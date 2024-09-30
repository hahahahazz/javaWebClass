package Main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/main0")
public class MainServlet0 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
		//req.getRequestDispatcher("WEB-INF/views/main.jsp").forward(req, resp);
	  req.getRequestDispatcher("WEB-INF/views/main0.jsp").forward(req, resp);
	
	
	}
}
 
