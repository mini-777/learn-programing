<?php
include_once "db_connect.php";
?>

<!DOCTYPE html>
<html lang="en">

    <head>
    <meta charset="UTF-8">
<title>main</title>
	<link rel="stylesheet" href="css/common.css">
	<link rel="stylesheet" href="css/grid.css">
	<link rel="stylesheet" href="css/theme.css">
	
	<meta name="viewport" content="width=device-width">
    <script>
        function submit(){
            alert("Thank You!");
        }
    
    </script>
	<script src="js/index.js"></script></head>


<body>

<html>
<head>
	<title></title>
</head>
<body><!-- asked help from codementor -->
<div class="navbar">
<div class="container">
<div class="row">
<nav class="nav col-xs-4">
<ul>
	<li><a href="main.php">Home</a></li>
	<li><a href="product_list.php">Shop</a></li>
</ul>
</nav>

<div class="logo col-xs-4">
<h2>JOEN BOOK US</h2>
</div>

<nav class="icons col-xs-4">
<ul>
	<li><a href="contact.php">Contact</a></li>
<li><a id="cart" href="cart.php">Cart</a></li>
</ul>
</nav>
</div>

<div class="row mobile-grid">
<div class="mobile-logo col-xs-6">
<h2>JOEN BOOK US</h2>
</div>

<div class="menu-wrap col-xs-6"><img alt="" class="menu" src="images/main.jpg" /></div>
</div>

<nav class="mobile-nav">
<ul>
	<li><a href="main.php">Home</a></li>
	<li><a href="product_list.php">Shop</a></li>
	<li><a href="contact.php">Contact</a></li>
	<li><a href="cart.php">Cart</a></li>
</ul>
</nav>
</div>
</div>
<script src="http://code.jquery.com/jquery-3.2.1.min.js"></script><script src="js/index.js"></script></body>
</html>

<br>
<div class="hero-image">
        <div id="main-hero">
            <div class="hero-texts">
                <h3>"Internet Store of Souvenir from All Countries of the World"</h3>
                <br>
            </div>
        </div>
    </div>
 



	<div class="section2check row form-row">
		    	<div class=" col-xs-12 col-lg-12">
                <form onSubmit="submit()" method="post" id="contact-form2">
                    <div class="col-sm-12 col-md-6">
                        <input class="send-button-input" name="email" type="text" placeholder="Enter you email" required>
                    </div>
                    <div class="col-sm-12">
                        <textarea class="form-box-textarea" name="message" placeholder="Message"></textarea>
                    </div>
                    
                </form>
            </div>
            <div class="send-button">
                            <input type="button"  class="submit" onClick="submit()" value="submit">
        
                        </div>
                
		</div>
	</div>
</div>



</body>

<footer>
        <div class="container">
            <div class="row gap">
                <div class="col-xs-12 subscribe">
                    <p>Academy of Art University<br>79 New Montgomery St, San Francisco, CA 94105</p>
                    <div class="row gap subscribe-field">
                        <div class="col-md-1 col-lg-2 subscribe-center"></div>
                        <div class="col-xs-12 col-md-7 col-lg-6">
                           
                        </div>
                        
                        <div class="col-md-1 col-lg-2 subscribe-center"></div>
                    </div>
                </div>
                <div class="col-xs-4"></div>
                <div class="col-xs-1 social-media">
                    <ion-icon name="logo-facebook"></ion-icon>
                </div>
                <div class="col-xs-1 social-media">
                    <ion-icon name="logo-instagram"></ion-icon>
                </div>
                <div class="col-xs-1 social-media">
                    <ion-icon name="logo-pinterest"></ion-icon>
                </div>
            </div>

            <p>Copyright 2020 Designed by Minkyeong Shin</p>
        </div>
    </footer>

</html>
