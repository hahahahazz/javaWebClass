package day09;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class FoodService {

	FoodDAO dao = new FoodDAO();
	
	
	//메뉴 정보 가져오기, JSON
	
	//메뉴 정보 리스트 가져오기 , JSON
	
	public JSONArray getMenuListJSON() {
		
		//
		ArrayList<Food> list = new ArrayList<>();
		list.add(new Food("오므라이스",4000));
		list.add(new Food("돈까스",8000));
		list.add(new Food("비빔밥",10000));
		
		JSONArray arr = new JSONArray();
		for(Food food : list) {
			//JSONObject 변환
			//JSONArray  에 추가
			JSONObject o = new JSONObject();
			o.put("name", food.getName());
			o.put("price", food.getPrice());

			arr.put(o);		//위에서 만든걸 추가 
		}
		System.out.println(arr);
		
		return arr;
	}
	
	
	public JSONArray getMenuListJSONReal() {
		ArrayList<Food> list = dao.getFoodList();
		
		//JSON 변환
		JSONArray arr = new JSONArray();
		for(Food food : list) {
			//JSONObject 변환
			//JSONArray 에 추가
			JSONObject o = new JSONObject();
			o.put("name", food.getName());
			o.put("price", food.getPrice());
			arr.put(o);
		}
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		FoodService s = new FoodService();
		//s.getMenuListJSONReal();
		JSONArray list = s.getMenuListJSONReal();
		System.out.println(list);
		
	}
	
}
