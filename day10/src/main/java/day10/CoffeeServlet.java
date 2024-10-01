package day10;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/coffee1")
public class CoffeeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String[] coffee= {"아메리카노","라떼","카푸치노","에스프레소","모카" };		
		req.setAttribute("coffee", coffee);
		req.getRequestDispatcher("WEB-INF/views/JSTLprac3.jsp").forward(req, resp);
		
	
	}
}
