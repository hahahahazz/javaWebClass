package day10;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/acornList")
public class AcornList extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//Model - service,  dao
		AcornService service = new AcornService();
		ArrayList<Acorn>list = service.getList();
		
		req.setAttribute("list", list);
	
		req.getRequestDispatcher("WEB-INF/views/list0.jsp").forward(req, resp);
	
	}
}
