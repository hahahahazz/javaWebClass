package Store;

import java.util.ArrayList;

public class StoreService {
	
	StoreDAO dao = new StoreDAO();
	
	ArrayList<Store> getStoreList(){
		return dao.selectAll();
	}
	
	
	
}
