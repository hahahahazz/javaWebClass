package day01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//톰캣  = 서블릿 컨테이너라고 한다
//요청이 들어오면 그 요청에 대한 내용을 만들어서 html 형식으로 내보내준다.

//서블릿을 만드는 방법
//1. 서블릿을 상속받는다
//2. 톰캣은 서블릿을 실행시켜주는 프로그램인데 시작전에 약속되어있다
// 그래서. 2. 서블릿의 시작매서드 service 를 오버라이드 한다. (	)
//자신이 책임져야하는 요청에대해 오버라이드하면된다
//주문정보, 상품상세정보, 댓글...
//3. 요청에 대한 내용을 만든다  (= 응답결과를 만든다)
//4. 요청한 쪽으로 응답한다. 


//요청( /hi3) => 간단한 메시지를 제공하는 서비스  
//이요청을 처리하기 위한 서블릿을 만들고 응답하기
//서블릿 url 에서 요청하는 매칭 정하기




@WebServlet("/hi3")
public class HelloSevelt2 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
													//얘가 나가는길 다 가지고있다
		//응답하기
		//응답하기 위한 스트림(길) 얻어오기 ( 출력스트림 : 나가는 길)
		
		PrintWriter out =  response.getWriter();
		out.println("<html> <head> </head> <body> <h2> >______< </h2> </body> </html>");
		
	}

	
	
	
}
