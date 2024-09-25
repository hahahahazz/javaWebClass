package Menu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/menu")
public class CafeMenuOne extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String menu_id = req.getParameter("menu_id");
		CafeMenuService service = new CafeMenuService();	
	 
		CafeMenu menu = service.getMenu( menu_id);
		
		req.setAttribute("Menu", menu);
		
		req.getRequestDispatcher("WEB-INF/views/menu.jsp").forward(req, resp);
		
	}
	
}
