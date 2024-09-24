package day02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fighting")
public class 실습2_화이팅메시지응답하기 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	 PrintWriter out=resp.getWriter();
	
	 out.println("<html> <head> </head> <body> Java Fighting!! </body></html>");
	
	
	
	
	
	}
}
