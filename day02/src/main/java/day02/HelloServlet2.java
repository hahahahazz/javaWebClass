package day02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hi2")
// /hi2?num =3 이라고 입력해줘야한다 
// hi2 라고 하는 서블릿을 만드는 사람이 
//숫자를 받아올때 키를 su  로 하든 num 으로 하든 만드는 사람이 지정해줘야함. 
public class HelloServlet2 extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//서버는 클라이언트가 보낸 값을 얻어 올 수 있다.
		//클라이언트가 보낸 정보,요청에 관련한 건 request 
		//내가 응답해야하는 부분은 response
		String num_ = request.getParameter("num");
		
		int num;
		if(num_ == null) {num = 1;	}
		else {
		num = Integer.parseInt(num_);
		}
		
		
		//num2 => hello Servlet  hello Servlet
		
		String result = "";
		for(int i=1; i<= num; i++) {
			result += "<h2>hello Servlet";
		}
	
	
	//응답하는 부분 리스판스로 부터 나가는 스트림을 얻어오기
		PrintWriter out = response.getWriter();
				out.println("<html>");
				out.println("<head>");
				out.println("</head>");
				out.println("<body>");
				out.println(result);
				out.println("*");
				
				out.println("</body>");
				out.println("</html>");
	
	
	
	
	
	}

	
	
	
	
	
	
	
	
}
