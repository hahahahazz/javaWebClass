package prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/hello")
public class HelloServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
	resp.setCharacterEncoding("utf-8");	//보내는 데이터를 인코딩 하는 방법설정	
	resp.setContentType("text/html;charset=utf-8");	//보내는데이터의 형식이 html , 웹브라우저가 utf-8 로 해석
		
		
	//클라이언트가 보내온 데이터 가져오기 		전달된값을 받아올수 있게.
	//req.getParameter("su");
	String su =  req.getParameter("su");
	
	
	PrintWriter out = resp.getWriter();
	
	out.println("HELLo Servlet 안녕 서블릿"+ su);
	
	
	
	}
	
	

}
