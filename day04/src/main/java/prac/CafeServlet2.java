package prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pracCafe2")
public class CafeServlet2 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	//resp.getWriter().println("CAFE MENU");
		
			
//		resp.setCharacterEncoding("utf-8");
//		resp.setContentType("text/html;charset=utf-8");
//		resp.getWriter().println("🌟");

		
		CafeService service = new CafeService();
		String data = service.getMenu();
		
		req.setAttribute("data", data);
		
		
		
		//model 
		String content = "CAFE MENU";
		
		//저장소 사용 
		req.setAttribute("content", content);
	
		req.getRequestDispatcher("WEB-INF/views/pracCafe2.jsp").forward(req, resp);
		
		
	
	}
	
	
	
}
