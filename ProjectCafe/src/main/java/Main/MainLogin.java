package Main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import CafeCustomer.CustomerDAO;

@WebServlet("/login")
public class MainLogin extends HttpServlet{
	
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
	
	CustomerDAO customerDAO = new CustomerDAO();
	boolean result = customerDAO.authenticate(member_id);
	
	// ID가 존재하고 비밀번호가 ID와 같을 때 로그인 성공
	if(result && member_id.equals(member_passwd)) {
		HttpSession session = req.getSession();
		session.setAttribute("member_id", member_id);
		
		System.out.println("아이디와 비밀번호를 같게 잘 입력했어요. 로그인 성공!");
		
		resp.sendRedirect("/ProjectCafe/main");
	}else {
		System.out.println(" 너 오타있다. 로그인 실패 . 다시 하렴 ^^");
	 req.setAttribute("loginFailMessage", " 너 오타있다. 로그인 실패 . 다시 하렴 ^^");
		req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
	}
	
	
	}
	
}
