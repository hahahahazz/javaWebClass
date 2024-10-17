<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

로그인 하렴 하하 
<form  action="<%=request.getContextPath()%>/login"  method="post">

<div> 
<input type="text" name ="id" placeholder="id를 입력">아이디 <br>
<input type="text" name= "pw" placeholder="비밀번호를 입력하세요">비밀번호 
</div>
 <div>
 	<button> 제출 </button>
 </div>
 </form>
</body>
</html>