package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/* 서블릿으로 만든는 방법
1. HttpServlet 을 상속받기
2.서블릿으로 등록하기  @WevServlet ("/hi")
							어떤이름으로 요청이들어왓을때 처리할지  그 이름 지정해주기
							이부분이 매핑 ! 매핑의 이름은 겹치면, 중복되면 안된다. 그럼 실행안된다. 
						이 이름으로 클라이언트의 요청이 들어오면 이 이름 부분을 실행해 달라는 의미
						그래서 출력하면 이부분이 동작한다는 거다 .
3. service 매서드를 자신의 요청에 맞게 응당할 수 있도록 재정의 해야한다. 
4. 응답하기 - 출력스트림을 통해서 만든응답 내용을 보내야 한다. html 형식으로데이터를 보내기

*/
@WebServlet("/ex23")
		// /ex2 라고 정한 서블릿을 만든 사람이 수를 입력받아 계산후 출력하고 싶다면
		//수 를 입력받을 때 그 키는 내가 지정해주면 된다 . service 부분 에서 getParameter 의 값으로
	//그리고 사이트에서 주소창에	/ex2?su=3		이런식으로 입력해주면 3 을 입력받아 계산후 출력됨
public class 연습수입력받아출력3_10까지합 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//서버는 클라이언트가 보낸 값을 얻어 올 수 있다.	클라이언트가 보낸 정보,요청에 관련한 건 request   내가 응답해야하는 부분은 response
		
		//>_____________________< Hello 여러번 출력해보기
		
	//요청하는 쪽인 클라이어트 (사용자)가 보낸 값을 얻어오기. 
	//요청값을 다 req  객체에 담아서 얻어오면된다. 
		// req.getParameter();
		//	su_ 라는 스트링변수에 넣기	  su라는 이름의 키로 값을 얻어와서
		String su_ = req.getParameter("su"); 
		// 숫자로 변환해서 사용하기		"215"	=>	215
		int su = Integer.parseInt(su_);		
		
		//원하는 코드 입력하기 
		//>_____________________< Hello 여러번 출력해보기 난 이 문장을 입력받은만큼 연속 출력하겠다
		
		String result = "";
		for(int i =1; i<=su; i++) {
			result += "<h1> >_____________________< Hello </h1>";
		}
		
		
		
//응답하기 
	// 클라이언트(사용자)에게서 요청을 받았으니 응답하려면 나가는길, 즉 출력스트림을 얻어와야한다
	// response 객체에 있기에 그걸 가져오기만 하면된다. 	=	resp.getWriter();
		
		PrintWriter out =  resp.getWriter();
//		out.println("<html> <head> </head> <body> <h2> >______< </h2> </body> </html>");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("HIHIHIHIHIHIHIHHIHIHI");
//		out.println("✨");
		out.println(result);
		out.println("</body>");
		out.println("</html>");

	}
		
}
