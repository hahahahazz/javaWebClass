package pracdb;

 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTEST {

	public static void main(String[] args) {

		// DB 연결하려면 
		//DB 연결정보 필요
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "scott";
		String password = "tiger";
		

		//1. 드라이버 로드( 클래스 정보를 로드해서 객체를 생성하겠다. 그래야 그클래스가 제공하는 메서드를 쓸수 있기때문에)
//		Class.forName("oracle.jdbc.driver.OracleDriver");
	
		try {
			//1. 드라이버 로드
			//Class.forName(driver);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.데이터 베이스 연결
			Connection con =  DriverManager.getConnection(url,user,password);
			
			//3.문장 얻어오기( 필요한 sql 을 실행하고 결과를 얻어옴)
			
			Statement st =  con.createStatement();	
								// 이부분 import 할 때 올바른 주소로 import 해야한다 .
			
			//필요한 sql  작성하기
			 String sql = "select * from acorntbl";
			
			 ResultSet rs = st.executeQuery(sql);
			
			//sql select 결과집합 가져오기 
			 while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
			
			rs.close();
			st.close();
			con.close();
			 
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
