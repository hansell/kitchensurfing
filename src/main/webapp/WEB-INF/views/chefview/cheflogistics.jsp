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
						<li class="menuactive"><a href="/KitchenSurfing/chef/chefLogistics.view"><i class="glyphicon glyphicon-bell"></i>&nbsp;&nbsp;作息</a></li>
						<li class=""><a href="/KitchenSurfing/chef/chefImage.view"><i class="glyphicon glyphicon-picture"></i>&nbsp;&nbsp;照片</a></li>
						<li class=""><a href="/KitchenSurfing/chef/chefMenus.view"><i class="glyphicon glyphicon-list-alt"></i>&nbsp;&nbsp;菜单</a></li>
</ul>
				</div>
			</div>

			<div class="col-md-9" role="main">

				<form role="form">


					<div class='infogroup'>

						<h3>可用时间</h3>

						<div class='infosplit'></div>

						<p>我们确保你们仅在选中的日期接收请求.</p>

						<div class="checkbox">
							<label> <input type="checkbox" value=""> 星期一
							</label>
						</div>
						<div class="checkbox">
							<label> <input type="checkbox" value=""> 星期二
							</label>
						</div>
						<div class="checkbox">
							<label> <input type="checkbox" value=""> 星期三
							</label>
						</div>
						<div class="checkbox">
							<label> <input type="checkbox" value=""> 星期四
							</label>
						</div>
						<div class="checkbox">
							<label> <input type="checkbox" value=""> 星期五
							</label>
						</div>
						<div class="checkbox">
							<label> <input type="checkbox" value=""> 星期六
							</label>
						</div>
						<div class="checkbox">
							<label> <input type="checkbox" value=""> 星期日
							</label>
						</div>

					</div>


					<div class='infogroup'>

						<h3>价格</h3>

						<div class='infosplit'></div>


						<p>每个小时需话费的费用</p>

						<div class="input-group moneyitem">
							<div class="input-group-btn">
								<button type="button" class="btn btn-default dropdown-toggle"
									data-toggle="dropdown">
									￥<span class="caret"></span>
								</button>
								<ul class="dropdown-menu">
									<li><a href="#">$</a></li>
								</ul>
							</div>
							<!-- /btn-group -->
							<input type="text" class="form-control">
						</div>
						<!-- /input-group -->

					</div>

					<div class='infogroup'>

						<h3>地址</h3>

						<div class='infosplit'></div>

						<p>选择您所在的城市</p>

						<select class="form-control  locationitem">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
						</select>

						<div class="form-group">
							<label for="exampleInputPassword1">你愿意去哪些地方</label> <input
								name="placetravelto" class="form-control">
						</div>

					</div>

					<div class='infogroup'>

						<h3>联系方式</h3>

						<div class='infosplit'></div>

						<p>请输入您的手机号码</p>

						<div class="input-group input-group-lg phoneitem">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-phone"></span></span> 
							
							<input type="text"
								class="form-control" placeholder="手机号码">
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