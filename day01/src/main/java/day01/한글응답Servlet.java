package day01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/hangul")
public class 한글응답Servlet extends HttpServlet{

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
	
	out.println("안녕 서블릿!!!!!!>____< ༼ つ ◕_◕ ༽つ");
	out.println("○( ＾皿＾)っ Hehehe…○( ＾皿＾)っ Hehehe…○( ＾皿＾)っ Hehehe…");
	out.println("(￣y▽￣)╭ Ohohoho.....(￣y▽￣)╭ Ohohoho.....(￣y▽￣)╭ Ohohoho.....");
	out.println("(⌐■_■)(▀̿Ĺ̯▀̿ ̿)ヾ(⌐■_■)ノ♪(▀̿Ĺ̯▀̿ ̿)( •_•)>⌐■-■(▀̿Ĺ̯▀̿ ̿)ヾ(⌐■_■)ノ♪");
	out.println("┬┴┬┴┤(･_├┬┴┬┴┬┴┬┴┤(･_├┬┴┬┴┬┴┬┴┤(･_├┬┴┬┴┬┴┬┴┤(･_├┬┴┬┴┬┴┬┴┤(･_├┬┴┬┴");
	out.println("(╯‵□′)╯︵┻━┻┳━┳ ノ( ゜-゜ノ)(╯°□°）╯︵ ┻━┻┻━┻ ︵ ＼( °□° )／ ︵ ┻━┻(ヘ･_･)ヘ┳━┳");
	
	
	}
	
	
}
