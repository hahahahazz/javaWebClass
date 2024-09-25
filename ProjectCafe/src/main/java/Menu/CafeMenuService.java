package Menu;

import java.util.ArrayList;

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
}
