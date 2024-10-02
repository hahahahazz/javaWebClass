<%@page import="day11.Acorn"%>
<%@page import="java.util.ArrayList"%>
<%@page import="day11.PageHandler"%>
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
<h2>게시판 글 목록</h2>



<div></div>




<h2>페이징 관련 데이터</h2>


<!--  이전  -->
<c:if test="${handler.currentGroup>1}">
 	[ <a href="/day11/list?p=${handler.currentGroup - 1}"> 이전 </a> ]
</c:if>


<c:forEach var="i" begin="${handler.grpStartPage }" end="${handler.grpEndPage }">
[  <a href="/day11/list?p=${i}">  ${i}  </a> ]
</c:forEach>

 <!-- 다음 -->
 <c:if test="${handler.totalPage > handler.grpEndPage} ">
 	[ <a href="/day11/list?p=${handler.grpEndPage+1}"> 다음 </a> ]
</c:if>


</body>
</html>