package Menu;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MenuList")
public class CafeMenuList extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		CafeMenuService service = new CafeMenuService();
		ArrayList <CafeMenu> list = service.getMenuList();
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/views/menuList.jsp").forward(req, resp);
		
	}
	
}
