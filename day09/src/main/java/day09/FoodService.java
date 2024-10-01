package day09;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class FoodService {

	//JSON = 자바스크립트에서 객체를 다루는 표현법
	// 자바스크립트에서 사용할 수 있도록 JSON이라는 형태로 자바객체를 가공하는 표현법
	
	FoodDAO dao = new FoodDAO();
	
	
	//메뉴 정보 가져오기, JSON
	
	//메뉴 정보 리스트 가져오기 , JSON
	
	public JSONArray getMenuListJSON() {
		
		// ArrayList : 메뉴정보가 하나가 아니라 여러개 일 때 제공하는 방법
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
