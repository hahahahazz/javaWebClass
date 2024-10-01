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
<h2>7. MVC를 사용하여 배열로 커피정보 (Coffee 클래스 사용) 출력하기 </h2>

<% String[] coffee  =  (String[]) request.getAttribute("coffee"); %>
<%
   for( int i=0; i< coffee.length ; i++){
	    String c = coffee[i];  
	    out.println(c);
   }
%> <br>
<%
   for( String  f : coffee){	     
	    out.println(f);
   }
%><br>
2. JSTL  <br>
<c:forEach  var="item" items="${coffee}">
${item} 
</c:forEach>



</body>
</html>