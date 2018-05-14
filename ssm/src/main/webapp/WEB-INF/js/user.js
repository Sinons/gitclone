$(function(){
	
	re = new Vue({
		el: "#recorder",
		data:{
			recorder: [{
				"date":"2018-05-12",
				"pay":"87￥",
				"goods":"书包",
				"code":"08723730912734403",
				"owner":"天猫商城",
				},
			{
				"date":"2018-05-12",
				"pay":"87￥",
				"goods":"书包",
				"code":"08723730912734403",
				"owner":"天猫商城",
			}],
			show:false,
		}
	});
	
	order = new Vue({
		el: "#order",
		data:{
			recorder: [{				
				"date":"2018-05-12",
				"goods":"书包",
				"code":"08723730912734403",
				"status":"已发往长沙转运中心,下一站湖南科技大学",
			}],
			show:false,
		}
	});
})
 