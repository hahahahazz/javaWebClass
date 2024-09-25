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
                <li><a href="/ProjectCafe/StoreList">지점 관리</a></li>
                <li><a href="#">로그인 </a></li>
                <li><a href="/ProjectCafe/signUp">회원가입</a></li>
            </ul>
        </nav>
    </header>
 <main>
        <section class="edit-menu">
            <h2 class="table-title">메뉴 변경</h2> <!-- 중앙 정렬을 위한 클래스 추가 -->
            <form action="updateMenu" method="post">
                <input type="hidden" name="menuId" value="1"> <!-- 메뉴 ID -->
                <table class="menu-table">
                    <tr>
                        <td><label for="menuName">메뉴명:</label></td>
                        <td><input type="text" id="menuName" name="menuName" value="아메리카노" required></td>
                    </tr>
                    <tr>
                        <td><label for="price">가격:</label></td>
                        <td><input type="number" id="price" name="price" value="4500" required></td>
                    </tr>
                    <tr>
                        <td><label for="points">적립 포인트:</label></td>
                        <td><input type="number" id="points" name="points" value="45" required></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <button type="submit">변경하기</button>
                            <button type="button" onclick="window.history.back()">취소</button>
                        </td>
                    </tr>
                </table>
            </form>
        </section>
    </main>
    <footer>
        <p>&copy; 2024 스타벅스. 모든 권리 보유.</p>
    </footer>

</body>
</html>