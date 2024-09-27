package day08_login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logoutEx")
public class LogOutServlet extends HttpServlet{
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	//세션 지우기
	
	
	//세션 저장소 얻어오기
	HttpSession session = req.getSession();
	session.invalidate();// 다 삭제하기		


	//콘솔창에 흔적만 남겨보자
	System.out.println("로그아웃");
	
	// 메인페이지로 리다이렉트( = 웹브라우저에게 재 요청하세요라는 의미이다) 
	//resp.sendRedirect("/day08/loginEx");
	
	resp.sendRedirect("/day08/mainEx");
}
}
