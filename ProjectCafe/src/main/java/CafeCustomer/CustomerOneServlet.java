package CafeCustomer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/one")
public class CustomerOneServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String id = req.getParameter("customer_id");
	
	CustomerService service = new CustomerService();
	Customer customer = service.getMember(id);
	req.setAttribute("customer", customer);
	
	req.getRequestDispatcher("WEB-INF/views/member.jsp").forward(req, resp);
	
	
	
	
	}
	
	
}
