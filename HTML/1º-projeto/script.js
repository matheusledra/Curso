// let idade = prompt("Informe sua idade");
// let consentimento = confirm("Você tem consentimento?");

// if (idade >= 18 && consentimento === true) {
//     console.log("Maior de 18 e Consentimento OK");
// } else if (idade >= 18) {
//     console.log("Maior de 18... Consentimento false");
// } else if (consentimento) {
//     console.log("Menor de 18... Consentimento OK");
// } else {
//     console.log("Menor de 18... Consentimento false");
// }

// switch (parseInt(idade)) {
//     case 18:
//         console.log("18 anos OK!");
//         break;
//     case 15:
//         console.log("Menor de 18");
//         break;
//     default:
//         break;
// }

//------------------------------------------------------

// let contador = 20;
// while (contador > 0) {
//     console.log(contador);
//     contador--;
// }

// for (let index = 0; index < contador; index++) {
//     console.log(calculaIMC(1.75, 70 + index));
// }


//------------------------------------------------------

// let arrayNumeros = [2, 6, 9, 1, 3, 24, 13, 98];
// console.log(arrayNumeros);

// for (let i = 0; i < arrayNumeros.length; i++) {
//     console.log(arrayNumeros[i]);
// }

//------------------------------------------------------

// let objPessoa = {
//     nome: 'Matheus',
//     idade: 16
// };

// console.log(objPessoa.nome);

// let arrayObjPessoa = [
//     { nome: 'Blu3', idade: 27, peso: 80, altura: 1.80 },
//     { nome: 'Matheus', idade: 40, peso: 78, altura: 1.71 },
//     { nome: 'Suelen', idade: 18, peso: 78, altura: 1.65 }
// ];

// for (let index = 0; index < arrayObjPessoa.length; index++) {
//     const objPessoa = arrayObjPessoa[index];
//     const imc = calculaIMC(objPessoa.altura, objPessoa.peso);

//     console.log(objPessoa.nome + " - " + imc)
// }

// console.log(arrayObjPessoa);

//------------------------------------------------------

// console.log(document.querySelector('.block-list'));

//------------------------------------------------------

$(document).ready(function() {
    console.log("JQuery loaded!");

    let objPessoa = {
        nome: 'Ryan',
        idade: 17,
        peso: 80,
        altura: 1.83
    };

    let arrayObjPessoa = [
        { nome: 'Blu3', idade: 27, peso: 80, altura: 1.80 },
        { nome: 'Matheus', idade: 40, peso: 78, altura: 1.71 },
        { nome: 'Suelen', idade: 18, peso: 78, altura: 1.65 }
    ];

    arrayObjPessoa.push(objPessoa);

    $('#lista-ordenada').html(monstaLista(arrayObjPessoa));
});




function monstaLista(objeto) {
    let htmlList = "";
    for (let i = 0; i < objeto.length; i++) {
        const pessoa = objeto[i];
        htmlList += '<li>' + pessoa.nome + '</li>';
    }
    return htmlList;
}

function calculaIMC(altura, peso) {
    let imc = peso / (altura * altura);
    return imc;
}