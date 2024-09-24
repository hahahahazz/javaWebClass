<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
border: 1px solid  black;
}
th, td{
border: 0.5px solid skyblue;
text-align: center;
}
</style>
</head>
<body>
<% String data = (String)request.getAttribute("content"); %>

<%=data %>



<table>
<tr>
<th>메뉴명</th>
<th>메뉴가격</th>
<th>적립 포인트</th>
</tr>

<tr>
<td>아이스 카페라떼</td>
<td>4500</td>
<td>45</td>
</tr>
</table>

</body>
</html>