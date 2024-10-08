<%@page import="Review.Review"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Review review = (Review) request.getAttribute("review_id");
// 리뷰아이디 review_id , 사용자아이디 user_id, 제품번호 product_no,
	// 아이템번호 item_no, 리뷰내용 review_contents , 평점 rating
	// 리뷰작성시간 review_date (type date) 타이틀 (리뷰내용 제목) title
%>
<table>
<tr>
<th> 리뷰 아이디 </th>
<td> <input type = "text" id ="id"  value=" <%=review.getReview_id() %>"> </td>
</tr>

<tr>
<th> 제품 번호 </th>
<td> <input type = "text" id = "product_no" value=" <%=review.getproduct_no() %>"> </td>
</tr>
<tr>
<th> 타이틀 </th>
<td> <input type = "text" id ="title"  value=" <%=review.getTitle() %>"> </td>
</tr>
<tr>
<th> 평점 </th>
<td> <input type = "text" id = "rating" value=" <%=review.getRating() %>"> </td>
</tr>
<tr>
<th> 리뷰 작성시간 </th>
<td> <input type = "text" id = "review_date" value=" <%=review.getReview_date() %>"> </td>
</tr>
<tr>
<th> 리뷰 내용 </th>
<td> <input type = "text" id = "contents" value=" <%=review.getReview_contents() %>"> </td>
</tr>
<tr>
	<td colspan="2" style="text-align: center;"> 
	<button type="submit">변경하기</button>
	<button type="button" onclick="window.history.back()">취소</button>
	</td>
 
</tr>
</table>
</body>
</html>