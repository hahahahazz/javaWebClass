package 회원정보;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class CustomerDAO {

	//customer_id, customer_name, customer_tell, customer_birth, customer_point
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	
//DB 연결	
	public Connection dbcon() {
		
		Connection con = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			if( con != null) System.out.println("db ok");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	

	
// 고객명단 조회
	
	public ArrayList<Customer> selectAll(){
		
		ArrayList<Customer> list= null;
		list = new ArrayList<>();	
		//db연결
		 Connection con  =dbcon();
		 PreparedStatement pst= null;
		 ResultSet  rs = null;
		
		//sql작성
		
		 try {
			 String sql="select * from customer_tbl4";
			pst= 	con.prepareStatement(sql);
			 rs= pst.executeQuery();
				
			 while( rs.next()) {
				 System.out.println( rs.getString(2));
				 String customer_id = rs.getString(1);
				 String customer_name = rs.getString(2);
				 String customer_tell = rs.getString(3);
				 String customer_birth = rs.getString(4);
				 String customer_point = rs.getString(5);
				 Customer cus = new Customer( customer_id, customer_name, customer_tell, customer_birth, customer_point);
				 list.add(cus);				 
			 }			
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //실행된 결과 
		 close(rs, pst, con);
		
		return list;
	}
	
	
	



	//고객등록 회원가입 - signUp
	public void signUpMember(Customer newCus) {
		
		 if (newCus.getCustomer_id() == null || newCus.getCustomer_id().isEmpty()) {
		        throw new IllegalArgumentException("Customer ID cannot be null or empty");
		    }
		
		Connection con = dbcon();
		PreparedStatement pst =null;
		
		String sql = "insert into customer_tbl4(customer_id, customer_name, customer_tell, customer_birth)"
				+ "values(?,?,?,?)";
		
		try {
			pst =con.prepareStatement(sql);
			
			pst.setString(1, newCus.getCustomer_id());
			pst.setString(2, newCus.getCustomer_name());
			pst.setString(3, newCus.getCustomer_tell());
			pst.setString(4, newCus.getCustomer_birth());
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(pst, con);
	}
	

	//정보 업데이트하기  - 목록의 id 를 입력하고 뒤의 내용을 수정하면 그내용으로 정정된다. 
	public void update(String id, String name, String tell, String birth, String point) {
		
		Connection con = dbcon();
		PreparedStatement pst = null;
		
		String sql = " update customer_tbl4 set customer_name=?, customer_tell=?, customer_birth=?, customer_point=? where customer_id=? ";
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1,name);
			pst.setString(2, tell);
			pst.setString(3, birth);
			pst.setString(4, point);
			pst.setString(5, id);
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(pst, con);
	}
	
	
	
	
	// 특정 ID 로 조회하기 
	public Customer selectOne( String id) {
		//연결
		Connection con  =dbcon();
		PreparedStatement pst  =null;
		ResultSet   rs  = null;
		
		//sql
		String sql = "select * from customer_tbl4 where customer_id =? ";
		Customer cus = null;
		
		try {
			pst = con.prepareStatement(sql);
			
			pst.setString(1, id);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				//id가 존재한다면 
				String id_tmp  = rs.getString(1);
				String name =  rs.getString(2);
				String tell = rs.getString(3);	
				String birth = rs.getString(4);	
				cus = new Customer(id_tmp, name, tell, birth);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(rs, pst, con);
		return cus;
	}
	
	//회원 탈퇴 
	public void delete (String id) {
		Connection con = dbcon();
		String sql = "delete customer_tbl4 where customer_id=?";
		PreparedStatement pst = null;
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(pst, con);
	}
	
	
	
	
	
	
	
	
	
	
// 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDAO dao = new CustomerDAO();
		
		ArrayList<Customer> list  =dao.selectAll();
		System.out.println( list);
	//고객 추가
		//Customer cus = new Customer("Z012","길동","010-0021-7878","12-12","0");
		//dao.signUpMember(cus);
	//고객 삭제
//		Customer c = dao.selectOne("Z999");
//		System.out.println(c);
		dao.update("Z012", "하하", "010-1478-2580", "12-04","0");
		
	}
	
//
	public void close (AutoCloseable ...a ) {
		for( AutoCloseable item : a) {
			
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
