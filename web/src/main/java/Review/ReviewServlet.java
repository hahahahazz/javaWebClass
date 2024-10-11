package Review;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/review")
public class ReviewServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ReviewDAO dao = new ReviewDAO();
		ReviewService service = new ReviewService();
		
		int pageSize =3;
		int grpSize = 5;
		int currentPage =1;
		// 쿼리 파라미터에서 페이지 번호 가져오기
		String p_ = req.getParameter("p");
		if(p_ != null) {
			currentPage = Integer.parseInt(p_);
		}
		//총 레코드 수 가져오기 
		int totRecords = dao.selectTotalCnt();
		
		ArrayList<Review> allList = dao.listPaging(currentPage, pageSize); // 현재 페이지에 해당하는 리뷰 목록 가져오기

		   // 리뷰 리스트를 review_no 기준으로 정렬
		Collections.sort(allList, new Comparator<Review>() {
		    @Override
		    public int compare(Review r1, Review r2) {
		        return Integer.compare(Integer.valueOf(r2.getReview_no()), Integer.valueOf(r1.getReview_no()));
		    }
		});

		 // Paging 객체 생성
        Paging paging = new Paging(pageSize, grpSize, totRecords, currentPage);

        // 요청 속성에 리뷰 목록과 페이징 정보 설정
        req.setAttribute("allList", allList);
        req.setAttribute("paging", paging);
        req.setAttribute("totalCount", totRecords); // 전체 리뷰 수 설정
		req.getRequestDispatcher("WEB-INF/views/review.jsp").forward(req, resp);
		
		
	}
}