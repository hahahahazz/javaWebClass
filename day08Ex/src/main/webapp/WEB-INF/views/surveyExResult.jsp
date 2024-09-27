<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> 그 음료는 </h1>
<% 

String survey1 = (String)session.getAttribute("survey1"); 
%>

<p> 오늘 니가 마신 음료는 = <%=survey1 %> </p>

</body>
</html>