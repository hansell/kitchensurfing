
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>KitchenSurfing</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/plugin/bootstap/css/bootstrap.css">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta content="website" property="og:type">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/project/css/user/user_483293djdeuweuww3.css">
<!--[if lt IE 9]>
    <script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
<link rel="shortcut icon" href="images/favicon.ico">
<link rel="apple-touch-icon" href="images/apple-touch-icon.png">
<link rel="apple-touch-icon" sizes="72x72"
	href="images/apple-touch-icon-72x72.png">
<link rel="apple-touch-icon" sizes="114x114"
	href="images/apple-touch-icon-114x114.png">
<meta
	content="KitchenSurfing is a community for a unique food and social experience. Meet, cook and eat together,
 host a dinner or join others. Food brings people from any culture all over the world together."
	property="og:description">
<meta content="https://www.kitchensurfing.com/" property="og:url">
<style type="text/css">
</style>
</head>
<body>
	<div class="navbar   navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"><img
					alt="Kitchensurfing-logo-cropped@2x" class="img-responsive"
					height="19"
					src="<%=request.getContextPath()%>/baseimages/kitchensurfing-logo.png"
					width="161"></a>

			</div>
			<div class="collapse navbar-collapse" id="hamburger-head">
				<ul class="nav navbar-nav">
					<li class="dropdown hidden-xs hidden-sm" id="city-dropdown"><a
						class="dropdown-toggle" data-toggle="dropdown"
						href="<%=request.getContextPath()%>/shanghai"> <span
							data-i18n="headline.cities.ShangHai" id="current_city"></span> <span
							class="caret"></span>
					</a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="<%=request.getContextPath()%>/shanghai"
								id="current-shanghai" data-i18n="headline.cities.ShangHai"></a></li>
							<li><a href="<%=request.getContextPath()%>/beijing"
								id="current-beijing" data-i18n="headline.cities.BeiJing"></a></li>
							<li><a
								href="<%=request.getContextPath()%>/promo/kitchensurfing-is-coming"
								data-i18n="headline.cities.Other" id="current-other"></a></li>
						</ul></li>
					<li><a class="active"
						href="<%=request.getContextPath()%>/menus?source=header"
						id="find-chef" data-i18n="headline.chef.find_a_chef"></a></li>

					<li><a href="<%=request.getContextPath()%>/help=center"
						class="help-center-link" data-i18n="headline.helper.help"></a></li>
					<li><a href="<%=request.getContextPath()%>/blog"
						data-i18n="headline.blog.blog"></a></li>
					<li class="dropdown hidden-xs hidden-sm" id="language-dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown"
						href="<%=request.getContextPath()%>/CN"> <span>Language</span>
							<span class="caret"></span>
					</a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="?setLng=zh-CN"
								data-i18n="headline.language.Chinese"></a></li>
							<li><a href="?setLng=en-US"
								data-i18n="headline.language.English"></a></li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<div class="subnavigation">
		<div class="container">
			<ul class="unstyled">


			</ul>
		</div>
	</div>
	<div class="notifications"></div>

	<div class="container user-container">
		<div class="row">
			<div class="col-md-3">
				<div class='user_nav'>
					<ul class="slider">
						<li class=""><a href="<%=request.getContextPath()%>/account"><i
								class="glyphicon glyphicon-send"></i>&nbsp;&nbsp;账户</a></li>
						<li class=""><a href="<%=request.getContextPath()%>/settings"><i
								class="glyphicon glyphicon-picture"></i>&nbsp;&nbsp;简介</a></li>
					</ul>
				</div>
			</div>
			<div class="col-md-9" role="main">
				<form accept-charset="UTF-8" action="/settings"
					class="simple_form edit_user"
					id="edit_user_5365bbf267ec88c1c300000c" method="post"
					novalidate="novalidate">
					<div class='infogroup'>

						<h3>联系信息</h3>

						<div class='infosplit'></div>

						<div class="form-group string">
							<label for="user_email" class="" style="font-weight: bold;">* E-Mail </label><br>
							<div class="col-xs-5">
								<input type="text" name="username" class="form-control" value=""
									placeholder="E-Mail">
							</div>

							<br> <br>
						</div>

						<div class="form-group">
							<label class=" " for="user_phone" style="font-weight: bold;">联系电话</label>
							  <p style="margin-left:2px;padding-top: 0.65em;">我们不会对外公开 </p>
							<div class="col-xs-5">
								<input type="text" name="user[phone]" class="form-control"
									value="" id="user_phone" placeholder="phone number" size="50" >
							</div>
						</div>
						<div class="form-group section-header" style="">
                           <h2 class="section-headline">上传你的照片</h2>
                         </div>
                        
						<div class="control-group">
						    <div class="controls actions">
						    
							<div class="col-sm-offset-2 col-sm-10" style="align:center">
                               <div class="legend">* required fields</div>
								<button type="submit" class="btn btn-default subbtn " >提交</button>
							</div>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

	<script src="<%=request.getContextPath()%>/plugin/jquery/jquery.js"></script>
	<script
		src="<%=request.getContextPath()%>/plugin/bootstap/js/bootstrap.js"></script>
	<script data-main="plugin/app"
		src="<%=request.getContextPath()%>/plugin/require.js" defer
		async="true"></script>
</body>

</html>
