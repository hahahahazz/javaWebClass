package acorn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/order.do")
				//.do  로 끈나는 애들은 필터를 거치게 매핑 한거임 
//매핑 규칙  .do  붙이면 요청에 필터를 거쳐갈거다 라고 정해놓음 filter2 파일 확인하면 거기 web 코드가 .do 이다
//노션 에  정리 되있다. 

public class Order  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 
		//로그인여부 체크 
		//주문정보가 보여지거나 아니면 로그인화면으로
	/*	
		HttpSession  session  = req.getSession();
		String id  = (String)session.getAttribute("id");
		
		 
		if( id !=null) {
			// model, 주문목록 
			req.getRequestDispatcher("WEB-INF/views/order.jsp").forward(req, resp);
		}else {
			//로그인이 되어 있지 않다면
			resp.sendRedirect("/filterPrj_/login");
		}
		*
		*/
		//model 
		//req.setAttribute("list", list);
		
		//이 서블릿 실행하면 필터가 있어서 필터를 거쳐가기때문에  로그인 화면 이 뜰것이다.
		req.getRequestDispatcher("WEB-INF/views/order.jsp").forward(req, resp);
		
	}

}
