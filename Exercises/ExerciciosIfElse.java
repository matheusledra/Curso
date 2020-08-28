package Curso.Exercises;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ExerciciosIfElse {

	public static int escolhaExercicio;
	
	public static void exerciciosIfElse() throws InterruptedException {
		Scanner entradaValores = new Scanner(System.in);
		System.out.println("");
		System.out.println("1 -> Retornar maior valor entre 2 valores");
		System.out.println("2 -> Retornar maior valor entre 4 valores");
		System.out.println("3 -> Verificar se um número é ímpar");
		System.out.println("4 -> Retornar nome de produto a partir de seu código");
		System.out.println("5 -> Falar se uma pessoa pode votar ou não esse ano pelo ano de nascimento");
		System.out.println("6 -> Verificar validade de uma senha");
		System.out.println("7 -> Total de uma compra de maçãs pela quantidade");
		System.out.println("8 -> Escrever 3 valores em ordem crescente");
		escolhaExercicio = entradaValores.nextInt();

		System.out.println("");
		System.out.println("Iniciando Exercício...");
		TimeUnit.SECONDS.sleep(1);

		switch (escolhaExercicio) {
		case 1:
			exercicioIfElse1();
			break;
		case 2:
			exercicioIfElse2();
			break;
		case 3:
			exercicioIfElse3();
			break;
		case 4:
			exercicioIfElse4();
			break;
		case 5:
			exercicioIfElse5();
			break;
		case 6:
			exercicioIfElse6();
			break;
		case 7:
			exercicioIfElse7();
			break;
		case 8:
			exercicioIfElse8();
			break;
		default:
			System.out.println("Exercício não encontrado...");
			break;
		}
	}

	public static void exercicioIfElse1() {
		Scanner entradaValores = new Scanner(System.in);
		int num1, num2;

		System.out.print("Digite o primeiro valor:");
		num1 = entradaValores.nextInt();
		System.out.print("Digite o segundo valor:");
		num2 = entradaValores.nextInt();
		
		if(num1 > num2) {
			System.out.println("O maior número é: " + num1);
		} else { 
			System.out.println("O maior número é: " + num2);
		}
	}

	public static void exercicioIfElse2() {
		Scanner entradaValores = new Scanner(System.in);
		int num1, num2, num3, num4;
		
		System.out.print("Digite o primeiro valor: ");
		num1 = entradaValores.nextInt();
		System.out.print("Digite o segundo valor: ");
		num2 = entradaValores.nextInt();
		System.out.print("Digite o terceiro valor: ");
		num3 = entradaValores.nextInt();
		System.out.print("Digite o quarto valor: ");
		num4 = entradaValores.nextInt();
		
		if(num1 > num2 && num1 > num3 && num1 > num4) {
			System.out.println("O maior número é: " + num1);
		} else if(num2 > num1 && num2 > num3 && num2 > num4) {
			System.out.println("O maior número é: " + num2);
		} else if(num3 > num1 && num3 > num2 && num3 > num4) {
			System.out.println("O maior número é: " + num3);
		} else {
			System.out.println("O maior número é: " + num4);
		}
	}

	public static void exercicioIfElse3() {
		Scanner entradaValores = new Scanner(System.in);
		int num, parImpar;
		
		System.out.print("Digite o número: ");
		num = entradaValores.nextInt();
		
		parImpar = num - num / 2 * 2;

		if(parImpar == 0) {
			System.out.println("Número " + num + " é par");
		} else {
			System.out.println("Número " + num + " é ímpar");
		}
	}

	public static void exercicioIfElse4() {
		Scanner entradaValores = new Scanner(System.in);
		String codigoProduto;

		System.out.print("Digite o cóigo do produto: ");
		codigoProduto = entradaValores.next();

		if (codigoProduto.equals("001")) {
			System.out.println("Código 001");
			System.out.println("Produto - Arroz");
		} else if (codigoProduto.equals("002")) {
			System.out.println("Código 002");
			System.out.println("Produto - Feijão");
		} else if (codigoProduto.equals("003")) {
			System.out.println("Código 003");
			System.out.println("Produto - Farinha");
		} else {
			System.out.println("Código " + codigoProduto);
			System.out.println("Diversos");
		}
	}

	public static void exercicioIfElse5() {
		Scanner entradaValores = new Scanner(System.in);
		int anoNascimento;
		
		System.out.print("Digite seu ano de nascimento: ");
		anoNascimento = entradaValores.nextInt();
		
		if(2020 - anoNascimento >= 16) {
			System.out.println("Você pode votar esse ano!");
		} else {
			System.out.println("Você não pode votar esse ano!");
		}
	}

	public static void exercicioIfElse6() {
		Scanner entradaValores = new Scanner(System.in);
		int senha;

		System.out.print("Digite a senha: ");
		senha = entradaValores.nextInt();

		if(senha == 1234) {
			System.out.println("Acesso Permitido!");
		} else {
			System.out.println("Acesso Negado!");
		}
	}

	public static void exercicioIfElse7() {
		Scanner entradaValores = new Scanner(System.in);
		double macas, precoTotal;

		System.out.print("Digite o número de maçãs compradas: ");
		macas = entradaValores.nextDouble();

		if (macas < 12) {
			precoTotal = macas * 0.30;
			System.out.println("Preço a ser pago: R$" + precoTotal);
		} else {
			precoTotal = macas * 0.25;
			System.out.println("Preço a ser pago: R$" + precoTotal);
		}
	}

	public static void exercicioIfElse8() {
		Scanner entradaValores = new Scanner(System.in);
		int valor1, valor2, valor3;
		
		System.out.print("Digite o primeiro valor: ");
		valor1 = entradaValores.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = entradaValores.nextInt();
		System.out.print("Digite o terceiro valor: ");
		valor3 = entradaValores.nextInt();
		
		if(valor1 < valor2 && valor1 < valor3) {
			if(valor2 < valor3) {
				System.out.println(valor1 + ", " + valor2 + ", " + valor3);
			} else {
				System.out.println(valor1 + ", " + valor3 + ", " + valor2);
			}
		} else if(valor2 < valor1 && valor2 < valor3) {
			if(valor1 < valor3) {
				System.out.println(valor2 + ", " + valor1 + ", " + valor3);
			} else {
				System.out.println(valor2 + ", " + valor3 + ", " + valor1);
			}
		} else {
			if(valor2 < valor1) {
				System.out.println(valor3 + ", " + valor2 + ", " + valor1);
			} else {
				System.out.println(valor3 + ", " + valor1 + ", " + valor2);
			}
		}
	}
}
