package 회원정보;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		
		
		String id = req.getParameter("customer_id");
		String name = req.getParameter("customer_name");
		String tell = req.getParameter("customer_tell");
		String birth = req.getParameter("customer_birth");
		
		Customer cus = new Customer(id, name, tell, birth);
		
		CustomerService service = new CustomerService();
		service.modifyMember(id, name, tell, birth, birth);
	
		req.getRequestDispatcher("WEB_INF/views/list.jsp").forward(req, resp);
	
	
	
	
	}
		
}
