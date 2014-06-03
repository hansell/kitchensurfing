<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<meta content="website" property="og:type">
<meta content="Moroccan Comfort " property="og:title">
<meta content="Chef Or Amsalam&#39;s menu on Kitchensurfing"
	property="og:description">
<link
	href="<%=request.getContextPath()%>/project/css/new_application-68f5548c6dd1809e29217ea8ea574930.css"
	media="screen" rel="stylesheet" type="text/css">
<style type="text/css">
/* line 216, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .main-header .im-a-chef-wrapper,
.chefs.create .main-header .im-a-chef-wrapper {
  display: none;
}
/* line 219, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index #main,
.chefs.create #main {
  margin-bottom: -40px;
}
/* line 222, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .stage,
.chefs.create .stage {
  background: url(<%=request.getContextPath()%>/assets/chefs/stage-1-9eba7018231514ffb7bd9012fc03cba5.jpg) center center no-repeat;
  height: 315px;
  min-width: 1004px;
  -moz-background-size: cover;
  -o-background-size: cover;
  -webkit-background-size: cover;
  background-size: cover;
}
/* line 228, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .headline,
.chefs.create .headline {
  color: #f9f9f3;
  font-size: 55px;
  letter-spacing: 3px;
  line-height: 1.1;
  margin: 120px 0 0;
}
/* line 235, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .headline + p,
.chefs.create .headline + p {
  color: #f9f9f3;
  font-size: 18px;
}
/* line 239, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .headline,
.chefs.index .headline + p,
.chefs.create .headline,
.chefs.create .headline + p {
  text-align: center;
  text-shadow: rgba(0, 0, 0, 0.15) 0 1px 2px;
}
/* line 244, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .domain-name,
.chefs.create .domain-name {
  position: absolute;
  border: 1px solid transparent;
  color: #d6d3cc;
  text-align: right;
  width: 175px;
}
/* line 253, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .vanity-url input[type=text],
.chefs.create .vanity-url input[type=text] {
  padding-left: 175px;
}
/* line 256, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .vanity-url .input-surround,
.chefs.create .vanity-url .input-surround {
  padding-right: 185px;
}
/* line 259, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index #main .sign-up,
.chefs.create #main .sign-up {
  background: #f7f6ef;
  border: 1px solid #d6d3cc;
  text-align: center;
}
/* line 264, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .sign-up-form,
.chefs.create .sign-up-form {
  margin: 20px 0;
  vertical-align: middle;
  display: inline-block;
  vertical-align: middle;
  *vertical-align: auto;
  *zoom: 1;
  *display: inline;
  *zoom: 1;
}
/* line 14, ../../vendor/bundle/ruby/2.1.0/gems/compass_twitter_bootstrap-2.3.1/stylesheets/compass_twitter_bootstrap/_mixins.scss */
.chefs.index .sign-up-form:before, .chefs.index .sign-up-form:after,
.chefs.create .sign-up-form:before,
.chefs.create .sign-up-form:after {
  display: table;
  content: "";
  line-height: 0;
}
/* line 22, ../../vendor/bundle/ruby/2.1.0/gems/compass_twitter_bootstrap-2.3.1/stylesheets/compass_twitter_bootstrap/_mixins.scss */
.chefs.index .sign-up-form:after,
.chefs.create .sign-up-form:after {
  clear: both;
}
/* line 270, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .sign-up-form button,
.chefs.create .sign-up-form button {
  font-weight: normal;
  padding: 0;
  width: 200px;
}
/* line 275, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .sign-up-form input[type=text],
.chefs.index .sign-up-form input[type=email],
.chefs.create .sign-up-form input[type=text],
.chefs.create .sign-up-form input[type=email] {
  height: 2.4em;
}
/* line 279, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .sign-up-form .domain-name,
.chefs.index .sign-up-form input[type=text],
.chefs.index .sign-up-form input[type=email],
.chefs.index .sign-up-form button,
.chefs.create .sign-up-form .domain-name,
.chefs.create .sign-up-form input[type=text],
.chefs.create .sign-up-form input[type=email],
.chefs.create .sign-up-form button {
  font-size: 20px;
  line-height: 2.4;
}
/* line 286, ../../app/assets/stylesheets/chef.css.sass */
.ie7 .chefs.index .sign-up button, .ie7
.chefs.create .sign-up button {
  line-height: 2;
}
/* line 289, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .input-field, .chefs.index #submit,
.chefs.create .input-field,
.chefs.create #submit {
  float: left;
  margin-bottom: 0;
}
/* line 293, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .input-field,
.chefs.create .input-field {
  width: 375px;
}
/* line 296, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .input-field + .input-field,
.chefs.create .input-field + .input-field {
  margin: 0 10px;
}
/* line 299, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .chef-image,
.chefs.create .chef-image {
  width: 50px;
  height: 50px;
}
/* line 302, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .credential-box,
.chefs.create .credential-box {
  height: 320px;
  display: none;
}
/* line 306, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .credential-box.active,
.chefs.create .credential-box.active {
  display: block;
}
/* line 309, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .credential-box .centralized-content,
.chefs.create .credential-box .centralized-content {
  text-align: left;
}
/* line 312, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .credential-content,
.chefs.create .credential-content {
  font-weight: normal;
  letter-spacing: 1px;
  line-height: 1.6;
  margin: 0;
}
/* line 318, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .chef-details,
.chefs.create .chef-details {
  color: #49362b;
  font-size: 20px;
  line-height: 1.3;
  margin: 0;
}
/* line 324, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .related-chef,
.chefs.create .related-chef {
  margin-top: 30px;
}
/* line 327, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .benefits,
.chefs.create .benefits {
  border-top: 1px solid #d6d3cc;
  padding: 30px 0;
  text-align: center;
}
/* line 332, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .benefit-list,
.chefs.create .benefit-list {
  *zoom: 1;
  display: inline-block;
  vertical-align: middle;
  *vertical-align: auto;
  *zoom: 1;
  *display: inline;
}
/* line 14, ../../vendor/bundle/ruby/2.1.0/gems/compass_twitter_bootstrap-2.3.1/stylesheets/compass_twitter_bootstrap/_mixins.scss */
.chefs.index .benefit-list:before, .chefs.index .benefit-list:after,
.chefs.create .benefit-list:before,
.chefs.create .benefit-list:after {
  display: table;
  content: "";
  line-height: 0;
}
/* line 22, ../../vendor/bundle/ruby/2.1.0/gems/compass_twitter_bootstrap-2.3.1/stylesheets/compass_twitter_bootstrap/_mixins.scss */
.chefs.index .benefit-list:after,
.chefs.create .benefit-list:after {
  clear: both;
}
/* line 336, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .benefit,
.chefs.create .benefit {
  color: #49362b;
  float: left;
  font-size: 18px;
  line-height: 1;
  text-align: left;
}
/* line 47, ../../app/assets/stylesheets/base/_prototypes.css.sass */
.chefs.index .benefit .benefit-icon,
.chefs.create .benefit .benefit-icon {
  display: block;
  float: left;
  margin-right: 15px;
}
/* line 53, ../../app/assets/stylesheets/base/_prototypes.css.sass */
.chefs.index .benefit, .chefs.index .benefit .benefit-content,
.chefs.create .benefit,
.chefs.create .benefit .benefit-content {
  overflow: hidden;
  *overflow: visible;
  *zoom: 1;
}
/* line 344, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .benefit.web-presence,
.chefs.create .benefit.web-presence {
  width: 285px;
}
/* line 347, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .benefit.business,
.chefs.create .benefit.business {
  margin: 0 100px;
  width: 215px;
}
/* line 351, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .benefit.business .benefit-content,
.chefs.create .benefit.business .benefit-content {
  position: relative;
  top: 11px;
}
/* line 354, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .benefit.network,
.chefs.create .benefit.network {
  width: 235px;
}
/* line 357, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .benefit-content,
.chefs.create .benefit-content {
  line-height: 1.2;
}
/* line 360, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .icon-right-arrow-circled,
.chefs.index .icon-left-arrow-circled,
.chefs.create .icon-right-arrow-circled,
.chefs.create .icon-left-arrow-circled {
  cursor: pointer;
  filter: progid:DXImageTransform.Microsoft.Alpha(Opacity=60);
  opacity: 0.6;
  position: relative;
  top: 140px;
  -moz-transition: opacity 0.2s linear;
  -o-transition: opacity 0.2s linear;
  -webkit-transition: opacity 0.2s linear;
  transition: opacity 0.2s linear;
}
/* line 367, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .icon-right-arrow-circled:hover,
.chefs.index .icon-left-arrow-circled:hover,
.chefs.create .icon-right-arrow-circled:hover,
.chefs.create .icon-left-arrow-circled:hover {
  filter: progid:DXImageTransform.Microsoft.Alpha(enabled=false);
  opacity: 1;
}
/* line 370, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .error,
.chefs.create .error {
  background-color: #f7f6ef;
}
/* line 373, ../../app/assets/stylesheets/chef.css.sass */
.chefs.index .error input,
.chefs.create .error input {
  border-color: #b94a48;
  color: #b94a48;
}

