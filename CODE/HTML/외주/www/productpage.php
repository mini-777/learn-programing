<?php
include_once "db_connect.php";
?>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>productpage</title>
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
<h2>Souvenir Shop</h2>
</div>

<nav class="icons col-xs-4">
<ul>
	<li><a href="contact.php">Contact</a></li>
	<!-- 	<div class="menu-icon dark-layer">
						<a href="#" class="search-menu hover-icon"><img src="images/search_icon.png" alt=""></a>
					</div> --><!-- 		<div class="search-block">
						<div class="close-popup"><img src="images/close_sm.png" alt=""></div>
						<div class="table-align">
							<div class="cell-view">
								<form action="#">
									<div class="container-menu">
										<div class="input-field">
											<input type="text" placeholder="SEARCH">
											<span class="clear-input"><img src="images/close.png" alt=""></span>
										</div>
									</div> 
								</form> 
							</div>
						</div>
					</div> --><!-- <li class="search-button">Search</li>
								<li class="search-box">
									<input type="text" placeholder="Item Name">
								</li> -->
	<li><a id="cart" href="cart.php">Cart</a></li>
</ul>
</nav>
</div>

<div class="row mobile-grid">
<div class="mobile-logo col-xs-6">
<h2>Souvenir Shop</h2>
</div>
<div class="menu-wrap col-xs-6"><img alt="" class="menu" src="images/1-1.jpg" /></div>
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

   <div class="container">
        <div class="section">
        <p> <a class="sectionav" href="main.php">Home</a> <span>></span> <a class="sectionav" href="product_list.php">Product list</a> <span>></span>  Product Page</p>
        </div>
    </div>

<div class="container">
		<div class="section2productpage row">
		<div class="left-col col-xs-12 col-lg-6">
			<img class="img-one" src="images/1-1.jpg" />
		
			
		</div>
		<div class="right-col col-xs-12 col-lg-6">
			<div class="one">
				<br><br><br><br>
				<h2>Key West, Florida<br></h2>
				<h4>Key West, Florida Magnet<br> </h4>
				<h4>$4.50</h4>
				<br>
				<p>Size: 2.25" x 2.6"</p>
				<p></p>
				<br>
				<p>Metal Fridge Magnet: Key West. Product of Key West (Chrome Plating and Enamel)</p>
			</div>

<!-- quantity -->
			<div class="quan">
				<div class="dropdown" style="margin-top:1em;">
						<select class="dropdown-quantity">
							<option value="0">Select</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
						</select>
					</div>
					<br>
				<button data-price="3.29" data-id="8" data-title="Jeju Island" onclick="addToCart(this)" data-img="1-1.jpg" class="add">ADD TO CART</button>
			</div>

			
		</div>


		</div>
	</div>

	</div>
</div>





	</div>
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


</body>