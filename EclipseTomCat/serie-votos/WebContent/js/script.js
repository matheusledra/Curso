$(document).ready(function() {
	console.log('JS Loaded!');
});

function addVoto(id) {
	let urlAction = "serie?action=addVoto&id=" + id;
	$.ajax({ 
            url: urlAction,
            type: 'GET',
            success: function(response) {
                location.reload();
            },
            error: function(response) {
                alert(response);
            }
        });
}

function delSerie(id, nomeSerie) {
	var senhaSeguranca = prompt("Digite a senha de segurança para poder apagar a série: \n\n" + nomeSerie);
	
	if (senhaSeguranca == null || !senhaSeguranca.trim()) {
		
	} else if(senhaSeguranca == '!delSerieSFDB@' + id) {
		let urlAction = "serie?action=delSerie&id=" + id;
		$.ajax({
			url: urlAction,
			type: 'GET',
			success: function(response) {
				if(response === 'OK') {
					alert('Série ' + nomeSerie + ' deletada!');
                    window.location.assign("http://localhost:8080/serie-votos/serie?action=listSeries&ae=delSerie");
				} else {
					alert('Erro ao deletar a série!!');
				}
			} 
		});
	}
}