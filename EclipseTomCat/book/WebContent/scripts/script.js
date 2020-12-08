$(document).ready(function() {
	atualizarDiv();
	
	$('#titulo').keyup(function() {
		atualizarDiv();
	});

});

function atualizarDiv() {
	var titulo = ($('#titulo').val() != null) ? $('#titulo').val() : "";
	let urlAction = "social?action=getListaAjax&titulo=" + titulo;
	var listLivros = '';
	$.ajax({
		url: urlAction,
		type: 'GET',
		dataType: 'json',
		success: function(response) {
			$.each(response, function(i, jsonData) {
				listLivros += '<tr id="listaLivrosTable">';
				listLivros += '<th scope=row>' + jsonData.id + '</th>'
				listLivros += '<td>' + jsonData.titulo + '</td>';
				listLivros += '<td>' + jsonData.autor + '</td>';
				listLivros += '<td>' + jsonData.categoria + '</td>';
				listLivros += '<td> EM BREVE </td>';
				listLivros += '</tr>';
			});
			$('#listaLivrosTable').html(listLivros);
		}
	});
}
