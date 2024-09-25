package CafeCustomer;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cusList")

public class CustomerServlet extends HttpServlet{

	//customer_id, customer_name, customer_tell, customer_birth, customer_point

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		//MODEL
		CustomerService service = new CustomerService();
		ArrayList<Customer> list = service.getCustomerList();
	
		
		//MODEL저장
		req.setAttribute("list", list);
	
		req.getRequestDispatcher("WEB-INF/views/list.jsp").forward(req, resp);
	
	
	}
	
	
	
	
	
}
