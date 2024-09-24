package day02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hap10ver2")
public class 합10응답서블릿2 extends HttpServlet{

	// 이제 톰캣이 관리한다 톰캣이 서비스라는 메소드를 실행시키게한다
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	//키값 정하기 su 로 하든 num 으로하든
		// 		/hap10ver2?su=5  라고 요청이 온다면 수행할거야
		
		String su_ = req.getParameter("su");
			//숫자가 아닌 문자열로 받는다
		//getParameter 는 기본적으로String 타입을 받기 때문이다. 
		
		int su;
		if(su_ == null) {
			su = 10;
		}else {
			su = Integer.parseInt(su_);	//입력받은 수를 즉 문자를   "125" => 125	문자를 숫자로 바꾸는 
		}
		
		int sum = 0;
		for (int i=1; i<=su; i++) {
			sum += i;
		}
		
		
	PrintWriter out =resp.getWriter();	
	//html 형식으로 입력하지 않으면 다음 문장은 오류난다 out.println("입력한 수까지의 합은 ");
	out.println(sum);
	
	}
	
	
}
