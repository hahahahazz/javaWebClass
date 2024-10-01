<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>자바 코드로 작성하기</h2>
<% String data =(String) request.getAttribute("data"); %>
<%= data %>

<h2>EL 사용하기</h2>
${data}

<h2>EL 사용 못하는 경우 : 저장소에 없으면 사용할 수 없다</h2>
<h2>EL 사용 못하는 경우 : 저장소에 있는 것 만 EL 사용가능</h2>
<% String str = "나도 EL 알고싶어"; %>
<%=str %>

<!--<h2>EL 사용 시도</h2>
${str}
//출력되지 않는다!! 저장소에 담아주면 사용할수 있다 
EL 을 쓸 때 사용하는 저장소 = pageContext  -->


<h2>EL 사용 시도 : 저장소 이용 </h2>
<h3> 저장소 알아보기 4개 </h3>
<ul>

<li>pageContext</li>
<li>request</li>
<li>session</li>
<li>application</li>

</ul>
<% pageContext.setAttribute("str", str); 
				//키 는 내맘대로 지정		내용은 넣을 내용의 변수의이름

%>
${str}


</body>
</html>