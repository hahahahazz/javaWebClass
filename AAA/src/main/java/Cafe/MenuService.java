package Cafe;

import java.util.ArrayList;

public class MenuService {

	MenuDAO dao = new MenuDAO();


	public ArrayList<Menu> selectMenu(){
		return dao.selectMenu();
	}
}
