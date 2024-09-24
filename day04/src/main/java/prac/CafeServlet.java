package prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pracCafe")
public class CafeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	//resp.getWriter().println("CAFE MENU");
		
		
		
		
//		resp.setCharacterEncoding("utf-8");
//		resp.setContentType("text/html;charset=utf-8");
//		resp.getWriter().println("🌟");
	
//		PrintWriter out = resp.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<style>");
//		
//		out.println("</style>");
//		out.println("</head>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<div>");
//		out.println("<p> 지금 쓰는 내용은 서블릿 관련 공부이다. </p>");
//		out.println("</div>");
//		out.println("</body>");
//		out.println("</html>");
		
	

	
		req.getRequestDispatcher("WEB-INF/views/pracCafe.jsp").forward(req, resp);
		
		
	
	}
	
	
	
}
