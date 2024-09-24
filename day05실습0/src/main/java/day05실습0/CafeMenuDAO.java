package day05실습0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CafeMenuDAO {
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";	
	
	
	
	public Connection dbcon() {
		
		Connection con = null;
		
		try {
			Class.forName(driver);
			 con = DriverManager.getConnection(url, user, password);
			 if(con != null) System.out.println("okokok");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	
	// 전체조회
	public ArrayList<CafeMenu> selectAll(){
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList<CafeMenu> list = new ArrayList<>();
		
		con = dbcon();
		String sql = "select * from menu_tbl";
		
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				String menu_id = rs.getString(1);
				String menu_name = rs.getString(2);
				String menu_price = rs.getString(3);
				String menu_point = rs.getString(4);
				
				CafeMenu menu = new CafeMenu(menu_id, menu_name, menu_price, menu_point);
				list.add(menu);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	

	// 하나만 조회
	public CafeMenu selectOne(String menu_id) {
		
		Connection con = dbcon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		CafeMenu menu = null;
		String sql = "select menu_id, menu_name, menu_price, menu_point from menu_tbl where id = ?";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, menu_id);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String price = rs.getString(3);
				String point = rs.getString(4);
				
				menu = new CafeMenu(id, name, price, point);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return menu;
	}
	
	
	// 등록
	public int insert(CafeMenu menu) {
		
		int rRow = 0;
		Connection con = dbcon();
		PreparedStatement pst = null;
		String sql = "insert into menu_tbl (menu_id, menu_name, menu_price, menu_point) values(?, ?, ?, ?)";
		try {
			pst = con.prepareStatement(sql);
			
			pst.setString(1, menu.getMenu_id());
			pst.setString(2, menu.getMenu_name());
			pst.setString(3, menu.getMenu_price());
			pst.setString(4, menu.getMenu_point());
			
			rRow = pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rRow;
	}
	
	
	// 변경
	public int update(CafeMenu menu) {
		
		int rRow = 0;
		
		Connection con = dbcon();
		PreparedStatement pst = null;
		String sql = "update menu_tbl set menu_name = ? where menu_id = ?";
		try {
			pst = con.prepareStatement(sql);
			
			pst.setString(1, menu.getMenu_name());
			pst.setString(2, menu.getMenu_id());
			
			rRow = pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rRow;
	}
	
	
	
	// 삭제
	int delete(String menu_id) {
		int rRow = 0;
		
		return rRow;
	}
	
	
	public static void main(String[] args) {
		
//		selectAll() 테스트
//		CafeMenuDAO dao = new CafeMenuDAO();
//		ArrayList<CafeMenu> list = dao.selectAll();
//		
//		for(CafeMenu menu : list) {
//			System.out.println(menu);
//		}
		
	}
	
	
}
