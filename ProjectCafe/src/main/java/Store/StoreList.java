package Store;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StoreList")
public class StoreList extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StoreService service = new StoreService();
		ArrayList<Store> list = service.getStoreList();
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/views/storeList.jsp").forward(req, resp);
		
	}
	
}
