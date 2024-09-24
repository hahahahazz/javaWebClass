package day02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hap10")
			//이 이름으로 들어오면 나 실행해줘  라는 ㅇ의미   출력하면 이게 동작한거고 
public class 합10응답서블릿 extends HttpServlet {

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
	int sum = 0;
	for(int i=1; i<=10; i++) {
		sum += i;
		
	}
	
	PrintWriter out = resp.getWriter();
	out.println(sum);
	
	
	
//	out.println("<html>");
//	out.println("<head>");
//	out.println("</head>");
//	out.println("<body>");
//	out.println(sum);
//	out.println("</body>");
//	out.println("</html>");
	
	//이부분이 수행되서 결과 가 출력된다. 
	
	
	
	
	
	}
	
	
	
}
