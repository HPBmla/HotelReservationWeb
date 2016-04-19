<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!--css folder-->
<link href="css/aaa.css" rel="stylesheet" type="text/css" />
<link href="css/slider.css" rel="stylesheet" type="text/css" />
<link href="css/index.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap-theme.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap-theme.min.css" rel="stylesheet"
	type="text/css" />
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<!--/css folder-->
</head>
<body>
	<div class="container-fluid">this is container-fluid</div>
	<div class="container">
		<br> <br> <br> <br> <br> <br>
		<div class="col-md-12">
			<div class="col-md-4">
				<div class="row">
					<div class="container">
						<div class="row">
							<div class="col-md-6">
								<div id="carousel-example-generic"
									style="position: absolute; right: 20px; width: 500px; padding: 5px;"
									class="carousel slide" data-ride="carousel">
									<!-- Indicators -->
									<ol class="carousel-indicators">
										<li data-target="#carousel-example-generic" data-slide-to="0"
											class="active"></li>
										<li data-target="#carousel-example-generic" data-slide-to="1"></li>
										<li data-target="#carousel-example-generic" data-slide-to="2"></li>
									</ol>

									<!-- Wrapper for slides -->
									<div class="carousel-inner" role="listbox">
										<div class="item active">
											<div
												style="background: #5133AB; width: 100%; height: 300px; color: #000;">
												<img src="images/hotels-op-mallorca.jpg" alt="" /> Hello1
											</div>
										</div>
										<div class="item">
											<div
												style="background: #AC193D; width: 100%; height: 300px; color: #000;">
												<img src="images/OasiaHotelSingapore_ClubSui.jpg" alt="" />
												World2
											</div>
										</div>
										<div class="item">
											<div
												style="background: #DC572E; width: 100%; height: 300px; color: #000;">
												<img src="images/thumb-hotels-wnp.jpg" alt="" /> World3
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<br> <br> <br> <br> <br> <br> <br>
				<br> <br> <br> <br> <br> <br> <br>
				<br> <br> <br> <br> <br>
				<div class="row">
					<h4>Like us on:</h4>
					<div class="row onl_row-sm-offset-3 onl_socialButtons">
						<div class="col-xs-2 col-sm-2">
							<a href="#" class="btn btn-lg btn-block onl_btn-facebook"
								data-toggle="tooltip" data-placement="top" title="Facebook">
								<i class="fa fa-facebook fa-2x"></i> <span class="hidden-xs"></span>
							</a>
						</div>
						<div class="col-xs-2 col-sm-2">
							<a href="#" class="btn btn-lg btn-block onl_btn-twitter"
								data-toggle="tooltip" data-placement="top" title="Twitter">
								<i class="fa fa-twitter fa-2x"></i> <span class="hidden-xs"></span>
							</a>
						</div>
						<div class="col-xs-2 col-sm-2">
							<a href="#" class="btn btn-lg btn-block onl_btn-google-plus"
								data-toggle="tooltip" data-placement="top" title="Google Plus">
								<i class="fa fa-google-plus fa-2x"></i> <span class="hidden-xs"></span>
							</a>
						</div>
					</div>
					<br>
				</div>
			</div>
			<!--border: 3px solid #73AD21;-->
			<div class="col-md-8"
				style="position: absolute; right: 10px; width: 500px; padding: 0px;">
				<div class="page">
					<div class="metr">
						<a href="login.jsp" class="metrostyle eenmetro"
							style="background-color: #345467; height: 150px; width: 200px; cursor: pointer">

							<span class="fa fa-cogs"
							style="font-size: 2em; color: white; padding-left: 0.3em; margin-top: 3px; float: left"></span>
							<span
							style="color: white; font-size: 1.1em; float: right; margin-top: 5px; padding-right: 0.2em"></span>
							<span
							style="color: white; float: left; margin-top: 35px; margin-left: 10px; margin-right: 50px">User
								LogIn</span>

						</a> <a href="register.jsp" class="metrostyle eenmetro"
							style="background-color: #101442; height: 150px; width: 200px; cursor: pointer">

							<span class="fa fa-cogs"
							style="font-size: 2em; color: white; padding-left: 0.3em; margin-top: 3px; float: left"></span>
							<span
							style="color: white; font-size: 1.1em; float: right; margin-top: 5px; padding-right: 0.2em"></span>
							<span
							style="color: white; float: left; margin-top: 35px; margin-left: 10px; margin-right: 50px">User
								Registration</span>

						</a>
					</div>
					<div class="metr">
						<a class="metrostyle orgmetro"
							style="background-color: #1f6b65; height: 150px; width: 200px; cursor: pointer"
							href="newbooking.jsp"> <span class="fa fa-users"
							style="font-size: 2em; color: white; padding-left: 0.3em; margin-top: 3px; float: left"></span>
							<span
							style="color: white; font-size: 1.1em; float: right; margin-top: 5px; padding-right: 0.2em"></span>
							<span
							style="color: white; float: left; margin-top: 35px; margin-left: 10px; margin-right: 80px">
								New Booking</span>
						</a> <a href="viewbookings.jsp" class="metrostyle eenmetro"
							style="background-color: #393551; height: 150px; width: 200px; cursor: pointer">

							<span class="fa fa-cogs"
							style="font-size: 2em; color: white; padding-left: 0.3em; margin-top: 3px; float: left"></span>
							<span
							style="color: white; font-size: 1.1em; float: right; margin-top: 5px; padding-right: 0.2em"></span>
							<span
							style="color: white; float: left; margin-top: 35px; margin-left: 10px; margin-right: 50px">View
								View Bookings</span>

						</a>
					</div>
					<!--<div class="metr">
                            <a style="height: 150px; width: 404px; cursor: pointer" class="metrostyle metrostylelarge  toometro" href="viewBookings.html">
                                <span class="fa fa-ticket" style="font-size: 2em; color: white; padding-left: 0.3em; margin-top: 3px ;float:left"></span>
                                <span style="color: white; font-size:  1.1em; float: right; margin-top: 5px; padding-right: 0.2em">7</span>
                                <span style="color: white; float: left; margin-top: 35px; margin-left: 10px;margin-right:120px">Reservation Type</span>
                            </a>
                        </div>-->
					<div class="metr">
						<a href="aboutus.jsp" class="metrostyle eenmetro"
							style="background-color: #1d4e7a; height: 150px; width: 200px; cursor: pointer">

							<span class="fa fa-cogs"
							style="font-size: 2em; color: white; padding-left: 0.3em; margin-top: 3px; float: left"></span>
							<span
							style="color: white; font-size: 1.1em; float: right; margin-top: 5px; padding-right: 0.2em"></span>
							<span
							style="color: white; float: left; margin-top: 35px; margin-left: 10px; margin-right: 50px">About
								Us</span>

						</a> <a href="contactus.jsp" class="metrostyle eenmetro"
							style="background-color: #345467; height: 150px; width: 200px; cursor: pointer">

							<span class="fa fa-cogs"
							style="font-size: 2em; color: white; padding-left: 0.3em; margin-top: 3px; float: left"></span>
							<span
							style="color: white; font-size: 1.1em; float: right; margin-top: 5px; padding-right: 0.2em"></span>
							<span
							style="color: white; float: left; margin-top: 35px; margin-left: 10px; margin-right: 50px">Contact
								Us</span>

						</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--js folder-->
	<script src="js/slider.js" type="text/javascript"></script>
	<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
	<script src="js/bootstrap.js" type="text/javascript"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<script src="js/npm.js" type="text/javascript"></script>
	<!--/js folder-->
</body>
</html>