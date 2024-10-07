package Cafe;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/store")
public class StoreServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding("UTF-8");
	
		StoreService service = new StoreService();
		ArrayList<Store> slist = service.getStoreList();
	
		req.setAttribute("slist", slist);
		req.getRequestDispatcher("WEB-INF/views/storelist.jsp").forward(req, resp);
	}

}
