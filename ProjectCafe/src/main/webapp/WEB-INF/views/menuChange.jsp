<%@page import="Menu.CafeMenu"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/ProjectCafe/css/menuChangeCheck.css">
</head>
<body>
<header>
        <h1>SUK TA BUCK SU</h1>
        <nav>
            <ul>
                <li><a href="/ProjectCafe/main">홈</a></li>
                <li><a href="/ProjectCafe/MenuList">메뉴 관리</a></li>
                <li><a href="/ProjectCafe/cusList">고객 관리</a></li>
                <li><a href="#">지점 관리</a></li>
                <li><a href="#">로그인 </a></li>
                <li><a href="/ProjectCafe/signUp">회원가입</a></li>
            </ul>
        </nav>
    </header>
    <main>
        <section class="edit-menu">
     <h2 class="table-title">메뉴 변경</h2> <!-- 중앙 정렬을 위한 클래스 추가 -->
     
            <% CafeMenu menu = (CafeMenu)request.getAttribute("Menu"); %>
            
<form name="frm" action="/ProjectCafe/MenuUpdate" method="post">

 <input type="hidden" name="menuId" value="1"> <!-- 메뉴 ID -->
<table class="menu-table" style="margin: auto;">

<tr>
                        <td><label for="menuName">메뉴명:</label></td>
                        <td><input type="text" id="menuName" name="menuName" value="<%=menu.getMenu_name() %>" required></td>
                    </tr>
                    <tr>
                        <td><label for="price">가격:</label></td>
                        <td><input type="number" id="price" name="price" value="<%=menu.getMenu_price() %>" required></td>
                    </tr>
                    <tr>
                        <td><label for="points">적립 포인트:</label></td>
                        <td><input type="number" id="points" name="points" value="<%=menu.getMenu_point() %>" required></td>
                    </tr>
                    <tr>
                        <td colspan="2" style="text-align: center;">
                            <button type="submit">변경하기</button>
                            <button type="button" onclick="window.history.back()">취소</button>
                        </td>
                    </tr>
                </table>
</form>
</section>
</main>
</body>
</html>