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
<link rel="stylesheet" href="<%=request.getContextPath()%>/plugin/bootstap/css/bootstrap.css">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<meta content="website" property="og:type">
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
<meta
	content="KitchenSurfing is a community for a unique food and social experience. Meet, cook and eat together,
 host a dinner or join others. Food brings people from any culture all over the world together."
	property="og:description">
<meta content="https://www.kitchensurfing.com/" property="og:url">

</head>
<body>
	
</body>
</html>