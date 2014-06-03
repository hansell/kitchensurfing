<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Chef Or Amsalam's Moroccan Comfort on KitchenSurfing</title>
<meta content="website" property="og:type">
<meta content="Moroccan Comfort " property="og:title">
<meta content="Chef Or Amsalam&#39;s menu on Kitchensurfing"
	property="og:description">
<link
	href="<%=request.getContextPath()%>/project/css/new_application-68f5548c6dd1809e29217ea8ea574930.css"
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
				<a class="navbar-brand" href="<%=request.getContextPath()%>/shanghai"><img
					alt="Kitchensurfing-logo-cropped@2x" class="img-responsive"
					height="19"
					src="<%=request.getContextPath()%>/project/images/kitchensurfing-logo-cropped@2x-0d9f82384215fb931c20e51a4ed8b3b8.png"
					width="161"></a>
				<ul class="nav navbar-nav header-nav city-nav visible-xs visible-sm"
					id="city-dropdown">
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="<%=request.getContextPath()%>/shanghai"> <span
							data-current-city="la" id="current-city">上海</span> <span
							class="caret"></span>
					</a>
						<ul class="dropdown-menu" role="menu">

							<li><a href="<%=request.getContextPath()%>/shanghai">上海</a></li>
							<li><a href="<%=request.getContextPath()%>/beijing">北京</a></li>
							<li><a href="<%=request.getContextPath()%>/shenzhen">深圳</a></li>
							<li><a href="<%=request.getContextPath()%>/promo/kitchensurfing-is-coming">Other</a></li>

						</ul></li>
				</ul>
			</div>
			<div class="collapse navbar-collapse hamburger-collapse"
				id="hamburger-menu">
				<ul class="nav navbar-nav header-nav">
					<li class="visible-xs visible-sm"><a href="<%=request.getContextPath()%>/shanghai">Home</a></li>
					<li class="dropdown hidden-xs hidden-sm" id="city-dropdown"><a
						class="dropdown-toggle" data-toggle="dropdown"
						href="<%=request.getContextPath()%>/shanghai"> <span>上海</span> <span
							class="caret"></span>
					</a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="<%=request.getContextPath()%>/shanghai">上海</a></li>
							<li><a href="<%=request.getContextPath()%>/beijing">北京</a></li>
							<li><a href="<%=request.getContextPath()%>/shenzhen">深圳</a></li>
							<li><a href="<%=request.getContextPath()%>/promo/kitchensurfing-is-coming">Other</a></li>
						</ul></li>
					<li><a href="<%=request.getContextPath()%>/menus?source=header">Find a
							Chef</a></li>
					<li><a href="<%=request.getContextPath()%>/help=center"
						class="help-center-link">Help</a></li>
					<li class="referral"><a
						href="<%=request.getContextPath()%>/referrals?source=header" id="referral-link">Get
							$50</a></li>
				</ul>
				<ul class="nav navbar-nav header-nav user-nav logged-out-user-nav">
					<li><a href="<%=request.getContextPath()%>/account/sign-up?source=header"
						class="sign-up-or-log-in">Sign Up</a></li>
					<li><a href="<%=request.getContextPath()%>/login" class="sign-up-or-log-in">Log
							in</a></li>
					<li class="im-a-chef-wrapper"><a class="btn im-a-chef"
						href="<%=request.getContextPath()%>/chefs" role="button">I'm a Chef</a></li>
				</ul>
			</div>
		</div>
	</div>
	</nav>
	<div class="notifications"></div>
	<div class="menu-container-wrapper">
		<div class="container">
			<div class="row">
				<div class="col-sm-12"></div>
			</div>
			<div class="row">
				<div class="col-md-8 col-md-push-4">
					<div class="menu">
						<p class="cuisines-and-style">Middle Eastern, Plated Meal</p>
						<h2>Moroccan Comfort</h2>
						<p class="description"><c:out value="${chef.personalDetails }"></c:out></p>
						<hr class="top">
						<h4 class="course-title">Choice of Moroccan Salads</h4>
						<p>Spicy tomato stew/ Homemade hummus/ Pickled Moroccan
							eggplant</p>
						<hr>
						<h4 class="course-title">Sugar Snap Pea Salad</h4>
						<p>Shaved snap peas, pickled radish, slivered almonds, wild
							arugula and a cilantro vinaigrette</p>
						<hr>
						<h4 class="course-title">Spicy Braised Cod</h4>
						<p>Cod slowly braised in a spicy pepper sauce with fresh herbs
						</p>
						<hr>
						<h4 class="course-title">Lamb Tagine</h4>
						<p>Tender lamb shoulder stewed with seasonal root vegetables
							and a red chermoula sauce served with a handmade couscous</p>
						<hr>
						<h4 class="course-title">Sesame Sponge Cake</h4>
						<p>Sesame sponge cake served with a light tahini ice cream,
							lemon gelée and a pistachio crumble</p>
						<hr>
					</div>
				</div>
				<div class="col-md-4 col-md-pull-8 request-and-share">
					<div class="menu-request">
						<div class="chef-infobox">
							<a
								href="<%=request.getContextPath()%>/chefs/52407c1f8f7f4d531400002d?source=menu+page"><img
								alt="Modern Moroccan"
								src="<%=request.getContextPath()%>/assets/52abcb98ba7fc3d129000004-120x120.jpg">
							</a>
							<h4 class="infobox-text">
								<a
									href="<%=request.getContextPath()%>/chefs/52407c1f8f7f4d531400002d?source=menu+page"><c:out value="${chef.firstName}"></c:out>
									 <c:out value="${chef.lastName}"></c:out></a>
							</h4>
							<p class="infobox-text">
								<a
									href="<%=request.getContextPath()%>/chefs/52407c1f8f7f4d531400002d#reviews"> <c:out value="${reviewCount}"></c:out>
									reviews</a>
							</p>
							<p class="infobox-text approved-at">KitchenSurfing <c:choose>
							<c:when test="${chef.isApproved==1}">
							   approved
							</c:when>
							<c:when test="${chef.isApproved!=1}">
							Not approved
							</c:when>
							<c:otherwise>Not approved</c:otherwise>
							</c:choose>
								 <c:out value="${chef.approvedTime}"></c:out></p>
						</div>
						<div class="message-chef"
							data-availability="[true, true, true, true, true, true, true]">
							<div class="row party-size message-chef-row">
								<div class="col-md-12">
									<div class="stepper-input">
										<a
											href="<%=request.getContextPath()%>/menus/menu-529d5a826325f3a8b7000035#"
											class="input-icon stepper-dec-button"></a> <input
											class="party-size-input" id="party-size" max="50" min="1"
											name="party-size" type="text" value="8"> <a
											href="<%=request.getContextPath()%>/menus/menu-529d5a826325f3a8b7000035#"
											class="input-icon stepper-inc-button"></a> <label
											for="party-size">people</label>
									</div>
								</div>
							</div>
							<div class="row message-chef-row">
								<div class="col-md-12">
									<a
										href="<%=request.getContextPath()%>/menus/menu-529d5a826325f3a8b7000035#"
										class="message-chef-btn open-direct-request-form btn btn-red"
										data-target=".message-request-529d5a826325f3a8b7000035"
										data-toggle="modal">Customize Menu</a>
								</div>
							</div>
							<div class="row">
								<div class="col-md-12">
									<div class="price-per-person" data-max-people="14"
										data-min-people="8"
										data-price-per-person="{&quot;8&quot;:75,&quot;9&quot;:75,&quot;10&quot;:75,&quot;11&quot;:75,&quot;12&quot;:75,&quot;13&quot;:75,&quot;14&quot;:73}">
										<span class="estimate-unavailable hide">Pricing not
											available for this party size. Message chef for a bid.</span>
										<div class="price-estimate">
											<span class="price-symbol">$</span><span class="price">75</span><span
												class="per-person">/person</span>
										</div>
									</div>
								</div>
							</div>
							<div class="row price-includes message-chef-row">
								<div class="col-md-12">Customize this menu with the chef
									to suit your price and food preferences.</div>
							</div>
						</div>
					</div>
					<div class="share">
						<div class="share-this-menu">Share this menu</div>
						<div>
							<div class="icon">
								<a
									href="#"
									class="facebook-share-link" target="blank"><img
									alt="Facebook2" data-share-network="facebook"
									data-source="menu page"
									src="<%=request.getContextPath()%>/assets/facebook2-20fc3bd1235aa5d46dc06d99e199d9d1.png">
								</a>
							</div>
							<div class="icon">
								<a
									href="<%=request.getContextPath()%>/home?status=Or%20Amsalam%27s%20menu%20on%20@kitchensurfing%20is%20perfect.%20Must%20book%20now:%20https://www.kitchensurfing.com/menus/moroccan-comfort-529d5a826325f3a8b7000035"
									class="twitter-share-link"><img alt="Twitter2"
									data-share-network="twitter" data-source="menu page"
									src="<%=request.getContextPath()%>/assets/twitter2-780c03f54f2a91050b3cc08cca6e9cd7.png">
								</a>
							</div>
							<span class="copy-menu-link">
								<button class="copy"
									data-clipboard-text="<%=request.getContextPath()%>/menus/moroccan-comfort-529d5a826325f3a8b7000035">
									Copy link</button>
								<div class="copy-success hidden">✓ Copied</div>
							</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>