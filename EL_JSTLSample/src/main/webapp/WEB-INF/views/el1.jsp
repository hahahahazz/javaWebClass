<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<% String result  = (String) request.getAttribute("data"); %>
<%=result %>

<h2>EL : 저장소의 값을 편리하게 꺼낼 수 있다.</h2>
<h3>대신 저장소에 있어야 한다. 저장소에 있는것들만 사용할 수 있다. </h3>
<p> 주의사항  : 저장소에 저장된 것들만  EL을 사용할 수 있다.</p>
${data}		
<!--  위의 두줄을 이렇게 간단하게 쓸수 있다.  -->

</body>
</html>