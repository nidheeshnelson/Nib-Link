<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign in</title>
    <link rel="stylesheet" href="css/signup.css">
</head>
<body>
    <div class="header">
        <nav>
            <div class="logo">N<span>i</span>B<span>-</span>L<span>i</span>nk</div>
            <div>
            <button><a href="/">Home</a></button>
        </div>
        </nav>

        <div class="wrapper">
            <!-- <div class="title-text">
              <div class="title login">Login Form</div>
              <div class="title signup">Signup Form</div>
            </div> -->
            <div class="form-container">
              <div class="slide-controls">
                <input type="radio" name="slide" id="login" checked>
                <input type="radio" name="slide" id="signup">
                <label for="login" class="slide login">Login</label>
                <label for="signup" class="slide signup">Signup</label>
                <div class="slider-tab"></div>
              </div>
              <div class="form-inner">
                <form action="/logaccount" method="post" class="login">
                  <div class="field">
                    <input type="text" name="user" placeholder="user name" required>
                  </div>
                  <div class="field">
                    <input type="password" name="password" placeholder="Password" required>
                  </div>
                  <div class="pass-link"><a href="#">Forgot password?</a></div>
                  <div class="field btn">
                    <div class="btn-layer"></div>
                    <input type="submit" value="Login">
                  </div>
                  <div class="signup-link">Not a member? <a href="">Signup now</a></div>
                  <div class="signup-link">An expert not joined yet? <a href="">Register now</a></div>
                </form>
                <form action="/customer" method="post" class="signup">
                  <div class="field">
                    <input type="text" name="email" placeholder="Email Address" required>
                  </div>
                  <div class="field">
                    <input type="number" name="phone" placeholder="Phone number" required>
                  </div>
                  <div class="field">
                    <input type="text" name="user" placeholder="User name" required>
                  </div>
                  <div class="field">
                    <input type="password" name="password" placeholder="Password" required>
                  </div>
                  <div class="field">
                    <input type="password" name="passwordc" placeholder="Confirm password" required>
                  </div>
                  <div class="field btn">
                    <div class="btn-layer"></div>
                    <input type="submit" value="Signup">
                  </div>
                </form>
              </div>
            </div>
          </div>
      
        <!-- <div class="header-content">
            <h2>Sign In</h2>
            <form action="">
                <div class="form-control">
                    <input type="text" id="user" required>
                    <label for="user">Email or Phone number</label>
                </div>
                <div class="form-control">
                    <input type="password" id="password" required>
                    <label for="password">Password</label>
                </div>
                <button type="submit">Sign In</button>
                <div class="form-help">
                    <div class="remember-me">
                    <input type="checkbox" id="remember-me">
                    <label for="remember-me">Remember me</label>
                </div>
                <a href="">Need Help</a>
            </div>
            </form>
            <p>New to NiB-Link? <a href="">Sign up now</a></p>
            <small>
                This page is protected by Google reCaptcha to ensure you're not a bot (Nidheesh Nelson Ph:8086906582,7012024782)
                <a href="">Learn more</a>
            </small>
        </div> -->
    </div>
    <script src="js/signup.js"></script>
</body>
</html>