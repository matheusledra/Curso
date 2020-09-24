package Curso.Estudos;

import java.util.Scanner;

public class RefazendoExerciciosIfElse {

	public static void exercicio1() {
		Scanner scEntrada = new Scanner(System.in);
		int numeroUm, numeroDois;
		
		System.out.print("Digite o primeiro número: ");
		numeroUm = scEntrada.nextInt();
		System.out.print("Digite o segundo número: ");
		numeroDois = scEntrada.nextInt();
		
		if(numeroUm > numeroDois ) {
			System.out.println("O maior número é o " + numeroUm);
		} else {
			System.out.println("O maior número é o " + numeroDois);
		}

		scEntrada.close();
	}
	
	public static void exercicio2() {
		Scanner scEntrada = new Scanner(System.in);
		int numeroUm, numeroDois, numeroTres, numeroQuatro;
		
		System.out.print("Digite o primeiro número: ");
		numeroUm = scEntrada.nextInt();
		System.out.print("Digite o segundo número: ");
		numeroDois = scEntrada.nextInt();
		System.out.print("Digite o terceiro número: ");
		numeroTres = scEntrada.nextInt();
		System.out.print("Digite o quarto número: ");
		numeroQuatro = scEntrada.nextInt();
		
		if(numeroUm < numeroDois && numeroUm < numeroTres && numeroUm < numeroQuatro) {
			System.out.println("O menor número é: " + numeroUm);
		} else if(numeroDois < numeroUm && numeroDois < numeroTres && numeroDois < numeroQuatro) {
			System.out.println("O menor número é: " + numeroTres);
		} else if(numeroTres < numeroUm && numeroTres < numeroDois && numeroTres < numeroQuatro) {
			System.out.println("O menor número é: " + numeroTres);
		} else {
			System.out.println("O menor número é: " + numeroQuatro);
		}
		
		scEntrada.close();
	}

	public static void exercicio3() {
		Scanner scEntrada = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número: ");
		numero = scEntrada.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O número " + numero + " é par");
		} else {
			System.out.println("O número " + numero + " é ímpar");
		}
		
		scEntrada.close();
	}

	public static void exercicio4() {
		Scanner scEntrada = new Scanner(System.in);
		String codigoProduto;
		
		System.out.print("Digite o código do produto: ");
		codigoProduto = scEntrada.next();
		
		if(codigoProduto.equals("001") ) {
			System.out.println("Produto 001 - Arroz");
		} else if (codigoProduto.equals("002")) {
			System.out.println("Produto 002 - Feijão");
		} else if (codigoProduto.equals("003")) {
			System.out.println("Produto 002 - Farinha");
		} else {
			System.out.println("Produto " + codigoProduto + " - Diversos");
		}
		
		scEntrada.close();
	}

	public static void exercicio5() {
		Scanner scEntrada = new Scanner(System.in);
		int anoNascimento;
		
		System.out.print("Digite o ano de nascimento da pessoa: ");
		anoNascimento = scEntrada.nextInt();
		
		if(2020 - anoNascimento > 15) {
			System.out.println("Pode votar esse ano!");
		} else {
			System.out.println("Não pode votar esse ano!");
		}
		
		scEntrada.close();
	}

	public static void exercicio6() {
		Scanner scEntrada = new Scanner(System.in);
		int senhaValida = 1234, senhaDigitada;
		
		System.out.print("Para acessar, digita a senha: ");
		senhaDigitada = scEntrada.nextInt();
		
		if(senhaDigitada == senhaValida) {
			System.out.println("Acesso Permitido!");
		} else {
			System.out.println("Acesso Negado!");
		}
		
		scEntrada.close();
	}

	public static void exercicio7() {
		Scanner scEntrada = new Scanner(System.in);
		Double qntdMacas, precoPagar;
		
		System.out.print("Informe a quantidade de maçãs compradas: ");
		qntdMacas = scEntrada.nextDouble();
		
		if(qntdMacas < 12) {
			precoPagar = qntdMacas * 0.30;
		} else {
			precoPagar = qntdMacas * 0.25;
		}
		
		System.out.println("O preço a ser pago é: R$" + precoPagar);
		
		scEntrada.close();
	}

}
