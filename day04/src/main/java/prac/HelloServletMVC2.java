package prac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pracHello4")
public class HelloServletMVC2 extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		//내용이 모델이다 (Model)
		String content = "A c orn Student";
		//jsp 에서는 여기있는 모델.내용을 쓸수 없기때문에 저장소를 사용한다. 

		//저장소사용 (request 저장소를 사용)
					//아래부분 key 부분은  부분은 내맘대로 지정가능
		req.setAttribute("content", content);
		// 위 코드로 모델저장  하지만 바로 출력하면 나오지 않고 이 저장소를 jsp 파일에 알려줘야한다. 
		
		
		req.getRequestDispatcher("WEB-INF/views/pracHello4.jsp").forward(req, resp);
	
	}
}
