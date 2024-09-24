package day02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/star5")	//	/star?cnt=5
public class 실습오후5_별출력 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//특수문자 출력
				resp.setCharacterEncoding("UTF-8");
//				resp.setContentType("test/html;charset=utf-8");
				resp.setContentType("text/html;charset=utf-8");
				
				
				String cnt_ = req.getParameter("cnt");
				
				int cnt;
				if(cnt_ == null) {
					cnt =1;
				}else {
					cnt = Integer.parseInt(cnt_);
				}
				
				String result = "";
				for(int i =1; i<=cnt; i++) {
					result += "<h1> 🌟 </h1>";
				}
				
					
				
			PrintWriter out =	resp.getWriter();
			out.println(result);
			
	
	}
	
	
	
	
	
}
