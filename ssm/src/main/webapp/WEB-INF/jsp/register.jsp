<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>逸轩阁欢迎您</title>
	<link rel="icon" type="x-icon" href="/ssm/image/home.ico">
	<link rel="stylesheet" href="/ssm/css/register.css">
	<!--<script type="text/javascript" charset="utf-8" src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.js"></script>
  	<script type="text/javascript" charset="utf-8" src="http://apps.bdimg.com/libs/jquerymobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>-->
	<script type="text/javascript" charset="utf-8" src="/ssm/js/jquery-3.2.1.js"></script>
	<script type="text/javascript" charset="utf-8" src="/ssm/js/register.js"></script>
</head>
<body>
	<div id="register">
		<div class="register-list register-title" >
			<h3>逸轩阁</h3>
		</div>
		<div class="register-list register-input">
			<input class="input-list input-phone" type="text" placeholder="请输入手机号"><span class="tips">*</span>
			<span class="alert-list alert-phone"></span>
			<input class="input-list input-password" type="password" placeholder="请输入密码" ><span class="tips">*</span>
			<span class="alert-list alert-password"></span>
			<input class="input-list input-confirm" type="password" placeholder="请确认密码"><span class="tips">*</span>
			<span class="alert-list alert-confirm"></span>
			<input class="input-list input-address" type="text" placeholder="请输入收货地址">
			<span class="alert-list alert-address"></span>
			<input class="input-list input-name" type="text" placeholder="请输入真实姓名"><span class="tips">*</span>
			<span class="alert-list alert-name"></span>			
			<input class="input-list input-nick" type="text" placeholder="请输入昵称">
			<span class="alert-list alert-nick"></span>
		</div>
		<div class="register-list register-commit">
			<audio src="/ssm/audio/secretGarden.mp3" autoplay="autoplay" id="music" loop="loop"></audio>
			<button class="commit" disabled="disabled">注册</button>
		</div>
	</div>
</body>
</html>