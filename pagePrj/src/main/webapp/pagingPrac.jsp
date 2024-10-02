<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
/* 페이지 처리과정



*/

int pageSize = 7;	//한페이지에 들어가는 목록의 개수		직접설정
int groupSize = 5; 	//한 그룹에 들어가는 페이지의개수 	직접설정

int totalRecords = 51;  //총 레코드수 테이블로 구하기 .임의값
// 총 페이지 개수 구하기
//현재페이지 설정	기본 1 로 설정
//헌재 페이지에 대한 현재그룹의 번호 구하기
//현재그룹의 시작 번호와 마지막 번호 구하기

//현재그룹의 마지막번호와 총 페이지 수를 판단한다
//- 총 페이지 수 보다 크다면 현재그룹의마지막 번호를 총 페이지수로 갱신한다


//반복하기. 이전, 다음 처리하기 


int currentPage =1; //현재페이지
if( request.getParameter("p") != null){
	currentPage = Integer.parseInt(request.getParameter("p"));
}

int totalPage; //총페이지 개수 구하기
int currentpageGroup =0;	//현재페이지 그룹


//총페이지  수 구하기
int remain = totalRecords % pageSize;
if(remain == 0 )
	totalPage = totalRecords / pageSize;
else 
	totalPage = totalRecords / pageSize +1;


//현재페이지에 대한 현재그룹 구하기
int remain2 = currentPage % groupSize ;
if(remain2 == 0 )
	currentpageGroup = currentPage / groupSize ;
else
	currentpageGroup = currentPage / groupSize +1;

//현재 그룹에 대한 시작번호 와 끝번호 구하기
int currentpageGroupStartNum = (currentpageGroup -1 ) * groupSize +1 ;
int currentpageGroupEndNum = currentpageGroup * groupSize ;

//마지막 그룹의 마지막페이지 번호 는 총페이지의 마지막 번호랑 같게하기 
if(currentpageGroupEndNum > totalPage){
	currentpageGroupEndNum = totalPage;
}

// 그룹의 시작번호와 마지막번호 반복해서 출력하기
 int index = currentpageGroupStartNum ;
if(currentpageGroup >1){
	%>
<a href ="/pagePrj/pagingPrac.jsp?p=<%= index%>">[<%= index %>]</a>
<%  index ++ ; }
if(currentpageGroupEndNum < totalPage){%>	
<a href="/pagePrj/pagingPrac.jsp?p=<%=currentpageGroupEndNum+1%>">[ 다음 ]</a>  
<% }
%>
</body>
</html>