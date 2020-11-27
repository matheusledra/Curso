$(document).ready(function() {
    console.log('JS LOADED!');

});

function deleteFilme(id, tituloFilme) {
    var senhaSeguranca = prompt("Digite a senha de segurança para poder apagar o filme: \n\n" + tituloFilme);

	if (senhaSeguranca == null || !senhaSeguranca.trim()) {
	
	} else if (senhaSeguranca == "!delFilmeFFDB@" + id) {
        let urlAction = "filme?action=delFilme&id=" + id;
 
        $.ajax({
            url: urlAction,
            type: 'GET',
            success: function(response) {
                if (response === 'OK') {
                    alert('Filme deletado com sucesso');
                    window.location.assign("http://localhost:8080/atividade-filmes/filme?action=listFilmes");
                } else {
                    alert(response);
                }
            },
            error: function(response) {
                alert(response);
            }
        });
    } else {
    	alert('Senha incorreta!');
    }
}

function topFilmeChecked() {
    if ($('#star-che').is(':hidden')) {
        $('#star-che').show();
        $('#star-un').hide();
    } else {
        $('#topfilme').prop('checked', false);
        $('#star-che').hide();
        $('#star-un').show();
    }
}

function classificacaoChecked() {
    if ($('#18').is(':checked')) {
        $('#18-label').css('border', '2px solid #000000');
        $('#16-label').css('border-style', 'none');
        $('#14-label').css('border-style', 'none');
        $('#12-label').css('border-style', 'none');
        $('#10-label').css('border-style', 'none');
        $('#livre-label').css('border-style', 'none');
    } else if ($('#16').is(':checked')) {
        $('#18-label').css('border-style', 'none');
        $('#16-label').css('border', '2px solid #000000');
        $('#14-label').css('border-style', 'none');
        $('#12-label').css('border-style', 'none');
        $('#10-label').css('border-style', 'none');
        $('#livre-label').css('border-style', 'none');
    } else if ($('#14').is(':checked')) {
        $('#18-label').css('border-style', 'none');
        $('#16-label').css('border-style', 'none');
        $('#14-label').css('border', '2px solid #000000');
        $('#12-label').css('border-style', 'none');
        $('#10-label').css('border-style', 'none');
        $('#livre-label').css('border-style', 'none');
    } else if ($('#12').is(':checked')) {
        $('#18-label').css('border-style', 'none');
        $('#16-label').css('border-style', 'none');
        $('#14-label').css('border-style', 'none');
        $('#12-label').css('border', '2px solid #000000');
        $('#10-label').css('border-style', 'none');
        $('#livre-label').css('border-style', 'none');
    } else if ($('#10').is(':checked')) {
        $('#18-label').css('border-style', 'none');
        $('#16-label').css('border-style', 'none');
        $('#14-label').css('border-style', 'none');
        $('#12-label').css('border-style', 'none');
        $('#10-label').css('border', '2px solid #000000');
        $('#livre-label').css('border-style', 'none');
    } else {
        $('#18-label').css('border-style', 'none');
        $('#16-label').css('border-style', 'none');
        $('#14-label').css('border-style', 'none');
        $('#12-label').css('border-style', 'none');
        $('#10-label').css('border-style', 'none');
        $('#livre-label').css('border', '2px solid #000000');
    }
}