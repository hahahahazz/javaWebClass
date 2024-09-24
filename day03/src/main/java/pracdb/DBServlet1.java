package pracdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//에이콘 학생정보를 제곻하는 서비스 를 만들겟다. => 서블릿 한개

@WebServlet("/acornlist")
public class DBServlet1 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	//db
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "scott";
		String password = "tiger";
		
		ArrayList<Acorn> list = new ArrayList<>();
		
		try {
			//1.드라이버 로드
			Class.forName(driver);
			//2.데이터베이스 연결
		 	Connection con = DriverManager.getConnection(url, user, password);
			
		 	String sql = "select * from acorntbl";
			PreparedStatement pst = con.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String id =  rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				
				// Acorn 객체 생성
				Acorn acorn = new Acorn (id,pw,name);
				list.add(acorn);
				
			}
			rs.close();
			pst.close();
			con.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
	
		// 
		for(Acorn acorn : list ) {
			System.out.println(acorn);
		}
	
	
		//나가는 스트림을 통해서 응답하기
		
		resp.setCharacterEncoding("UTF-8");    
		resp.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");

		out.println("<style>");
		out.println("table, th {border : 1px solid black ;}");
		out.println("td {border : 1px solid black ;}");
		
		out.println("</style>");	
		
		out.println("</head>");
		out.println("<body>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<th>아이디</th>");
		out.println("<th>비밀번호</th>");
		out.println("<th>이름</th>");
		out.println("</tr>");
		
		for(Acorn acorn : list) {
			out.println("<tr>");
			out.println("<td>"+ acorn.getId()+"</td>");
			out.println("<td>"+ acorn.getPw()+"</td>");
			out.println("<td>"+ acorn.getName()+"</td>");
			out.println("</tr>");
			
		}
	
		out.println("</table>");
		
		out.println("</body>");
		out.println("</html>");
		
	
	}
	
	
	

}
