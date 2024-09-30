package day09;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

//메뉴정보 JSON 으로 제공하기
//get
@WebServlet("/pracJson4")
public class FoodServletJSON4 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		FoodService s = new FoodService();
		JSONArray arr = s.getMenuListJSONReal();
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("application/json;charset=utf-8");

		resp.getWriter().println(arr);
	
	}
	
}
