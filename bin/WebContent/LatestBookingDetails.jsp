<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Latest Booking Details</title>
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
	<div class="col-md-12">
	<div class="col-md-4"></div>
	<div class="well">
	<div class="col-md-4">
	<h2>Latest Booking Details</h2>
		<form>
			<label>Checking Date</label><br>
			<input type="text" name="Checking Date" class="span3" readonly="readonly"><br>
			<label>Checkout Date</label><br>
			<input type="text" name="Checkout Date" class="span3" readonly="readonly"><br>
			<label>No of Rooms</label><br>
			<input type="text" name="No of Rooms" class="span3" readonly="readonly"><br>
			<label>No of Guests</label><br>
			<input type="text" name="No of Guests" class="span3" readonly="readonly"><br>
			<label>Room Type</label><br>
			<input type="text" name="Room Type" class="span3" readonly="readonly"><br>
			<input id="confirm" type="submit" value="Got it" class="btn btn-primary pull-right">
			<div class="clearfix"></div>
		</form>
	</div>
	</div>
	<div class="col-md-4"></div>
	</div>
	<!--js files-->
	<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
	<script src="js/bootstrap.js" type="text/javascript"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<script src="js/npm.js" type="text/javascript"></script>
	<!--/js files-->
</body>
</html>