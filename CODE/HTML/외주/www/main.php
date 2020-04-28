<?php
include_once "db_connect.php";

  
    if(isset($_SESSION['cart'])){ 
          
        $sql="SELECT * FROM products WHERE id_product IN ("; 
          
        foreach($_SESSION['cart'] as $id => $value) { 
            $sql.=$id.","; 
        } 
          
        $sql=substr($sql, 0, -1).") ORDER BY name ASC"; 
        $query=mysql_query($sql); 
        while($row=mysql_fetch_array($query)){ 
              
        ?> 
            <p><?php echo $row['name'] ?> x <?php echo $_SESSION['cart'][$row['id_product']]['quantity'] ?></p> 
        <?php 
              
        } 
    ?> 
        <hr /> 
        <a href="index.php?page=cart">Go to cart</a> 
    <?php 
          
    }else{ 
          
        echo "<p>Your Cart is empty. Please add some products.</p>"; 
          
    } 
  
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

	<script src="js/index.js"></script></head>


<body>

<html>
<head>
	<title></title>
</head>
<body>
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
<h2>Souvenir Shop</h2>

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
<h2>Souvenir Shop</h2>
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

<!-- start -->
<br>
<div class="hero-image">
        <div id="main-hero">
            <div class="hero-texts">
                <h3>"Internet Store of Souvenir from All Countries of the World"</h3>
                <br>
                    <a href="product_list.php" id="hero-btn2">SHOP NOW</a>
            </div>
        </div>
    </div>
    <br>
    <br>



<div class="container">
        <div class="card">
            <div class="row">
                <div class="col-xs-12 col-md-6 flex-parent flex-align-center flex-justify-center" style="position:relative;">
                    <img src="images/0-1.jpg" class="fit-width" alt="" style="max-height:40vh">
                </div>
                <div class="col-xs-12 col-md-6 flex-parent flex-align-center flex-justify-center" style="position:relative;">
                    <div class="fit-width">
                        <h1>Souvenir from Around the Globe</h1>
                        <br>
                        <p>Souvenir from around the globe are great souvenirs and an immensely popular way to celebrate your tourist travels – including the journeys you have planned for the future – and it is certainly easy to understand why. 
                            <br>
                            <br>
                        These small, colorful depictions of famous landmarks, map-like country outlines, and other things redolent of the excitement and fun of visiting foreign parts evoke your favorite memories of tourism abroad, or conjure up images of the destinations you are yearning to visit soon.</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <br>




        <br>


        <div class="container products-list">
        
        <div class="row">
                        <a class="col-lg-3 col-xs-12" href="productpage.php?id=<?= $row->id ?>">
                <div class="product-card">
                    <div class="product-details">
                        <h4 class="product-title">How to Start Startup</h3>
                        <p class="product-price">$28.00</p>
                    </div>
                </div>
                <div class="product-card2">
                </div>
    </div>


            </a>

            <div class="container products-list">
        
            <div class="row">
                    <a class="col-lg-4 col-xs-12" href="productpage3.php?id=<?= $row->id ?>">
                <div class="product-card">
                    <div class="product-details">
                        <h4 class="product-title">Bollinger on Bollinger Bands</h3>
                        <p class="product-price">$30.50</p>
                    </div>
                </div>
                <div class="product-card2">
                </div>
    </div>
            </a>




<br>
<br>


         <div class="product-list row gap" id="best-seller">
            <div class="col-xs-12 section-title">
                <h2>Most Popular</h2>
            </div>
            <div class="col-xs-6 col-md-4 col-lg-3">
                <div class="product-item">
                    <div class="product-image">
                        <img src="images/1-1.jpg" alt="" class="media-image">
                    </div>
                    <div class="product-description">
                    </div>
                </div>
            </div>
            <div class="col-xs-6 col-md-4 col-lg-3">
                <div class="product-item">
                    <div class="product-image">
                        <img src="images/1-2.jpg" alt="" class="media-image">
                    </div>
                    <div class="product-description">
                    </div>
                </div>
            </div>
            <div class="col-xs-6 col-md-4 col-lg-3">
                <div class="product-item">
                    <div class="product-image">
                        <img src="images/1-3.jpg" alt="" class="media-image">
                    </div>
                    <div class="product-description">
                    </div>
                </div>
            </div>
            <div class="col-xs-6 col-md-4 col-lg-3">
                <div class="product-item">
                    <div class="product-image">
                        <img src="images/2-1.jpg" alt="" class="media-image">
                    </div>
                    <div class="product-description">
                    </div>
                </div>
            </div>
        </div>

        <div class="hero-texts">
                <h3>"Check our newest books"</h3>
                <br>
                    <a href="product_list.html" id="hero-btn">SHOP NOW</a>
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