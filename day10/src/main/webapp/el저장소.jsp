<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> 저장소 </h2>
<% pageContext.setAttribute("id", "pageContext id"); %>
<% request.setAttribute("id", "request id"); %>
<% session.setAttribute("id", "session id"); %>
<% application.setAttribute("id", "application id"); %>

<h2> 저장소에서 꺼내오기 </h2>
pageContext -> request -> session -> application
저장소의 내용을 어떤순서로 꺼내면서 데이터를 찾냐면 위의 순서대로 꺼낸다 
<br>
${id}



<h4> 저장소별로 값을 꺼내기 </h4>
${ sessionScope.id}
${ requestScope.id} 
${ applicationScope.id}
${ pageScope.id}

</body>
</html>