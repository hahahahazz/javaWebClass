package Cafe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDAO {

	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	
	public Connection dbcon() {
		Connection con = null;
		try {
			Class.forName(driver);		
		
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
	
	public ArrayList<Customer> cafeCusList(){

		Connection con = dbcon();
		
		//sql 불러오기
		String sql ="select * from customer_tbl4";
		//sql 실행
		 PreparedStatement pst = null;
		 ResultSet rs = null;
		 
		 ArrayList<Customer> list = new ArrayList<>();
		 try {
			pst=con.prepareStatement(sql);
			rs =pst.executeQuery();
//String customer_id, String customer_name, String customer_tell, String customer_birth,String customer_point
			while(rs.next()) {
				String customer_id = rs.getString(1);
				String customer_name = rs.getString(2);
				String customer_tell = rs.getString(3);
				String customer_birth = rs.getString(4);
				String customer_point = rs.getString(5);
				
				Customer c = new Customer(customer_id,  customer_name,  customer_tell,  customer_birth,	customer_point);
				list.add(c);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 close(rs, pst, con);
		return list;
	}
	
	public void close( AutoCloseable ...a) {
		for( AutoCloseable  item : a) {
		   try {
			item.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}	
	}
	
	public static void main(String[] args) {
		CustomerDAO dao = new CustomerDAO();
		ArrayList<Customer> list = dao.cafeCusList();
		System.out.println(list );
	}
	
	
	
}
