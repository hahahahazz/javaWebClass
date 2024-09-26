<%@page import="Store.Store"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/ProjectCafe/css/menu.css">

</head>
<body>
<header>
        <h1>SUK TA BUCK SU</h1>
        <nav>
            <ul>
                <li><a href="/ProjectCafe/main">홈</a></li>
                <li><a href="/ProjectCafe/MenuList">메뉴 관리</a></li>
                <li><a href="/ProjectCafe/cusList">고객 관리</a></li>
                <li><a href="/ProjectCafe/StoreList">지점 관리</a></li>
                <li><a href="/ProjectCafe/login">로그인 </a></li>
                <li><a href="/ProjectCafe/signUp">회원가입</a></li>
            </ul>
        </nav>
    </header>
   <main>
        <section class="menu-list">
        <h2>매장 목록</h2>
<table  class="menu-table">

      <thead>
        <tr>
          <th>매장 아이디</th>
          <th>지점명</th>
          <th>매장 전화번호</th>
          <th>월매출</th>
          <th>변경 / 삭제</th>
        </tr>
    </thead>
 <tbody>

<% ArrayList<Store> list = (ArrayList<Store>)request.getAttribute("list"); 
for(Store store:list){ %>

<tr>
<td><%=store.getStore_id()%></td>
<td><%=store.getStore_name()%></td>
<td><%=store.getStore_tell()%></td>
<td><%=store.getStore_total()%></td>
<td>
	<a href="#">변경</a> /
	<a href="#">삭제</a>
</td>
</tr>
<%} %>
</tbody>
</table>
</section>
</main>
    <footer>
        <p>&copy; 2024 SUK TA BUCK SU. 모든 권리 보유.</p>
    </footer>
</body>
</html>