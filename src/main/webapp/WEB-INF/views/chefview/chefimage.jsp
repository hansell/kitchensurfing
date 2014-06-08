<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="/KitchenSurfing/plugin/bootstap/css/bootstrap.css">
<link rel="stylesheet" href="/KitchenSurfing/project/css/chef/chef.css">
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
					src="/KitchenSurfing/baseimages/kitchensurfing-logo.png"
					width="161"></a>

			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="dropdown hidden-xs hidden-sm" id="city-dropdown"><a
						class="dropdown-toggle" data-toggle="dropdown" href="#"> <span>北京</span>
							<span class="caret"></span>
					</a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="berlin">上海</a></li>
							<li><a href="boston">深圳</a></li>
							<li><a href="chicago">广州</a></li>
							<li><a href="hamptons">浙江</a></li>
							<li><a href="los-angeles">江西</a></li>
							<li><a href="new-york">南昌</a></li>
						</ul></li>
					<li class="active"><a href="#">找厨师</a></li>
					<li><a href="#about">博客</a></li>
				</ul>
			</div>
		</div>
	</div>


	<div class="container chef-container">
		<div class="row">
			<div class="col-md-3">
				<div class='chefnav'>
					<ul class="slider">
						<li class=""><a href="/KitchenSurfing/chef/chefBase.view"><i class="glyphicon glyphicon-user"></i>&nbsp;关于</a></li>
						<li class=""><a href="/KitchenSurfing/chef/chefExprerience.view"><i class="glyphicon glyphicon-send"></i>&nbsp;&nbsp;经历</a></li>
						<li class=""><a href="/KitchenSurfing/chef/chefLogistics.view"><i class="glyphicon glyphicon-bell"></i>&nbsp;&nbsp;作息</a></li>
						<li class="menuactive"><a href="/KitchenSurfing/chef/chefImage.view"><i class="glyphicon glyphicon-picture"></i>&nbsp;&nbsp;照片</a></li>
						<li class=""><a href="/KitchenSurfing/chef/chefMenus.view"><i class="glyphicon glyphicon-list-alt"></i>&nbsp;&nbsp;菜单</a></li>
</ul>
				</div>
			</div>

			<div class="col-md-9" role="main">

				<form role="form">


					<div class='infogroup chefimagealign' >

					 	<h3>图片上传</h3>

						<div class='infosplit'></div>

						<p>选择你的一张高清图片上传到kitchensuring服务器</p>

						<img class='chefimageupload' src="/KitchenSurfing/baseimages/chef/addimg.jpg" alt="上传图片" class="img-thumbnail">

					</div>
 
					<button type="submit" class="btn btn-default subbtn">上传</button>
				</form>



			</div>
		</div>
	</div>

	<script src="/KitchenSurfing/plugin/jquery/jquery.js"></script>
	<script src="/KitchenSurfing/plugin/bootstap/js/bootstrap.js"></script>
	<script
		src="/KitchenSurfing/plugin/bootstrap-plugin/dialog/js/bootstrap-dialog.min.js"></script>

</body>
</html>