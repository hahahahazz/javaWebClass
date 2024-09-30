package Menu;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;


public class CafeMenuService {
	
	CafeMenuDAO dao = new CafeMenuDAO();
	
	int registerMenu(CafeMenu menu) {
		int rtn = dao.insert(menu);
		return rtn;
	}
	
	
	ArrayList<CafeMenu> getMenuList(){
		return dao.selectAll();
	}
	
	
	CafeMenu getMenu(String menu_id) {
		return dao.selectOne(menu_id);
	}
	
	int modifyMenu(CafeMenu menu) {
		return dao.update(menu);
	}
	
	int deleteMenu(String menu_id) {
		return dao.delete(menu_id);
	}
	

	public JSONArray getCafeMenuList() {
		ArrayList<CafeMenu> list = dao.getCafeMenuList();
		JSONArray arr  = new JSONArray();
		for(int i =0; i<list.size(); i++) {
			CafeMenu c = list.get(i);
			JSONObject o = new JSONObject();
			o.put("menu_id", c.getMenu_id());
			o.put("menu_name", c.getMenu_name());
			o.put("menu_price", c.getMenu_price());
			o.put("menu_point", c.getMenu_point());
			arr.put(o);
			
		}
		return arr;
	}
	
}
