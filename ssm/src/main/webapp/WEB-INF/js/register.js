$(function(){
	$("#music")[0].play();
	inputListener();
	$(".commit").on('mousedown',function(){
		$(this).css({"width": "78%","height":"2.45em","margin-left":"12%"});
	});
	$(".commit").on('mouseup',function(){
		$(this).css({"width": "80%","height":"2.5em","margin-left":"11%"});
		commitCheck();
	});
	$(".commit").on('mouseout',function(){
		$(this).css({"width": "80%","height":"2.5em","margin-left":"11%"});
	});
});
function inputListener(){
	$(".input-list").each(function(){
		$(this).on('input',function(){
			$(".alert-list").text("");
			if($(".input-password").val().length>7 && $(".input-password").val().length<17
					&& $(".input-confirm").val().length>7 && $(".input-confirm").val().length<17
					&& $(".input-name").val().length>0 && $(".input-name").val()!=""
					&& $(".input-phone").val().length==11){
				setCommitStyle(false,"#228B22");	
			}else{
				setCommitStyle(true,"#404040");	
			}
		});
	});	
}
function commitCheck(){
	var phone = /^1[34578]\d{9}$/;
	var pwd = /[a-zA-Z0-9]{8,18}/;
	var $phone = $(".input-phone").val();
	var $password = $(".input-password").val();
	var $confirm = $(".input-confirm").val();
	var $phonetest = phone.test($phone);
	var $passwordtest = pwd.test($password);
	var $confirmtest = pwd.test($confirm);
	if($phonetest && $passwordtest && $confirmtest && $confirm==$password){
		save();
	}
	if(!$phonetest){
		$(".alert-phone").text("请输入正确手机号");
		$(".input-phone").val("");
	}
	if(!$password){
		$(".alert-password").text("密码格式不正确,密码只能包含字母、数字、下划线");
		$(".input-password").val("");
	}
	if($confirm!=$password){
		$(".alert-confirm").text("两次密码不一致，请重新输入");
		$(".input-password").val("");
		$(".input-confirm").val("")
	}
	if(!$confirmtest){
		$(".alert-confirm").text("密码格式不正确,密码只能包含字母、数字、下划线");
		$(".input-confirm").val("");
	}
}
function save(){
	var user = $(".input-phone").val();
	var password = $(".input-password").val();
	var address = $(".input-address").val();
	var name = $(".input-name").val();
	var nick = $(".input-nick").val();
	var param = "{\"phone\":\"" + user + "\",\"password\":\"" + password + "\",\"address\":\"" + address + "\",\"name\":\"" + name + "\",\"nick\":\"" + nick + "\"}";
	$.ajax({
		url: "/summer/register/save",
		type: "POST",
		data: param,
		contentType: "application/json",
		dataType: "json",
		success: function(data){
			if(data.code=="0"){
				$(".alert-phone").text(data.message);
				$(".input-phone").val("");
			}else if(data.code=="1"){
				alert(data.message);
				$(".input-list").each(function() {
					$(this).val("");
				});
			}
		},
		error: function(data){
			alert(data.status + " " + data.code);
		}
	});
}
function setCommitStyle(status,bg){
	$(".commit").attr('disabled',status);
	$(".commit").css("background",bg);
}
