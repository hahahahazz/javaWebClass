package day02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//서블릿으로 만드는 방법
//1. HttpServlet 을 상속받기
//2.서블릿으로 등록하기  @WevServlet ("/hi")
//								어떤 요청의 이름으로 들어올거냐
//3. service 매서드를 자신의 요청에 맞게 응당할 수 있도록 재정의 해야한다. 
//4. 응답하기 - 출력스트림을 통해서 만든응답 내용을 보내야 한다. html 형식으로데이터를 보내기



@WebServlet("/starEx")
		// 매핑의 이름은 겹치면 실행이 안된다. 중복되면안된다. 


public class 별응답서블릿 extends HttpServlet{
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		//인코딩하기   별하나 문자하나 나타내려면 1바이트로는 부족하다
		//그래서 인코딩을 utf-8 로 해줘야한다
		
		response.setCharacterEncoding("UTF-8");    
		response.setContentType("text/html;charset=utf-8");
		//출력스트림을 얻어오기전에 설정해야 한다!!!
				
		
//출력스트림 나가는 길 얻어오기		response.getWriter();
	
		PrintWriter out = response.getWriter();
	
		out.println("✨");
		out.println("✨✨");
		out.println("✨✨✨");
		out.println("✨✨✨✨");
		out.println("✨✨✨✨✨");
	
	
	}
	
	
	
	
	
	
	
	
}
