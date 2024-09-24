<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	border: 1px solid black;
	margin : 0 auto;
}

 
 td{
 border:1px solid black;
 }
 
 td:nth-child(1) {
	text-align: center;
}


</style>
</head>
<body>

<form action="/day04/acornReg" method="post" > 
<!-- 아래테이블로 등록할내용들을 입력받은후 form 으로 post  해주기위해 
내용은 꼭 form 안에 넣어줘야한다.  -->



<table>
<caption> 회원가입</caption>
<tr>
<td> 아이디</td>
<td> <input type="text" name="id"> </td>

</tr>

<tr>
<td> 비밀번호</td>
<td> <input type="text" name="pw"> </td>

</tr>

<tr>
<td> 이름</td>
<td> <input type="text" name="name"> </td>

</tr>



<tr>
<td>취미</td>
<td>
		<label><input type="checkbox" value="book"  name="hobby">독서</label>
        <label><input type="checkbox" value="movie" name="hobby">영화</label>
        <label><input type="checkbox" value="sleep" name="hobby">잠자기</label>        
</td>
</tr>

<tr>
<td colspan="2"> <button> 등록</button> </td> 
</tr>



</table>



   </form>

</body>
</html>