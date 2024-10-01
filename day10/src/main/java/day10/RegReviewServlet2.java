package day10;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
@WebServlet("/reg2")
public class RegReviewServlet2 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	//꺼내보기
		
		req.setCharacterEncoding("UTF-8");
		
		
		//req.getInputStream();	//당신이보낸게 이미지나 다른 형식인가요 그럼 이걸 쓰세요
//		req.getReader(); 	// 당신이 보낸게 텍스트형식인가요 그럼 이걸쓰세요
		//클라이언트의 요청 바디의 내용 읽어오기
		BufferedReader reader = req.getReader();
		
		StringBuilder build = new StringBuilder();
		String line = null;
		while((line = reader.readLine()) != null) {
			build.append(line);
			
		}
		
		System.out.println(build.toString());
		
		String bodyData = build.toString();	// <= {"id":"1","content":"like it"}
		
		//JSON 객체로 변환 	//JSON 라이브러리 lib 폴더 에 있는지 확인!
		//그러고 나서 자바 객체로 변환
		JSONObject o = new JSONObject(build.toString());
		
		String id = o.getString("id");
		String content = o.getString("content");
		
		Review review = new Review(id, content);
	
		System.out.println(review);
		
		resp.getWriter().println("ok");
	}
}
