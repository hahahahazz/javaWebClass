package prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pracDan")
public class DanServelt extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String su_ = req.getParameter("su");
		
		int su =2;
		if(su_ != null) {
		su = Integer.parseInt(su_);
		}
		
		
		//2단 정보 = 이서비스에서 핵심데이터 = 모델 model 
		String result ="";			// 2*1 = 2
		
		for(int i =1; i<=9; i++) {
			String unit = su +"*" + i + "=" + su*i +"<br>"; 
			result += unit;
		}
		
		System.out.println(result);
		
		//응답하기 
	
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		resp.getWriter().println(result);
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		
		out.println("</style>");
		out.println("</head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div>");
		out.println(result);
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		
		
	}
	
}
