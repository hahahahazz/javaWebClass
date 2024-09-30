<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/ProjectCafe/css/login.css">
<script>
function loginCheck() {
    // 입력 필드 가져오기
    var id = document.getElementById("loginID").value;
    var passwd = document.getElementById("loginPasswd").value;

    // 입력값 검사
    if (id === "") {
        alert("아이디를 입력하세요.");
        document.getElementById("loginID").focus(); // 아이디 입력 필드에 포커스
        return false; // 폼 제출 중지
    }

    if (passwd === "") {
        alert("비밀번호를 입력하세요.");
        document.getElementById("loginPasswd").focus(); // 비밀번호 입력 필드에 포커스
        return false; // 폼 제출 중지
    }

    return true; // 모든 검사가 통과하면 폼 제출 허용
}
    window.onload = function() {
        // 로그인 실패 메시지가 있을 경우 경고창 표시
        var loginFailMessage = '<%= request.getAttribute("loginFailMessage") != null ? request.getAttribute("loginFailMessage") : "" %>';
        if (loginFailMessage) {
            alert(loginFailMessage);
        }
}

</script>
</head>
<body>
 <header>
        <h1>SUK TA BUCK SU</h1>
        <nav>
            <ul>
                <li><a href="/ProjectCafe/main0">홈</a></li>
                <li><a href="/ProjectCafe/login">메뉴 관리</a></li>
                <li><a href="/ProjectCafe/login">고객 관리</a></li>
                <li><a href="/ProjectCafe/login">지점 관리</a></li>
                <li><a href="/ProjectCafe/login">로그인 </a></li>
                <li><a href="/ProjectCafe/login">회원가입</a></li>
            </ul>
        </nav>
    </header>
    <main>

        <div class="item-list">
                <div class="titleArea">
                    <h2><strong>로그인</strong></h2>
                </div>
        <form action="/ProjectCafe/login" method="post" onsubmit="return loginCheck()" >
                <div class="login_wrap">
                        <p class="check">
                            <span>User ID</span>
                            <input type="text" name="member_id" id="loginID" required>
                        </p>
                        <p class="check">
                            <span>Password</span>
                            <input type="password" name="member_passwd" id="loginPasswd" required>
                        </p>
                </div>
             <div class = "btn"> <button type="submit"> 로그인 </button></div>
                
              </form>  
        </div>

    </main>
    <footer>
        <p>&copy; 2024 SUK TA BUCK SU. 모든 권리 보유.</p>
    </footer>

</body>
</html>