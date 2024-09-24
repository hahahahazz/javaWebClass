package prac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//hello servlet 라는 제공하는 서비스 만들기	=>  get 요청만 만들어보겠다.

@WebServlet("/pracHello2")
public class HelloServlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//PrintWriter out = resp.getWriter();
		//out.println();
		
		
		
		resp.getWriter().println("HELLO SERVLET");
	
	}
	
}
