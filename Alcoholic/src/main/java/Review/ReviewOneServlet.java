package Review;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/reviewOne")
public class ReviewOneServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String review_id = req.getParameter("review_id");
		ReviewService service = new ReviewService();
		Review review = service.getReview_id(review_id);

		req.setAttribute("review_id", review);
		req.getRequestDispatcher("/WEB-INF/views/reviewOne.jsp").forward(req, resp);
	
	}
}
