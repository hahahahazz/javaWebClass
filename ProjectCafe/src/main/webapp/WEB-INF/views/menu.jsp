<%@page import="Menu.CafeMenu"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title><link rel="stylesheet" type="text/css" href="/ProjectCafe/css/menuChangeCheck.css">
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
<% CafeMenu menu = (CafeMenu)request.getAttribute("Menu"); %>

<h2>메뉴정보</h2>
<form name="frm" action="/ProjectCafe/MenuUpdate" method="post">

<table class="menu-table" style="margin: auto;">

<tr>
<td>메뉴 아이디</td>
<td><input type="text" name="menu_id" value="<%=menu.getMenu_id() %>"></td>
</tr>

<tr>
<td>메뉴 이름</td>
<td><input type="text" name="menu_name" value="<%=menu.getMenu_name() %>"></td>
</tr>

<tr>
<td>메뉴 가격</td>
<td><input type="text" name="menu_price" value="<%=menu.getMenu_price() %>"></td>
</tr>

<tr>
<td>적립 포인트</td>
<td><input type="text" name="menu_point" value="<%=menu.getMenu_point() %>"></td>
</tr>

<tr>
<td codspan="2"><button>등록</button></td>
</tr>

</table>
</form>
</main>
<footer>
        <p>&copy; 2024 스타벅스. 모든 권리 보유.</p>
    </footer>
</body>
</html>