package day10;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/del1")
public class DeleteReviewServlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	// 삭제하려고 하는 코드 id 만 오면된다
		String id = req.getParameter("id");
		System.out.println(id);
	
		//서비스 데이터베이스에 id 를 가진 내용 삭제
		resp.getWriter().println("ok");
	
	}
}
