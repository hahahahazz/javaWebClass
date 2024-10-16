package acorn;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("*.do")
public class Filter3 implements Filter{

	@Override			//ServletRequest = httpServlet request 의 부모 격.  그래서 다운캐스팅 해야한다.
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		//세션에서 로그인 확인
		//-그 이후 로그인 되어있으면 정상적인 흐름으로 넘어가면된다.
		//-아니면 로그인 될 수 있도록 재요청 해라. sendRedirect()  라는 식으로 만들자면. 
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		HttpSession session = req.getSession();
		String id = (String)session.getAttribute("id");
		//심어놓은게 잇으면 심은걸 꺼내고 아니면 null
		

		if(id != null) {	//로그인된상황
			
			chain.doFilter(req, response);
			//만든게 적용이 된건지 확인
			System.out.println("hi");
			
		} else {
			resp.sendRedirect("/filterPrj_/login");
		}
		
		
		
	}
}
