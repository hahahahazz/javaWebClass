<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        .frm{
            border: 1px solid black;
            width: 700px;
            margin: 0 auto;
            display: flex;
            flex-direction: column;
            padding: 20px;
        }

       .first{

        border: 0px solid red;
        background-color: cadetblue;
        text-align: center;
        margin-bottom: 60px;
        flex: 1;
       }
       .second{
        border: 0px solid teal;
        display: flex;
       }
       .second input{
        height: 50px;
        flex: 5;
       }
       .second button{
        flex: 1;
       }
       .third{
        border: 0px solid saddlebrown;
        display: flex;
       }
       .third input{
        height: 50px;
        flex: 1;
       }
       .list input{
        border: 0px solid palegreen;
        width: 90%;
       }
    </style>
</head>
<body>
    <form class="frm">
    <div class="first">
        <label> <h1>오늘은 😗</h1></label>
        <label>Oct 17</label>
    </div>
    <label for=""><h2>새로운 todo 작성하기 ✏️</h2></label>
    <div class="second">
        <input type="text" name="" id="" placeholder="일정추가"> <button>등록</button>           
    </div>
    <label for=""><h2>Todo List</h2></label>
    <div class="third">
        <input type="text" name="" id="" placeholder="검색어를 입력하세요.">
    </div>        
    <hr>
    <div class="list">
        <ul>
            <li><input type="text"> <button>등록</button></li> 
        </ul>
   
    </div>
    </form>
</body>
</html>