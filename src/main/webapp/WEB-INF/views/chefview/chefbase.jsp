<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="/KitchenSurfing/plugin/bootstap/css/bootstrap.css">
<link rel="stylesheet"
	href="/KitchenSurfing/project/css/chef/chef.css">
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
	   
	    <c:if test="${msg!=null }">
			<div class="alert alert-success alert-dismissable">
				<button type="button" class="close" data-dismiss="alert"
					aria-hidden="true">&times;</button>
				<strong>提示信息:数据保存成功!<c:out value="${chef.userid }"></c:out></strong> 		
		    </div>
		</c:if>
	
	
		<div class="row">
			<div class="col-md-3">
				<div class='chefnav'>
					<ul class="slider">
						<li class="menuactive"><a href="/KitchenSurfing/chef/chefBase.view"><i class="glyphicon glyphicon-user"></i>&nbsp;关于</a></li>
						<li class=""><a href="/KitchenSurfing/chef/chefExprerience.view"><i class="glyphicon glyphicon-send"></i>&nbsp;&nbsp;经历</a></li>
						<li class=""><a href="/KitchenSurfing/chef/chefLogistics.view"><i class="glyphicon glyphicon-bell"></i>&nbsp;&nbsp;作息</a></li>
						<li class=""><a href="/KitchenSurfing/chef/chefImage.view"><i class="glyphicon glyphicon-picture"></i>&nbsp;&nbsp;照片</a></li>
						<li class=""><a href="/KitchenSurfing/chef/chefMenus.view"><i class="glyphicon glyphicon-list-alt"></i>&nbsp;&nbsp;菜单</a></li>

					</ul>
				</div>
			</div>

			<div class="col-md-9" role="main">

				<form role="form" action="/KitchenSurfing/chef/chefBaseAdd.model">


					<div class='infogroup'>

						<h3>个人基本信息</h3>

						<div class='infosplit'></div>

						<div class="form-group">
							<label for="exampleInputEmail1">个人标签</label> <input type="email"
								name="tagline" class="form-control" value="<c:if test="${chef.tagLine!=null }"><c:out value="${chef.tagLine}"></c:out></c:if>"
								placeholder="输入个人标签">
						</div>

					</div>


					<div class='infogroup'>

						<h3>烹饪技巧</h3>

						<div class='infosplit'></div>

						<div class="form-group">
							<label for="exampleInputPassword1">烹饪方式</label>
							<textarea class="form-control"  name="cookstyle" rows="4" placeholder="输入您的个人烹饪技巧" ><c:if test="${chef.cookstyle!=null }"><c:out value="${chef.cookstyle}"></c:out></c:if></textarea>
						</div>
						<div class="form-group">

							<label for="exampleInputPassword1">您最喜欢的原料 </label>
							<div class="row">
								<div class="col-md-4">
									<input type="text"  name="favoringredientone" value="<c:if test="${chef.favoringredientone!=null }"><c:out value="${chef.favoringredientone}"></c:out></c:if>" class="form-control" placeholder="橄榄油">
								</div>
								<div class="col-md-4">
									<input type="text" name="favoringredienttwo" value="<c:if test="${chef.favoringredienttwo!=null }"><c:out value="${chef.favoringredienttwo}"></c:out></c:if>" class="form-control" placeholder="橄榄油" class="form-control" placeholder="鳄梨">
								</div>
								<div class="col-md-4">
									<input type="text" name="favoringredientthree" value="<c:if test="${chef.favoringredientthree!=null }"><c:out value="${chef.favoringredientthree}"></c:out></c:if>" class="form-control" placeholder="橄榄油" class="form-control" placeholder="姜片">
								</div>
							</div>
						</div>

					</div>


					<div class='infogroup'>

						<h3>个人关键字</h3>

						<div class='infosplit'></div>

						<p>将你擅长的菜系按先后顺序排列显示,最多输入5个</p>

						<div class="form-group">
							<label for="exampleInputEmail1">关键字(最多输入5个)</label> <input
								 name="personalkey" class="form-control"
								 placeholder="个人关键字" value="<c:if test="${chef.personalkey!=null }"><c:out value="${chef.personalkey}"></c:out></c:if>">
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">个人最擅长</label> <input 
								name="personalspecial" class="form-control" 
								placeholder="个人最擅长" value="<c:if test="${chef.personalspecial!=null }"><c:out value="${chef.personalspecial}"></c:out></c:if>">
						</div>

					</div>

					<div class='infogroup'>

						<h3>个人web地址</h3>

						<div class='infosplit'></div>


						<div class="form-group">
							<label for="exampleInputEmail1">facebook 地址</label> <input
								name="weblocationone" class="form-control"
								placeholder="facebook 地址" value="<c:if test="${chef.weblocationone!=null }"><c:out value="${chef.weblocationone}"></c:out></c:if>" >
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">twitter 地址</label> <input
							    name="weblocationtwo" class="form-control"
								value="<c:if test="${chef.weblocationtwo!=null }"><c:out value="${chef.weblocationtwo}"></c:out></c:if>" placeholder="twitter 地址">
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">个人网址</label>
						    <input name="weblocationthree" class="form-control" value="<c:if test="${chef.weblocationthree!=null }"><c:out value="${chef.weblocationthree}"></c:out></c:if>"
								placeholder="个人网址">
						</div>

					</div>

					<button type="submit" class="btn btn-default subbtn">提交</button>
					
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