package Menu;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

@WebServlet("/MenuList2")
public class CafeMenuList2 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		CafeMenuService service = new CafeMenuService();
		ArrayList <CafeMenu> list = service.getMenuList();
		
		//JSON 객체 변환
		JSONArray arr = new JSONArray();
		
		for(  CafeMenu  menu  : list) {
			JSONObject  o  = new JSONObject();
			o.put("menu_id", menu.getMenu_id());
			o.put("menu_name", menu.getMenu_name());
			o.put("menu_price", menu.getMenu_price());
			o.put("menu_point", menu.getMenu_point());			
			
			arr.put(o);
		}
		
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/views/menuList.jsp").forward(req, resp);
		
	}
	
}
