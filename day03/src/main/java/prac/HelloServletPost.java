package prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloPost123")
public class HelloServletPost extends HttpServlet{

	//service매서드가 요청정보를 확인하고 post => doPost 를 호출함 ( doPost 재정의)
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();	
		out.println("Post!!! Hello Servlet");
	}
	

	
	//get 을 하나 추가 해서  post 로 호출하면  post 내용이  get 으로 호출하면 get 내용이 출력된다
	//html 의 바디내용에서  <form action="/day03/helloPost" method="post">  여기 method ="get" 으로 바꾸면
	//get 내용이 출력된다. 
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	PrintWriter out = resp.getWriter();	
//		out.println("Get!!! Hello Servlet");
//	}
	
	
	

}
