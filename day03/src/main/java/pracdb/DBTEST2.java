package pracdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBTEST2 {

	public static void main(String[] args) {
		//데이터베이스 에이콘학생정보 -> ArrayList<Acorn>
/*		ArrayList<Acorn> list = new ArrayList<>();
		list.add(new Acorn("a01", "1234", "주형준"));	//괄호안의정보를 데이터베이스에서 읽어오겠다
		list.add(new Acorn("a02", "1234", "김솔"));	
		list.add(new Acorn("a03", "1234", "이효진"));	
		
		for(Acorn acorn : list) 
			System.out.println(acorn);
		*/
		
		//라이브러리가  odjbc8.jar => WEB-INF/lib   위치에 jar 파일이 있어야 한다. 
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "scott";
		String password = "tiger";
		
		
		
		ArrayList<Acorn> list = new ArrayList<>();
		
		//1.
		
		try {
			//1.드라이버 로드(객체생성)
			Class.forName(driver);
			//2.데이터베이스 연결
			Connection con =  DriverManager.getConnection(url, user, password);
			//쿼리작성
			String sql = "select * from acorntbl";
			PreparedStatement pst = con.prepareStatement(sql);
			
			//5.실행 -
			//등록,변경,삭제 할때는  executeUpdate() 사용
			//조회 => executeQuery 사용
			ResultSet rs = pst.executeQuery();	// 매개변수 자리 () 안은 비워둔다. 
			
			while(rs.next()) {
				String id =  rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				
				// Acorn 객체 생성
				Acorn acorn = new Acorn (id,pw,name);
				list.add(acorn);
				
			}
			
			
			rs.close();
			pst.close();
			con.close();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//학생정보 (ArrayList  에 있는)
		for (int i =0; i<list.size(); i++) {
			Acorn a = list.get(i);
			System.out.println(a);
		}
		
		
		
		
	}

}
