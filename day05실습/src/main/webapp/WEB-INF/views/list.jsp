<%@page import="회원정보.Customer"%>
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
	margin: 0 auto;
}
th, td {
	border: 1px solid skyblue;
}
</style>

</head>
<body>

<table>

<caption>숙타벅수 고객 목록</caption>

<% ArrayList<Customer> list = (ArrayList<Customer>)request.getAttribute("list"); 
	for(Customer cus : list){
%>

<tr>
<th>고객 ID</th>
<th>고객명</th>
<th>고객 전화번호</th>
<th>고객 정보</th>
<th>누적 포인트 </th>
<th> 변경  / 삭제  </th>
</tr>


<tr>
<td><%=cus.getCustomer_id()  %> </td>
<td><%=cus.getCustomer_name() %> </td>
<td><%=cus.getCustomer_tell() %> </td>
<td><%=cus.getCustomer_birth() %> </td>
<td><%=cus.getCustomer_point() %> </td>
<td><%  %> </td>
</tr>

<% } %>
</table>
</body>
</html>