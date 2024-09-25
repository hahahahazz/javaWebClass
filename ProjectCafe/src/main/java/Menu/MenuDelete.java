package Menu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteMenu")
public class MenuDelete extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String menu_id = req.getParameter("menu_id");
		System.out.println(menu_id);
		
		CafeMenuService service = new CafeMenuService();
		service.deleteMenu(menu_id);
		
		resp.sendRedirect("/ProjectCafe/MenuList");
		
	}
	
}
