package CafeCustomer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("customer_id");
		
		CustomerService service = new CustomerService();
		service.deleteMember(id);
		
		//req.getRequestDispatcher("WEB-INF/views/list.jsp").forward(req, resp);
		resp.sendRedirect("/ProjectCafe/cusList");
	}
}
