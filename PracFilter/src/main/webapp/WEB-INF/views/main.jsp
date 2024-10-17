<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<h1>안녕? 여긴 메인 화면이야</h1>

<% String idpw  = (String) session.getAttribute("idpw"); %>
<% if( idpw ==null) {%>
 <a href="<%=request.getContextPath()%>/login">로그인</a>
<%}else{ %>
<a href="<%=request.getContextPath()%>/logOut">로그아웃</a>  <br>
<%}%>
<p>
<a href="<%=request.getContextPath()%>/memo.do">주문정보</a>  <br>
<p>
<a href="<%=request.getContextPath()%>/board.do"> 메모장 </a>  <br>

</body>
</html>