</style>
</head>
<body class="chefs index loggedout  has-footer" data-tr-category="chefs" data-tr-label="new">
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
				<a class="navbar-brand"
					href="<%=request.getContextPath()%>/shanghai"><img
					alt="Kitchensurfing-logo-cropped@2x" class="img-responsive"
					height="19"
					src="<%=request.getContextPath()%>/project/images/kitchensurfing-logo-cropped@2x-0d9f82384215fb931c20e51a4ed8b3b8.png"
					width="161"></a>
				<ul class="nav navbar-nav header-nav city-nav visible-xs visible-sm"
					id="city-dropdown">
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown"
						href="<%=request.getContextPath()%>/shanghai"> <span
							data-current-city="la" id="current-city">上海</span> <span
							class="caret"></span>
					</a>
						<ul class="dropdown-menu" role="menu">

							<li><a href="<%=request.getContextPath()%>/shanghai">上海</a></li>
							<li><a href="<%=request.getContextPath()%>/beijing">北京</a></li>
							<li><a href="<%=request.getContextPath()%>/shenzhen">深圳</a></li>
							<li><a
								href="<%=request.getContextPath()%>/promo/kitchensurfing-is-coming">Other</a></li>

						</ul></li>
				</ul>
			</div>
			<div class="collapse navbar-collapse hamburger-collapse"
				id="hamburger-menu">
				<ul class="nav navbar-nav header-nav">
					<li class="visible-xs visible-sm"><a
						href="<%=request.getContextPath()%>/shanghai">Home</a></li>
					<li class="dropdown hidden-xs hidden-sm" id="city-dropdown"><a
						class="dropdown-toggle" data-toggle="dropdown"
						href="<%=request.getContextPath()%>/shanghai"> <span>上海</span>
							<span class="caret"></span>
					</a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="<%=request.getContextPath()%>/shanghai">上海</a></li>
							<li><a href="<%=request.getContextPath()%>/beijing">北京</a></li>
							<li><a href="<%=request.getContextPath()%>/shenzhen">深圳</a></li>
							<li><a
								href="<%=request.getContextPath()%>/promo/kitchensurfing-is-coming">Other</a></li>
						</ul></li>
					<li><a
						href="<%=request.getContextPath()%>/menus?source=header">Find
							a Chef</a></li>
					<li><a href="<%=request.getContextPath()%>/help=center"
						class="help-center-link">Help</a></li>
					<li class="referral"><a
						href="<%=request.getContextPath()%>/referrals?source=header"
						id="referral-link">Get $50</a></li>
				</ul>
				<ul class="nav navbar-nav header-nav user-nav logged-out-user-nav">
					<li><a
						href="<%=request.getContextPath()%>/account/sign-up?source=header"
						class="sign-up-or-log-in">Sign Up</a></li>
					<li><a href="<%=request.getContextPath()%>/login"
						class="sign-up-or-log-in">Log in</a></li>

				</ul>
			</div>
		</div>
	</div>
	</nav>
	<div class="notifications"></div>
	<div id="main">
		<div class="stage">
			<div class="container">
				<div class="row">
					<div class="span12">
						<h1 class="headline">SIGN UP AND START COOKING</h1>
						<p>Create your Kitchensurfing profile today.</p>
					</div>
				</div>
			</div>
		</div>
		<div class="sign-up">
			<div class="container">
				<form accept-charset="UTF-8"
					action="<%=request.getContextPath()%>/joinUs"
					class="simple_form sign-up-form" id="new_chef" method="post"
					novalidate="novalidate">
					<div style="margin: 0; padding: 0; display: inline">
						<input name="utf8" type="hidden" value="✓"><input
							name="authenticity_token" type="hidden"
							value="4MQYLYRgLJS4oArwVTF5bgj2AvmQn9iCUJQt3Eu41Nc=">
					</div>
					<div class="control-group email optional input-field">
						<div class="controls">
							<div class="input-surround">
								<input class="string email optional" id="chef_email"
									name="email" placeholder="Your E-Mail" size="50"
									type="email">
							</div>
						</div>
					</div>
					<div class="control-group string optional input-field vanity-url">
						<div class="controls">
							<div class="input-surround">
								<span class="domain-name">kitchensurfing.com/</span> <input
									class="string optional" id="chef_name" name="name"
									placeholder="YourName" size="50" type="text">
							</div>
						</div>
					</div>
					<input id="landing_page" name="landing_page" type="hidden"
						value="true">
					<button class="btn primary" id="submit" type="submit">Join
						Now</button>
				</form>

			</div>
		</div>
		<div class="credentials">
			<div class="container">
				<div class="row">
					<div class="span1">
						<div class="icon-left-arrow-circled prev-credential"></div>
					</div>
					<div class="span10">
						<div class="credential-box" style="opacity: 0;">
							<table class="centralized">
								<tbody>
									<tr>
										<td class="centralized-content"><div>
												<h3 class="credential-content">“Kitchensurfing is the
													perfect tool for me to mimic a restaurant experience in
													completely different surroundings without all of the chaos
													and uncertainty that inevitably comes with running a NYC
													kitchen.”</h3>
												<div class="related-chef media">
													<img alt="" class="media-object chef-image" height="50"
														src="<%=request.getContextPath()%>/anthony-sasso-312a0aaec84d3d43e953fdd16cc1a1b0.jpg"
														width="50">
													<p class="chef-details media-body">
														<strong>Anthony Sasso</strong> <br> <span>Chef
															de Cuisine at Casa Mono</span>
													</p>
												</div>
											</div></td>
									</tr>
								</tbody>
							</table>
						</div>
						<div class="credential-box active" style="opacity: 1;">
							<table class="centralized">
								<tbody>
									<tr>
										<td class="centralized-content"><div>
												<h3 class="credential-content">“Kitchensurfing is a
													gift from the food gods. It takes all the boring aspects
													but necessary evils of the food world, such as PR,
													advertising and collection of money out of your hands. It
													lets you do what you do best: COOK!”</h3>
												<div class="related-chef media">
													<img alt="" class="media-object chef-image" height="50"
														src="<%=request.getContextPath()%>/warren-schierenbeck-030f43569e2fa37f62569f31c168be18.jpg"
														width="50">
													<p class="chef-details media-body">
														<strong>Warren Schierenbeck</strong> <br> <span>Kitchensurfing
															Ace</span>
													</p>
												</div>
											</div></td>
									</tr>
								</tbody>
							</table>
						</div>
						<div class="credential-box" style="opacity: 0;">
							<table class="centralized">
								<tbody>
									<tr>
										<td class="centralized-content"><div>
												<h3 class="credential-content">“Kitchensurfing is
													essentially, my agent and manager, sending me only the
													potential jobs for which I am best suited. It's helped me
													build my business and establish myself as a chef, while
													becoming a better cook along the way!”</h3>
												<div class="related-chef media">
													<img alt="" class="media-object chef-image" height="50"
														src="<%=request.getContextPath()%>/chris-lynch-55e9cd91a753f426d70a9f9fbda738ab.jpg"
														width="50">
													<p class="chef-details media-body">
														<strong>Chris Lynch</strong> <br> <span>Experienced
															Private Chef</span>
													</p>
												</div>
											</div></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<div class="span1">
						<div class="icon-right-arrow-circled next-credential"></div>
					</div>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="benefits">
				<div class="benefit-list">
					<div class="benefit web-presence">
						<div class="icon-piggy-bank benefit-icon"></div>
						<div class="benefit-content">
							100% Free Web Presence <br> with 24/7 Customer Support
						</div>
					</div>
					<div class="benefit business">
						<div class="icon-globe benefit-icon"></div>
						<div class="benefit-content">Grow Your Business</div>
					</div>
					<div class="benefit network">
						<div class="icon-favorite benefit-icon"></div>
						<div class="benefit-content">
							Join a Global Network <br> of Food Lovers
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>