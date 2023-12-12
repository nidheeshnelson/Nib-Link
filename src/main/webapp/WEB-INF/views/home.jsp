<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/Home.css">
    <link rel="stylesheet" href="./fontawesome-free-6.4.2-web/css/all.css">
</head>
<body>
    <div class="header">
        <nav>
            <div class="logo">N<span>i</span>B<span>-</span>L<span>i</span>nk</div>
            <div>
                <button class="join">Join partner <i class="fa-solid fa-person-arrow-down-to-line"></i>
                <div class="sub-menu-1">
                    <ul>
                        <li><a href="/expert">Join Experts</a></li>
                        <li><a href="#">Join Engineers</a></li>
                        <li><a href="#">Join Machine Owners</a></li>
                        <li><a href="#">Join Trucks</a></li>
                        <li><a href="#">Join Earth Movers</a></li>
                    </ul>
                </div>
                </button>
            <button><a href="Signin.html">Sign In</a></button>
        </div>
        </nav>
        <div class="header-content">
            <h1>Experts are ready to work</h1>
            <h2>Your time is valuable</h2>
            <h3>Maintain Quality</h3>
            <form action="/subscribe" method="post" class="email-signup">
                <input type="email" placeholder="Email address for getting news letter" name="email" required>
                <button type="submit">Get Started</button>
            </form>
        </div>
    </div>
    <div class="features">
        <div class="row">
            <div class="text-col">
                <h2>Search here for experts available in your locality</h2>
                <p>Book available shifts of a worker</p>
            </div>
            <div class="img-col">
                <img src="./Images/Power tool3.jpg" alt="">
            </div>
            <div class="row">
                <div class="img-col">
                    <img src="./Images/engineer.jpg" alt="">
                </div>
                <div class="text-col">
                    <h2>Increase the Quality of your works</h2>
                    <p>Engineer assistance is available</p>
                </div>
            </div>
        <div class="row">
            <div class="text-col">
                <h2>Time and coverage of work is valuable</h2>
                <p>Payment is based on working hours</p>
            </div>
            <div class="img-col">
                <img src="./Images/time.jpeg" alt="">
            </div>
        </div>
        <div class="row">
            <div class="img-col">
                <img src="./Images/trust.jpg" alt="">
            </div>
            <div class="text-col">
                <h2>Put your trust on us, we will do that</h2>
                <p>Your work is worth for us</p>
            </div>
        </div>
    </div>
    <div class="faq">
        <h2>Frequently Asked Questions</h2>
        <ul class="accordion">
            <li>
                <input type="radio" name="accordion" id="first">
                <label for="first">What is NiB-Link?</label>
                <div class="content">
                    <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Laboriosam, nam accusamus cupiditate accusantium consequatur officiis ut earum illo sunt temporibus! Possimus quisquam expedita nobis dicta sint consequuntur aut provident architecto.</p>
                </div>
            </li>
            <li>
                <input type="radio" name="accordion" id="second">
                <label for="second">How can be a partner?</label>
                <div class="content">
                    <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Est blanditiis laborum rerum ducimus dignissimos maiores non magni ab nulla, expedita veniam animi ut voluptatem maxime distinctio fugit delectus commodi unde.</p>
                </div>
            </li>
            <li>
                <input type="radio" name="accordion" id="Third">
                <label for="Third">What is NiB-Link?</label>
                <div class="content">
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Expedita ab reprehenderit aliquid nisi minus corrupti labore libero incidunt sed ducimus non esse, repudiandae quidem magni, provident aut officiis debitis! Nesciunt?
                    Excepturi maiores ea ipsa, sint necessitatibus repudiandae cupiditate dolorum laboriosam id aliquid dolores amet sit ex officiis delectus fuga doloremque accusamus dolore voluptatem exercitationem et, veritatis molestias facilis! Impedit, quas!</p>
                </div>
            </li>
        </ul>
        <small>Join us</small>
        <form action="/subscribe" method="post" class="email-signup">
            <input type="email" placeholder="Email address for getting news letter" name="email" required>
            <button type="submit">Get Started</button>
        </form>
    </div>
    <div class="footer">
        <h2>Questions? call me Nidheesh Nelson 918086906582</h2>
        <div class="row">
            <div class="col">
                <a href="#">FAQ</a>
                <a href="#">Invester Relations</a>
                <a href="#">Privacy</a>
                <a href="#">Speed test</a>
            </div>
            <div class="col">
                <a href="#">Help center</a>
                <a href="#">Job</a>
                <a href="#">Cookies Preferences</a>
                <a href="#">Legal Notices</a>
            </div>
            <div class="col">
                <a href="#">Account</a>
                <a href="#">Way to join</a>
                <a href="#">Corparate Information</a>
                <a href="#">Only on NiB-Link</a>
            </div>
            <div class="col">
                <a href="#">Media Centre</a>
                <a href="#">Terms</a>
                <a href="#">Contact: Nidheesh Nelson</a>
                <a href="#">Speed test</a>
            </div>
        </div>
        <button class="language">English <i class="fa-solid fa-person-arrow-down-to-line"></i></button>
        <p class="copyright"><div class="logo">N<span>i</span>B<span>-</span>L<span>i</span>nk</div><small>India</small></p>
    </div>
  <script src="./fontawesome-free-6.4.2-web/js/all.js"></script>  
</body>
</html>