package Menu;

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
	
	
	private void dbClose(AutoCloseable...autoCloseables) {
		for(AutoCloseable a:autoCloseables) {
			if(a != null)
				try {
					a.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	
	// 전체조회
	public ArrayList<CafeMenu> selectAll(){
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList<CafeMenu> list = new ArrayList<>();
		
		con = dbcon();
		String sql = "select  trim(menu_id),  menu_name, menu_price, menu_point from menu_tbl ";
		
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
		}finally {
			dbClose(rs, pst, con);
		}
		return list;
	}
	

	// 하나만 조회
	public CafeMenu selectOne(String menu_id) {
		
		
		System.out.println( menu_id );
		
		Connection con = dbcon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		CafeMenu menu = null;
		String sql = "select  trim(menu_id),  menu_name, menu_price, menu_point from menu_tbl where menu_id = ?";
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
		}finally {
			dbClose(rs, pst, con);
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
		}finally {
			dbClose(pst, con);
		}
		return rRow;
	}
	
	
	// 수정
	public int update(CafeMenu menu) {
		
		int rRow = 0;
		
		Connection con = dbcon();
		PreparedStatement pst = null;
		String sql = "update menu_tbl set menu_name=?, menu_price=?, menu_point=? where menu_id=?";
		try {
			pst = con.prepareStatement(sql);
			
			pst.setString(1, menu.getMenu_name());
			pst.setString(2, menu.getMenu_price());
			pst.setString(3, menu.getMenu_point());
			pst.setString(4, menu.getMenu_id());
			
			rRow = pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dbClose(pst, con);
		}
		
		return rRow;
	}
	
	
	
	// 삭제
	public int delete(String menu_id) {
		int rRow = 0;
		
		Connection con = dbcon();
		PreparedStatement  pst = null;
		
		String sql = "delete from menu_tbl where menu_id=?";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, menu_id);
			rRow = pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dbClose(pst, con);
		}
		
		return rRow;
	}
	

	public ArrayList<CafeMenu>  getCafeMenuList(){		
		
		 Connection con  =dbcon();		 
		 String sql=" select  * from  menu_tbl ";
		 ArrayList<CafeMenu> list = new ArrayList<>();
		 
		 try {
			PreparedStatement pst  = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while( rs.next()){				
				 String menu_id=rs.getString(1);
				 String menu_name= rs.getString(2);
				 String menu_price= rs.getString(3);
				 String menu_point= rs.getString(4);
				 
				 CafeMenu cafeMenu = new CafeMenu(menu_id,menu_name,menu_price,menu_point);
				 list.add(cafeMenu);						 
			   	
			}	
			rs.close();
			pst.close();
			con.close();
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	 
		return list;	 
		
	}
	
	
	public static void main(String[] args) {
		
		CafeMenuDAO dao = new CafeMenuDAO();
		ArrayList<CafeMenu> list = dao.selectAll();
		CafeMenu menu = new CafeMenu();
		
		
//		전체메뉴 정보확인 테스트
//		for(CafeMenu menu : list) {
//			System.out.println(menu);
//		}
		
		
//		개별메뉴 정보확인 테스트
//		CafeMenu menu = dao.selectOne("A006");
//		System.out.println(menu.getMenu_id());
//		System.out.println(menu.getMenu_name());
		
		
//		메뉴추가 테스트
//		int result = dao.insert(new CafeMenu("A007", "물", "1000", "0"));
//		System.out.println(result);
		
		
//		메뉴수정 테스트
//		menu.setMenu_name("초코맛밀키스");
//		menu.setMenu_price("33250");
//		menu.setMenu_point("123456");
//		menu.setMenu_id("A006");
//		int rtn = dao.update(menu);
//		System.out.println(rtn);
//		CafeMenu m = dao.selectOne("A006");
//		System.out.println(m.getMenu_name());
		
		
//		메뉴삭제 테스트
//		int rtn = dao.delete("A007");
//		System.out.println(rtn);
		
	}
	
	
}
