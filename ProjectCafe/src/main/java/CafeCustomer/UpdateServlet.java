package CafeCustomer;

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
		
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String tell = req.getParameter("tell");
		String birth = req.getParameter("birth");
		String point = req.getParameter("point");
		
		
		Customer cus = new Customer(id, name, tell, birth, point);
		
		System.out.println(cus);
		
		CustomerService service = new CustomerService();
		//service.modifyMember(id, name, tell, birth, point);
		service.modifyMember(cus);
		
		//req.getRequestDispatcher("WEB_INF/views/list.jsp").forward(req, resp);
		resp.sendRedirect("/ProjectCafe/cusList");
		
	
	
	
	}
		
}
