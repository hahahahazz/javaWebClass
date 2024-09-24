package day01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/double02")
public class 두배만들기서블릿2 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
	//요청하는 쪽인 클라이언트가 보낸 값 얻어오기
		//요청값을 다 req 에 담아서 얻어오면된다
		String su_ = req.getParameter("su");	//su라는 이름을 키로 값을 얻어옴 
		
		//숫자로 변환해서 사용ㅇ해야함
		int su = Integer.parseInt(su_); // "5" =>5
	
	
		int result = su*2;
		
		PrintWriter out = resp.getWriter();
	
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>result = </h2>");
		out.println("<h3>" + result + "</h3>");
		out.println("</body>");
		out.println("</html>");
	
		
	///서블릿은 프로그램 그 프로그램이 동작한 결과만 받는다 
	
		
		resp.getWriter().println(result);
	
	}
	
	
	
}
