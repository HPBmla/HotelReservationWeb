<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!--css files-->
<link href="WebContent/css/commonCss.css" rel="stylesheet"
	type="text/css" />
<link href="WebContent/css/bootstrap-theme.css" rel="stylesheet"
	type="text/css" />
<link href="WebContent/css/bootstrap-theme.min.css" rel="stylesheet"
	type="text/css" />
<link href="WebContent/css/bootstrap.css" rel="stylesheet"
	type="text/css" />
<link href="WebContent/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
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
						<li class="dropdown 218 active"><a href="WebContent/home.jsp"
							class="dropdown-toggle disabled active">Home</a></li>
						<li class="dropdown 1777"><a href="WebContent/login.jsp"
							title="" class="dropdown-toggle disabled">Login</a></li>
						<li class="dropdown 346"><a
							href="WebContent/viewbookings.jsp" title=""
							class="dropdown-toggle disabled">View My Bookings</a></li>
						<li class="dropdown 346"><a href="WebContent/aboutus.jsp"
							title="" class="dropdown-toggle disabled">About Us</a></li>
						<li class="dropdown 346"><a href="WebContent/contactus.jsp"
							title="" class="dropdown-toggle disabled">Contact Us</a></li>
					</ul>
				</div>
			</div>
		</div>
		</nav>
		<div class="row">
			<div id="SignUpForm" class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h3 class="modal-title" id="myModalLabel">
							<i class="fa fa-user"></i> Setup Your New Account
						</h3>
					</div>
					<div class="modal-body">
						<div class="row">
							<div class="col-xs-6">
								<div class="well">
									<div
										class="padding-top-and-bottom-fiftheen-px align-text-center hidden-sm hidden-xs">
										<i class="fa fa-user"
											style="width: 65px; height: 65px; font-size: 45px; margin: 0 auto 8px; padding-top: 7px; padding-left: 13px; display: block; border: solid 1px #CDCDCD; color: #CECECE; -moz-border-radius: 50%; -webkit-border-radius: 50%; border-radius: 50%;"></i>
									</div>
									<form id="NewAccountForm" method="POST" action="hr/register"
										novalidate="novalidate">
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon" id="UserEmail"><i
													class="fa fa-user" title="Enter Your First Name"></i></span> <input
													type="text" class="form-control" id="fname" name="user.fname"
													value="" required title="Enter Your First Name"
													placeholder="Enter Your First Name" /> <span
													class="input-group-addon" id="PasswordLockAltHelp"><a
													href="#UserEmailLightbox" data-toggle="modal"><i
														class="fa fa-question-circle"></i></a></span>
											</div>
											<span class="help-block"></span>
										</div>
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon" id="UserEmail"><i
													class="fa fa-user" title="Enter Your Last Name"></i></span> <input
													type="text" class="form-control" id="lname" name="user.lname"
													value="" required title="Enter Your Last Name"
													placeholder="Enter Your Last Name" /> <span
													class="input-group-addon" id="PasswordLockAltHelp"><a
													href="#UserEmailLightbox" data-toggle="modal"><i
														class="fa fa-question-circle"></i></a></span>
											</div>
											<span class="help-block"></span>
										</div>
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon" id="UserEmail"><i
													class="fa fa-user" title="Enter Your PostalCode"></i></span> <input
													type="text" class="form-control" id="addl1" name="user.add1"
													value="" required title="Enter Your Recidence PostalCode"
													placeholder="Enter Your Recidence PostalCode" /> <span
													class="input-group-addon" id="PasswordLockAltHelp"><a
													href="#UserEmailLightbox" data-toggle="modal"><i
														class="fa fa-question-circle"></i></a></span>
											</div>
											<span class="help-block"></span>
										</div>
										 <input type="radio" name="user.userType" value="True" checked> Customer<br>
                                         <input type="radio" name="user.userType" value="false"> Employee<br>
  
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon" id="UserEmail"><i
													class="fa fa-user" title="Enter Your Street"></i></span> <input
													type="text" class="form-control" id="addl2" name="user.add2"
													value="" required title="Enter Your Street Name"
													placeholder="Enter Your Street Name" /> <span
													class="input-group-addon" id="PasswordLockAltHelp"><a
													href="#UserEmailLightbox" data-toggle="modal"><i
														class="fa fa-question-circle"></i></a></span>
											</div>
											<span class="help-block"></span>
										</div>
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon" id="UserEmail"><i
													class="fa fa-user" title="Enter Your City"></i></span> <input
													type="text" class="form-control" id="addl3" name="user.add3"
													value="" required title="Enter Your City"
													placeholder="Enter Your City" /> <span
													class="input-group-addon" id="PasswordLockAltHelp"><a
													href="#UserEmailLightbox" data-toggle="modal"><i
														class="fa fa-question-circle"></i></a></span>
											</div>
											<span class="help-block"></span>
										</div>
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon" id="nic"><i
													class="fa fa-user" title="Enter Your NIC"></i></span> <input
													type="text" class="form-control" id="nic" name="user.nic"
													value="" required title="Enter Your NIC"
													placeholder="Enter Your NIC" /> <span
													class="input-group-addon" id="PasswordLockAltHelp"><a
													href="#UserEmailLightbox" data-toggle="modal"><i
														class="fa fa-question-circle"></i></a></span>
											</div>
											<span class="help-block"></span>
										</div>
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon" id="UserPassword"><i
													class="fa fa-unlock-alt" title="Choose a Username"></i></span> <input
													type="text" class="form-control" id="username"
													name="user.username" value="" required title="Choose a Username"
													placeholder="Choose a Username" /> <span
													class="input-group-addon" id="PasswordLockAltHelp"><a
													href="#CVVLightbox" data-toggle="modal"><i
														class="fa fa-question-circle"></i></a></span>
											</div>
											<span class="help-block"></span>
										</div>
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon" id="password"><i
													class="fa fa-lock" title="Choose a password"></i></span> <input
													type="password" class="form-control" id="password"
													name="user.password" value="" required title="Choose a password"
													placeholder="Choose a password" /> <span
													class="input-group-addon" id="PasswordLockAltHelp"><a
													href="#CVVLightbox" data-toggle="modal"><i
														class="fa fa-question-circle"></i></a></span>
											</div>
										</div>
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon" id="UserPasswordMatch"><i
													class="fa fa-lock" title="Re-enter password"></i></span> <input
													type="password" class="form-control" id="passwordmatch"
													name="user.passwordmatch" value="" required
													title="Re-enter password" placeholder="Re-enter password" />
												<span class="input-group-addon" id="PasswordLockAltHelp"><a
													href="#CVVLightbox" data-toggle="modal"><i
														class="fa fa-question-circle"></i></a></span>
											</div>
										</div>
									 <div class="form-group">
											<div class="input-group">
												<span class="input-group-addon" id="UserPassword"><i
													class="fa fa-unlock-alt" title="Add contact details"></i></span> <input
													type="text" class="form-control" id=" telNum "
													name="user.telNum" value="" required title="Choose a Username"
													placeholder="Choose a Username" /> <span
													class="input-group-addon" id="PasswordLockAltHelp"><a
													href="#CVVLightbox" data-toggle="modal"><i
														class="fa fa-question-circle"></i></a></span>
											</div>
											<span class="help-block"></span>
										</div>
										<button type="submit" class="btn btn-success btn-block">Submit</button>
									</form>
								</div>
							</div>
							<div class="col-xs-6">
								<p class="lead">New Account Requirements</p>
								<ul class="list-unstyled small" style="line-height: 2">
									<li><span class="fa fa-check text-success"></span> Provide
										a valid email account</li>
									<li><span class="fa fa-check text-success"></span>
										Password must have 1 upper-case letter (A-Z)</li>
									<li><span class="fa fa-check text-success"></span> It must
										have 1 lower-case letter (a-z)</li>
									<li><span class="fa fa-check text-success"></span> Be at
										least 1 number (0-9)</li>
									<li><span class="fa fa-check text-success"></span> It must
										be between 8-19 characters</li>
									<li><span class="fa fa-check text-success"></span> Spaces
										& symbols (! @ # $ % ^ & * _)</span></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--js files-->
	<script src="WebContent/js/jquery-1.11.3.min.js" type="text/javascript"></script>
	<script src="WebContent/js/bootstrap.js" type="text/javascript"></script>
	<script src="WebContent/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="WebContent/js/npm.js" type="text/javascript"></script>
	<!--/js files-->
</body>
</html>