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
		<div class="col-md-12">
			<div id="SignUpForm" class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h3 class="modal-title" id="myModalLabel">
							<i class="fa fa-user"></i> New Booking
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
									<form id="NewAccountForm" novalidate="novalidate">
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon" id="UserEmail"><i
													class="fa fa-user" title="Select Your Checking Date"></i></span> <input
													type="email" class="form-control" id="chkindate"
													name="chkindate" value="" required
													title="Select Your Checking Date"
													placeholder="Select Your Checking Date" /> <span
													class="input-group-addon" id="chkindate"><a
													href="#UserEmailLightbox" data-toggle="modal"><i
														class="fa fa-question-circle"></i></a></span>
											</div>
											<span class="help-block"></span>
										</div>
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon" id="UserEmail"><i
													class="fa fa-user" title="Select Your Checkout Date"></i></span> <input
													type="email" class="form-control" id="chkoutdate"
													name="chkoutdate" value="" required
													title="Select Your Checkout Date"
													placeholder="Select Your Checkout Date" /> <span
													class="input-group-addon" id="chkoutdate"><a
													href="#UserEmailLightbox" data-toggle="modal"><i
														class="fa fa-question-circle"></i></a></span>
											</div>
											<span class="help-block"></span>
										</div>
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon" id="nrooms"><i
													class="fa fa-unlock-alt" title="No of Rooms"></i></span> <input
													type="text" class="form-control" id="nrooms"
													name="password" value="" required title="No of Rooms"
													placeholder="No of Rooms" /> <span
													class="input-group-addon" id="nrooms"><a
													href="#CVVLightbox" data-toggle="modal"><i
														class="fa fa-question-circle"></i></a></span>
											</div>
											<span class="help-block"></span>
										</div>
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon" id="UserPassword"><i
													class="fa fa-unlock-alt" title="No of Guests"></i></span> <input
													type="password" class="form-control" id="nguests"
													name="nguests" value="" required title="No of Guests"
													placeholder="No of Guests" /> <span
													class="input-group-addon" id="nguests"><a
													href="#CVVLightbox" data-toggle="modal"><i
														class="fa fa-question-circle"></i></a></span>
											</div>
											<span class="help-block"></span>
										</div>
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon" id="UserPasswordMatch"><i
													class="fa fa-lock" title="Choose Room Type"></i></span> <input
													type="password" class="form-control" id="rtype"
													name="rtype" value="" required title="Choose Room Type"
													placeholder="Choose Room Type" /> <span
													class="input-group-addon" id="rtype"><a
													href="#CVVLightbox" data-toggle="modal"><i
														class="fa fa-question-circle"></i></a></span>
											</div>
										</div>
										<button type="submit" class="btn btn-success btn-block">Submit</button>
									</form>
								</div>
							</div>
							<div class="col-xs-6">
								<p class="lead">New Booking Requirements</p>
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
	<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
	<script src="js/bootstrap.js" type="text/javascript"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<script src="js/npm.js" type="text/javascript"></script>
	<!--/js files-->
</body>
</html>