package Acorn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class acorndbtest {

	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:testdb";
		String user="scott";
		String password="tiger";
		
		ArrayList<Acorn> list = new ArrayList<>();
		
		try {
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			Statement st = con.createStatement();
			
			String sql  = "select * from acorntbl";
			
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				//System.out.print( rs.getString(1));
				//System.out.print( rs.getString(2));
				//System.out.println( rs.getString(3));
				String id  =  rs.getString(1);
				String pw  =  rs.getString(2);
				String name  =  rs.getString(3);				
				
				Acorn acorn = new Acorn( id, pw, name);
				list.add(acorn);	
			}
			rs.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i).getId());
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getPw());
		}
	
	}
	

}
