package prac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pracHello")
public class HelloServlet extends HttpServlet{

	/*
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String method = req.getMethod();	// 요청방법 GEt 으로 , post으로 요청했다는걸 알수 있다
	
	if(method.equals("GET")) {
		
		doGet(req,resp);
		
	}else if(method.equals("POST")) {
		doPost(req, resp);
	}
		
	}	
	*/
	
	//정보를 얻기만 하는! 주문정보보여줘 등 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("GET");
		
		resp.getWriter().println("get");
		
	}
	
	//서버에 새로운 정보가 반영이되는!!  로그인같은 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("POST");
		
		resp.getWriter().println("post");
	}
}
