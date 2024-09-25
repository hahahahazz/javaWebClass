<%@page import="java.util.ArrayList"%>
<%@page import="day05실습.CafeMenu"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	border: 1px solid black';
	margin: 0 auto;
	text-align: center;
}
th, td{
	border: 1px solid skyblue;
}

</style>


</head>
<body>

<h2> CAFE MENU</h2>

<% ArrayList<CafeMenu> CafeMenus = (ArrayList<CafeMenu>)request.getAttribute("list"); %>


<table>
<tr>
<th>메뉴 품목</th>
<th>메뉴 이름</th>
<th>메뉴 가격</th>
<th>적립 포인트 </th>
</tr>

<%   for (CafeMenu cafemenu : CafeMenus) {
    %>

<tr>
<td><%=cafemenu.getMenu_id()  %></td>
<td><%=cafemenu.getMenu_name() %></td>
<td><%=cafemenu.getMenu_price() %></td>
<td><%=cafemenu.getMenu_point() %></td>

</tr>

<% } %>
</table>


</body>
</html>