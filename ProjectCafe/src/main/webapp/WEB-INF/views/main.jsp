<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="/ProjectCafe/css/main.css">
    <title>Document</title>

</head>

<body>
    <header>
    <img  src="/ProjectCafe/imgs/숙타벅수로고_배경제거.png">
        <h1>SUK TA BUCK SU</h1>
        <nav>
        <%  %>
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
        <section class="hero">
            <h2>당신의 일상에 특별한 순간을 더하세요</h2>
            <p>숙타벅수에서 나만의 커피를 즐겨보세요!</p>
        </section>

    <div class="sliderWrap">

        <section class="products">
            <h3>커피</h3>
            <div class="slider">
                <div class="slide active">
                    <img src="data:image/jpeg;base64,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" class="img">
                    <h4>아메리카노</h4>
                </div>
                <div class="slide">
                    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTreX4wz8Ti6VJbOYIAZ0GFM8bBeIldr6l_JA&s" class="img">
                    <h4>카페라떼</h4>
                </div>
                <div class="slide">
                    <img src="https://img.freepik.com/free-photo/hot-caramel-macchiato_1339-6096.jpg" class="img">
                    <h4>카라멜 마끼아또</h4>
                </div>
            </div>
        </section>

        <section class="products">
            <h3>블렌디드</h3>
            <div class="slider">
                <div class="slide active">
                    <img src="https://cdn.imweb.me/upload/S202011028376a98fe86b7/76c48154a7816.png" class="img">
                    <h4>요거트 스무디</h4>
                </div>
                <div class="slide">
                    <img src="https://contents.sixshop.com/uploadedFiles/41523/product/image_1679976548078.png" class="img">
                    <h4>생과일주스</h4>
                </div>
                <div class="slide">
                    <img src="https://img.danawa.com/prod_img/500000/181/746/img/9746181_1.jpg?_v=20191023172307" class="img">
                    <h4>리얼 초코 프라페</h4>
                </div>
            </div>
        </section>

        <section class="products">
            <h3>디저트</h3>
            <div class="slider">
                <div class="slide active">
                    <img src="https://sitem.ssgcdn.com/69/42/44/item/1000375444269_i1_750.jpg" class="img">
                    <h4>초코 쿠키</h4>
                </div>
                <div class="slide">
                    <img src="https://www.dailypop.kr/news/photo/201906/39466_72117_1243.jpg" class="img">
                    <h4>마카롱</h4>
                </div>
                <div class="slide">
                    <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/d/db/Raised_slice_of_cheesecake.jpg/640px-Raised_slice_of_cheesecake.jpg" class="img">
                    <h4>치즈케이크</h4>
                </div>
            </div>
        </section>

    </div>
        
    </main>
    <footer>
        <p>&copy; 2024 숙타벅수. 모든 권리 보유.</p>
    </footer>
 <script>
        const sliders = document.querySelectorAll('.slider');

        sliders.forEach(slider => {
            const slides = slider.querySelectorAll('.slide');
            let currentSlide = 0;

            function showSlide(index) {
                slides.forEach((slide, i) => {
                    slide.classList.toggle('active', i === index);
                });
            }

            function nextSlide() {
                currentSlide = (currentSlide + 1) % slides.length;
                showSlide(currentSlide);
            }

            setInterval(nextSlide, 3000); // 5초마다 슬라이드 변경
        });
    </script>

</body>

</html>