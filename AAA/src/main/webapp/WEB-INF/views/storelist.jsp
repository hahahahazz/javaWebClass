<%@page import="Cafe.Store"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> 매장별 정보 </h2>
<%ArrayList<Store> list =(ArrayList<Store>) request.getAttribute("slist");
 for (Store store : list){ %>
<p>
 <b> 지점별 id </b> : 
<%=store.getStore_id() %> <br>
 <b> 지점 </b> : 
<%=store.getStore_name() %> <br>
 <b> 지점별 연락처 </b> : 
<%=store.getStore_tell() %> <br>
 <b> 지점별 매출 </b> : 
<%=store.getStore_total() %><br>

</p>
<% } %>
</body>
</html>