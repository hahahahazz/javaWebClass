<%@page import="day10.Coffee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>7-2. ArrayList 에 커피정보 (Coffee 클래스 사용) 출력하기 </h2>
1. 자바스크립트 사용 <br>
<% ArrayList<Coffee> coffees = (ArrayList<Coffee> ) request.getAttribute("coffee");

for(Coffee coffee : coffees){
	out.println(coffee.getName());
	out.println(coffee.getPrice());
	out.println(coffee.getSize());
}
%>
<br>
2. JSTL 사용 <br>
<c:forEach var="c" items="${coffee}">
${c.name }
${c.price }
${c.size }
<br>
</c:forEach>
</body>
</html>