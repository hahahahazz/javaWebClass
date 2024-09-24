<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

.content{
width : 200px;
height : 100px;
border : 1px solid black;
}


</style>


</head>
<body>

<h2>Hello MVC</h2>


<div class="content">
									<!-- 아래 키부분은 심은데로 꺼내야한다.  -->
<% String result = (String)request.getAttribute("content");
%>


<% out.println(result); %>
<%= result  %>



</div>



</body>
</html>