package Review;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/update")
public class UpdateReviewServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		String user_id = req.getParameter("user_id");
		String product_no = req.getParameter("product_no");
		String item_no = req.getParameter("item_no");
		String title = req.getParameter("title");
		String review_contents = req.getParameter("review_contents");
		String rating = req.getParameter("rating");

		Review review = new Review(user_id, product_no, item_no, title, review_contents, rating);
		
		ReviewService service = new ReviewService();
		service.updateReview(review);
	
		resp.sendRedirect("/Alcoholic/reviewList");
		
	}
}
