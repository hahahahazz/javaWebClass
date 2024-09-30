<%@page import="CafeCustomer.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title><link rel="stylesheet" type="text/css" href="/ProjectCafe/css/menu.css">
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
               <!-- <li><a href="/ProjectCafe/login">로그인 </a></li> --> 
                <li><a href="/ProjectCafe/signUp">회원가입</a></li>
                <li><a href="/ProjectCafe/logout">로그아웃</a></li>
            </ul>
        </nav>
    </header>
    <main>
<% Customer customer =(Customer)request.getAttribute("customer"); %>

<form name="frm" action="/ProjectCafe/update" method="post">

<table class="menu-table" style="margin: auto;">
<tr>
<th> 고객 ID </th>
<td> <input type="text"  name="id"  value="<%=customer.getCustomer_id() %>"></td>
</tr>

<tr>
<th> 고객 이름 </th>
<td> <input type="text"  name="name"  value="<%=customer.getCustomer_name() %>"></td>
</tr>


<tr>
<th> 고객 전화번호 </th>
<td> <input type="text"  name="tell"  value="<%=customer.getCustomer_tell() %>"></td>
</tr>

<tr>
<th> 고객 생일 </th>
<td> <input type="text"  name="birth"  value="<%=customer.getCustomer_birth() %>"></td>
</tr>

<tr>
<th> 적립포인트 </th>
<td> <input type="text"  name="point"  value="<%=customer.getCustomer_point() %>"></td>
</tr>

<tr>
	<td colspan="2" style="text-align: center;"> 
	<button type="submit">변경하기</button>
	<button type="button" onclick="window.history.back()">취소</button>
	</td>
	 
	</tr>
</table>

</form>
</main>
    <footer>
        <p>&copy; 2024 SUK TA BUCK SU. 모든 권리 보유.</p>
    </footer>
</body>
</html>