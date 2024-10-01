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
<h2>1~10 까지 출력하기</h2>
1. 자바스크립트 <br>
<% for(int i=1; i<=10; i++){
	out.println(i);
}
%>
<br>
2. JSTL  <br>
<c:forEach var = "su" begin="1" end="10"> ${su }</c:forEach>


<h2>2. 안녕하세요  - 5번 출력하기 </h2>
1. 자바스크립트 <br>
<% for(int i=1; i<=5; i++){
	out.println("안녕하세요");
} %> <br>
2. JSTL  <br>
<c:forEach var="sayHI" begin="1" end="5"> 안녕하세요 </c:forEach>


<h2>3. 성적에 따라 A,B,C,F 출력하기</h2>
1. 자바스크립트 <br>
 영어 점수는 78점일때 등급은 : 
 <% int eng = 78;
if(eng>=90){
	out.println("A");
}else if(eng>=80){
	out.println("B");
}else if(eng>=70){
	out.println("C");
}else {
	out.println("F");
} %> <br>

2. JSTL  <br>
국어 점수가 94점일때 등급은  : 
<c:set var="korScore" value="94"></c:set>
<c:choose>
<c:when test="${korScore >=90 }">A</c:when>
<c:when test="${korScore >=80 }">B</c:when>
<c:when test="${korScore >=70 }">C</c:when>

<c:otherwise> F </c:otherwise>
</c:choose>



<h2>6-1. 구구단 3단 출력하기</h2>
1. 자바스크립트 <br>
<% for(int i=1; i<=9; i++){
	out.println(3*i);
} %> <br>
2. JSTL  <br>
<c:forEach var="i" begin="1" end="9"> ${3*i } </c:forEach>

<h2> 6-2. 전체 구구단 출력하기</h2>
1. 자바스크립트 <br>
<% for(int i=1; i<=9; i++){
	for(int j=1; j<=9; j++){
		out.println(i+" X "+ j +" = "+ i*j + " || ");
	}
} %> <br>
2. JSTL  <br>
<c:forEach var="dan" begin="1" end="9">
	<c:forEach var="i" begin="1" end="9"> ${dan*i } </c:forEach>
</c:forEach>


</body>
</html>