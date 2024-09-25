<%@page import="CafeCustomer.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% Customer customer =(Customer)request.getAttribute("customer"); %>

<form name="frm" action="/ProjectCafe/update" method="post">

<table>
<tr>
<th> 고객 ID </th>
<td> <input type="text"  name="id"  value="<%=customer.getCustomer_id() %>"></td>
</tr>

<tr>
<th> 고객 이름 </th>
<td> <input type="text"  name="id"  value="<%=customer.getCustomer_name() %>"></td>
</tr>


<tr>
<th> 고객 전화번호 </th>
<td> <input type="text"  name="id"  value="<%=customer.getCustomer_tell() %>"></td>
</tr>

<tr>
<th> 고객 생일 </th>
<td> <input type="text"  name="id"  value="<%=customer.getCustomer_birth() %>"></td>
</tr>


<tr>
	<td colspan="2"> 
	 <button>변경</button>
	</td>
	 
	</tr>
</table>




</form>
</body>
</html>