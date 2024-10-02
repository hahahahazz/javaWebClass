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

<h2>EL 산술 연산</h2>
${ 5+3 }
${ 5-3 }

<h2>EL 관계 연산</h2>
${ 5 > 3 }
${ 5 < 3 }

<% request.setAttribute("data", "상품정보");  %>

${empty data }
=> 비어있니?  아니  위의 내용이 있다. 그래서 false 출력될거다
${not empty data }
	
<h2> EL 삼항연산    (조건 ? 참 : 거짓) </h2>
<% session.setAttribute("id", "acorn1"); %>
${empty id ?"로그인"	: "로그아웃" }



</body>
</html>