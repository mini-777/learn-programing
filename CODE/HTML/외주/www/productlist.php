<?php
    mysql_connect('localhost','root','');
    mysql_select_db('mk-products');
//include_once "db_connect.php";
?>

<!DOCTYPE html>
<html lang="en">

    <head>
    <meta charset="UTF-8">
<title>productlist</title>
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
<li><a id="cart" href="cart.php">Cart</a></li>
</ul>
</nav>
</div>

<div class="row mobile-grid">
<div class="mobile-logo col-xs-6">
<h2>Souvenir Shop</h2>
</div>

<div class="menu-wrap col-xs-6"><img alt="" class="menu" src="images/menu.png" /></div>
</div>

<nav class="mobile-nav">
<ul>
    <li><a href="index.php">Home</a></li>
    <li><a href="productlist.php">Shop</a></li>
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
<p> <a class="sectionav" href="index.html">Home</a> <span>></span> Product list </p>
    </div>
</div>








<!-- start -->
<br>
    <div class="container products-list">

<a href="add_product_form.php" id="hero-btn">Add Product</a>
<br>
<br>
        


        <div class="row">
                        <a class="col-lg-4 col-xs-12" href="productpage.php?id=<?= $row->id ?>">
                <div class="product-card">
                    <img src="images/1-1.jpg" alt="">
                    <div class="product-details">
                        <h4 class="product-title">Key West, Florida</h3>
                        <p class="product-price">$4.50</p>
                    </div>
                </div>
                <div class="product-card2">
                </div>
                    <div class="add-cart">
        
    </div>


            </a>
                       <a class="col-lg-4 col-xs-12" href="productpage2.php?id=<?= $row->id ?>">
                <div class="product-card">
                    <img src="images/1-2.jpg" alt="">
                    <div class="product-details">
                        <h4 class="product-title">Las Vegas, Nevada</h3>
                        <p class="product-price">$4.50</p>
                    </div>
                </div>
                <div class="product-card2">
                </div>
                    <div class="add-cart">
    </div>
            </a>

                    <a class="col-lg-4 col-xs-12" href="productpage3.php?id=<?= $row->id ?>">
                <div class="product-card">
                    <img src="images/1-3.jpg" alt="">
                    <div class="product-details">
                        <h4 class="product-title">Cancun, Mexico</h3>
                        <p class="product-price">$4.50</p>
                    </div>
                </div>
                <div class="product-card2">
                </div>
                    <div class="add-cart">
    </div>
            </a>


                    <a class="col-lg-4 col-xs-12" href="productpage4.php?id=<?= $row->id ?>">
                <div class="product-card">
                    <img src="images/2-1.jpg" alt="">
                    <div class="product-details">
                        <h4 class="product-title">London, United Kingdom</h3>
                        <p class="product-price">$4.50</p>
                    </div>
                </div>
                <div class="product-card2">
                </div>
                    <div class="add-cart">
    </div>
            </a>



                    <a class="col-lg-4 col-xs-12" href="productpage5.php?id=<?= $row->id ?>">
                <div class="product-card">
                    <img src="images/2-2.jpg" alt="">
                    <div class="product-details">
                        <h4 class="product-title">Solvang, California</h3>
                        <p class="product-price">$4.50</p>
                    </div>
                </div>
                <div class="product-card2">
                </div>
                    <div class="add-cart">
    </div>
            </a>



                    <a class="col-lg-4 col-xs-12" href="productpage6.php?id=<?= $row->id ?>">
                <div class="product-card">
                    <img src="images/2-3.jpg" alt="">
                    <div class="product-details">
                        <h4 class="product-title">New York, New York</h3>
                        <p class="product-price">$4.50</p>
                    </div>
                </div>
                <div class="product-card2">
                </div>
                    <div class="add-cart">
    </div>
            </a>



                    <a class="col-lg-4 col-xs-12" href="productpage7.php?id=<?= $row->id ?>">
                <div class="product-card">
                    <img src="images/3-1.jpg" alt="">
                    <div class="product-details">
                        <h4 class="product-title">Bahamas,Bahamas </h3>
                        <p class="product-price">$4.50</p>
                    </div>
                </div>
                <div class="product-card2">
                </div>
                    <div class="add-cart">
    </div>
            </a>


                    <a class="col-lg-4 col-xs-12" href="productpage8.php?id=<?= $row->id ?>">
                <div class="product-card">
                    <img src="images/3-2.jpg" alt="">
                    <div class="product-details">
                        <h4 class="product-title">Zion, Utah</h3>
                        <p class="product-price">$4.50</p>
                    </div>
                </div>
                <div class="product-card2">
                </div>
                    <div class="add-cart">
    </div>
            </a>



                    <a class="col-lg-4 col-xs-12" href="productpage9.php?id=<?= $row->id ?>">
                <div class="product-card">
                    <img src="images/3-3.jpg" alt="">
                    <div class="product-details">
                        <h4 class="product-title">New York, New York</h3>
                        <p class="product-price">$4.50</p>
                    </div>
                </div>
                <div class="product-card2">
                </div>
                    <div class="add-cart">
    </div>
            </a>


                    <a class="col-lg-4 col-xs-12" href="productpage10.php?id=<?= $row->id ?>">
                <div class="product-card">
                    <img src="images/0-1.jpg" alt="">
                    <div class="product-details">
                        <h4 class="product-title">California</h3>
                        <p class="product-price">$10.50</p>
                    </div>
                </div>
                <div class="product-card2">
                </div>
                    <div class="add-cart">
    </div>
            </a>


                    <a class="col-lg-4 col-xs-12" href="productpage11.php?id=<?= $row->id ?>">
                <div class="product-card">
                    <img src="images/0-2.jpg" alt="">
                    <div class="product-details">
                        <h4 class="product-title">New Orleans, Louisiana</h3>
                        <p class="product-price">$10.50</p>
                    </div>
                </div>
                <div class="product-card2">
                </div>
                    <div class="add-cart">
    </div>
            </a>


                    <a class="col-lg-4 col-xs-12" href="productpage12.php?id=<?= $row->id ?>">
                <div class="product-card">
                    <img src="images/0-3.jpg" alt="">
                    <div class="product-details">
                        <h4 class="product-title">Cancun, Mexico</h3>
                        <p class="product-price">$10.50</p>
                    </div>
                </div>
                <div class="product-card2">
                </div>
                    <div class="add-cart">
    </div>
            </a>
                       
                      


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

</html>