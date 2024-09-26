<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/ProjectCafe/css/login.css">

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
                <li><a href="/ProjectCafe/login">로그인 </a></li>
                <li><a href="/ProjectCafe/signUp">회원가입</a></li>
            </ul>
        </nav>
    </header>
    <main>

        <div class="item-list">
                <div class="titleArea">
                    <h2><strong>로그인</strong></h2>
                </div>
        
                <div class="login_wrap">
                    <div class="login">
    
                        <p class="check">
                            <span>User ID</span>
                            <input type="text" name="member_id" id="loginID">
                        </p>
                        <p class="check">
                            <span>Password</span>
                            <input type="password" name="member_passwd" id="loginPasswd">
                        </p>
                        
                        <p class="login_btn"><a href="#" id="loginBtn" type="button">Login</a></p>
                    </div>
                    
                </div>
        </div>

    </main>
    <footer>
        <p>&copy; 2024 SUK TA BUCK SU. 모든 권리 보유.</p>
    </footer>

</body>
</html>