package day09;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//메뉴 정보 제공하는 서비스( data 만 제공하는 서비스)
//GET 요청
@WebServlet("/pracFood1")
public class FoodServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding("UTF-8");
//		resp.setContentType("text/plain;charset=utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		//특정한 음식 메뉴 정보 1개 를 응답하기

		String menu= "오므라이스 는 4,000원 ";
		
		PrintWriter out =resp.getWriter();
		out.println(menu);
		
		
		
		
		
		//req.getRequestDispatcher("")
	
	}
}
