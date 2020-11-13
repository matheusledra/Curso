$(document).ready(function() {
    console.log('JQuery Loaded!');

    let listaPessoas = [
        { nome: 'Matheus Momm Ledra', status: 'Online', idade: 27, peso: 80, altura: 1.80 },
        { nome: 'Marcos Jessé', idade: 40, status: 'Offline', peso: 78, altura: 1.71 },
        { nome: 'Ryan Augusto', idade: 18, status: 'Online', peso: 78, altura: 1.83 },
        { nome: 'Gustavo Santana', idade: 17, status: 'OffLine', peso: 78, altura: 1.65 },
        { nome: 'João Cleber', idade: 18, status: 'Online', peso: 78, altura: 1.65 },
        { nome: 'José Primo', idade: 18, status: 'OffLine', peso: 78, altura: 1.65 },
        { nome: 'Rafael Augusto', idade: 18, status: 'Online', peso: 78, altura: 1.65 },
    ];

    $('#lista-online').html(listaOnline(listaPessoas));

    $("#endereco-comp").hide();

    $("#cep").on("blur", function() {
        $.ajax({
            url: "https://viacep.com.br/ws/" + $(this).val() + "/json/",
            dataType: "jsonp",
            success: function(response) {
                if (response != "") {
                    $("#rua").val(response.logradouro);
                    $("#bairro").val(response.bairro);
                    $("#cidade").val(response.localidade);
                    $("#uf").val(response.uf);
                    // mostra o form endereco
                    $("#endereco-comp").show();
                }
            }
        });
    });

    $("#btn-enviar").hide();

    $("#nome").on("blur", function() {
        ativarBtnEnviar();
    });
    $("#email").on("blur", function() {
        ativarBtnEnviar();
    });
    $("#descricao").on("blur", function() {
        ativarBtnEnviar();
    });
    $("#rua").on("blur", function() {
        ativarBtnEnviar();
    });
    $("#cidade").on("blur", function() {
        ativarBtnEnviar();
    });
    $("#uf").on("blur", function() {
        ativarBtnEnviar();
    });
    $("#bairro").on("blur", function() {
        ativarBtnEnviar();
    });

});

let starChecked = false;

function ativarBtnEnviar() {
    if ($("#descricao").val() != "" && $("#nome").val() != "" && $("#email").val() != "" && $("#uf").val() != "" && $("#rua").val() != "" && $("#cep").val() != "" && $("#bairro").val() != "" && $("#cidade").val() != "" && starChecked) {
        $("#btn-enviar").show();
    }
}

function ativarBtnEnviarStar() {
    if ($("#descricao").val() != "" && $("#nome").val() != "" && $("#email").val() != "" && $("#uf").val() != "" && $("#rua").val() != "" && $("#cep").val() != "" && $("#bairro").val() != "" && $("#cidade").val() != "") {
        $("#btn-enviar").show();
    } else {
        starChecked = true;
    }
}

function listaOnline(listaPessoas) {
    let htmlList = "";
    let finalLista = "";
    htmlList += "<span style='color: #0CFF00'>●</span> Online";
    htmlList += " <span style='color: red'>●</span> Offline";
    htmlList += "<hr style='margin: 0.5em; border-color: #56458b;'>";
    for (let i = 0; i < listaPessoas.length; i++) {
        const pessoa = listaPessoas[i];
        if (pessoa.status == 'Online') {
            htmlList += "<li><span style='color: #0CFF00'>●</span> " + pessoa.nome + "</li>";
        } else {
            finalLista += "<li><span style='color: red'>●</span> " + pessoa.nome + "</li>";
        }
    }
    htmlList += finalLista;
    return htmlList;
}