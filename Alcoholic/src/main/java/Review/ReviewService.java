package Review;

import java.util.ArrayList;

public class ReviewService {

	ReviewDAO dao = new ReviewDAO();
	public ArrayList<Review> getReview(){
		return dao.selectReview();
	}

	//리뷰 아이디로 조회하기
	public Review getReview_id(String review_id) {
		Review review = dao.selectOne(review_id);
		return review;
	}
	//업데이트 하기 
	public Review updateReview(Review review) {
		return dao.update(review);
	}
	
	//리뷰추가
	public void addReview(Review review) {
        dao.addReview(review);
    }
}
