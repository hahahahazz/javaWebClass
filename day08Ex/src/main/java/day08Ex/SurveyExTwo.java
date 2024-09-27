package day08Ex;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/surveyExThree")
public class SurveyExTwo extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	req.setCharacterEncoding("UTF-8");
	
	// 마신 음료 정보 받아와서
	String drink = req.getParameter("lunch");
	
	
	// 저장소에 저장하기
	HttpSession session =  req.getSession();
//	session.setAttribute("oneDrink", lunch);
//		//받아온 정보를 저장소에 저장후 그걸 불러올때 쓸 키 를 정해주기
//	
	
	req.getRequestDispatcher("WEB-INF/views/surveyExTwo.jsp").forward(req, resp);
	}
}
