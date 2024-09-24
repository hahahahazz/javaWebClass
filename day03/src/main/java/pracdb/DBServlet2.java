package pracdb;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/acornlist2")
public class DBServlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	//
		AcornDAO dao  = new AcornDAO();
		ArrayList<Acorn> list = dao.getAcornList();
	
	
	
		System.out.println(list);
	
		
		//이 데이터를 서블릿에서 직접 응답하기
		//jsp(view) 를 사용해서 응답하기 - 서블릿(Controller 역할) , jsp(view 껍데기) , model(데이터) => mvc2
	
		req.setAttribute("list", list);
		
		
		req.getRequestDispatcher("WEB-INF/views/list.jsp").forward(req, resp);
		
		
	
		
		
	}
	
	
	
}
