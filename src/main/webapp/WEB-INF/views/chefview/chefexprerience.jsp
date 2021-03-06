<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
		<div class="row">
			<div class="col-md-3">
				<div class='chefnav'>
					<ul class="slider">
					<li class=""><a href="/KitchenSurfing/chef/chefBase.view"><i class="glyphicon glyphicon-user"></i>&nbsp;关于</a></li>
						<li class="menuactive"><a href="/KitchenSurfing/chef/chefExprerience.view"><i class="glyphicon glyphicon-send"></i>&nbsp;&nbsp;经历</a></li>
						<li class=""><a href="/KitchenSurfing/chef/chefLogistics.view"><i class="glyphicon glyphicon-bell"></i>&nbsp;&nbsp;作息</a></li>
						<li class=""><a href="/KitchenSurfing/chef/chefImage.view"><i class="glyphicon glyphicon-picture"></i>&nbsp;&nbsp;照片</a></li>
						<li class=""><a href="/KitchenSurfing/chef/chefMenus.view"><i class="glyphicon glyphicon-list-alt"></i>&nbsp;&nbsp;菜单</a></li>

					</ul>
				</div>
			</div>

			<div class="col-md-9" role="main">

				<form role="form">


					<div class='infogroup'>

						<h3>经历</h3>

						<div class='infosplit'></div>

						<div class="form-group">
							<label for="exampleInputPassword1">学习烹饪经历</label>
							<textarea class="form-control" rows="4" placeholder="输入您的个人烹饪技巧"></textarea>
						</div>

					</div>


					<div class='infogroup  trainexcontainer'>

						<h3>培训经历</h3>

						<div class='infosplit'></div>

                         <div class='additem addTrain'>
                             <span class="glyphicon glyphicon-plus"></span> 添加培训经历
                         </div>
                         
                         <div class='trainexitems'>
                               
                        </div> 

					</div>
					
					<div class='infogroup'>

						<h3>工作经历</h3>

						<div class='infosplit'></div>

                         <div class='additem'>
                             <span class="glyphicon glyphicon-plus"></span> 添加工作经历
                         </div>

					</div>

					<button type="submit" class="btn btn-default subbtn">提交</button>
				</form>

			</div>
		</div>
	</div>

   <!-- 添加模板 (增加培训经历)-->
<script type="text/template" id="tpl-trainexadd">

                      <div style="padding: 8px;border: 1px solid #cccccc;border-radius: 12px;margin-bottom: 5px;">
                             <div  style='height: 25px;'>
                                <div  style="float:right;">
	                                <button type="button" class="btn btn-primary  btn-sm  save">保存</button>
	                                <button type="button" class="btn btn-success  btn-sm  cancel">取消</button>
                                </div>
                             </div>
	                         <div class="form-group">
							    <label for="begindate">开始日期</label>
							    <input type="text" name='startdate' class="form-control" id="begindate" placeholder="开始日期">
							  </div>
							  
							  <div class="form-group">
							    <label for="enddate">截止日期</label>
							    <input type="text" name='enddate'  class="form-control" id="enddate" placeholder="截止日期">
							  </div>
	                         
	                          <div class="form-group">
							    <label for="traincontent">培训内容</label>
							    <textarea rows="5" class='form-control traincontent'  placeholder="培训内容"></textarea>
							  </div>
                       </div> 
</script>




	<script src="/KitchenSurfing/plugin/jquery/jquery.js"></script>
	<!-- 引入backbone -->
	<script
		src="/KitchenSurfing/plugin/backbone/underscore.js"></script>
	<script
		src="/KitchenSurfing/plugin/backbone/backbone.js"></script>
	<script
		src="/KitchenSurfing/project/js/chef/chefview.js"></script>
	<script type="text/javascript">
            var trainviews=new TrainExViews();
	            
	
	</script>

</body>
</html>