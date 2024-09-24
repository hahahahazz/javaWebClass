package day05실습;

import java.util.ArrayList;

public class CafeMenuService2 {

	public ArrayList<CafeMenu> getCafeMenuListAll(){
		
		ArrayList<CafeMenu> list = new ArrayList<>();
		
		list.add(new CafeMenu("A111","아이스바닐라라떼","5400","54"));
		list.add(new CafeMenu("A222","핫바닐라라떼","5400","54"));
		list.add(new CafeMenu("A333","핫라떼","5400","54"));
		
		return list;
	}
	
	
	
	
	
}
