package prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloGet")
public class HelloServletGet extends HttpServlet{

	//부모의 service 가 하는 역할은 요청정보를 확인하고 get  => doGet 을 호출, 
											//post 라면 => doPost를 호출하는 역할을 한다
	
	//이제 이 서비스는 get으로 만들거다 post로 만들거다 구분해서 만들어보자 
	//우선 아래는 get 으로 doGet 호출
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();	
		
		out.println("Get!!! Hello Servlet");
	
	}
	
	
}
