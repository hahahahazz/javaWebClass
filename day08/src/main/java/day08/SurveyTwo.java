package day08;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/surveyEx2")
public class SurveyTwo extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	req.setCharacterEncoding("UTF-8");	
		
	//req.getParameter("animal");
	String animal = req.getParameter("animal");
	
	//다른정보도 사용할수 있도록 저장하기
	//각 클라이언트마다 사용할 수 있는 저장소인 세션 얻어오기 => 각 클라이언트마다 제공되는 저장소
	//req.getSession();
	HttpSession session = req.getSession();
	
	//세션 저장소 저장하기
	session.setAttribute("survey1", animal);
						//survey1 이라는 이름의 키에 첫번째 설문의 결과를 담기
	
	req.getRequestDispatcher("WEB-INF/views/surveyTwo.jsp").forward(req, resp);
	
	
	}
	
}
