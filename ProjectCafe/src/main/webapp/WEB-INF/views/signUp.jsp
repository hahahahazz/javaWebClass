<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/ProjectCafe/css/menuChangeCheck.css">


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
        <section class="edit-menu">
<h2><strong>회원가입</strong></h2>

<form name="form" action="/ProjectCafe/signUp" method="post" onsubmit="return signUpCheck()">

<table  class="menu-table">


<tr>
<th> 아이디 </th> 
<td> <input type="text"  name="customer_id" placeholder="고객 ID (Z000)" required></td>
</tr>

<tr>
<th> 고객이름 </th> 
<td> <input type="text"  name="customer_name" placeholder="이름" required></td>
</tr>

<tr>
<th> 전화번호 </th> 
<td> <input type="text"  name="customer_tell" placeholder="전화번호 (010-0000-0000) " required></td>
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
</section>
    </main>
    <footer>
        <p>&copy; 2024 SUK TA BUCK SU. 모든 권리 보유.</p>
    </footer>

</body>
</html>