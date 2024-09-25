package Store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StoreDAO{
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";	
	
	
	public Connection dbcon() {
		
		Connection con = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			if(con != null) System.out.println("ok");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	
	public ArrayList<Store> selectAll(){
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList<Store> list = new ArrayList<>();
		
		con = dbcon();
		String sql = "select * from store_tbl";
		try {
			pst =con.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				String store_id = rs.getString(1);
				String store_name = rs.getString(2);
				String store_tell = rs.getString(3);
				String store_total = rs.getString(4);
				
				Store store = new Store(store_id, store_name, store_tell, store_total);
				list.add(store);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	

}
