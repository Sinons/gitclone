<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>逸轩阁</title>
	<link rel="icon" type="x-icon" href="/ssm/image/home.ico">
	<link rel="stylesheet" href="/ssm/css/home.css">
	<!--
	  <script type="text/javascript" charset="utf-8" src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.js"></script>
	  <script type="text/javascript" charset="utf-8" src="http://apps.bdimg.com/libs/jquerymobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>-->
  	  <script type="text/javascript" charset="utf-8" src="/ssm/js/jquery-3.2.1.js"></script>
  	  <script type="text/javascript" charset="utf-8" src="/ssm/js/home.js"></script>
  	   <script type="text/javascript" charset="utf-8" src="/ssm/js/vue.min.js"></script>
</head>
<body>
	<div id="main">
		<div id="main-top">
			<a class="main-top-list main-top-login" href="/ssm/login">登录</a>
			<a class="main-top-list main-top-sign" href="/ssm/register">我要注册</a>
			<a class="main-top-list main-top-mine" href="/ssm/user">我的阁楼</a>
			<a class="main-top-list main-top-trolley" href="#">购物车</a>
		</div>
		<div id="main-center">
			<div class="main-center-list main-center-icon">
				<img class="main-center-icon-item" alt="图片走丢了" src="/ssm/image/homeicon.png">
			</div>

			<div class="main-center-list main-center-content">
				<div class="main-center-content-list main-center-content-search">
					<input class="search-list search-input" type="text" placeholder="搜索  商品/品牌/店铺">
					<input class="search-list search-button" type="button" value="搜索">
				</div>
				<div class="main-center-content-list main-center-content-stream">
					<a class="stream-list" href="#">连衣裙</a>
					<a class="stream-list" href="#">四件套</a>
					<a class="stream-list" href="#">摄像头</a>
					<a class="stream-list" href="#">客厅灯</a>
					<a class="stream-list" href="#">口红</a>
					<a class="stream-list" href="#">手机</a>
					<a class="stream-list" href="#">运动鞋</a>
					<a class="stream-list" href="#">牛奶</a>
				</div>
			</div>
		</div>
		<div id="main-bottom" style="width: 100%;height: auto;position: relative;top: 11em;">
		  <div class="display-list" v-for="items in data" style="display: none;width: 12em;height: 19em;border: 0.1em solid green;margin:1em;">
 		    <img :src='items.image' alt="图片走丢了" style="width: 100%;height: 12em;">
    		<a href="#"> <span class="items-list">&nbsp产品:&nbsp&nbsp{{items.name}}</span></a>
    		<a href="#" style="text-decoration: underline;">&nbsp&nbsp加入购物车</a>
    		<br/>
		  	<a href="#"><strong class="items-list">&nbsp价格:&nbsp&nbsp{{items.price}}￥</strong></a>
		  	<br/>
		  	<a href="#"><span class="items-list">&nbsp发货地:&nbsp&nbsp{{items.source}}</span></a>
		  	<br/>
		  	<a href="#"><span class="items-list">&nbsp月销量:&nbsp&nbsp{{items.sales}}</span></a>
	  		<br/>
	  		<a href="#"><span class="items-list">&nbsp包邮:&nbsp&nbsp{{items.free}}</span>	</a>
	  		<a href="#" style="text-decoration: underline;">&nbsp&nbsp立即购买</a>
		  </div>
		</div>
	</div>
</body>
</html>
