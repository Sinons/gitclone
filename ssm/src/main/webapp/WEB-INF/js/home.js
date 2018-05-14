$(function(){
	
	vm = new Vue({
		el:"#main-bottom",
		data:{
			data:[]
		},
	});
	$(".search-button").on('click',function(){
		inputListener();
	});
	$(".search-input").keydown(function(event){
		if(event.which==13){
			inputListener();	
		}
	});
	scrollListener();
	
})

function sendAjax(){
	let json = {"keyWords":"\"" + $(".search-input").val() + "\""};
	$.ajax({
		url: "/ssm/search",
		data: json,
		contentType: "application/json",
		dataType: "json",
		type: "GET",
		success: function(result){
			vm.data = result;
			$(".display-list").each(function(){this.style.display='block'});
		},
		error: function(){
			tooltip("客官,没找到您要的商品");
		}
	});
}
function inputListener(){
	if($(".search-input").val() != "" && $(".search-input").val().length > 0){
		sendAjax();
	}else{
		tooltip("客官,搜索框没有东西哟,若要搜索,请输入相关信息");
	}
}
function tooltip(tips){
	$("#main").children("#tooltips").remove();
	$("#main").append("<div id='tooltips'>"+ tips +"</div>");
	$("#tooltips").css({'width': '15em','height': '3em','position': 'absolute','left': '30em','top': '0.5em','padding': '0.1em','z-index': '10','color': 'rgba(255,255,255,0)'});
	$("#tooltips").css({'animation':'tooltips 5s'});
}
function scrollListener(){
	$(window).scroll(function(){
		if($("#main-bottom").offset().top<($("#main-center").offset().top + $("#main-center").height())){
			$("#main-center").css({
				'background-color': 'rgb(41,41,41,0.5)',
				'border':'none',
			})
		}else{
			$("#main-center").css({
				'background-color': 'rgb(255,255,255,1)',
				'border-bottom': '0.1em solid green',
			})
		}
	});
}