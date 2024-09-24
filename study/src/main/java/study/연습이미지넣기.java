package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exImage")
			
public class 연습이미지넣기 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		PrintWriter  out  =resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
														//이미지 원래 넣으려면 아래모양인데 "" 안에 넣으려면 \ 필요!
														// <img src="/day02/a.png" /> 
		out.println("<img  src=\"/study/a.png\" />");    // "<img src=\"/day02/a.png\" />"
		out.println("</body>");
		out.println("</html>"); 
	}
		
}
/* 서블릿으로 만든는 방법
1. HttpServlet 을 상속받기
2.서블릿으로 등록하기  @WevServlet ("/hi")
								어떤 요청의 이름으로 들어올거냐 지정해주기 
								어떤이름으로 요청이들어왓을때 처리할지 
								이부분이 매핑 ! 매핑의 이름은 겹치면, 중복되면 안된다. 그럼 실행안된다. 
						이 이름으로 클라이언트의 요청이 들어오면 이 이름 부분을 실행해 달라는 의미
						그래서 출력하면 이부분이 동작한다는 거다 .
3. service 매서드를 자신의 요청에 맞게 응당할 수 있도록 재정의 해야한다. 
4. 응답하기 - 출력스트림을 통해서 만든응답 내용을 보내야 한다. html 형식으로데이터를 보내기









*/
