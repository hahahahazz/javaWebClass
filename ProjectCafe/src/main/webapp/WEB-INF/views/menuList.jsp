<%@page import="Menu.CafeMenu"%>
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
                <li><a href="#">로그인 </a></li>
                <li><a href="/ProjectCafe/signUp">회원가입</a></li>
            </ul>
        </nav>
    </header>
   <main>
        <section class="menu-list">
            <h2>메뉴 목록</h2>
            <table>
                <thead>
                    <tr>
                        <th>아이디</th>
                        <th>메뉴명</th>
                        <th>가격</th>
                        <th>적립 포인트</th>
                        <th>변경</th>
                        <th>삭제</th>
                    </tr>
                </thead>
                <tbody>
<button><a href="/ProjectCafe/menuReg">메뉴 추가</a></button>



<% ArrayList<CafeMenu> list = (ArrayList<CafeMenu>)request.getAttribute("list");
for(CafeMenu menu:list){ %>

<tr>
<td><%= menu.getMenu_id() %></td>
<td><%= menu.getMenu_name() %></td>
<td><%= menu.getMenu_price() %></td>
<td><%= menu.getMenu_point() %></td>
<td>
	<a href="/ProjectCafe/menu?menu_id=<%=menu.getMenu_id()%>">변경</a>
	<a href="/ProjectCafe/DeleteMenu?menu_id=<%=menu.getMenu_id()%>">삭제</a>
</td>
</tr>
<%} %>
</tbody>
</table>
</section>
    </main>
    <footer>
        <p>&copy; 2024 스타벅스. 모든 권리 보유.</p>
    </footer>
</body>
</html>