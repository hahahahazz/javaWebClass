<%@page import="java.sql.*"%>
<%@page import="pracdb.Acorn"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
 border : 1px solid black ;
 margin : 0 auto;
} 

td{
 border : 1px solid black;
}

</style>


</head>
<body>

<table>
<tr>
<td>아이디</td>
<td>비밀번호</td>
<td>이름</td>
</tr>


<%

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "scott";
		String password = "tiger";
		
ArrayList<Acorn> list = new ArrayList<>();
		
		try {
			Class.forName(driver);
		 	Connection con = DriverManager.getConnection(url, user, password);
			
		 	String sql = "select * from acorntbl";
			PreparedStatement pst = con.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String id =  rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);		
				
				
		
%>

<tr>
<td><%=id %></td>
<td><%=pw %></td>
<td><%=name %></td>
</tr>



<%
				//out.println(id);
				//out.println(pw);
				//out.println(name);			
		}				
			rs.close();
			pst.close();
			con.close();		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		%>

</table>
</body>
</html>