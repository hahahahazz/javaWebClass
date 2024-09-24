<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
border : 1px solid blue; }
 
 td{
 border: 1px solid black;}

</style>

</head>
<body>
  
<% //자바코드 작성할거야 라는 의미의 코드이다 %>
<% 
//html ,css , 자바스크립트는 알아서 응답출력한다. 
//request, response, out 
//jsp 는 서블릿과 같은 
	int sum = 0;

	for(int i =1; i<=10; i++){
		sum += i;		
	}
	//여기가 스크립트부분
	
	//출력하기
	out.println(sum);

//아래도 출력하는  표현식 부분
%>

<%= sum %>

<table>
<tr>
<td><%= sum %></td>
</tr>
</table>
</body>
</html>