package Review;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/reviewDetails")
public class ReviewDetailServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//리뷰 전체목록에서 수정 버튼 클릭시 
		req.getRequestDispatcher("WEB-INF/views/reviewDetails.jsp").forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 수정 후 내용 post로 전달받아 다시 리뷰페이지로 이동
		
		resp.sendRedirect("/Alcoholic/reviewDetails");
	
	}
}
