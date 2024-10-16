package acorn;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//있는기능
@WebFilter("/*")
						// 상속받으면된다. 
public class Filter1  implements Filter {
	@Override					
																			// 아래 필터 체인 제공된다
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {	
		
		//서블릿 호출되기전 수행됬으면 하는 코드는 여기
		//대부분 서블릿에서 쓰는 코드들 .  여러군데 쓰지말고  이걸 거쳐서 다 적용할수 있게 코드를작성한다. 
		
		System.out.println(" filter1");		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");	
		
		
		//주의 !! 
		//원래 서블릿이 호출될 수 있도록 
		chain.doFilter(request, response);
		//얘를 호출해줘야 클라이언트가 요청햇던 서블ㄹ릿이  정상적으로 동작한다. 
		
		
		
		//그 이후 수행됫으면 하는 코드는 여기 작성하면된다. 
	}

}
