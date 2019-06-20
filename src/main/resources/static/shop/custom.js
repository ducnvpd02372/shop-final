

$(document ).ready (function(){ $("#quantity_inc_button
	").click(function(){ var qty= parseInt($("#quantity_input").val())+1;
	$("#add
	").attr("href","/addcart?prod="+$("#idprod").val()+"&qty="+qty+"")
	
}

);
$("#quantity_dec_button ").click (function(){ $("#add
	").attr("href","/addcart?prod="+$("#idprod").val()+"&qty="+qty+"")
	
}
);
}
);