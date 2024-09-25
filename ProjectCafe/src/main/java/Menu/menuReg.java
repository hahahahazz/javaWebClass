package Menu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/menuReg")
public class menuReg extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("WEB-INF/views/menuReg.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		
		String menu_id = req.getParameter("menu_id");
		String menu_name = req.getParameter("menu_name");
		String menu_price = req.getParameter("menu_price");
		String menu_point = req.getParameter("menu_point");
		
		CafeMenu menu = new CafeMenu(menu_id, menu_name, menu_price, menu_point);
		
		System.out.println(menu_id);
		System.out.println(menu_name);
		System.out.println(menu_price);
		System.out.println(menu_point);
		
		
		// 등록서비스
		CafeMenuService service = new CafeMenuService();
		int rtn = service.registerMenu(menu);
		
		req.getRequestDispatcher("WEB-INF/views/menuRegOK2.jsp").forward(req, resp);
		
	}
	
}
