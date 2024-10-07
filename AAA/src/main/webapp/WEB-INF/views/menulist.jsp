<%@page import="Cafe.Menu"%>
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
	border: 0.5px solid yellow;
}
</style>
</head>
<body>
<table>
<%//menu_id, menu_name, menu_price, menu_point %>
<tr>
<th>메뉴 아이디</th>
<th>메뉴명</th>
<th>메뉴 가격</th>
<th>메뉴별 적립포인트</th>
</tr>
<% ArrayList<Menu> mlist = (ArrayList<Menu>)request.getAttribute("mList");
 for(Menu menu : mlist){%>

<tr>
<td><%=menu.getMenu_id() %></td>
<td><%=menu.getMenu_name() %></td>
<td><%=menu.getMenu_price() %></td>
<td><%=menu.getMenu_point() %></td>
</tr>
<%} %>
</table>
</body>
</html>