package prac;

import java.sql.*;

public class DBTEST공부 {

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
	여기서 이 드라이버는 Java 애플리케이션이 특정 데이터베이스에 접근할 수 있게 해주는 소프트웨어 구성요소이다. 
*/
			Class.forName(driver);
			//위 매서드를 사용하여 JDBC 드라이버 클래스를 로드한다.
	//이 드라이버 클래스는 데이터베이스와 연결을 관리하는 데 필요한 모든 기능을 제공한다. 
/*클래스를 로드한다는 것은 자바프로그램에서 특정 클래스의 정의를 메모리에 가져오는 과정을 의미한다.
클래스의 정의란 자바에서 클래스를 작성할 때 그 클래스가 어떤 속성과 행동을 가질지를 명시하는 내용을 말한다. 
즉, 클래스의 구조를 설명하는 것으로, 어떤 속성(변수) 과 행동(메서드)을 가질지를 기술한다.			
	이러한 정의는 자바가 객체지향적으로 동작할수 있도록 도와준다. 
	각 클래스는 특정유형의 객체를 생성하기 위한 청사진 역할이며,
	이 객체들은 클래스의 속성과 메서드를 사용하여 특정기능을 수행할 수 있다. 
			
public class Person {
	//위부분은 클래스의 이름과  접근제어자를 포함하여 클래스를 선언하는 부분

    private String name;  // 속성
    private int age;      // 속성

//위 부분은 클래스가 가질수 있는 변수들, 이들은 객체의 상태를 저장한다. 
 속성은 일반적으로 private 으로 선언하여 직접 접근을 막고, getter/setter 메서드를 통해 접근하도록한다.
        
    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
//위 생성자부분은 객체가 생성될 때 호출되는 특별한 메서드로, 초기화 작업을 수행한다.
 생성자는 클래스 이름과 같으며, 반환 타입이 없다. 

    // 메서드
    public void introduce() {
        System.out.println("안녕하세요, 제 이름은 " + name + "이고, 나이는 " + age + "세입니다.");
    }
}


public void greet() {
    System.out.println("Hello, " + name);
}			
 //위 메서드는 클래스가 수행할 수 있는 동작을 정의하는 메서드이다. 
  메서드는 클래스의 기능을 구현한다. 			
			
*/
			//2. 데이터베이스 연결
			Connection  con = DriverManager.getConnection(url, user, password);
			
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
