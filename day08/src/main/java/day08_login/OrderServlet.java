package day08_login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//주문정보 제공하는 서비스
//get   요청이들어오면 해당정보 보여주기만 하면되니까
@WebServlet("/orderEx")
public class OrderServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 로그인 여부에 따라 주문정보가 보여지거나 아니면 로그인 페이지가 제공될 수 있도록 하기 
		
		//로그인 여부 확인하기
		//세션장소에 로그인 정보 가져오기
		//req.getSession();
		HttpSession session = req.getSession();
		//session.getAttribute("loginId");
		String userid = (String)session.getAttribute("loginId");
		
		//저장소에서 로그인 정보 확인하기 
		if(userid != null) {	//로그인 했었던 정보를 확인해보자
			//로그인이 되었던 고객이다!
			
			//로그인 했으니까 그 로그인에 해당하는
			//주문데이터 가져오기
		req.getRequestDispatcher("WEB-INF/views/orderList.jsp").forward(req, resp);
			
			
			
		}else {	//이부분은  로그인이 안되있다!!	=> 다시로그인을 해라!
			resp.sendRedirect("/day08/loginEx");
		}
		
		
		
		
		
		
	//우선 데이터 가져오기 (서비스를 통해서)
	//해당고객의 주문정보 데이터 가져오기 (=모델) 
		//뷰 를 통해서 보여준다
	//req.getRequestDispatcher("WEB-INF/views/orderList.jsp").forward(req, resp);
	
	}
	
}
