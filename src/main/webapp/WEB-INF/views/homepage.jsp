<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>KitchenSurfing: Find a Chef</title>
<link rel="stylesheet" href="plugin/bootstap/css/bootstrap.css">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<link href="/KitchenSurfing/project/css/new_application-68f5548c6dd1809e29217ea8ea574930.css"
	media="screen" rel="stylesheet" type="text/css">
<style>
.user-nav {
	float: right;
	margin-right: -15px;
}

body {
	background: #f9f9f3;
	color: #181812;
	font-family: "微软雅黑", "PT Sans", sans-serif;
}

.navbar-fixed-top {
	background: #ffffff;
}

ul.dropdown-menu li {
	background: #f9f9f3;
	width: 100%;
	border-top: 1px solid #e1e0db;
}

ul.dropdown-menu li a:hover {
	color: #f9f9f3;
	background-color: #e95100;
}

ul.dropdown-menu li a {
	font-weight: bold;
	height: 36px;
	line-height: 32px;
	padding: 3px 20px;
}

.navbar-nav>li>.dropdown-menu {
	margin-top: 0;
	border-top-right-radius: 0;
	border-top-left-radius: 0;
	padding: 0px;
}

.nav>li>a:hover,.nav>li>a:focus {
	text-decoration: none;
	color: red;
	background-color: #ffffff;
}

.nav .open>a,.nav .open>a:hover,.nav .open>a:focus {
	background-color: #ffffff;
	border-color: #428bca;
}

.jumbotron {
	background-image: url("baseimages/feature-normal.jpg");
	height: 360px;
	color: #ffffff;
}

.hireinfo {
	position: absolute;
	right: 60px;
	top: 48px;
}

.carousel .item {
	height: 300px;
}

.carousel-inner>.active {
	left: 0;
}

.carousel-inner>.item>img {
	position: absolute;
	top: 0;
	left: 0;
	min-width: 100%;
	height: 300px;
}

.carousel-control .icon-prev,.carousel-control .glyphicon-chevron-left {
	left: 20%;
}

.carousel-control .icon-next,.carousel-control .glyphicon-chevron-right
	{
	right: 20%;
}

.promotion-title {
	font-size: 24px;
}

.promotion-description {
	font-size: 16px;
	padding-top: 19px;
}

.promotion-button {
	padding-top: 30px;
}

.sign-up-social {
	color: #3f3e38;
	padding: 40px 0px;
	background-color: #ffffff;
}

.sign-up-social .social-icons img {
	width: 40px;
	height: 40px;
}

a,a:hover,a:active,a:focus {
	color: #e95100;
	text-decoration: none;
}

.social-icons .col-sm-2,.social-icons .col-xs-2 {
	text-align: center;
	min-width: 19%;
	max-width: 20%;
}

.col-sm-4 {
	width: 33.33333333333333%;
}

.sign-up-social .sign-up {
	border-right: 2px solid #d6d3cc;
	padding-bottom: 15px;
}

.featured-chefs .left-column {
	padding-right: 0px;
	padding-left: 7px;
	margin-top: -7px;
}

.featured-chefs .left-column .price-attributes {
	height: 128px;
	margin-top: 12px;
	border-right: 2px solid #e1e0db;
	margin-right: 2px;
}

.featured-chefs .right-column {
	margin-top: 13px;
	padding-left: 10px;
	padding-right: 0px;
}

.featured-chefs .chef-name {
	padding-top: 20px;
	font-weight: bold;
}

.featured-chefs .left-column p {
	text-align: right;
	padding-right: 10px;
	font-size: 12px;
}

.featured-chefs .left-column p.menu {
	font-family: "PT Sans Caption";
	font-size: 10px;
	text-transform: uppercase;
}

.featured-chefs .left-column p.numbers {
	margin-bottom: -5px;
	font-weight: bold;
	font-size: 16px;
}

.service-cities ul {
	width: 100%;
	font-size: 16px;
	display: inline-block;
	list-style-type: none;
	padding-left: 0;
}

.service-cities li {
	padding-left: 10px;
	padding-bottom: 10px;
	margin-top: 3px;
	border-bottom: 1px dotted #d6d3cc;
}

