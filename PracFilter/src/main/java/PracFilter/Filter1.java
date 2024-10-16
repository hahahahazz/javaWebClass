package PracFilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter("/*")
public class Filter1 implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		//필터 는. 여러 클래스에서 중복되어 작성되는 한글 인코딩 이라던가
				// 로그인 기능 이라던가
				// 관리자 기능 이라던가 
				//하나의 파일에만 적용되면 필요가 없겟지만 여러 파일에서 사용되는 기능을
				//중복 해서 작성하여 코드의 길이를 늘리기 보단 필터를 거쳐가면 적용될수 있게 함으로써 효율적인
				//코드 작성을 위해 사용하는 기능이다. 
				
				//주로 필터 하나보단 여러개를 사용할수 있는데 
				//한글 인코딩은 여러 . 대부분의 파일에서 적용하지만  로그인이라던가 관리자는 제한... 범위를 주기때문에
				//필터를 따로 만들어서 줘야하기에  여러개 작성 한다. 
				
				//필터1 은 한글 인코딩을 목적으로 작성 
				//필터 2 는 로그인 해야 가능함을 목적으로 작성
				//필터 3은 관리자 로그인을 해야 가능함을 목적으로 작성
				
				//순서는 우선 Filter 을 implements 상속받고
				//매핑이름은 WebFilter 로  규칙이 있다. 
				// *  을 입력하면 모든 매핑이름에 적용된다 라는 의미
				// ("*.do")  는 매핑이름 다음에 .do 를 적어주면 그 필터를 그 매핑이름한 요청에 적용시키겟다는 의미 
				//매핑 규칙은 노션 확인해보자. 
				//그러고나면 클래스이름에 빨간줄 뜨면  doFilter 실행해주기. 
				
				//필터 코드 작성 부분 위부분에는 서블릿 이 호출 되기 전에 수행 되었으면 하는 코드를 작성하고
				// 필터 코드 작성 부분 아래에는 그 이후 수행되었으면 하는 코드를 작성하면 된다.
				
				//그래서 대부분 서블릿에서 사용되는 코드들은 윗부분에 작성한다. 
				
				//그리고 필터 코드 작성부분은 주의해야한다.
				//이부분이 바로 요청한 서블릿이 호출 될 수 있도록 해주는 부분이기에  주의해준다. 
				
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		chain.doFilter(request, response);
		
/*
@WebFilter("/*")로 설정하면, 여러분이 만든 패키지에 있는 서블릿뿐만 아니라, 애플리케이션의 모든 서블릿에 대해 필터가 적용됩니다.
 즉, 어떤 URL 요청이 들어오든 간에 이 필터가 실행된다는 의미입니다.
이 필터의 내용이 모든 요청에 적용된다. 	

추가로, @WebFilter의 URL 패턴을 다른 것으로 변경하면 필터가 적용되는 범위를 조정할 수 있습니다.
 예를 들어, @WebFilter("/api/*")와 같이 설정하면 /api/로 시작하는 요청만 필터가 처리하게 됩니다.			
			
*/
	}
}
