package day01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HELLo")
public class HellServlet2 extends HttpServlet{

	
		
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// 안녕 서블릿!! >< 한글로 응답	
				//응답 정보를 설정할 수 있다.
				//서버가 보내는 데이터가 html 형식의 데이터이다
				//보내는 데이터의 형식을 지정할 수 있다. 
				//주의사항 이 있다. 출력스트림을 얻기전에 설정해야한다
					//아래 두가지 설정해야하는데 순서도 맞춰야한다.
					
				response.setCharacterEncoding("UTF-8");
				response.setContentType("text/html;charset=utf-8");
				//response.setContentType("text/plain;charset=utf-8");
		
		
		PrintWriter out = response.getWriter();
		out.println(
				"<html> <head> </head> <body> <h1>  HTML </h1> html 태그는 대소문자를 구분하지 않는다. 파일명의 확장자는 반드시 html 이나 htm 으로 지정한다.<br> br 을 줘야 엔터키 를 적용한 듯 줄 바꿈이 가능하다 <br>두칸 이상 연속된 공백은 하나의 공백으로 처리된다. <br> 아 아 아 아  아  아  아 " );
		out.println("<table border=\"1\">\r\n"
				+ "        <caption>색깔의 종류</caption>\r\n"
				+ "        <thead>\r\n"
				+ "            <tr>\r\n"
				+ "                <th>종류</th><th>밝은계열</th>\r\n"
				+ "            </tr>\r\n"
				+ "        </thead>");
		out.println(" <tbody>\r\n"
				+ "            <tr>\r\n"
				+ "                <td>1</td> <td>하늘색</td>\r\n"
				+ "            </tr> \r\n"
				+ "            <tr>\r\n"
				+ "                <td>2</td> <td>빨간색</td>\r\n"
				+ "            </tr>\r\n"
				+ "        </tbody>\r\n"
				+ "    </table>");
		out.println("</body> </html>");
		
		
	}
	

	
}
