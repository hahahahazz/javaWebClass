package Cafe;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/customer")
public class CustomerServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		CustomerService service = new CustomerService();
		ArrayList<Customer> cuslist = service.getCusList();
	
		req.setAttribute("cuslist", cuslist);
		req.getRequestDispatcher("WEB-INF/views/cuslist.jsp").forward(req, resp);
		
		//PrintWriter out = resp.getWriter();
		//out.println(cuslist);
	}
}
