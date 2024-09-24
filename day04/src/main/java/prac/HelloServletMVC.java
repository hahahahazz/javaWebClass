package prac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/pracHello3")
public class HelloServletMVC extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
		//입력정보가 있는지 . 얻기
		
		
		
		//필요한 서비스에 대한 데이터를 만들기	(순수자바로 POJO 플레인자바 )
	
	
		//응답하기(jsp로 VIEW 만들기  )
		
		req.getRequestDispatcher("WEB-INF/views/pracHello3.jsp").forward(req, resp);
		
		
	}
		
	
}
