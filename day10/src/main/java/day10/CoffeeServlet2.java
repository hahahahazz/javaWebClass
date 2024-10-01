package day10;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/coffee2")
public class CoffeeServlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ArrayList<Coffee> coffee = new ArrayList<>();
		coffee.add(new Coffee("아메리카노","1800","벤티"));
		coffee.add(new Coffee("바닐라 라떼","2500","그란데"));
		coffee.add(new Coffee("카푸치노","2800","톨"));
		coffee.add(new Coffee("에스프레소","1500","톨"));
		
		req.setAttribute("coffee", coffee);
		req.getRequestDispatcher("WEB-INF/views/JSTLprac4.jsp").forward(req, resp);
		
	
	}
}
