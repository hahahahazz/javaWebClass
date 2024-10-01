package day10;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/pracEL1")
public class ELServlet1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//request : 하나의 서비스가 요청이 되서 응답이 이루어지기 전까지 사용할 수 있는 저장소
		//session  : 하나의 클라이언트가 사용할 수 있는 저장소 
		//둘다 서버에서 제공하는 저장소이다
		
		req.setAttribute("data", "EL이 뭐에여?");
	req.getRequestDispatcher("WEB-INF/views/el1.jsp").forward(req, resp);
	
	}
}
