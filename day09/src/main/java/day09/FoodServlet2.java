package day09;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//음식 메뉴 정보를 객체 데이터로 응답하기
//메뉴정보 제공하는 서비스 만들기
//GET 요청
@WebServlet("/pracFood2")
public class FoodServlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain;charset=utf-8");
		
		Food food = new Food("오므라이스", 4000);
						//이제 위 데이터를 데이터베이스로 부터 가져올거냐 
			// 그럼 우선 resp.getWriter();  로 나가는 스트림을 얻어오기
		PrintWriter out =  resp.getWriter();
		out.println(food);	//food.toString() 이 호출되어 출력된다
							//toString() 작성해두지않으면 class 정보가 출력될거다 
		
		
	}
}
