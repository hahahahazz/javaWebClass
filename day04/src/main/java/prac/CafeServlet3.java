package prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pracCafe3")
public class CafeServlet3 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
	//resp.getWriter().println("CAFE MENU");
		resp.getWriter().println("🌟");
		
		
		
		
		String star = req.getParameter("stars");
		
		PrintWriter out = resp.getWriter();
		
		int stars = 1;
		if(star == null) {
			out.println("*");
		}else {
		stars = Integer.parseInt(star);
		String result = getPrintStar(stars);
		out.println(result);
		}
		
		
	
	}
	
	


public String getPrintStar(int n) {
	
	String result="";
	for (int i = 1; i<=n; i++) {
		for( int j = 1; j<=i; j++) {
			result += "*";
		}
	}

	
	return result;
}

}
