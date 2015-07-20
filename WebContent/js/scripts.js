// Empty JS for your own code to be here
$( document ).ready(function() {
	$("#bt_enviar").click(function(){
		var txt_banco = $("#txt_banco").val();
		var txt_agencia = $("#txt_agencia").val();
		var txt_conta = $("#txt_conta").val();
		
		//enviar dados via ajax
		$.ajax({
			  method: "POST",
			  url: "Controller",
			  data: { banco: txt_banco, conta: txt_conta, agencia: txt_agencia }
		});
	});
});