<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
	border:1px solid black;
	width:300px;
	margin:100px auto;
	border-collapse: collapse;
}

th, td{
border:1px solid black;
text-align: center;
}
</style>

<script>
function regCheck(){
	let frm = document.frm;
	let id  = frm.id.value;
	let name  = frm.name.value;
	let tell  = frm.tell.vale;
	let birth  = frm.birth.vale;

	
	if( id==""){
		alert("아이디 입력");
		frm.id.focus();
		return false;
	}
	
	if( name==""){
		alert("이름 입력");
		frm.name.focus();
		return false;
	}

	if(tell==""){
		alert("전화번호 입력");
		frm.tell.focus();
		return false;
	}
	if(birth==""){
		alert("생년월일 입력");
		frm.birth.focus();
		return false;
	}
	
	
	return true;
	
	
}

</script>
</head>
<body>

<form name="form" action="/day05실습/signUp" method="post" onsubmit="return signUpCheck()">

<table>
<caption> 회원 가입</caption>

<tr>
<th> 아이디 </th> 
<td> <input type="text"  name="customer_id" placeholder="고객 ID" required></td>
</tr>

<tr>
<th> 고객이름 </th> 
<td> <input type="text"  name="customer_name" placeholder="이름" required></td>
</tr>

<tr>
<th> 전화번호 </th> 
<td> <input type="text"  name="customer_tell" placeholder="전화번호" required></td>
</tr>

<tr>
<th> 생년월일 </th> 
<td> <input type="text"   name="customer_birth" placeholder="생년월일"></td>
</tr>

<tr> 
	<td colspan="2"> 
		<button type="submit">등록</button>
		<button type="reset">취소</button>
	</td>
	</tr>


</table>

</form>


</body>
</html>