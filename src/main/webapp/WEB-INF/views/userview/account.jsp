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
<title>KitchenSurfing</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/plugin/bootstap/css/bootstrap.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/project/css/chef/chef.css">
<meta content="website" property="og:type">
<meta
	content="KitchenSurfing is a community for a unique food and social experience. Meet, cook and eat together,
 host a dinner or join others. Food brings people from any culture all over the world together."
	property="og:description">
<meta content="" property="og:url">
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
						class="dropdown-toggle" data-toggle="dropdown" href="<%=request.getContextPath()%>/shanghai"> <span data-i18n="headline.cities.ShangHai" id="current_city"></span>
							<span class="caret"></span>
					</a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="<%=request.getContextPath()%>/shanghai" id="current-shanghai" data-i18n="headline.cities.ShangHai"></a></li>
							<li><a href="<%=request.getContextPath()%>/beijing" id="current-beijing" data-i18n="headline.cities.BeiJing"></a></li>
								<li><a
									href="<%=request.getContextPath()%>/promo/kitchensurfing-is-coming" data-i18n="headline.cities.Other" id="current-other"></a></li>
						</ul></li>
							<li><a class="active"
							href="<%=request.getContextPath()%>/menus?source=header" id="find-chef" data-i18n="headline.chef.find_a_chef"></a></li>
					
					<li><a href="<%=request.getContextPath()%>/help=center"
							class="help-center-link" data-i18n="headline.helper.help"></a></li>
							<li><a href="<%=request.getContextPath()%>/blog" data-i18n="headline.blog.blog"></a></li>
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
			</div>
		</div>
	</div>
<script src="<%=request.getContextPath()%>/plugin/jquery/jquery.js"></script>	
 <script src="<%=request.getContextPath()%>/plugin/bootstap/js/bootstrap.js"></script>
 <script data-main="plugin/app" src="<%=request.getContextPath()%>/plugin/require.js" defer async="true"></script>
</body>
>>>>>>> 279f1dd0cddfb3d696fba80a5c7748e045830431
</html>