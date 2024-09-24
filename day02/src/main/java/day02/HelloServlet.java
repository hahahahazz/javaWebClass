package day02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/hi")
//서블릿으로 등록하기 어떤이름으로 요청이들어왓을때 처리할지 

public class HelloServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
	
	
	//>_____________________< Hello servlet
	

	//응답하려면 나가는길, 출력스트림 얻어오기. 리스판스객체에 잇어서 가져오기만 하면된다
		PrintWriter out =	resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> >_____________________< </h1>");
		out.println("<h2> Hello");
		out.println("servlet </h2>");
		out.println("<h1> >_____.._____< </h1>");
		out.println("</body>");
		out.println("</html>");
		
		
		
	
	}
	
	
	
	
	
	
	
}
