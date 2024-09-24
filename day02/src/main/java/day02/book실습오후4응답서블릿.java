package day02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/book")
public class book실습오후4응답서블릿 extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		
		book b1 = new book("해리포터와 아즈카반의 죄수","조앤.k.롤링","판타지","18,900원");
		book b2 = new book("언젠가 우리가 같은 별을 바라본다면","차인표","문학소설","12,800원");
		book b3 = new book("이중 하나는 거짓말","김애란","문학소설","16,000원");
		book b4 = new book("불안 세대","조너선 하이트","교양 인문학","24,800원");
		book b5 = new book("이명의 탄생","페르난두 페소아","외국에세이","18,500원");
		//이명의 탄생 첫문장 	
//사람들은 내가 흉내로 혹은 거짓으로 글을 쓴다고 하지만 그렇지 않다. 나는 그저 상상으로 느낄 뿐. 마음을 사용하지 않을 뿐.
	
		PrintWriter out = resp.getWriter();
		out.println(b1);
		out.println(b2);
		out.println(b3);
		out.println(b4);
		out.println(b5);
	
	
	}	
}
