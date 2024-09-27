<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!--  로그인 여부에 따라서 내용을 다르게 응답하기 -->

<!-- 로그인 하지않은 경우에는 아래 부분이 출력-->
<%
//세션 저장소 얻기 (각 클라이언트가 사용하는 세션 저장소를 얻어온다.)
//세션 저장소에 저장한 KEY 얻어오기

String id = (String)session.getAttribute("loginId");

%>

<% if( id == null) { %> <a href="/day08/loginEx">로그인</a>	
<% } else { %>

<!-- 로그인 성공한 경우에는 아래 부분이 출력-->

<%=id %> 님 반갑습니다 o(*≧▽≦)ツ┏━┓ .
<a href="/day08/logoutEx">로그아웃</a>	 <% } %>
<a href="/day08/orderEx">주문하기</a>

</body>
</html>