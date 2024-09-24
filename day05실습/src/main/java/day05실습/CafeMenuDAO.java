package day05실습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CafeMenuDAO {
	// DB 연결정보    driver  url  사용자, 비밀번호
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	
	
	public Connection dbcon() {
		
		Connection con = null;
		
		try {
			//1. 드라이버 로드 (객체생성)
			Class.forName(driver);
			//2. 데이터베이스 연결
			con = DriverManager.getConnection(url, user, password);
			
			if(con != null) System.out.println("hahaha");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public ArrayList<CafeMenu> selectAll(){
		
		//연결 
		Connection con = dbcon();
		
		//sql
		String sql = "select * from menu_tbl";
		
		//sql 실행
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		ArrayList<CafeMenu> list = new ArrayList<>();
		
		try {
			
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				String menu_id = rs.getString(1);
				String menu_name = rs.getString(2);
				String menu_price = rs.getString(3);
				String menu_point = rs.getString(4);
				
				CafeMenu m = new CafeMenu(menu_id,menu_name,menu_price, menu_point);
				list.add(m);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//해제 
		close (rs, pst, con);
		return list;
		
		
		
	}
	
	
	public void close (AutoCloseable ... a) {
		for (AutoCloseable item : a) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		CafeMenuDAO dao = new CafeMenuDAO();
		
		ArrayList<CafeMenu> list = dao.selectAll();
		System.out.println(list );
		
	}
	
	
	
	
	
}
