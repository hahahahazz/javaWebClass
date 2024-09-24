package day02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/book2")
public class book실습오후4응답서블릿2 extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		
		book b1 = new book("해리포터와 아즈카반의 죄수","조앤.k.롤링","판타지","18,900원");
		book b2 = new book("언젠가 우리가 같은 별을 바라본다면","차인표","문학소설","12,800원");
		book b3 = new book("이중 하나는 거짓말","김애란","문학소설","16,000원");
		book b4 = new book("불안 세대","조너선 하이트","교양 인문학","24,800원");
		book b5 = new book("이명의 탄생","페르난두 페소아","외국에세이","18,500원");
	
		PrintWriter out = resp.getWriter();
		out.println(b1);
		out.println("<html><head>");	
		out.println("<style>");			
		out.println("table{ border : 1px solid black;"
				+"color : black;"
				+ "background-color: beige;}");			
		out.println("th { border : 1px solid blue;}");			
		out.println("td { border : 1px solid blue;}");
		
		out.println("</style>");			
		out.println("</head>");	
		out.println("<body>");	
		//
		out.println("<table>");	
		//
		out.println("<tr>");	
		
		out.println("<th> 책 제목 </th>");	
		out.println("<th> 작가 </th>");	
		out.println("<th> 장르 </th>");	
		out.println("<th> 가격 </th>");	
		
		out.println("</tr>");
		
		//
		out.println("<tr>");	
		
		out.println("<td>"+ b1.name +"</td>");	
		out.println("<td>"+ b1.author + "</td>");	
		out.println("<td>"+ b1.genre + "</td>");	
		out.println("<td>"+ b1.price + "</td>");	
		
		out.println("</tr>");
		
		//
out.println("<tr>");	
		
		out.println("<td>"+ b2.name +"</td>");	
		out.println("<td>"+ b2.author + "</td>");	
		out.println("<td>"+ b2.genre + "</td>");	
		out.println("<td>"+ b2.price + "</td>");	
		
		out.println("</tr>");
		//
out.println("<tr>");	
		
		out.println("<td>"+ b3.name +"</td>");	
		out.println("<td>"+ b3.author + "</td>");	
		out.println("<td>"+ b3.genre + "</td>");	
		out.println("<td>"+ b3.price + "</td>");	
		
		out.println("</tr>");
		//
		out.println("<tr>");	
		
		out.println("<td>"+ b4.name +"</td>");	
		out.println("<td>"+ b4.author + "</td>");	
		out.println("<td>"+ b4.genre + "</td>");	
		out.println("<td>"+ b4.price + "</td>");	
		
		out.println("</tr>");
		
		//
		out.println("<tr>");	
		
		out.println("<td>"+ b5.name +"</td>");	
		out.println("<td>"+ b5.author + "</td>");	
		out.println("<td>"+ b5.genre + "</td>");	
		out.println("<td>"+ b5.price + "</td>");	
		
		out.println("</tr>");
		
		
		
		out.println("</table>");	
		
		
		
		out.println("</body>");	
		out.println("</html>");	
	
	
	}	
}
