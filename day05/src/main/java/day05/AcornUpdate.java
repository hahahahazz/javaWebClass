package day05;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//회원정보 변경하는 서비스 만들어보자 		
//하나의 서비스에는  서블릿(컨트롤러), 모델(서블릿, DAO), view   =MVC 


@WebServlet("/update")
public class AcornUpdate extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
		//얻어오기 
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		
		
		Acorn acorn = new Acorn(id,pw,name);
		
		AcornService service = new AcornService();
		service.modifyMember(acorn);
		
		
	
		req.getRequestDispatcher("WEB-INF/views/updateok.jsp").forward(req, resp);
	
	}
	
	

	
}
