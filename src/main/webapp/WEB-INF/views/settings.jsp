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
<meta content="website" property="og:type">

<meta
	content="KitchenSurfing is a community for a unique food and social experience. Meet, cook and eat together,
 host a dinner or join others. Food brings people from any culture all over the world together."
	property="og:description">
<meta content="https://www.kitchensurfing.com/" property="og:url">
<link
	href="/KitchenSurfing/project/css/new_application-68f5548c6dd1809e29217ea8ea574930.css"
	media="screen" rel="stylesheet" type="text/css">
<link
	href="/KitchenSurfing/project/css/application-b5553895490433b29a30db110ed1e714.css"
	media="screen" rel="stylesheet" type="text/css">
</head>
<body class="account-without-devise show loggedin  has-footer"
	data-tr-category="account_without_devise" data-tr-label="chef">
	<div class="wrap">
		<div>
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
						<a class="navbar-brand" href="/KitchenSurfing/shanghai"><img
							alt="Kitchensurfing-logo-cropped@2x" class="img-responsive"
							height="19"
							src="/KitchenSurfing/project/images/kitchensurfing-logo-cropped@2x-0d9f82384215fb931c20e51a4ed8b3b8.png"
							width="161"></a>
						<ul
							class="nav navbar-nav header-nav city-nav visible-xs visible-sm"
							id="city-dropdown">
							<li class="dropdown"><a class="dropdown-toggle"
								data-toggle="dropdown" href="/kitchenSurfing/shanghai"> <span
									data-current-city="la" id="current-city">上海</span> <span
									class="caret"></span>
							</a>
								<ul class="dropdown-menu" role="menu">

									<li><a href="/KitchenSurfing/shanghai">上海</a></li>
									<li><a href="/KitchenSurfing/beijing">北京</a></li>
									<li><a
										href="/KitchenSurfing/promo/kitchensurfing-is-coming">Other</a></li>

								</ul></li>
						</ul>
					</div>
					<div class="collapse navbar-collapse hamburger-collapse"
						id="hamburger-menu">
						<ul class="nav navbar-nav header-nav">
							<li class="visible-xs visible-sm"><a
								href="/KitchenSurfing/shanghai">Home</a></li>
							<li class="dropdown hidden-xs hidden-sm" id="city-dropdown">
								<a class="dropdown-toggle" data-toggle="dropdown"
								href="/KitchenSurfing/shanghai"> <span>上海</span> <span
									class="caret"></span>
							</a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="/KitchenSurfing/shanghai">上海</a></li>
									<li><a href="/KitchenSurfing/beijing">北京</a></li>
									<li><a
										href="/KitchenSurfing/promo/kitchensurfing-is-coming">Other</a></li>
								</ul>
							</li>
							<li><a
								href="<%=request.getContextPath()%>/menus?source=header">Find
									a Chef</a></li>
							<li><a href="<%=request.getContextPath()%>/help=center"
								class="help-center-link">Help</a></li>
							<li class="referral"><a
								href="<%=request.getContextPath()%>/referrals?source=header"
								id="referral-link">Get $50</a></li>
						</ul>



					</div>
				</div>
			</div>
			</nav>
			<div class="subnavigation">
				<div class="container">
					<ul class="unstyled">
						<li id="inbox"><a href="<%=request.getContextPath()%>/inbox">Inbox</a></li>
						<li id="listing"><a
							href="<%=request.getContextPath()%>/chefs/edit">Edit Chef
								Profile</a></li>
						<li class="active" id="settings"><a
							href="<%=request.getContextPath()%>/usercontrol/account" class="active">Settings</a></li>
					</ul>
				</div>
			</div>
			<div class="notifications"></div>
			<div class="contextual-layout" id="main">
				<div class="container messages"></div>
				<div class="container">
					<div class="contextual-page">
						<div class="contextual-page-nav">
							<div class="vertical-subnavigation">
								<ul class="unstyled">
									<li class="active simple-navigation-active-leaf" id="profile"><a
										href="<%=request.getContextPath()%>/usercontrol/account"
										class="active">Profile</a></li>
									<li id="account"><a
										href="<%=request.getContextPath()%>/usercontrol/settings">Account</a></li>
								</ul>
							</div>
						</div>
						<div class="contextual-page-body">
							<div class="generic-form">
								<div class="sections">
									<form accept-charset="UTF-8"
										action="<%=request.getContextPath()%>/usercontrol/account?self=save"
										class="simple_form edit_user"
										id="edit_user_5365bbf267ec88c1c300000c" method="post"
										novalidate="novalidate">
										<div style="margin: 0; padding: 0; display: inline">
											<input name="utf8" type="hidden" value="✓"><input
												name="_method" type="hidden" value="put"><input
												name="authenticity_token" type="hidden"
												value="CISktTbjVPkPZBxbwJgEnGNhlcQ+9gWTUh1dElHT2YI=">
										</div>
										<div class="section-header">
											<h2 class="section-headline">Basic Information</h2>
										</div>
										<div class="inner">
											<fieldset>
												<div class="control-group string optional">
													<label class="string optional control-label"
														for="user_first_name">* 姓(First name)</label>
													<div class="controls">
														<input class="string optional" id="user_first_name"
															name="first_name" size="50" type="text"
															value="${sessionScope.kitchensurfing_session_user.firstName }">
													</div>
												</div>
												<div class="control-group string optional">
													<label class="string optional control-label"
														for="user_last_name">* 名字(Last name)</label>
													<div class="controls">
														<input class="string optional" id="user_last_name"
															name="last_name" size="50" type="text" value="${sessionScope.kitchensurfing_session_user.lastName }">
													</div>
												</div>
												<div class="control-group date_dropdown optional">
													<label class="date_dropdown optional control-label"
														for="user_birthday">生日(Birthday)</label>
													<div class="controls">
														<div class="combobox dropdown vline" id="combobox_month">
															<a class="dropdown-toggle"
																href="https://www.kitchensurfing.com/account#combobox_month"
																data-toggle="dropdown">May</a>
															<ul class="dropdown-menu" role="menu">
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="">Month</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1">Jan</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="2">Feb</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="3">Mar</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="4">Apr</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="5" class="selected">May</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="6">Jun</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="7">Jul</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="8">Aug</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="9">Sep</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="10">Oct</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="11">Nov</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="12">Dec</a></li>
															</ul>
															<input type="hidden" id="month" name="user[birthday(2i)]"
																value="5">
														</div>
														<div class="combobox dropdown vline" id="combobox_day">
															<a class="dropdown-toggle"
																href="https://www.kitchensurfing.com/account#combobox_day"
																data-toggle="dropdown">05</a>
															<ul class="dropdown-menu" role="menu">
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="">Day</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1">01</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="2">02</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="3">03</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="4">04</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="5" class="selected">05</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="6">06</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="7">07</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="8">08</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="9">09</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="10">10</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="11">11</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="12">12</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="13">13</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="14">14</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="15">15</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="16">16</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="17">17</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="18">18</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="19">19</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="20">20</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="21">21</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="22">22</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="23">23</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="24">24</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="25">25</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="26">26</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="27">27</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="28">28</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="29">29</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="30">30</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="31">31</a></li>
															</ul>
															<input type="hidden" id="day" name="user[birthday(3i)]"
																value="5">
														</div>
														<div class="combobox dropdown vline" id="combobox_year">
															<a class="dropdown-toggle"
																href="https://www.kitchensurfing.com/account#combobox_year"
																data-toggle="dropdown">1991</a>
															<ul class="dropdown-menu" role="menu">
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="">Year</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="2014">2014</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="2013">2013</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="2012">2012</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="2011">2011</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="2010">2010</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="2009">2009</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="2008">2008</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="2007">2007</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="2006">2006</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="2005">2005</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="2004">2004</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="2003">2003</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="2002">2002</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="2001">2001</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="2000">2000</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1999">1999</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1998">1998</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1997">1997</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1996">1996</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1995">1995</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1994">1994</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1993">1993</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1992">1992</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1991" class="selected">1991</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1990">1990</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1989">1989</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1988">1988</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1987">1987</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1986">1986</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1985">1985</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1984">1984</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1983">1983</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1982">1982</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1981">1981</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1980">1980</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1979">1979</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1978">1978</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1977">1977</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1976">1976</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1975">1975</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1974">1974</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1973">1973</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1972">1972</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1971">1971</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1970">1970</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1969">1969</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1968">1968</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1967">1967</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1966">1966</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1965">1965</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1964">1964</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1963">1963</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1962">1962</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1961">1961</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1960">1960</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1959">1959</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1958">1958</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1957">1957</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1956">1956</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1955">1955</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1954">1954</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1953">1953</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1952">1952</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1951">1951</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1950">1950</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1949">1949</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1948">1948</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1947">1947</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1946">1946</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1945">1945</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1944">1944</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1943">1943</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1942">1942</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1941">1941</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1940">1940</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1939">1939</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1938">1938</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1937">1937</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1936">1936</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1935">1935</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1934">1934</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1933">1933</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1932">1932</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1931">1931</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1930">1930</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1929">1929</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1928">1928</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1927">1927</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1926">1926</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1925">1925</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1924">1924</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1923">1923</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1922">1922</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1921">1921</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1920">1920</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1919">1919</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1918">1918</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1917">1917</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1916">1916</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1915">1915</a></li>
																<li><a
																	href="https://www.kitchensurfing.com/account#"
																	data-value="1914">1914</a></li>
															</ul>
															<input type="hidden" id="year" name="user[birthday(1i)]"
																value="1991">
														</div>
													</div>
												</div>
												<div class="control-group select optional">
													<label class="select optional control-label"
														for="user_languages_spoken">* Languages Spoken</label>
													<div class="controls">
														<input name="user[languages_spoken][]" type="hidden"
															value=""><select class="select optional"
															id="user_languages_spoken" multiple="multiple"
															name="user[languages_spoken][]" size="5"><option
																value="Afrikaans">Afrikaans</option>
															<option value="Albanian">Albanian</option>
															<option value="Arabic">Arabic</option>
															<option value="Armenian">Armenian</option>
															<option value="Basque">Basque</option>
															<option value="Bengali">Bengali</option>
															<option value="Bulgarian">Bulgarian</option>
															<option value="Catalan">Catalan</option>
															<option value="Central Khmer">Central Khmer</option>
															<option value="Chinese" selected="selected">Chinese</option>
															<option value="Croatian">Croatian</option>
															<option value="Czech">Czech</option>
															<option value="Danish">Danish</option>
															<option value="Dutch">Dutch</option>
															<option value="English">English</option>
															<option value="Estonian">Estonian</option>
															<option value="Fijian">Fijian</option>
															<option value="Finnish">Finnish</option>
															<option value="French">French</option>
															<option value="Georgian">Georgian</option>
															<option value="German">German</option>
															<option value="Greek">Greek</option>
															<option value="Gujarati">Gujarati</option>
															<option value="Hebrew">Hebrew</option>
															<option value="Hindi">Hindi</option>
															<option value="Hungarian">Hungarian</option>
															<option value="Icelandic">Icelandic</option>
															<option value="Indonesian">Indonesian</option>
															<option value="Irish">Irish</option>
															<option value="Italian">Italian</option>
															<option value="Japanese">Japanese</option>
															<option value="Korean">Korean</option>
															<option value="Latin">Latin</option>
															<option value="Latvian">Latvian</option>
															<option value="Lithuanian">Lithuanian</option>
															<option value="Macedonian">Macedonian</option>
															<option value="Malay">Malay</option>
															<option value="Malayalam">Malayalam</option>
															<option value="Maltese">Maltese</option>
															<option value="Maori">Maori</option>
															<option value="Marathi">Marathi</option>
															<option value="Mongolian">Mongolian</option>
															<option value="Nepali">Nepali</option>
															<option value="Norwegian">Norwegian</option>
															<option value="Panjabi">Panjabi</option>
															<option value="Persian">Persian</option>
															<option value="Polish">Polish</option>
															<option value="Portuguese">Portuguese</option>
															<option value="Quechua">Quechua</option>
															<option value="Romanian">Romanian</option>
															<option value="Russian">Russian</option>
															<option value="Samoan">Samoan</option>
															<option value="Serbian">Serbian</option>
															<option value="Slovak">Slovak</option>
															<option value="Slovenian">Slovenian</option>
															<option value="Spanish">Spanish</option>
															<option value="Swahili">Swahili</option>
															<option value="Swedish">Swedish</option>
															<option value="Tamil">Tamil</option>
															<option value="Tatar">Tatar</option>
															<option value="Telugu">Telugu</option>
															<option value="Thai">Thai</option>
															<option value="Tibetan">Tibetan</option>
															<option value="Tonga (Tonga Islands)">Tonga
																(Tonga Islands)</option>
															<option value="Turkish">Turkish</option>
															<option value="Ukrainian">Ukrainian</option>
															<option value="Urdu">Urdu</option>
															<option value="Uzbek">Uzbek</option>
															<option value="Vietnamese">Vietnamese</option>
															<option value="Welsh">Welsh</option>
															<option value="Xhosa">Xhosa</option></select>
													</div>
												</div>
											</fieldset>
										</div>
										<div class="section-header">
											<h2 class="section-headline">Your Profile Photo</h2>
										</div>
										<div class="inner photo-description">
											<p>
												<strong>Please upload a photo that clearly shows
													your face.</strong>
											</p>
											<p>.png, .gif and .jpg files less than 2 MB are accepted.</p>
											<div class="s3-data" data-accesskeyid="AKIAJUVVMAMFMFJ3N6VQ"
												data-path="public_upload/5365bbf267ec88c1c300000c/user_photos/"
												data-policy=""
												data-signature="H4idsT+iiULgZBWdj9OGxkxGvCw="
												data-url="http://ks2p.s3.amazonaws.com/"></div>
											<div class="account-photo">
												<input id="photo_filename" name="photo_filename"
													type="hidden"> <input class="btn mini"
													type="file" name="fileupload" id="add-photos" data-url="">上传照片(Upload a
													photo) </a>
												<div class="image-box">
													<div class="progress">
														<div class="spinner"></div>
														<div class="progress-bar">
															<div class="bar"></div>
														</div>
													</div>
													<div class="image-shadow">
														<img alt="5365bc78350d479b7400000b-260x260"
															src="./Kitchensurfing_files/5365bc78350d479b7400000b-260x260.jpg">
													</div>
												</div>
											</div>
										</div>
										<div class="control-group">
											<div class="controls actions">
												<button class="btn small" type="submit">Save</button>
												<div class="legend">*required fields</div>
											</div>
										</div>
									</form>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>