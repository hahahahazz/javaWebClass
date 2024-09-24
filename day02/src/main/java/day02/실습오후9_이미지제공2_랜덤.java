package day02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cute/img2")
			//	/cute/img?su=1 	1이면 1번이미지 2이면 2번이미지 이런식인건가 
public class 실습오후9_이미지제공2_랜덤 extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		
		
		
		
		
		
		
		PrintWriter out = resp.getWriter();
		out.println("<html><head></head><body>");
		out.println("<img src = \"/day02/춘식이.jpg\"/>");
		out.println("</body> </html>");
				
	}
	
}
