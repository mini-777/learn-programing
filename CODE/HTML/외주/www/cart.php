<?php
include_once "db_connect.php";

  
    if(isset($_POST['submit'])){ 
          
        foreach($_POST['quantity'] as $key => $val) { 
            if($val==0) { 
                unset($_SESSION['cart'][$key]); 
            }else{ 
                $_SESSION['cart'][$key]['quantity']=$val; 
            } 
        } 
          
    } 
  
?> 
  
<h1>View cart</h1> 
<a href="index.php?page=products">Go back to the products page.</a> 
<form method="post" action="index.php?page=cart"> 
      
    <table> 
          
        <tr> 
            <th>Name</th> 
            <th>Quantity</th> 
            <th>Price</th> 
            <th>Items Price</th> 
        </tr> 
          
        <?php 
          
            $sql="SELECT * FROM products WHERE id_product IN ("; 
                      
                    foreach($_SESSION['cart'] as $id => $value) { 
                        $sql.=$id.","; 
                    } 
                      
                    $sql=substr($sql, 0, -1).") ORDER BY name ASC"; 
                    $query=mysql_query($sql); 
                    $totalprice=0; 
                    while($row=mysql_fetch_array($query)){ 
                        $subtotal=$_SESSION['cart'][$row['id_product']]['quantity']*$row['price']; 
                        $totalprice+=$subtotal; 
                    ?> 
                        <tr> 
                            <td><?php echo $row['name'] ?></td> 
                            <td><input type="text" name="quantity[<?php echo $row['id_product'] ?>]" size="5" value="<?php echo $_SESSION['cart'][$row['id_product']]['quantity'] ?>" /></td> 
                            <td><?php echo $row['price'] ?>$</td> 
                            <td><?php echo $_SESSION['cart'][$row['id_product']]['quantity']*$row['price'] ?>$</td> 
                        </tr> 
                    <?php 
                          
                    } 
        ?> 
                    <tr> 
                        <td colspan="4">Total Price: <?php echo $totalprice ?></td> 
                    </tr> 
          
    </table> 
    <br /> 
    <button type="submit" name="submit">Update Cart</button> 
</form> 
<br /> 


<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>cart</title>
	<link rel="stylesheet" href="css/common.css">
	<link rel="stylesheet" href="css/grid.css">
	<link rel="stylesheet" href="css/theme.css">
	
	<meta name="viewport" content="width=device-width">
	</head>
	<script>
		function checkout(){
			alert("Thank You!")
		}
	</script>

<body onload="showCart()">
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
</html>	<!-- start -->
	
 <div class="container">
        <div class="section">
        <p> <a class="sectionav" href="main.php">Home</a> <span>></span> <a class="sectionav" href="product_list.php">Product list</a> <span>></span>  
        	<!-- <a class="sectionav" href="productpage.php">Product page</a> --> 
        	<!-- <span>></span> --> 
        Cart </p>
        </div>
    </div>


	
	<div class="container">
		<div class="mainheader">
			<h2>CART</h2>
		</div>
	</div>

<div class="container">
	<div class="container_cart">
		<div class="item">
			<p>ITEM</p>
		</div>
		<div class="quan_cart">
			<p>QTY</p>
		</div>
		<div class="price">
			<p>PRICE</p>
		</div>
	</div>
</div>
	
<div class="container">
	<div id="cartDisplay">
    </div>


	<div class="checkout_cart">
		<div class="move-right">
			<div class="sub">
				<p>SUBTOTAL: <span id="sub" class="total_cart">$0</span></p>
			</div>
			<div class="sub">
				<p>TAX: <span id="tax" class="total_cart">$0</span></p>
			</div>
			<div class="sub">
				<p>TOTAL: <span id="total" class="total_cart">$0</span></p>
			</div>
			<div class="btn-wrapper_cart">
				<button class=checkoutbtn onClick="checkout()">PROCEED TO CHECKOUT</button></a>
			
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