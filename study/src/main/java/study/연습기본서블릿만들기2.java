package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/ex12")
			

public class 연습기본서블릿만들기2 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
	
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}

// 아래 처럼 심플하게 표현해도 되고 		
//		PrintWriter out = resp.getWriter();
//		out.println(sum);
		
		
		
		PrintWriter out =  resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("HIHIHIHIHIHIHIHHIHIHI");
		out.println("✨");
		out.println("1부터 10 까지의 합은 다음과 같다. ");		
		out.println(sum);		
		out.println("</body>");
		out.println("</html>");

	}
		
}
/* 서블릿으로 만든는 방법
1. HttpServlet 을 상속받기
2.서블릿으로 등록하기  @WevServlet ("/hi")
								어떤 요청의 이름으로 들어올거냐 지정해주기 
								어떤이름으로 요청이들어왓을때 처리할지 
								이부분이 매핑 ! 매핑의 이름은 겹치면, 중복되면 안된다. 그럼 실행안된다. 
						이 이름으로 클라이언트의 요청이 들어오면 이 이름 부분을 실행해 달라는 의미
						그래서 출력하면 이부분이 동작한다는 거다 .
3. service 매서드를 자신의 요청에 맞게 응당할 수 있도록 재정의 해야한다. 
4. 응답하기 - 출력스트림을 통해서 만든응답 내용을 보내야 한다. html 형식으로데이터를 보내기




//톰캣  = 서블릿 컨테이너라고 한다
//요청이 들어오면 그 요청에 대한 내용을 만들어서 html 형식으로 내보내준다.

//서블릿을 만드는 방법
//1. 서블릿을 상속받는다
//2. 톰캣은 서블릿을 실행시켜주는 프로그램인데 시작전에 약속되어있다
// 그래서. 2. 서블릿의 시작매서드 service 를 오버라이드 한다. (	)
//자신이 책임져야하는 요청에대해 오버라이드하면된다
//주문정보, 상품상세정보, 댓글...
//3. 요청에 대한 내용을 만든다  (= 응답결과를 만든다)
//4. 요청한 쪽으로 응답한다. 


//요청( /hi3) => 간단한 메시지를 제공하는 서비스  
//이요청을 처리하기 위한 서블릿을 만들고 응답하기
//서블릿 url 에서 요청하는 매칭 정하기



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
*/
