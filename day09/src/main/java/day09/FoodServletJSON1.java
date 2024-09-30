package day09;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;


@WebServlet("/pracJson1")
public class FoodServletJSON1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain;charset=utf-8");
		
		Food food = new Food("오므라이스", 4000);
		
		//JSON 으로 변환한 다음 응답하기
		//JSON jar 파일 (라이브러리)  lib 폴더에 넣기
		//ajaxSample 폴더 안에 lib 폴던안에꺼 복붙하기 
		//JSON 자바스크립트로 객체를 표현하는 방법이다(객체는 속성, 매서드의 집합이다.)
		
		//JSON 형태로 변환하면
		// {name=오므라이스, price=4000};  이런 구조로 변환하겟다
	
		JSONObject o = new JSONObject();
		o.put("name", food.getName());
		o.put("price", food.getPrice());
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("application/json;charset=utf-8");
		//내가 보내는 형식이 JSON 구조형태의 형식을 보낸다. 
		resp.getWriter().println(o);
	
	}
	
}
