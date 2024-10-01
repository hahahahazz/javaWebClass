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

<%
int su = 68;
if(su>=90){
	out.println("수");
}else if(su>=80){
	out.println("우");
}else if(su>=70){
	out.println("미");
}else if(su>=60){
	out.println("양");
}else {
	out.println("가");
}

%>

<h2>JSTL</h2>
<!-- c:set 으로 만든 변수는 pageContext 라는 저장소에 자동으로 저장된다.
=> EL 표현 사용가능  -->
<c:set var="korScore" value="80"	/>

<c:choose>

<c:when test="${korScore >= 90 }"> 수 </c:when>
<c:when test="${korScore >= 80 }"> 우 </c:when>
<c:when test="${korScore >= 70 }"> 미 </c:when>
<c:when test="${korScore >= 60 }"> 양 </c:when>
<c:otherwise> 가 </c:otherwise>
</c:choose>

</body>
</html>