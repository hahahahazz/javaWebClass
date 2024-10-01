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
<table>
<tr>
<td>아이디</td>
<td>비밀번호</td>
<td>이름</td>
</tr>

<c:forEach var="item" items="${list}">

<tr>
<td> ${item.id}</td>
<td> ${item.pw}</td>
<td> ${item.name}</td>
</tr>
</c:forEach>


</table>
<!-- 위 코드 작성하는데 필요한 
lib 폴더에 jstl-1.2.jar 파일과
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 -->
</body>
</html>