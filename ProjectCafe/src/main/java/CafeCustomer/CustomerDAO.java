package CafeCustomer;

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
	public int update(Customer cus) {
		int rRow=0;
		Connection con = dbcon();
		PreparedStatement pst = null;
		
		String sql = " update customer_tbl4 set customer_name=?, customer_tell=?, customer_birth=?, customer_point=? where customer_id=? ";
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, cus.getCustomer_name());
			pst.setString(2, cus.getCustomer_tell());
			pst.setString(3, cus.getCustomer_birth());
			pst.setString(4, cus.getCustomer_point());
			pst.setString(5, cus.getCustomer_id());
			rRow = pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(pst, con);
		return rRow;
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
				String point = rs.getString(5);
				cus = new Customer(id_tmp, name, tell, birth, point);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(rs, pst, con);
		return cus;
	}
	
	//회원 탈퇴 
	public int delete (String id) {
		int rRow=0;
		Connection con = dbcon();
		PreparedStatement pst = null;
		
		String sql = "delete from customer_tbl4 where customer_id=?";
		
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			rRow = pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(pst, con);
		
		return rRow;
	}
	
	
	//사용자 인증 메서드 
	public boolean authenticate(String memberId) {
		Connection con = dbcon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		boolean isValidUser = false;
		
		String sql= "SELECT customer_id FROM customer_tbl4 WHERE customer_id = ?";
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, memberId);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				isValidUser = true;	// 사용자 ID 가 존재하면 인증성공
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return isValidUser;
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
		//dao.update("Z012", "하하", "010-1478-2580", "12-04","0");
		
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
