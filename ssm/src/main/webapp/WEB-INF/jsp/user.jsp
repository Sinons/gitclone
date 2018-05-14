<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>逸轩阁</title>
	<link rel="icon" type="x-icon" href="/ssm/image/home.ico">
	<link rel="stylesheet" href="/ssm/css/user.css">
	<link rel="stylesheet" href="/ssm/css/bootstrap.min.css">
	<!--
	  <script type="text/javascript" charset="utf-8" src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.js"></script>
	  <script type="text/javascript" charset="utf-8" src="http://apps.bdimg.com/libs/jquerymobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>-->
  	  <script type="text/javascript" charset="utf-8" src="/ssm/js/jquery-3.2.1.js"></script>
  	  <script type="text/javascript" charset="utf-8" src="/ssm/js/user.js"></script>
  	   <script type="text/javascript" charset="utf-8" src="/ssm/js/vue.min.js"></script>
</head>
<body>
	<h2 class="text-center">我的阁楼</h2>
	<h4 class="text-right" style="margin-right: 2em;"><a href="/ssm/index">返回首页</a></h4>
	<nav class="navbar navbar-default" role="navigation">
	 
	    <ul class="nav nav-pills nav-justified">
		  <li class="active nav-list"><a href="#">我的信息</a></li>
		  <li class="nav-list"><a href="#">我的钱包</a></li>
		  <li class="active nav-list"><a href="#">交易记录</a></li>
		  <li class="nav-list"><a href="#">订单状态</a></li>
		</ul>
	 
	</nav> 
	<div class="container-fluid">
	  <div class="row">
	    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-left">
		  <ul class="list-group">
			<li class="list-group-item"><h4>用户名</h4></li>
			<li class="list-group-item"><h4>昵称</h4></li>
			<li class="list-group-item"><h4>会员</h4></li>
			<li class="list-group-item">
			  <h4><span class="caret"></span></h4>
			  <ul>
			  </ul>
			</li> 	
		  </ul>
	    </div>
	    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
		  <ul class="list-group">	
			<li class="list-group-item"><h4>余额</h4></li>
			<li class="list-group-item"><h4>银行卡<a class="glyphicon glyphicon-chevron-up" style="margin-left: 70%;"></a></h4></li>
			<li class="list-group-item">
			  <h4>添加银行卡<a class="glyphicon glyphicon-plus"></a></h4>
			  <ul>
			  </ul>
			</li> 
		  </ul>
	    </div>
	    <div id="recorder" class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
	      <h4 v-if="recorder==0">暂无记录</h4>
		  <ul class="list-group " v-for="items in recorder">
		    <li class="list-group-item list-group-item-success">交易时间:&nbsp&nbsp{{items.date}}</li>
		    <li class="list-group-item list-group-item-success">支出:&nbsp&nbsp{{items.pay}}</li>
		    <li class="list-group-item list-group-item-success">商品:&nbsp&nbsp{{items.goods}}</li>
		    <li class="list-group-item list-group-item-success">订单号:&nbsp&nbsp{{items.code}}</li>
		    <li class="list-group-item list-group-item-success">商家:&nbsp&nbsp{{items.owner}}</li>
		  </ul>
	    </div>
	    <div id="order" class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
		  <h4 v-if="recorder==0">暂无新订单</h4>
		  <ul class="list-group list-group-info" v-for="items in recorder">
		    <li class="list-group-item list-group-item-info">交易时间:&nbsp&nbsp{{items.date}}</li>
		    <li class="list-group-item list-group-item-info">商品:&nbsp&nbsp{{items.goods}}</li>
		    <li class="list-group-item list-group-item-info">订单号:&nbsp&nbsp{{items.code}}</li>
		    <li class="list-group-item list-group-item-info">状态:&nbsp&nbsp{{items.status}}</li>
		  </ul>
	    </div>
	  </div>
	</div>
</body>
</html>