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

});

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