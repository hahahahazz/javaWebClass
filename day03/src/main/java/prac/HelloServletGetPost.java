package prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloGetPost")
public class HelloServletGetPost extends HttpServlet{

	//get으로 요청해도 , post 로 요청해도 다 동작한다
	//단 service 와는 다른점은 각자의 내용으로 동작할수 있다는것 . service는 같은내용으로 동작할거다. 
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//회원등록
	//회원등록화면 나왔으면 좋겠다. 
	
		resp.setCharacterEncoding("utf-8");	
		resp.setContentType("text/html;charset=utf-8");
		
		
		//resp.getWriter().println("회원가입화면");
		
		PrintWriter out = resp.getWriter();			
		out.println("회원가입화면");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>회원가입</h2>");
		out.println("<form action=\"\" method=\"post\" >");
		out.println("<button>등록</button>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding("utf-8");	
		resp.setContentType("text/html;charset=utf-8");
		
	//회원정보가 등록 되는건 post 에두고 싶다.
	//회원정보 추출, 데이터베이스 등록
		//(회원정보가 등록된다)
		resp.getWriter().println("회원정보 데이터베이스 등록완료 ");
	
	}
	
}
