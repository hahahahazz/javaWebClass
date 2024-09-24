package cafe;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cafeEX")
public class CafeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	//메뉴추가하는 창 만들어보기 
		req.getRequestDispatcher("WEB-INF/views/cafeEX.jsp").forward(req, resp);
		
	
	
	}
}
