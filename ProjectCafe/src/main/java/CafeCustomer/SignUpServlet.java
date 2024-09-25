package CafeCustomer;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	req.getRequestDispatcher("WEB-INF/views/signUp.jsp").forward(req, resp);	
	}
	
	
	
	//customer_id, customer_name, customer_tell, customer_birth, customer_point
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
	
	
		String id = req.getParameter("customer_id");
		String name = req.getParameter("customer_name");
		String tell = req.getParameter("customer_tell");
		String birth = req.getParameter("customer_birth");
		
		
		   // ID 유효성 검사
	    if (id == null || id.trim().isEmpty()) {
	        throw new IllegalArgumentException("id cannot be null or empty");
	    }
	
		Customer cus = new Customer(id, name, tell, birth);
	
		CustomerService service = new CustomerService();
		service.signUpMember(cus);
		
		//req.getRequestDispatcher("WEB-INF/views/signUp.jsp").forward(req, resp);
		resp.sendRedirect("/ProjectCafe/cusList");
		
	}
	
	
	
}
