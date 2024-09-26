package prac;

import java.sql.*;

public class DBTEST공부2 {

	public static void main(String[] args) {
		 
		
		
		//DB연결정보
		//driver 
		//url
		//사용자 , 비밀번호		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "scott";
		String password = "tiger";	
		
				
		try {
			//1. 드라이버 로드 (객체생성)

/*	JDBC 드라이버 로드는 Java Database Connectivity (JDBC) API 를 사용하여
 	데이터베이스와 연결할 수 있도록 해주는 중요한 과정입니다.
 데이터베이스와 통신할 수 있도록 필요한 드라이버 클래스를 메모리에 불러오는 과정. 없으면 데이터베이스와 연결할 수 없다. 	 
	여기서 이 드라이버는 Java 애플리케이션이 특정 데이터베이스에 접근할 수 있게 해주는 소프트웨어 구성요소이다. 
*/
			Class.forName(driver);
			//위 매서드를 사용하여 JDBC 드라이버 클래스를 로드한다.
	//이 드라이버 클래스는 데이터베이스와 연결을 관리하는 데 필요한 모든 기능을 제공한다. 
//이렇게 드라이버가 로드되면, JDBC 드라이버가 Java 의 DriverManager 에 자동으로 등록된다.
//이렇게 등록된 드라이버는 아래처럼 DriverManager.getConnection() 메서드를 통해 사용할 수 있다.
//이과정을 통해 Java 애플리케이션이 JDBC API 를 사용하여 데이터베이스에 연결할 수 있는 준비가 완료되었다.

			
			
			//2. 데이터베이스 연결
			Connection  con = DriverManager.getConnection(url, user, password);
	//DriverManager 를 통해 지정한 URL, 사용자, 비밀번호를 사용하여 데이터베이스에 연결을 시도한다.
		//연결에 성공하면 위 메서드는 Connection 객체를 반환한다. 실패하면  SQLException이 발생한다.		
/* Connection 객체를 반환한다는 건 데이터베이스와의 연결을 나타내는 객체를 생성하여
 * 그 객체를(그 객체의 참조가) con 이라는 변수에 할당하는 과정을 의미한다. 
 * 이제 con 객체를 사용하여 SQL 쿼리를 실행하거나 트랜잭션을 관리할 수 있게 된다. 	
 			(SQL쿼리를 실행한다는 것은 데이터베이스에 대해 특정작업을 요청하는
 		SQL(Structured Query Language) 명령어를 보내고 , 그 결과를 받는 과정을 의미한다.
 		SQL쿼리는 데이터베이스에서 데이터를 조회,삽입,업데이트 또는 삭제 등의 작업을 수행할 수 있도록 해준다. 
Connection 객체는 자바애플리케이션과 데이터베이스간의 연결을 나타낸다. 
이 객체를 통해 SQL 문을 실행하고, 결과를 가져오는 등의 작업을 수행할 수 있다.
	Connection 객체는 데이터베이스와의 세션을 관리한다.
이 객체를 사용하여 트랜젝션을 시작하거나 종료할 수 있고, 데이터베이스에 대한 여러작업을 수행할 수 있다.
그리고 사용이 끝난 Connection 객체는 반드시 닫아줘야 합니다. 	일반적으로 con.close(); 메서드를 사용하여 연결을 종료합니다.
			
*/			
			//3. 문장얻어오기 
			Statement st =con.createStatement();
			
			//4. 쿼리작성 ( developer에서 sql 쿼리 작성 테스트 )
			String sql="select * from  acorntbl";
			
			//5.실행 ( executeQuery()-조회,  executeUpdate()- 나머지 등록, 변경, 삭제)
			// 조회시 실행결과 얻어오기 
			ResultSet rs=st.executeQuery(sql);
			
			//
			while( rs.next()) {
				
				System.out.println( rs.getString(1));
				System.out.println( rs.getString(2));
				System.out.println( rs.getString(3));
			} 			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
