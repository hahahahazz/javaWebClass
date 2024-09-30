package Main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

import Menu.CafeMenuService;

@WebServlet("/ajaxCafeMenu")
public class ajaxMethod extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("application/json;charset=utf-8");	
		
		
		CafeMenuService service = new CafeMenuService();
		JSONArray arr = service.getCafeMenuList();
		resp.getWriter().println(arr);
	}
}
