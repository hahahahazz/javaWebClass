<%@page import="CafeCustomer.Customer"%>
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
               <!-- <li><a href="/ProjectCafe/login">로그인 </a></li> --> 
                <li><a href="/ProjectCafe/signUp">회원가입</a></li>
                <li><a href="/ProjectCafe/logout">로그아웃</a></li>
            </ul>
        </nav>
    </header>
   <main>
        <section class="menu-list">
 <h2>SUK TA BUK SU 고객 목록</h2>
             <div class="menu-button">
  <button><a href="/ProjectCafe/signUp"> 고객 추가 </a></button>
            </div>
<table  class="menu-table">

 <thead>
<tr>
<th>고객 ID</th>
<th>고객명</th>
<th>고객 전화번호</th>
<th>고객 정보</th>
<th>누적 포인트 </th>
<th> 변경  / 삭제  </th>
</tr>

</thead>
<tbody>

<% ArrayList<Customer> list = (ArrayList<Customer>)request.getAttribute("list"); 
	for(Customer cus : list){
%>
<tr>
<td><%=cus.getCustomer_id()  %> </td>
<td><%=cus.getCustomer_name() %> </td>
<td><%=cus.getCustomer_tell() %> </td>
<td><%=cus.getCustomer_birth() %> </td>
<td><%=cus.getCustomer_point() %> </td>
<td><a href="/ProjectCafe/one?customer_id=<%=cus.getCustomer_id() %>"> 변경 </a>
<a href="/ProjectCafe/delete?customer_id=<%=cus.getCustomer_id() %>"> 삭제 </a> </td>
</tr>

<% } %>
</tbody>
</table>
</section>
    </main>
    <footer>
        <p>&copy; 2024 SUK TA BUCK SU. 모든 권리 보유.</p>
    </footer>
</body>
</html>