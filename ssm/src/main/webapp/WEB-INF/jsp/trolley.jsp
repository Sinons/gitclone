<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>购物车</title>
  <link rel="icon" type="x-icon" href="/ssm/image/home.ico">
  <link rel="stylesheet" href="/ssm/css/trolley.css">
  <link rel="stylesheet" href="/ssm/css/bootstrap.min.css">
 
<!--<script type="text/javascript" charset="utf-8" src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.js"></script>
	<script type="text/javascript" charset="utf-8" src="http://apps.bdimg.com/libs/jquerymobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>-->
    <script type="text/javascript" charset="utf-8" src="/ssm/js/jquery-3.2.1.js"></script>
    <script type="text/javascript" charset="utf-8" src="/ssm/js/trolley.js"></script>
    <script type="text/javascript" charset="utf-8" src="/ssm/js/vue.min.js"></script>
</head>
<body>
  <div class="container-fluid" style="background-color: rgba(41,41,41,0.2)">
  	<h2 class="text-center text-success">购物车</h2>
  	<h4 class="text-right"><a href="/ssm/index" style="margin-right: 2em;">返回首页</a></h4>
  </div>
  <div class="container-fluid text-center" style="height: 50em;">
    <div class="row col-lg-3 col-md-3 col-sm-3 col-xs-3" style="height: 50em;background-color: rgba(41,41,41,0.3)">
      <ul class="nav nav-pills nav-stacked" style="font-size: 1.5em;">
        <li class="nav-list " ><a href="#" style="text-decoration: none;">已添加<span class="badge">2</span></a></li>
		<li class="nav-list "><a href="#">全部清空</a></li>
      </ul>
    </div>
    <div class="row col-lg-9 col-md-9 col-sm-9 col-xs-9" style="margin-left: 2em;">
	  <input type="radio" value="hell">
      <ul class="" v-for="items in trolley">
        <li class="nav-list "><img><a>{{items.image}}</a></li>
        <li class="nav-list "><a>{{items.describe}}</a></li>
        <li class="nav-list "><a>{{items.}}</a></li>
        <li class="nav-list ">hello</li>
      </ul>
    </div>
  </div>
</body>
</html>