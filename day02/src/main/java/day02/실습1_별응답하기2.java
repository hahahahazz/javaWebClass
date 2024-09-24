package day02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/star12")
			//star12?su=10 입력해서 10개 출력하기 
public class 실습1_별응답하기2 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	//특수문자 출력
		resp.setCharacterEncoding("UTF-8");
//		resp.setContentType("test/html;charset=utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		PrintWriter out =	resp.getWriter();
		
		String su_ = req.getParameter("su");
		
		int su;
		if(su_ == null) {
			su =1;
		}else {
			su = Integer.parseInt(su_);
		}
		
		String result = "";
//		for(int i =1; i<=su; i++) {
//			result += "<h1> 🌟 </h1>";
//		}
		
		
		for(int i =1; i<=su; i++) {
			for( int j = 1; j<=i; j++) {
				result += "<h1> 🌟 </h1>";
			}
			out.println();
		}
			
		

	out.println(result);
	
	}
	
	
	
	
}
