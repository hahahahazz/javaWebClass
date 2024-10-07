package Cafe;

import java.util.ArrayList;

public class StoreService {

	StoreDAO dao = new StoreDAO();

	public ArrayList<Store> getStoreList(){
		return dao.getStoreList();
	}
}
