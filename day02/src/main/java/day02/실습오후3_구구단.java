package day02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dan3")
public class 실습오후3_구구단 extends HttpServlet {

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String dan_ = req.getParameter("dan");
		int dan ;
		if(dan_ == null) {
			dan = 1;
		}else {
			dan = Integer.parseInt(dan_);
		}
		
		int result ;
		
		
		
		
		
		PrintWriter out = resp.getWriter();
	
		out.println();
		out.println();
		out.println();
		out.println();
	
	}
	
	
}
