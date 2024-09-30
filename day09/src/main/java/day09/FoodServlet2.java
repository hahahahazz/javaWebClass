package day09;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//음식 메뉴정보 객체 데이터로 응답하기
//메뉴정보 제공하는 서비스 
//GET 요청
@WebServlet("/pracFood2")
public class FoodServlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain;charset=utf-8");
		
		Food food = new Food("오므라이스", 4000);
		
		PrintWriter out =  resp.getWriter();
		out.println(food);	//food.toString() 가 출력된다
		
		
	}
}
