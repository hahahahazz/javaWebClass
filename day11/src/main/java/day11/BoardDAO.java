package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BoardDAO {

	String driver = "oracle.jdbc.driver.OracleDriver" ;
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";

	private Connection dbCon() {		
		Connection con = null;
		
		try {
			Class.forName(driver);
			con =DriverManager.getConnection(url, user, password);
			if( con != null) { System.out.println("db ok");}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	
	//페이징 리스트 구하기 ArrayList<Acorn>
	
	
	
	
	// 전체레코드 수 구하기
	
	
	
	
	
	
	
	
	
	
	
	
}
