<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!--css files-->
<!--<link href="css/table.css" rel="stylesheet" type="text/css" />-->
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
						<li class="dropdown 1777"><a href="login.jsp"
							title="" class="dropdown-toggle disabled">Login</a></li>
						<li class="dropdown 346"><a href="register.jsp"
							title="" class="dropdown-toggle disabled">Register</a></li>
						<li class="dropdown 346"><a href="aboutus.jsp"
							title="" class="dropdown-toggle disabled">About Us</a></li>
						<li class="dropdown 346"><a href="contactus.jsp"
							title="" class="dropdown-toggle disabled">Contact Us</a></li>
					</ul>
				</div>
			</div>
		</div>
		</nav>
		<div class="row"></div>
		<div class="col-md-12">
			<h2>View All Booking</h2>
			<!--add new table-->
			<div class="form-group">
				<table id="table_id" class="table">
					<thead>
						<tr>
							<th>Date</th>
							<th>Check-In Time</th>
							<th>Check-Out Time</th>
						</tr>
					</thead>
					<s:iterator value="groupDao.groups" status="groupStatus">
					<tbody>
					
						<tr>

							<td><s:property value="name" /></td>
							<td><s:property value="%{chechinDte}" /> </td>
							<td> <s:property value="%{chechoutDte}" /> </td>
						</tr>
						<tr>
							<td><s:property value="name" /></td>
							<td><s:property value="%{chechinDte}" /></td>
							<td><s:property value="%{chechoutDte}" /></td>
						</tr>
						<tr>
							<td><s:property value="name" /></td>
							<td><s:property value="%{chechinDte}" /></td>
							<td><s:property value="%{chechoutDte}" /></td>

							
						</tr>
						
					</tbody>
					</s:iterator>
				</table>
			</div>
		</div>
	</div>
	<!--js files-->
	<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
	<script src="js/bootstrap.js" type="text/javascript"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<script src="js/npm.js" type="text/javascript"></script>
	<!--<script src="js/table.js" type="text/javascript"></script>-->
	<script src="js/viewBookings.js" type="text/javascript"></script>
	<!--/js files-->
</body>
</html>