package day05실습;

import java.util.ArrayList;

public class CafeMenuService {

	CafeMenuDAO dao = new CafeMenuDAO();
	
	public ArrayList<CafeMenu> getCafeMenuAll(){
		return dao.selectAll();
	}
	
	
	
	
}
