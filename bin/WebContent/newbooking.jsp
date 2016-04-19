<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!--css files-->
<link href="css/commonCss.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap-theme.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap-theme.min.css" rel="stylesheet"
	type="text/css" />
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<!--/css files-->
</head>
<body>
	<div class="container">
		<nav class="nav-main">
		<div class="region region-header-menu">
			<div id="block-system-main-menu"
				class="block block-system block-menu">
				<div class="content">
					<ul class="nav nav-pills nav-main" id="mainMenu">
						<li class="dropdown 218 active"><a href="home.jsp"
							class="dropdown-toggle disabled active">Home</a></li>
						<li class="dropdown 1777"><a href="login.jsp" title=""
							class="dropdown-toggle disabled">Register</a></li>
						<li class="dropdown 346"><a href="viewbookings.action"
							title="" class="dropdown-toggle disabled">View My Bookings</a></li>
						<li class="dropdown 346"><a href="aboutus.jsp" title=""
							class="dropdown-toggle disabled">About Us</a></li>
						<li class="dropdown 346"><a href="contactus.jsp" title=""
							class="dropdown-toggle disabled">Contact Us</a></li>
					</ul>
				</div>
			</div>
		</div>
		</nav>
	</div>
	<div class="container">
		<div id="signupbox" style="margin-top: 50px"
			class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">New Reservation</div>
					<br />
				</div>
				<div class="panel-body">
					<form id="createResform" class="form-horizontal" role="form"
						action="createreservation.action" method="post" theme="css_xhtml">
						<div id="signupalert" style="display: none"
							class="alert alert-danger">
							<p>Error:</p>
							<span></span>
						</div>
						<br>
						
						<br> <br> <br>
						<div class="form-group">
							<label for="rooms" class="col-md-3 control-label">No Of
								Rooms</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="bean.noOfRms"
									placeholder="No Of Rooms">
							</div>
						</div>
						<div class="form-group">
							<label for="guests" class="col-md-3 control-label">No Of
								Guests</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="bean.noOfGuests"
									placeholder="No Of Guests">
							</div>
						</div>
						<div class="form-group">
							<label for="rtype" class="col-md-3 control-label">Choose
								Room Type</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="bean.roomType"
									placeholder="Choose Room Type">
							</div>
						</div>
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label for="Date" class="col-md-3 control-label">Checking
										Date</label>
									<div class="col-md-9">
										<input id="Text2" type="text" class="form-control"
											name="bean.chechinDte">
									</div>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<label for="Date" class="col-md-3 control-label">Checkout
										Date</label>
									<div class="col-md-9">
										<input id="Text1" type='text' class="form-control"
											name="bean.chechoutDte" />
									</div>
								</div>
							</div>
							<br>
							<br>
							<div class="row">
							<div class="col-md-4"></div>
							<div class="col-md-4"></div>
							<div class="col-md-3">
								<div class="form-group" style="float: right;">
									<!-- Button -->
									<button id="addBooking" type="submit" class="btn btn-info">
										Save Booking</button>
								</div>
							</div>
							<div class="col-md-1"></div>
						</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!--js files-->
	<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
	<script src="js/bootstrap.js" type="text/javascript"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<script src="js/npm.js" type="text/javascript"></script>
	<script src="js/dcalendarpicker.js" type="text/javascript"></script>
	<script type="text/javascript">
		$.ajax({}).done(function() {
			$('#calendar-demo').dcalendar();
			$('#Text1').dcalendarpicker({
				format : 'yyyy-mm-dd'
			});
			$('#Text2').dcalendarpicker({
				format : 'yyyy-mm-dd'
			});
		});
	</script>
	<!--/js files-->
</body>
</html>