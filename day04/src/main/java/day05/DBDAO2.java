package day05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBDAO2 {

	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";	
	
//일단 지금은 메소드 2개 있다
//dbcon ()
//close()
// selectAll() : 전체조회
//insert () : 등록하기
//update() : 수정하기
//delete() : 삭제하기
// selectOne() : 한사람 조회하기 
//위는 제일 기본적인 조건들 

	private  Connection  dbcon() {
		Connection con= null;
		
		try {
			Class.forName(driver);
			con =DriverManager.getConnection(url, user, password);
			if( con != null) System.out.println(" dbok");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return con;
		
	}
	
	
	
	public  ArrayList<Acorn>  selectAll(){
		Connection con =null;
		PreparedStatement pst =null;
		ResultSet rs = null;
		ArrayList<Acorn> list  = new ArrayList<>();
		
		 	
		con= dbcon();			
		String sql=" select * from  acorntbl" ;	
		
		
		try {
			pst =con.prepareStatement(sql);
			rs  =pst.executeQuery();
			
			
			
			while( rs.next()) {  //rs => 한 행(레코드) 데이가 있음 
				String id  = rs.getString(1);
				String pw  = rs.getString(2);
				String name  = rs.getString(3);
				
				Acorn acorn = new Acorn( id, pw, name);
				
				list.add(acorn);				
			} 	
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		
		return list;
		
	}
	
	//학생 한명 조회하기
	public Acorn selectOne( String id) {
		Connection con = dbcon();
		PreparedStatement pst = null;
		ResultSet rs  = null;
		Acorn acorn = null;
		String sql="select id,pw,name from acorntbl where id = ? ";
		

		try{
			pst = con.prepareStatement(sql);
			// ?에 들어갈 값 채우기

			pst.setString(1,id);	//물음표의 순서, 왼쪽
			rs = pst.executeQuery();

			if(rs.next())
			{
				String t_id = rs.getString(1);
				String t_pw = rs.getString(2);
				String t_name = rs.getString(3);

				acorn = new Acorn( t_id, t_pw, t_name);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

		return acorn;
	}
	
	//등록, 변경, 삭제 , executeUpdate() => 개수를 반환한다
	
	//에이콘 학생 등록
	public int insert (Acorn acorn) {
		
		int rRow = 0;
		
		Connection con = dbcon();
		PreparedStatement pst = null;
		String sql = "insert into acorntbl(id, pw, name) values(? ,? ,?)";
		
		try {
			pst = con.prepareStatement(sql);
			
			pst.setString(1,acorn.getId());
			pst.setString(2,acorn.getPw());
			pst.setString(3,acorn.getName());
			
			rRow = pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rRow;
	}
	
	
	//에이콘 학생 변경
	
	public int update(Acorn acorn ) {
		
		int rRow  =0; 
		Connection con = dbcon();
		
		PreparedStatement pst = null;
		
		String sql = "update acorntbl set pw=? where id=?";
		
		try {
			con.prepareStatement(sql);
			
			pst.setString(1, acorn.getPw());
			pst.setString(2, acorn.getId());
			rRow = pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return rRow;
	}
	
	
	//에이콘학생정보 삭제
	int delete (String id) {
		int rRow = 0;
		
		Connection con = dbcon();
		PreparedStatement pst = null;
		String sql = "delete from acorntbl where id =?";
		
		try {
			pst =con.prepareStatement(sql);
			
			pst.setString(1, id);
			rRow = pst.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rRow;
	}
	
	
	
	
	
	public static void main(String[] args) {
		 
		//acorntbl   => select * from acorntbl;  =>  ArrayList<Acorn>
		// JDBC  -> 인터페이스     => 구현체는 각 데이터베이스회사에서 구현해서 제공한다  (라이브러리, 드라이버)
		
		
		DBDAO2  dao   = new DBDAO2();
		
		ArrayList<Acorn> list  =dao.selectAll();
		
		
		for( Acorn  acorn : list) {
			System.out.println( acorn);
		}
		
		
	 	Acorn acorn = dao.selectOne("ssb");
		System.out.println(acorn.getName());
		System.out.println(acorn.getId());
		
		int result = dao.insert(new Acorn("test999", "1234", "김길동"));
		System.out.println(result);
		
		
		/*
		Acorn acorn = new Acorn ();
		acorn.setId("ssb");
		acorn.setPw("ssb1004");
		
		
		int rtn = dao.update(null);
		System.out.println(rtn);
		
		Acorn a = dao.selectOne("ssb");
		System.out.println(a.getPw());
		*/
		
		/*
		int rtn = dao.delete("test999");
		System.out.println(rtn);
		*/
		
	}

}
