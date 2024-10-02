package day11;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/list2")
public class ListServlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		
		//model
		//게시판 글 목록 
		
		
		//페이징관련 객체 
	

		int pageSize =3;
		int grpSize = 5;
		int totRecords =0;
		int currentPage =1;
		
		
		String p_ = req.getParameter("p");
		if(p_ != null) {
			currentPage = Integer.parseInt(p_);
		}
		
		AcornDAO dao = new AcornDAO();
		totRecords = dao.selectTotalCnt();
		
		//데이터 받아오기
		ArrayList<Acorn> list = dao.selectListPaging(currentPage, pageSize);
		
//	public PageHandler(int pageSize, int grpSize, int totRecords, int currentPage)		
		PageHandler pageHandler = new PageHandler(pageSize,grpSize,totRecords,currentPage );
		
		req.setAttribute("list", list);
		
		req.setAttribute("handler", pageHandler);
		
		req.getRequestDispatcher("WEB-INF/views/list2.jsp").forward(req, resp);
	
	}
}
