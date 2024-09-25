package day05실습;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MenuList")
public class CafeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		/*
		CafeMenuService2 service = new CafeMenuService2();
		ArrayList<CafeMenu> list = service.getCafeMenuListAll();
		req.setAttribute("list", list);
		*/
		
		CafeMenuService service = new CafeMenuService();
		ArrayList<CafeMenu> list = service.getCafeMenuAll();
		req.setAttribute("list", list);
		
		
	req.getRequestDispatcher("WEB-INF/views/MenuList.jsp").forward(req, resp);
	
	
	
	
	}
	
}
