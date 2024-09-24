package day02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//약수구하기 김정석
@WebServlet("/divisor")
public class Divisor extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String _su = req.getParameter("su");
		
		PrintWriter out = resp.getWriter();
		
		if(_su == null) {
			out.println("null");
		} else {
			int su = Integer.parseInt(_su);
			String result = getDevisor(su);
			
			out.println(result);
		}
	}
	
	//라이브러리 를 만들때는 별도의 자바파일로 만들어서 다른사람도 쓸수 있게 배포할수 있게 만들어주면 더 낫다 
	public String getDevisor(int n) {
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 1; i <= n; i ++) {
			if(n % i == 0) {
				al.add(i);
			}
		}
		return al.toString();
	}
}