.service-cities {
	background-color: #eeede6;
	padding-bottom: 80px;
	padding-top: 20px;
}
.col-sm-3 {
width: 25%;
padding-bottom: 20px;
margin-right: 15px;
}
.bloginfo{
  padding-top:20px;
  text-align:center;
}
.carousel-indicators .active{
background:blue;
}
.carousel-indicators li{
background:grey;
}
</style>
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
					<ul
						class="nav navbar-nav header-nav city-nav visible-xs visible-sm"
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
						<li class="dropdown hidden-xs hidden-sm" id="city-dropdown">
							<a class="dropdown-toggle" data-toggle="dropdown"
							href="<%=request.getContextPath()%>/shanghai"> <span data-i18n="headline.cities.ShangHai" id="current_default"></span> <span class="caret"></span>
						</a>
							<ul class="dropdown-menu" role="menu">
								<li><a href="<%=request.getContextPath()%>/shanghai" id="current-shanghai" data-i18n="headline.cities.ShangHai"></a></li>
								<li><a href="<%=request.getContextPath()%>/beijing" id="current-beijing" data-i18n="headline.cities.BeiJing"></a></li>
								<li><a
									href="<%=request.getContextPath()%>/promo/kitchensurfing-is-coming" data-i18n="headline.cities.Other" id="current-other"></a></li>
							</ul>
						</li>
						<li><a
							href="<%=request.getContextPath()%>/menus?source=header" id="find-chef" data-i18n="headline.chef.find_a_chef"></a></li>
						<li><a href="<%=request.getContextPath()%>/help=center"
							class="help-center-link" data-i18n="headline.helper.help"></a></li>
							<li><a href="<%=request.getContextPath()%>/blog">博客</a></li>
						<li class="dropdown hidden-xs hidden-sm" id="language-dropdown">
							<a class="dropdown-toggle" data-toggle="dropdown"
							href="<%=request.getContextPath()%>/CN"> <span>Language</span> <span class="caret"></span>
						</a>
							<ul class="dropdown-menu" role="menu">
								<li><a href="?setLng=zh-CN" data-i18n="headline.language.Chinese"></a></li>
								<li><a href="?setLng=en-US" data-i18n="headline.language.English"></a></li>
							</ul>
						</li>
					</ul>
					<%--  <ul class="nav navbar-nav header-nav user-nav logged-out-user-nav">
						<li><a
							href="<%=request.getContextPath()%>/account/sign-up?source=header"
							class="sign-up-or-log-in">Inbox</a></li>
						<li><a href="/KitchenSurfing/login"
							class="sign-up-or-log-in">Account</a></li>
						
					</ul> --%>
					
			<c:choose>
			   <c:when test="${!empty sessionScope.kitchensurfing_session_user}">
			     <ul class="nav navbar-nav header-nav user-nav ">
			         <li class="menu-item hidden-xs hidden-sm"><a href="${pageContext.request.contextPath}/favorites" class="favorites"
			          data-placement="bottom" rel="tooltip" data-original-title="favorites">
			         </a></li>
			         <li class="menu-item inbox hidden-xs hidden-sm"><a href="${pageContext.request.contextPath}/inbox" data-placement="bottom"
			          rel="tooltip" data-origin-title="Inbox">
			          <span class="envelope-icon" data-i18n="headline.box.in_box"></span>
			         </a></li>
			         <li class="dropdown hidden-xs hidden-sm" id="user-dropdown"><a class="dropdown-toggle" data-toggle="dropdown"
			          href="${pageContext.request.contextPath}/shanghai#"> <img alt="${user.username}" class="user-image" src="${pageContext.request.contextPath}/assets/5365bc78350d479b7400000b-50x50.jpg">
			         <span class="name">${sessionScope.kitchensurfing_session_user.username }</span><span class="caret"></span>
			          </a>
			            <ul class="dropdown-menu" role="menu">
			            <li><a href="${pageContext.request.contextPath}/chefs/edit?tab=about_me" data-i18n="headline.edit.chef_profile"></a></li>
			            <li><a href="${pageContext.request.contextPath}/account"> <span class="translation_missing" title="translation missing:en.new_homepage.setting" data-i18n="headline.setting.first"></span>
			            </a></li>
			            <li><a href="${pageContext.request.contextPath}/logout"><span class="translation_missing" title="translation missing:en.new_homepage.log_out" data-i18n="headline.logout.out"></span>
			            </a></li>
			            </ul>
			          </li>
			     </ul>
			   </c:when>
			  <c:otherwise>
			   <ul class="nav navbar-nav header-nav user-nav logged-out-user-nav">
					<li><a href="<%=request.getContextPath()%>/account/sign-up?source=header"
						class="sign-up-or-log-in" data-i18n="headline.signUper.sign_up"></a></li>
					<li><a href="<%=request.getContextPath()%>/login" class="sign-up-or-log-in" data-i18n="headline.login_user.login">
							</a></li>
					<li class="im-a-chef-wrapper"><a class="btn im-a-chef"
						href="<%=request.getContextPath()%>/chefs" role="button" data-i18n="headline.Im_chef.cooker"></a></li>
				</ul>
			</c:otherwise>		
			</c:choose>
			
				
			</div>
			<input type="hidden" name="authenticity_token" id="token" value="${flag}">
		</div>
	</nav>

	<div class="jumbotron">
		<div class='hireinfo'>
			<img src="baseimages/hiring-badge.png">
		</div>
		<div class="container">
			<h1 class="header-signed-out headline signed-out">我们的厨师, 你的厨房.</h1>
			<div class="row col-xs-12 hidden-xs">
				<div class="col-sm-7 row subtitle">
					<p>你下个大餐从这里开始. 通过KitchenSurfing找到当地厨师在你家为你烹饪大餐.</p>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-12 find-a-chef-in">

					<button type="submit" class="btn btn-info">找北京当地厨师</button>

				</div>
			</div>
		</div>
	</div>


	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class=""></li>
			<li data-target="#myCarousel" data-slide-to="1" class=""></li>
			<li data-target="#myCarousel" data-slide-to="2" class="active"></li>
		</ol>

		<div class="carousel-inner">
			<div class="item active">

				<div class="container hidden-sm hidden-xs">
					<div class="content row">
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="row">
								<div
									class="col-lg-6 col-md-6 col-sm-6 col-xs-12 promotion-image">
									<img alt="Mmtve1avqnoulcf8fzbd"
										class="img-responsive stage-promo-image"
										src="baseimages/passover1110x600.png">
								</div>
								<div class="col-lg-6 col-md-6 col-sm-6 promotion-text">
									<div class="promotion-title">手撕包菜</div>
									<div class="promotion-description">你下个大餐从这里开始.
										通过KitchenSurfing找到当地厨师在你家为你烹饪大餐.</div>
									<div class="promotion-button">
										<button type="button" class="btn btn-info">查看菜单</button>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>




			</div>

			<div class="item">
				<div class="container hidden-sm hidden-xs">
					<div class="content row">
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="row">
								<div
									class="col-lg-6 col-md-6 col-sm-6 col-xs-12 promotion-image">
									<img alt="If3j3qmirwqj9gzsma68"
										class="img-responsive stage-promo-image"
										src="baseimages/date_night_1110x600.png">
								</div>
								<div class="col-lg-6 col-md-6 col-sm-6 promotion-text">
									<div class="promotion-title">烛光晚餐</div>
									<div class="promotion-description">你下个大餐从这里开始.
										通过KitchenSurfing找到当地厨师在你家为你烹饪大餐</div>
									<div class="promotion-button">
										<a href="<%=request.getContextPath()%>/map/graduation-party-${lp}" class="btn btn-info call-to-action">寻找菜谱</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>
			<div class="item">
				<div class="container hidden-sm hidden-xs">
					<div class="content row">
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="row">
								<div
									class="col-lg-6 col-md-6 col-sm-6 col-xs-12 promotion-image">
									<img alt="Lliepikstzewalxj7jct"
										class="img-responsive stage-promo-image"
										src="baseimages/uJiIdiHuSVSqUHNxwrv7.png">
								</div>
								<div class="col-lg-6 col-md-6 col-sm-6 promotion-text">
									<div class="promotion-title">现代摩洛哥</div>
									<div class="promotion-description">通过一些香料填充的旅程打开眼界烹饪

