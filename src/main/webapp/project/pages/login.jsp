<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<title>KitchenSurfing</title>
<link href="KitchenSurfing/plugin/bootstap/css/bootstrap.css"
	media="screen" rel="stylesheet" type="text/css">

<link href="/KitchenSurfing/project/css/new_application-68f5548c6dd1809e29217ea8ea574930.css"
	media="screen" rel="stylesheet" type="text/css">
</head>
<body>
	<nav class="navbar new-page-header" id="header" role="navigation">
		<div class="container">
			<div class="content header-content">
				<div class="navbar-header">
					<button class="navbar-toggle collapsed hamburger-toggle"
						data-target=".hamburger-collapse" data-toggle="collapse"
						type="button">
						<div class="sr-only">Toggle navigation</div>
						<div class="icon-bar"></div>
						<div class="icon-bar"></div>
						<div class="icon-bar"></div>
					</button>
					<a class="navbar-brand" href="/KitchenSurfing/"><img
						alt="Kitchensurfing-logo-cropped@2x" class="img-responsive"
						height="19"
						src="/KitchenSurfing/project/images/kitchensurfing-logo-cropped@2x-0d9f82384215fb931c20e51a4ed8b3b8.png"
						width="161"></a>
					<ul
						class="nav navbar-nav header-nav city-nav visible-xs visible-sm"
						id="city-dropdown">
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown"
							href="/kitchenSurfing/login#"> <span
								data-current-city="la" id="current-city">上海</span> <span
								class="caret"></span>
						</a>
							<ul class="dropdown-menu" role="menu">
							
								<li><a href="/KitchenSurfing/shanghai">上海</a></li>
								<li><a href="/KitchenSurfing/beijing">北京</a></li>
								<li><a href="/KitchenSurfing/shenzhen">深圳</a></li>
								<li><a href="/KitchenSurfing/guangzhou">广州</a></li>
								<li><a href="/KitchenSurfing/hamptons">浙江</a></li>
							    <li><a href="/KitchenSurfing/los-angeles">江西</a></li>
							     <li><a href="/KitchenSurfing/new-york">南昌</a></li>
								<li><a
									href="/KitchenSurfing/promo/kitchensurfing-is-coming">Other</a></li>
							
							</ul></li>
					</ul>
				</div>
				<div class="collapse navbar-collapse hamburger-collapse"
					id="hamburger-menu">
					<ul class="nav navbar-nav header-nav">
						<li class="visible-xs visible-sm"><a
							href="/KitchenSurfing/">Home</a></li>
						<li class="dropdown hidden-xs hidden-sm" id="city-dropdown">
							<a class="dropdown-toggle" data-toggle="dropdown"
							href="/KitchenSurfing/login#"> <span>上海</span> <span class="caret"></span>
						</a>
							<ul class="dropdown-menu" role="menu">
								<li><a href="/KitchenSurfing/shanghai">上海</a></li>
								<li><a href="/KitchenSurfing/beijing">北京</a></li>
								<li><a href="/KitchenSurfing/shenzhen">深圳</a></li>
								<li><a href="/KitchenSurfing/guangzhou">广州</a></li>
								<li><a href="/KitchenSurfing/hamptons">浙江</a></li>
							    <li><a href="/KitchenSurfing/los-angeles">江西</a></li>
							     <li><a href="/KitchenSurfing/new-york">南昌</a></li>
								<li><a
									href="/KitchenSurfing/promo/kitchensurfing-is-coming">Other</a></li>
							</ul>
						</li>
						<li><a
							href="/KitchenSurfing/menus?source=header">Find
								a Chef</a></li>
						<li><a href="/KitchenSurfing/help=center"
							class="help-center-link">Help</a></li>
						<li class="referral"><a
							href="/KitchenSurfing/referrals?source=header"
							id="referral-link">Get $50</a></li>
					</ul>
					<ul class="nav navbar-nav header-nav user-nav logged-out-user-nav">
						<li><a
							href="/KitchenSurfing/account/sign-up?source=header"
							class="sign-up-or-log-in">Sign Up</a></li>
						<li><a href="/KitchenSurfing/login"
							class="sign-up-or-log-in">Log in</a></li>
						<li class="im-a-chef-wrapper"><a class="btn im-a-chef"
							href="/KitchenSurfing/chefs" role="button">I'm
								a Chef</a></li>
					</ul>
				</div>
			</div>
		</div>
	</nav>
	<div class="notifications"></div>
	<div class="container signup-container">
		<div class="content text-center">
			<h1>Log in to KitchenSurfing</h1>
			<center>
				<div class="row">
					<div class="col-md-12">
						<form accept-charset="UTF-8"
							action="/KitchenSurfing/login"
							class="simple_form new_user" id="new_user" method="post"
							novalidate="novalidate">
							<div style="margin: 0; padding: 0; display: inline">
								<input name="utf8" type="hidden" value="${msg }"><input
									name="authenticity_token" type="hidden"
									value="K+zCqTwUgEv0PZIDLJHrhstaCW/RIDyy2h2co6maUSY=">
							</div>
							<div class="control-group email optional">
								<div class="controls">
									<input class="string email optional form-control"
										id="user_email" name="account" placeholder="Email Address"
										size="50" type="email">
								</div>
							</div>
							<div class="control-group password optional">
								<div class="controls">
									<input class="password optional form-control"
										id="user_password" name="password"
										placeholder="Password" size="50" type="password">
								</div>
							</div>
							<div class="form-actions">
								<input class="btn primary submit" name="commit" type="submit"
									value="Log in">
							</div>
							<div class="input boolean optional">
								<input name="user[remember_me]" type="hidden" value="0"><label
									class="checkbox"><input checked="checked"
									class="boolean optional" data-checkbox="true"
									id="user_remember_me" name="user[remember_me]" type="checkbox"
									value="1">Remember me</label>
							</div>
						</form>

					</div>
					<p>
						<a href="https://www.kitchensurfing.com/account/password/new">Forgot
							My Password</a>
					</p>
					<p>
						Don't have a Kitchensurfing Account? <a
							href="https://www.kitchensurfing.com/account/sign-up">Sign Up</a>
					</p>
				</div>
			</center>
		</div>
	</div>
	<script src="./plugin/jquery/jquery.js"></script>
	<script src="./plugin/bootstap/js/bootstrap.js"></script>

</body>
</html>