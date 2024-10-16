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

//@WebFilter("*.do")
public class Filter2 implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException { 
		 
		System.out.println(" filter 2");
		//  
		HttpServletRequest h_request=    (HttpServletRequest) request;
		HttpServletResponse h_response  = (HttpServletResponse) response ;
		HttpSession   session  = h_request.getSession();
		
		//로그인 한경우			 요청대로 가져와야한다. 
		if( session.getAttribute("id") != null ) {
			//요청한 서블릿으로 넘어감			
			long start = System.currentTimeMillis();
			System.out.println("before");
			
			chain.doFilter(request, response);
			
			System.out.println("after");
			long end = System.currentTimeMillis();
			
			System.out.println("걸린시간" + (end-start));
			 
			//위 걸리는 시간은 빼도된다. 요청서블릿 넘어가는 코드는 아래코드만 잇으면된다. 
			//			chain.doFilter(request, response);
			
			
			//로그인 안한경우
		}else {
			String path = h_request.getContextPath();
			h_response.sendRedirect(path +"/login");			
		}
		
		
		
	}

}
