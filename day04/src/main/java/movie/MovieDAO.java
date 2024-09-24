package movie;

import java.sql.*;
import java.util.ArrayList;

//DAO 를 만드는 이유는 
/*
Data Access Object 
별도의 메서드로 다빼는 거다 
db 연동하는거 연결하는거도 다 메소드로 뺀다

테이블하나당 dao 하나가 나온다 

*/


public class MovieDAO {

	//url
	//사용자 , 비밀번호		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "scott";
		String password = "tiger";
	
	//
		Connection dbCon() {
			
			Connection con = null;
			
			
			try {
				//1. 오라클 회사에서 제공하는 드라이브를 로드한다.
				Class.forName(driver);
				//2.
				con = DriverManager.getConnection(url, user, password);
				
				
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return con;
			
			
			
		}

		//영화정보를 데이터베이스로부터 가져올거다
		public ArrayList<Movie> selectAll(){
			
			Connection con = dbCon();
			PreparedStatement  pst = null;
			ResultSet rs = null;
			
			ArrayList<Movie> list = new ArrayList<>();
			
			String sql = "select * from movietbl";
			try {
				pst = con.prepareStatement(sql);
				rs = pst.executeQuery();
				
				
				while(rs.next()) {	//한줄, 한행 (레코드)  가져오기
					
					String id = rs.getString(1);
					String title = rs.getString(2);
					String url = rs.getString(3);
					String genre = rs.getString(4);
					
					//
					Movie m = new Movie(id, title, url, genre);
					list.add(m);
					
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return list;
		}
		
	public static void main(String[] args) {
		MovieDAO m = new MovieDAO();
		ArrayList<Movie> list =  m.selectAll();
		
		System.out.println(list);
	}
		
}
