package Cafe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MenuDAO {
	
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	
	//db연결 
	public Connection dbcon() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
	
			if(con != null)System.out.println("GOOD");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	//db연결 정보 조회
	public ArrayList<Menu> selectMenu(){
		ArrayList<Menu> list = new ArrayList<>();
		
		//db 연결
		Connection con = dbcon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		//sql 작성
		String sql="select * from menu_tbl";
		
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			//menu_id, menu_name, menu_price, menu_point
			while(rs.next()) {
				String menu_id = rs.getString(1);
				String menu_name = rs.getString(2);
				String menu_price = rs.getString(3);
				String menu_point= rs.getString(4);
				
				Menu menu = new Menu(menu_id, menu_name, menu_price, menu_point);
				list.add(menu);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(rs, pst, con);
		return list;		
	}
	
	public void close(AutoCloseable ...a) {
		for(AutoCloseable item : a) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MenuDAO dao = new MenuDAO();
		ArrayList<Menu> list  = dao.selectMenu();
		for(Menu menu : list) {
			System.out.println(menu);
		}
	}
	
}
