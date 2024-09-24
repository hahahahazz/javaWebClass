package day02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/star1")

public class 실습1_별응답하기 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	//특수문자 출력
		resp.setCharacterEncoding("UTF-8");
//		resp.setContentType("test/html;charset=utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
	PrintWriter out =	resp.getWriter();
	out.println("<html>");
	out.println("<head>");
	out.println("</head>");
	out.println("<body>");
	out.println("⭐⭐⭐");
	out.println("💫💫💫💫");
	out.println("🌟🌟🌟🌟🌟");
	out.println("</body>");
	out.println("</html>");
	
	}
	
	
	
	
}
