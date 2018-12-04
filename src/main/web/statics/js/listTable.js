$(function(){
	$("#ajaxtable>tbody tr:even").addClass("odd");
	
	$("#ajaxtable tr").hover(function(){
		$(this).addClass("hove");
	},function(){
		$(this).removeClass("hove");
	});	
	
	$(".querytable tbody tr:even").addClass("odd");
	
	$(".querytable tbody tr").hover(function(){
		$(this).addClass("hove");
	},function(){
		$(this).removeClass("hove");
	});
});
