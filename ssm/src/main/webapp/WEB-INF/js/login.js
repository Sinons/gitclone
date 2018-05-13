$(function(){
		$("#music")[0].play();
		checkInput($(".form-account-user"));
		checkInput($(".form-account-pwd"));
		$(".form-account-submit").on('mousedown',function(){
			$(this).css({"width": "80%","height":"2.45em","margin-left":"10%"});
		});
		$(".form-account-submit").on('mouseup',function(){
			$(this).css({"width": "82%","height":"2.5em","margin-left":"9%"});
			checkSubmit();
		});
		$(".form-account-submit").on('mouseout',function(){
			$(this).css({"width": "82%","height":"2.5em","margin-left":"9%"});
		});
		newAccount();
});
function checkInput($obj){
		$obj.on('input',function(){
			$(".alert-list").text("");
				if($(".form-account-user").val().length==11 && ($(".form-account-pwd").val().length>7 && $(".form-account-pwd").val().length<17)){
					  setSubmitStyle(false,"#228B22");
				}else {
					  setSubmitStyle(true,"#404040");
				}
		});
}
function newAccount(){
	$(".link-new").on('click',function(){
		window.location="/summer/register";
	});
}
function checkSubmit(){
		var phone = /^1[34578]\d{9}$/;
		var pwd = /[a-zA-Z0-9]{8,18}/;
		var user = $(".form-account-user").val();
		var password = $(".form-account-pwd").val();
		var $userresult = phone.test(user);
		var $pwdresult = pwd.test(password);
		var param = "{\"phone\":\"" + user + "\"," +"\"password\":" + "\"" + password + "\"}";
		if($userresult && $pwdresult){
			 $.ajax({
				 url: "/summer/login/check",
				 type: "POST",
				 data: param,
				 contentType: "application/json",
				 dataType: "json",	
				 success: function(data){
					 alert(data.status + " " + data.code);
//					 window.self.location="/summer/index";
				 },
				 error: function(data){
					alert("error"); 
				 }
			 });
		}else{
				if(!$userresult){
					  $(".alert-user").text("手机号码格式不正确");
				}
				if(!$pwdresult){
					  $(".alert-pwd").text("密码格式不正确");
				}
	  }
}
function setSubmitStyle(status,bg){
		$(".form-account-submit").attr('disabled',status);
   	$(".form-account-submit").css("background",bg);
}
