package PracFilter;

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
public class Filter2 implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		//이 필터는 세션에서 로그인 확인 하는 필터.
				//확인 후 로그인이 되어 있다면 정상적인 흐름으로 넘어가면되고.
				//확인 후 로그인이 되어있지않다면 로그인 될 수 있도록 재요청 하게  sendRedirect()  하면된다.
				// 위 흐름처럼  주로 코드를 작성.
				
				HttpServletRequest req = (HttpServletRequest)request;
				HttpServletResponse resp = (HttpServletResponse)response;
				
				HttpSession session = req.getSession();
				
				String idpw = (String)session.getAttribute("idpw");
				// idpw 라는 객체 정보가 심겨져 있다면 그 심은걸 꺼내고  없다면 null 
				
				if(idpw != null) { //idpw 가 null이 아니라면 즉 비지않았다. 채워졌다. 즉 로그인되었다면
					
					chain.doFilter(req, resp);
					
					//만든게 적용이 된건지 확인하는 로직
					System.out.println("아?");
					
				} else {	//로그인 이 되지 않았다면.
					resp.sendRedirect("/PracFilter/login");
					// 로그인 해라 !! 
				}
				
			}
		}
