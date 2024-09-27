package Main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login0")
public class MainLogin0 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String member_id = req.getParameter("member_id");
	String member_passwd = req.getParameter("member_passwd");
		
	System.out.println(member_id);
	System.out.println(member_passwd);
	
	boolean result = false;
	if(member_id.equals(member_passwd)) result = true;
	//만약 아이디와 비번을 같게 입력한다면 로그인에 성공한다는 결과가나오고
	// 그결과를 세션에 로그인정보를 저장한다. 
	if(result == true) {
		HttpSession session = req.getSession();
		session.setAttribute("member_id", member_id);
		
		System.out.println("아이디와 비밀번호를 같게 잘 입력했어요. 로그인 성공!");
		
		resp.sendRedirect("/ProjectCafe/main");
	}else {
		System.out.println(" 너 오타있다. 로그인 실패 . 다시 하렴 ^^");
	 req.setAttribute("loginFailMessage", "로그인 실패. 아이디 또는 비밀번호를 확인하세요.");
//이 코드는 로그인 실패 메시지를 요청 속성에 설정하여 JSP로 전달합니다.
//forward 메서드: 메시지를 설정한 후, JSP 파일로 포워딩합니다.
		req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
	}
	
	
	}
	
}
