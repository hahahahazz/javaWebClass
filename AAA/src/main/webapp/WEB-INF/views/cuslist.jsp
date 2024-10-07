<%@page import="Cafe.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	border: 1px solid black;
}
th {
	border: 1px solid skyblue;
}
td {
	border: 0.5px solid red;
}
</style>
</head>
<body>
<table>
<%//String customer_id, String customer_name, String customer_tell, String customer_birth,String customer_point %>
<tr>
<th> 회원 ID </th>
<th> 회원명 </th>
<th> 전화번호 </th>
<th> 회원생일 </th>
<th> 누적 포인트 </th>
</tr>
<% ArrayList<Customer> list = (ArrayList<Customer>)request.getAttribute("cuslist"); 
for(Customer cuslist : list){ %>
<tr>
<td><%=cuslist.getCustomer_id() %> </td>
<td><%=cuslist.getCustomer_name()  %> </td>
<td><%=cuslist.getCustomer_tell()  %> </td>
<td><%=cuslist.getCustomer_birth()  %> </td>
<td><%=cuslist.getCustomer_point()  %> </td>
</tr>
<tr>
</tr>
<% } %>
</table>
</body>
</html>