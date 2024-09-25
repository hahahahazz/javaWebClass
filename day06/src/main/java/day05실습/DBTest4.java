package day05실습;

import java.sql.*;
import java.util.ArrayList;


public class DBTest4 {


	public static void main(String[] args) {
	//DB연결정보
			//driver 
			//url
			//사용자 , 비밀번호		
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:testdb";
			String user = "scott";
			String password = "tiger";	
			
			ArrayList<CafeMenu> list  = new ArrayList<>();
			
			try {
				//1.드라이버로드 (객체생성)
				Class.forName(driver);
				
				//2.데이터베이스 연결
				
				Connection con =  DriverManager.getConnection(url, user, password);
				
				//3. 문장얻어오기 
				 
				String sql  ="select * from  menu_tbl ";
				PreparedStatement  pst =con.prepareStatement(sql);
				 	 
				//4. ? 세팅하기 
				
				//5.실행 ( executeQuery()-조회,  executeUpdate()- 나머지 등록, 변경, 삭제)
				ResultSet  rs =pst.executeQuery();	//!! sql넣으면 안됨 (sql)
				
				
				 
				 //
				 while (rs.next()) {
					 System.out.println(rs.getString(1));
					 System.out.println(rs.getString(2));
					 System.out.println(rs.getString(3));
					 System.out.println(rs.getString(4));
					 
					 
					 String menu_id  =  rs.getString(1);
						String menu_name  =  rs.getString(2);
						String menu_price  =  rs.getString(3);				
						String menu_point  =  rs.getString(4);				
						
						CafeMenu cafemenu = new CafeMenu(menu_id, menu_name, menu_price, menu_point);
						list.add(cafemenu);
					 
				 }
				 
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
		//// 정보 출력		
			for( int i=0 ; i< list.size(); i++ ) {
				System.out.print(  list.get(i).getMenu_id());
				System.out.print(  list.get(i).getMenu_name());
				System.out.println(  list.get(i).getMenu_price());
				System.out.println(  list.get(i).getMenu_point());
			}
			
			
			//
			System.out.println( " ##########################");
			for( CafeMenu  a : list) {
				System.out.print( a.getMenu_id());
				System.out.print( a.getMenu_name());
				System.out.print( a.getMenu_price() + " => ");
				System.out.println( a.getMenu_point());
			}
			
			
			
	
				
			}
}
