<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<title>TODO supply a title</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!--css files-->
<link href="css/login.css" rel="stylesheet" type="text/css" />
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
							title="" class="dropdown-toggle disabled">Register</a></li>
						<li class="dropdown 346"><a
							href="viewbookings.action" title=""
							class="dropdown-toggle disabled">View My Bookings</a></li>
						<li class="dropdown 346"><a href="aboutus.jsp"
							title="" class="dropdown-toggle disabled">About Us</a></li>
						<li class="dropdown 346"><a href="contactus.jsp"
							title="" class="dropdown-toggle disabled">Contact Us</a></li>
					</ul>
				</div>
			</div>
		</div>
		</nav>
		<div class="row">
			<div class="container">
				<div class="row">
					<br> <br> <br>
					<div id="SignInForm" class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<h3 class="modal-title" id="myModalLabel">
									<i class="fa fa-lock"></i> Secure Account Login
								</h3>
							</div>
							<div class="modal-body">
								<div class="row">
									<div class="col-sm-12">
										<p>Enter must enter a valid Email & Password combination
											to access your account:</p>
										<div class="well">
											<form id="loginForm" novalidate="novalidate"
												action="login.action" method="post" theme="css_xhtml">
												<div class="form-group">
													<div class="input-group">
														<span class="input-group-addon" id="UserEmail"><i
															class="fa fa-user" title="Enter Your username"></i></span> <input
															type="text" class="form-control" id="username"
															name="user.username" value="" required
															title="Please enter you username"
															placeholder="Enter Username" />
													</div>
													<span class="help-block"></span>
												</div>
												<div class="form-group">
													<div class="input-group">
														<span class="input-group-addon" id="UserPasswordMatch"><i
															class="fa fa-lock" title="Choose password"></i></span> <input
															type="password" class="form-control" id="passwordmatch"
															name="user.password" value="" required
															title="Enter your password" placeholder="Enter Password" />
													</div>
												</div>
												<button type="submit" class="btn btn-success btn-block">Login</button>
											</form>
										</div>
										<div>
											<p>testing</p>

											</form>




										</div>
										<p style="text-align: center;">
											<a href="#" title="Forgot password?">Forgot password?</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</div>
					<br>
					<div id="SignInForm" class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<h3 class="modal-title" id="myModalLabel">
									<i class="fa fa-lock"></i> Reset Account Password
								</h3>
							</div>
							<div class="modal-body">
								<div class="row">
									<div class="col-sm-12">
										<p>To reset your password you must enter a valid email
											address below:</p>
										<div class="well">
											<form id="loginForm" novalidate="novalidate">
												<div class="form-group">
													<div class="input-group">
														<span class="input-group-addon" id="UserEmail"><i
															class="fa fa-user" title="Enter Your Username"></i></span> <input
															type="text" class="form-control" id="username"
															name="username" value="" required
															title="Please enter your current username"
															placeholder="Enter Username" />
													</div>
													<span class="help-block"></span>
												</div>
												<div class="form-group">
													<div class="input-group">
														<span class="input-group-addon" id="UserEmail"><i
															class="fa fa-user" title="Enter Your new Password"></i></span> <input
															type="password" class="form-control" id="username"
															name="password" value="" required
															title="Please enter your new password"
															placeholder="Enter new Password" />
													</div>
													<span class="help-block"></span>
												</div>
												<div class="form-group">
													<div class="input-group">
														<span class="input-group-addon" id="UserEmail"><i
															class="fa fa-user"
															title="Enter confirm Your new Password"></i></span> <input
															type="password" class="form-control" id="newusername"
															name="password" value="" required
															title="Please confirm your new password"
															placeholder="Confirm new Password" />
													</div>
													<span class="help-block"></span>
												</div>
												<button type="submit" class="btn btn-success btn-block">Reset</button>
											</form>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--js files-->
	<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
	<script src="js/bootstrap.js" type="text/javascript"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<script src="js/npm.js" type="text/javascript"></script>
	<!--/js files-->
</body>
</html>