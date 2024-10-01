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



<h2>4. 좋아하는 것 배열 만들고 배열요소 출력하기 </h2>
1. 자바스크립트 <br>
<% String[] movie = {"조커","베놈","베테랑","30일","중경삼림","이프온리","센과치히로의 행방불명"};
for(int i =0; i<movie.length; i++){
	out.println(movie[i]);
}
%> <br>
2. JSTL  <br>
<%
    String[] movie2 = {"조커", "베놈", "베테랑", "30일", "중경삼림", "이프온리", "센과치히로의 행방불명"};
    request.setAttribute("movies", movie2);
%>
<c:forEach var="m" items="${movies}">    ${m} </c:forEach>




<h2>5. 책 이름 배열 출력하기 </h2>
1. 자바스크립트 <br>
<% String[] bookNames0 = {"소설","역사","인문","정치","미술","종교","여행","과학"};
for(int i =0; i<bookNames0.length; i++){
	out.println(bookNames0[i]);
}
%> <br>
2. JSTL  <br>
<%
    String[] bookNames = {"소설","역사","인문","정치","미술","종교","여행","과학"};
    request.setAttribute("bookName", bookNames);
%>
<c:forEach var="b" items="${bookName}">  ${b} </c:forEach>


</body>
</html>