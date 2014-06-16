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
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="dropdown hidden-xs hidden-sm" id="city-dropdown"><a
						class="dropdown-toggle" data-toggle="dropdown" href="<%=request.getContextPath()%>/shanghai"> <span>上海</span>
							<span class="caret"></span>
					</a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="<%=request.getContextPath()%>/shanghai">上海</a></li>
							
						</ul></li>
							<li><a class="active"
							href="<%=request.getContextPath()%>/menus?source=header" id="find-chef" data-i18n="headline.chef.find_a_chef"></a></li>
					<li><a href="<%=request.getContextPath()%>/blog">博客</a></li>
					<li><a href="<%=request.getContextPath()%>/help=center"
							class="help-center-link" data-i18n="headline.helper.help"></a></li>
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
	<script src="<%=request.getContextPath()%>/plugin/sea.js"></script>
	<script src="<%=request.getContextPath()%>/plugin/bootstap/js/bootstrap.js"></script>

<script src="<%=request.getContextPath()%>/plugin/i18next-1.7.3.js"></script>
<script type="text/javascript">
$.i18n.init({
    //lng: 'en-US',
    ns: { namespaces: ['ns.special'], defaultNs: 'ns.special'},
    useLocalStorage: false,
    debug: true
}, function() {
  
 alert($.t('headline.cities.ShangHai'));
   
    //$('#hamburger-menu').i18n();
   // $('#extendedAttr').i18n();
});
</script>
</body>
</html>