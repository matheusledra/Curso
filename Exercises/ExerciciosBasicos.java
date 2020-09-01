package Curso.Exercises;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ExerciciosBasicos {
	
	public static int escolhaExercicio = 0;
	
	public static void exerciciosBasicos() throws InterruptedException {
		Scanner entradaValores = new Scanner(System.in);

		System.out.println("");
		System.out.println("1 -> Mostrar em dias a idade de uma pessoa");
		System.out.println("2 -> Média aritmética...");
		System.out.println("3 -> Reajuste de 1% em um saldo");
		System.out.println("4 -> Total a ser pago com 2 peças...");
		System.out.println("5 -> Dizer quantos salários mínimos uma pessoa ganha");
		System.out.println("6 -> Sucessor e Antecessor de um número");

		escolhaExercicio = entradaValores.nextInt();

		System.out.println("");
		System.out.println("Iniciando Exercício...");
		TimeUnit.SECONDS.sleep(1);

		switch (escolhaExercicio) {
		case 1:
			idadeEmDias();
			break;
		case 2:
			mediaAritimetica();
			break;
		case 3:
			reajusteSaldo();
			break;
		case 4:
			totalPagoPecas();
			break;
		case 5:
			salariosMinimos();
			break;
		case 6:
			sucessorAntecessor();
			break;
		default:
			System.out.println("Exercício não encontrado...");
			break;
		}
		entradaValores.close();
	}

	// -----===[|> <!!!> <|]===---- \\
	public static void idadeEmDias() {
		Scanner entradaValores = new Scanner(System.in);
		/*
		 * Faca um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
		 * dias e mostre-a expressa em dias. Leve em consideracao o ano com 365 dias e o
		 * mes com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
		 */
		int anos;
		int meses;
		int dias;

		int anosDias;
		int mesesDias;

		int diasVividos;

		System.out.print("Digite quantos anos tem, meses e dias (3 2 15): ");
		anos = entradaValores.nextInt();
		meses = entradaValores.nextInt();
		dias = entradaValores.nextInt();

		anosDias = anos * 365;
		mesesDias = meses * 30;

		diasVividos = dias + anosDias + mesesDias;

		System.out.println("Você viveu " + diasVividos + " dias!");
		entradaValores.close();
	}

	public static void mediaAritimetica() {
		Scanner entradaValores = new Scanner(System.in);
		/*
		 * Fazer um programa que imprima a media aritmatica dos numeros 8,9 e 7. A media
		 * dos numeros 4, 5 e 6. A soma das duas medias. A media das medias.
		 */
		int sete = 7;
		int oito = 8;
		int nove = 9;

		int quatro = 4;
		int cinco = 5;
		int seis = 6;

		int mediaMaiores;
		int mediaMenores;

		double somaMedias;

		double mediaMedias;

		mediaMaiores = (sete + oito + nove) / 3;
		System.out.println("Media maiores: " + mediaMaiores);

		mediaMenores = (quatro + cinco + seis) / 3;
		System.out.println("Media menores: " + mediaMenores);

		somaMedias = mediaMaiores + mediaMenores;
		System.out.println("Soma das medias: " + somaMedias);

		mediaMedias = somaMedias / 2;
		System.out.println("Media das medias: " + mediaMedias);
		entradaValores.close();
	}

	public static void reajusteSaldo() {
		Scanner entradaValores = new Scanner(System.in);
		// Informar um saldo e imprimir o saldo com reajuste de 1%
		double saldo;
		double reajuste;
		double saldoFinal;

		System.out.print("Digite um saldo: ");
		saldo = entradaValores.nextDouble();

		reajuste = saldo * 0.01;
		saldoFinal = reajuste + saldo;

		System.out.println(saldoFinal);
		entradaValores.close();
	}

	public static void totalPagoPecas() {
		Scanner entradaValores = new Scanner(System.in);
//		EentradaValoresrever um algoritmo que lê:
//		- a porcentagem do IPI a ser acreentradaValoresido no valor das peças
//		- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
//		- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
//		O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
//		Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
		double IPI;
		double porc;
		double valorAdicional;

		double cod1;
		double val1;
		double qntd1;
		double valorTotalPecas1;

		double cod2;
		double val2;
		double qntd2;
		double valorTotalPecas2;

		double somas;
		double valorFinal;

		System.out.println("");
		System.out.print("Digite a porcentagem IPI: ");
		IPI = entradaValores.nextDouble();

		System.out.println("");
		System.out.print("Digite o codigo da peca 1: ");
		cod1 = entradaValores.nextInt();

		System.out.println("");
		System.out.print("Digite o valor da peca 1: ");
		val1 = entradaValores.nextInt();

		System.out.println("");
		System.out.print("Quantidade de pecas 1: ");
		qntd1 = entradaValores.nextInt();

		System.out.println("");
		System.out.print("Digite o codigo da peca 2: ");
		cod2 = entradaValores.nextInt();

		System.out.println("");
		System.out.print("Digite o valor da peca 2: ");
		val2 = entradaValores.nextInt();

		System.out.println("");
		System.out.print("Quantidade de pecas 2: ");
		qntd2 = entradaValores.nextInt();

		valorTotalPecas1 = val1 * qntd1;
		valorTotalPecas2 = val2 * qntd2;

		somas = valorTotalPecas1 + valorTotalPecas2;

		porc = IPI / 100;

		valorAdicional = somas * porc;

		valorFinal = somas + valorAdicional;

		System.out.println("Valor total de peças do codígo " + cod1 + " -> R$" + valorTotalPecas1);
		System.out.println("Valor total de peças do codígo " + cod2 + " -> R$" + valorTotalPecas2);
		System.out.println("Valor adicional ao preço -> R$" + valorAdicional);
		System.out.println("Valor final a ser pago: R$" + valorFinal);
		entradaValores.close();
	}

	public static void salariosMinimos() {
		Scanner entradaValores = new Scanner(System.in);
//		Crie um algoritmo que leia o valor do salario minimo e o valor do salario de um usuario,
//	    calcule a quantidade de salarios minimos esse usuario ganha e imprima o resultado.
//	    (1SM=R$1045,00)
		double salarioMinimo = 1045;
		double salarioUsuario;
		double salarios;

		System.out.print("Digite o salario do usuario: ");
		salarioUsuario = entradaValores.nextDouble();

		salarios = salarioUsuario / salarioMinimo;

		System.out.println("Este usuario ganha " + salarios + " salarios minimos!");
		entradaValores.close();
	}

	public static void sucessorAntecessor() {
		Scanner entradaValores = new Scanner(System.in);
//		 Desenvolva um algoritmo em Java que leia um numero inteiro e imprima o seu
//	     antecessor e seu sucessor.
		int num;
		int antecessor;
		int sucessor;

		System.out.print("Digite um numero: ");
		num = entradaValores.nextInt();

		antecessor = num - 1;
		sucessor = num + 1;

		System.out.println("Antecessor: " + antecessor);
		System.out.println("Sucessor: " + sucessor);
		entradaValores.close();
	}

}
