package day08_login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//로그인 서비스를 제공하는 서블릿
//get : 로그인화면 제공
//post : 실제 로그인 기능 제공 

@WebServlet("/loginEx")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	//req.getParameter("id");
	String id = req.getParameter("id");
	String pw = req.getParameter("pw");
	
	System.out.println(id);
	System.out.println(pw);
	
	
	//LoginService service = new LoginService();
	//
	
	boolean result = false;
	
	//만약 id 와 pw 가  같다면 회원이다 라고 판별해보겠다
	if(id.equals(pw)) result = true;
	
	//만약 회원이면 (id,pw 로 조회해서 로그인 성공했다면)
	// 성공했음을 의미하는 정보를 세션에 로그인 정보를 저장한다 .
	if(result == true) {
	//if(result) 이렇게만써도  result==true 라는 의미이기에 생략해도 된다.
	
	//req.getSession();
		HttpSession session = req.getSession();
		session.setAttribute("loginId", id);
	
	//메인페이지 (메인 서블릿을 호출할 수 있도록 resp.sendRedirect("/day08/main") 을 호출할수 있다
	System.out.println("로그인 성공 , 메인페이지가 호출될거다");
	
	resp.sendRedirect("/day08/mainEx");
	
	
	
		//로그인 성공을 못했다면 다시 로그인 뷰가 뜰수 있도록 한다
	} else {	//메인페이지를 아직안만들어서 아래 문구가뜨게 해보자
		System.out.println("로그인 실패, 로그인 페이지가 호출될거다 ");
		req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
	}
	
	
	}
	
}
