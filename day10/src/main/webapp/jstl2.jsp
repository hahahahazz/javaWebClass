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
int su = 94;
if(su >= 90){
	out.println("수");
}
	%>

<h2> 조건문 : JSTL </h2> 
<%int num =90; %>
<%pageContext.setAttribute("num", num); %>
<c:if test="${num>=90}"> 수수 </c:if>



<h2> 조건문 : JSTL </h2>
<h3>JSTL 로 변수만들기, 자동으로 pageContext 저장소에 저장된다. </h3> 
<c:set var="score" value="90"> </c:set>
<c:if test="${score>=90 }"> 수수수 </c:if>

</body>
</html>