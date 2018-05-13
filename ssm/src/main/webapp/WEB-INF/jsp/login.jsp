<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
  <head>
    <title>休闲就上逸轩阁</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel="stylesheet" type="text/css" href="/ssm/css/login.css">
    <link rel="icon" href="/ssm/image/home.ico" type="image/x-icon"/>
	<!--
	  <script type="text/javascript" charset="utf-8" src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.js"></script>
	  <script type="text/javascript" charset="utf-8" src="http://apps.bdimg.com/libs/jquerymobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>-->
  	<script type="text/javascript" charset="utf-8" src="/ssm/js/jquery-3.2.1.js"></script>
 	<script type="text/javascript" charset="utf-8" src="/ssm/js/login.js"></script>
  </head>
  <body>
  	<div id="login">
  		<div class="login-title">
  			<span class="login-title-list login-title-account">账号密码登录</span>
  			<span class="login-title-list login-title-phone">手机快捷登录</span>
  		</div>
  		<div class="login-content login-account">
  			<div class="login-content-form">
  				<input class="form-list form-account-list form-user form-account-user" type="text" placeholder="手机号"/>
  				<span class="alert-list alert-user"></span>
  				<input class="form-list form-account-list form-pwd form-account-pwd" type="password" placeholder="密码"/>
  				<span class="alert-list alert-pwd"></span>
   				<button class="form-submit form-account-submit" disabled="disabled">登录</button>
  			</div>
  			<div class="login-content-link">
  				<button class="link-list link-forget">忘记密码</button>
  				<span class="link-list link-divider">|</span>
  				<button class="link-list link-new">注册新账号</button>
  			</div>
  		</div>
  		<div class="login-content login-phone">
  			<div class="login-content-form">
  				<input class="form-list form-user form-phone-user" type="text" placeholder="手机号"/>
  				<input class="form-list form-phone-pwd" type="password" placeholder="请输入验证码"/>
  				<button class="form-check" disabled="disabled">发送验证码</button>
  				<span class="alert-list alert-pwd alert-phone-pwd"></span>
   				<button class="form-submit form-phone-submit" disabled="disabled">登录</button>
  			</div>
  			<div class="login-content-link">
  				<a class="link-list link-new" href="/summer/register">注册新账号</a>
  				<span class="link-list link-divider">|</span>
  				<a class="link-list link-forget" href="#">忘记密码 </a>
  			</div>
  			<audio src="/ssm/audio/secretGarden.mp3" autoplay="autoplay" id="music" loop="loop"></audio>
  		</div>
  	</div>
  </body>
</html>