摩洛哥的最美味的菜，像美味炖的和

正宗手工古斯古斯 在这里等着你。</div>
									<div class="promotion-button">
											<a href="<%=request.getContextPath()%>/menus/menu-529d5a826325f3a8b7000035" class="btn btn-red call-to-action">寻找菜谱</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>

		</div>

		<a class="left carousel-control"
			href="http://getbootstrap.com/examples/carousel/#myCarousel"
			data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
		<a class="right carousel-control"
			href="http://getbootstrap.com/examples/carousel/#myCarousel"
			data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
	</div>
	<!-- /.carousel -->

	<div class="sign-up-social">
		<div class="container">
			<div class="content row">
				<div class="col-sm-8 sign-up">
					<div class="row">
						<div class="col-xs-12">
							<p>注册获得特别优惠,食谱,餐饮技巧等等.</p>
						</div>
					</div>
					<div class="row">


						<form class="navbar-form navbar-left" role="form" action="/login"
							method="post">
							<div class="form-group">
								<input type="text" name="Email" size=50 placeholder="邮箱"
									class="form-control">
							</div>
							<div class="form-group">
								<input type="text" name="zip" placeholder="密码"
									class="form-control">
							</div>
							<button type="submit" class="btn btn-success">注册</button>
						</form>

					</div>
				</div>
				<div class="col-sm-4 col-xs-12 social">
					<p>Follow us on:</p>
					<div class="social-icons">
						<div class="col-xs-2">
							<a href="https://www.facebook.com/Kitchensurfing" id="facebook"
								target="_blank"><img alt="Follow_facebook_grey"
								src="baseimages/follow_facebook.png"></a>
						</div>
						<div class="col-xs-2">
							<a href="https://twitter.com/Kitchensurfing" id="twitter"
								target="_blank"><img alt="Follow_twitter_grey"
								src="baseimages/follow_twitter.png"></a>
						</div>
						<div class="col-xs-2">
							<a href="https://www.pinterest.com/kitchensurfing/"
								id="pinterest" target="_blank"><img
								alt="Follow_pinterest_grey"
								src="baseimages/follow_pinterest.png"></a>
						</div>
						<div class="col-xs-2">
							<a href="http://instagram.com/kitchensurfing/" id="instagram"
								target="_blank"><img alt="Follow_instagram_grey"
								src="baseimages/follow_instagram.png"></a>
						</div>
						<div class="col-xs-2">
							<a href="https://plus.google.com/+KitchensurfingHQ/" id="google+"
								target="_blank"><img alt="Follow_google_plus_grey"
								src="baseimages/follow_google.png"></a>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>




	<div class="hidden-xs">
		<div class="container featured-chefs">
			<h3 style='text-align: center'>北京厨师推荐</h3>
			<div class="row">
				<div class="col-sm-4 featured-chef">
					<img alt="5359cb8d2001bd4dc300002f-978x506" class="img-responsive"
						src="baseimages/dish.jpg">
					<div class="col-sm-4 left-column hidden-xs">
						<a href="/chefs/5285705b048b5c36e7000035?source=featured%2Bchefs"
							class="chef-name"><img alt="52b172f17e6bf34f7100000a-170x170"
							class="chef-photo img-responsive" src="baseimages/chief.jpg">
						</a>
						<div class="price-attributes">
							<p class="menu">菜单</p>
							<p class="numbers">8-20</p>
							<p>人数</p>
							<p class="numbers">$75</p>
							<p>平均每人</p>
						</div>
					</div>
					<div class="col-sm-8 right-column hidden-xs">
						<a href="/chefs/5285705b048b5c36e7000035?source=featured%2Bchefs"
							class="chef-name">小张</a>
						<p class="title">烹饪过程</p>
						<h4>东京Izakaya风格</h4>
						<p class="courses clamp-4">东京好吃的东京好吃的东京好吃的东京好吃的东京好吃的东京好吃的东京好吃的</p>
						<a href="/chefs/5285705b048b5c36e7000035?source=featured%2Bchefs">查看菜单</a>
					</div>
				</div>

				<div class="col-sm-4 featured-chef">
					<img alt="5239f0d8c21f2cf37000018a-978x506" class="img-responsive"
						src="baseimages/dish.jpg">
					<div class="col-sm-4 left-column hidden-xs">
						<a href="/chefs/5231f24f7000c1016000004e?source=featured%2Bchefs"
							class="chef-name"><img alt="531a26251c937e378100001a-170x170"
							class="chef-photo img-responsive" src="baseimages/chief.jpg">
						</a>
						<div class="price-attributes">
							<p class="menu">菜单</p>
							<p class="numbers">8-20</p>
							<p>人数</p>
							<p class="numbers">$75</p>
							<p>平均每人</p>
						</div>
					</div>
					<div class="col-sm-8 right-column hidden-xs">
						<a href="/chefs/5285705b048b5c36e7000035?source=featured%2Bchefs"
							class="chef-name">小张</a>
						<p class="title">烹饪过程</p>
						<h4>东京Izakaya风格</h4>
						<p class="courses clamp-4">东京好吃的东京好吃的东京好吃的东京好吃的东京好吃的东京好吃的东京好吃的</p>
						<a href="/chefs/5285705b048b5c36e7000035?source=featured%2Bchefs">查看菜单</a>
					</div>
				</div>

				<div class="col-sm-4 featured-chef">
					<img alt="53208386c80dfbc2c2000001-978x506" class="img-responsive"
						src="baseimages/dish.jpg">
					<div class="col-sm-4 left-column hidden-xs">
						<a href="/chefs/52cbb6ff4015827a62000014?source=featured%2Bchefs"
							class="chef-name"><img alt="5331c77b5a2ffc712800016b-170x170"
							class="chef-photo img-responsive" src="baseimages/chief.jpg">
						</a>
						<div class="price-attributes">
							<p class="menu">菜单</p>
							<p class="numbers">8-20</p>
							<p>人数</p>
							<p class="numbers">$75</p>
							<p>平均每人</p>
						</div>
					</div>
					<div class="col-sm-8 right-column hidden-xs">
						<a href="/chefs/5285705b048b5c36e7000035?source=featured%2Bchefs"
							class="chef-name">小张</a>
						<p class="title">烹饪过程</p>
						<h4>东京Izakaya风格</h4>
						<p class="courses clamp-4">东京好吃的东京好吃的东京好吃的东京好吃的东京好吃的东京好吃的东京好吃的东京好吃的</p>
						<a href="/chefs/5285705b048b5c36e7000035?source=featured%2Bchefs">查看菜单</a>
					</div>
				</div>

			</div>
		</div>
	</div>



	<div class="bloginfo">
		<div class="blog-social container">
			<div class="content">
				<h3>Kitchensurfing博客分享</h3>
				<div class="row blog-entries">
					<div class="col-sm-3  clearfix row">
						<div
							class=" col-sm-12 col-sm-push-0 col-xs-5 col-xs-push-7">
							<a href="#" target="_blank"> <img alt="Jzjrdtcisqqz7s3uibpg"
								class="img-responsive" src="baseimages/KSgrams-blog.png">
							</a>
						</div>
						<div
							class=" col-sm-12 col-sm-pull-0 col-xs-7 col-xs-pull-5">
							<p class="hidden-xs">March 20, 2014</p>
							<h4>
								<a href="#" target="_blank"> 这个是钟新的理念,很棒 </a>
							</h4>
						</div>
					</div>
					<div class="col-sm-3  clearfix row">
						<div
							class=" col-sm-12 col-sm-push-0 col-xs-5 col-xs-push-7">
							<a href="#" target="_blank"> <img alt="Fvuxx4ttryrj9nfnh54y"
								class="img-responsive" src="baseimages/KS_Austin.jpg">
							</a>
						</div>
						<div
							class=" col-sm-12 col-sm-pull-0 col-xs-7 col-xs-pull-5">
							<p class="hidden-xs">March 20, 2014</p>
							<h4>
							<a href="#" target="_blank"> 这个是钟新的理念,很棒 </a>
							</h4>
						</div>
					</div>
					<div class="col-sm-3  clearfix row">
						<div
							class=" col-sm-12 col-sm-push-0 col-xs-5 col-xs-push-7">
							<a href="#" target="_blank"> <img alt="Noi0ol6ustmk7ys6prib"
								class="img-responsive" src="baseimages/Ramen-Blog.jpg">
							</a>
						</div>
						<div
							class=" col-sm-12 col-sm-pull-0 col-xs-7 col-xs-pull-5">
							<p class="hidden-xs">February 27, 2014</p>
							<h4>
							<a href="#" target="_blank"> 这个是钟新的理念,很棒 </a>
							</h4>
						</div>
					</div>
					<div class="col-sm-3  clearfix row">
						<div
							class=" col-sm-12 col-sm-push-0 col-xs-5 col-xs-push-7">
							<a href="#" target="_blank"> <img alt="X637bt73st9afeshcpsy"
								class="img-responsive" src="baseimages/bubbly.jpg">
							</a>
						</div>
						<div
							class=" col-sm-12 col-sm-pull-0 col-xs-7 col-xs-pull-5">
							<p class="hidden-xs">December 12, 2013</p>
							<h4>
								<a href="#" target="_blank"> 这个是钟新的理念,很棒 </a>
							</h4>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>



	<div class="service-cities">
		<div class="container">
			<h3 style='text-align: center;'>我们的厨师分布在…</h3>
			<div class="row">
				<div
					class="col-md-3 col-md-offset-3 col-sm-4 col-sm-offset-2 col-xs-6">
					<ul>
						<li>北京</li>
						<li>上海</li>
						<li>深圳</li>
						<li>广州</li>
					</ul>
				</div>
				<div class="col-md-3 col-xs-6 col-sm-4">
					<ul>
						<li>南昌</li>
						<li>武汉</li>
						<li>南宁</li>
						<li>上饶</li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<footer>
		<nav class="new-page-footer navbar" id="footer-nav" role="navigation">

			<div style='text-align: center'>
				<img alt="Kitchensurfing-logo-on-dark@2x" class="footer-logo"
					src="baseimages/kitchensurfing-logo-on-dark.png">
				<p class="footline">
					<span>© 2014 Kitchensurfing, Inc.</span><span class="separator">|</span><span><a
						href="http://nytm.org/made">Made in NYC</a></span><span class="separator">|</span><span>Pick
						a chef, any chef.</span>
				</p>

			</div>
		</nav>


	</footer>
		<script src="<%=request.getContextPath()%>/plugin/jquery/jquery.js"></script>
	<script src="<%=request.getContextPath()%>/plugin/sea.js"></script>
	<script src="<%=request.getContextPath()%>/plugin/bootstap/js/bootstrap.js"></script>

<script src="<%=request.getContextPath()%>/plugin/i18next-1.7.3.js"></script>
	<script type="text/javascript">
	
     seajs.config({
    	 paths:{'base':'module'},
    	 alias:{
    		 "jquery" : "base/jquery/jquery.js",
			 "Backbone" : "base/backbone/Backbone.js",
			 "greet" : "base/greet.js"
    	 }
     });
    seajs.use(['greet'],function(Greet){
    	//Greet.helloJavaScript();
    });
    
    language_complete = navigator.language.split("-");
    language = (language_complete[0]);
    console.log("Sprache (root): %s", language);
    //i18n callback
    $.i18n.init({
        //lng: 'en-US',
        ns: { namespaces: ['ns.special'], defaultNs: 'ns.special'},
        useLocalStorage: false,
        debug: true
    }, function() {
      
     alert($.t('headline.cities.ShangHai'));
       
        $('#hamburger-menu').i18n();
       // $('#extendedAttr').i18n();
    });


	</script>
</body>
<%=request.getContextPath()%>
${pageContext.request.contextPath}
</html>