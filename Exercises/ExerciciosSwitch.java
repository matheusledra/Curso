package Curso.Exercises;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ExerciciosSwitch {

	public static int escolhaExercicio;
	
	public static void exerciciosSwitch() throws InterruptedException{
		Scanner entradaValores = new Scanner(System.in);
		System.out.println("");
		System.out.println("1 -> Frutas...");
		System.out.println("2 -> Compra de automóvel");
		System.out.println("3 -> Calculadora");
		System.out.println("4 -> Escolha de Produto");
		System.out.println("5 -> Jogo 21");
		escolhaExercicio = entradaValores.nextInt();

		System.out.println("");
		System.out.println("Iniciando Exercício...");
		TimeUnit.SECONDS.sleep(1);

		switch (escolhaExercicio) {
		case 1:
			exercicioSwitch1();
			break;
		case 2:
			exercicioSwitch2();
			break;
		case 3:
			exercicioSwitch3();
			break;
		case 4:
			exercicioSwitch4();
			break;
		case 5:
			exercicioSwitch5();
			break;
		default:
			System.out.println("Exercício não encontrado...");
			break;
		}
	}
	
	public static void exercicioSwitch1() {
		Scanner entradaValores = new Scanner(System.in);
		System.out.println("Frutas disponíveis: Maçã, Kiwi e Melancia");
		System.out.print("Digite uma fruta: ");
		
		String fruta = entradaValores.next();
		
		switch (fruta.toLowerCase()) {
		case "maçã":
			System.out.println("Não vendemos esta fruta aqui");
			break;
		case "kiwi":
			System.out.println("Estamos com escassez de kiwis");
			break;
		case "melancia":
			System.out.println("Aqui está, são R$3,00 o quilo");
			break;
		default:
			System.out.println("Fruta não reconhecida...");
			break;
		}
	}
	
	public static void exercicioSwitch2() {
		Scanner entradaValores = new Scanner(System.in);
		System.out.println("Bem-Vindo, qual modelo de automóvel você vai querer?");
		System.out.println("Modelos disponíveis: Hatch, Sedan, Motocicleta e Caminhonete");
		
		String modelo = entradaValores.next();
		
		switch (modelo.toLowerCase()) {
		case "hatch":
			System.out.println("Compra de um Hatch efetuada com sucesso!");
			break;
		case "sedan":
			System.out.println("Tem certeza que prefere este modelo? S/N");
			String confirmacaoSedan = entradaValores.next();
			
			switch (confirmacaoSedan.toLowerCase()) {
			case "s":
				System.out.println("Compra de um Sedan efetuada com sucesso!");
				break;
			case "n":
				System.out.println("Compra cancelada!");
			default:
				break;
			}
			break;
		case "motocicleta":
			System.out.println("Tem certeza que prefere este modelo? S/N");
			String confirmacaoMotocicleta = entradaValores.next();
			
			switch (confirmacaoMotocicleta.toLowerCase()) {
			case "s":
				System.out.println("Compra de uma Motocicleta efetuada com sucesso!");
				break;
			case "n":
				System.out.println("Compra cancelada!");
			default:
				break;
			}
			break;
		case "caminhonete":
			System.out.println("Tem certeza que prefere este modelo? S/N");
			String confirmacaoCaminhonete = entradaValores.next();
			
			switch (confirmacaoCaminhonete.toLowerCase()) {
			case "s":
				System.out.println("Compra de uma Caminhonete efetuada com sucesso!");
				break;
			case "n":
				System.out.println("Compra cancelada!");
			default:
				break;
			}
			break;
		default:
			System.out.println("Não trabalhamos com este tipo de automóvel aqui");
			break;
		}
	}
	
	public static void exercicioSwitch3() {
		Scanner entradaValores = new Scanner(System.in);
		System.out.println("Escolha uma operação: +, -, x, /");
		String operacao = entradaValores.next();
		int numero1, numero2, resultado;
		
		switch (operacao) {
		case "+":
			System.out.print("Digite o primeiro número: ");
			numero1 = entradaValores.nextInt();
			System.out.print("Digite o segundo número: ");
			numero2 = entradaValores.nextInt();
			
			resultado = numero1 + numero2;
			
			System.out.println("O resultado de " + numero1 + " + " + numero2 + " é: " + resultado);
			break;
		case "-":
			System.out.print("Digite o primeiro número: ");
			numero1 = entradaValores.nextInt();
			System.out.print("Digite o segundo número: ");
			numero2 = entradaValores.nextInt();
			
			resultado = numero1 - numero2;
			
			System.out.println("O resultado de " + numero1 + " - " + numero2 + " é: " + resultado);
			break;
		case "x":
			System.out.print("Digite o primeiro número: ");
			numero1 = entradaValores.nextInt();
			System.out.print("Digite o segundo número: ");
			numero2 = entradaValores.nextInt();
			
			resultado = numero1 * numero2;
			
			System.out.println("O resultado de " + numero1 + " x " + numero2 + " é: " + resultado);
			break;
		case "/":
			System.out.print("Digite o primeiro número: ");
			numero1 = entradaValores.nextInt();
			System.out.print("Digite o segundo número: ");
			numero2 = entradaValores.nextInt();
			
			resultado = numero1 / numero2;
			
			System.out.println("O resultado de " + numero1 + " / " + numero2 + " é: " + resultado);
			break;
		default:
			System.out.println("Operação não reconhecida '" + operacao + "'");
			break;
		}
	}

	public static void exercicioSwitch4() {
		Scanner entradaValores = new Scanner(System.in);

		System.out.println("Escolha um produto: ");
		System.out.println("Produtos não-perecíveis:");
		System.out.println("Arroz, feijão, café");
		System.out.println("Frutas:");
		System.out.println("Maçã, banana, manga, melancia");
		System.out.println("Bebidas:");
		System.out.println("Energético, suco, leite, refrigerante");
		
		String escolhaProduto = entradaValores.next();
		
		switch (escolhaProduto.toLowerCase()) {
		case "arroz":
			System.out.println("Produto escolhido: " + escolhaProduto);
			break;
		case "feijão":
			System.out.println("Produto escolhido: " + escolhaProduto);
			break;
		case "café":
			System.out.println("Produto escolhido: " + escolhaProduto);
			break;
		case "maçã":
			System.out.println("Produto escolhido: " + escolhaProduto);
			break;
		case "banana":
			System.out.println("Produto escolhido: " + escolhaProduto);
			break;
		case "manga":
			System.out.println("Produto escolhido: " + escolhaProduto);
			break;
		case "melancia":
			System.out.println("Produto escolhido: " + escolhaProduto);
			break;
		case "energético":
			System.out.println("Produto escolhido: " + escolhaProduto);
			break;
		case "suco":
			System.out.println("Produto escolhido: " + escolhaProduto);
			break;
		case "leite":
			System.out.println("Produto escolhido: " + escolhaProduto);
			break;
		case "refrigerante":
			System.out.println("Produto escolhido: " + escolhaProduto);
			break;
		default:
			break;
		}
	}

	public static void exercicioSwitch5() {
		Scanner entradaValores = new Scanner(System.in);
		Random numeroAleatorio = new Random();
		int numeroPrograma = ThreadLocalRandom.current().nextInt(1, 14);
		
		System.out.print("Informe um número entre 1 e 20: ");
		int numeroJogador = entradaValores.nextInt();
		
		int resultado = numeroJogador + numeroPrograma;
		
		switch (resultado) {
		case 7:
			System.out.println("Pontos: " + resultado + " pontos");
			break;
		case 14:
			System.out.println("Pontos: " + resultado + " pontos");
			break;
		case 21:
			System.out.println("Pontos: " + resultado + " pontos");
			break;
		default:
			break;
		}
		if(resultado >= 1 && resultado <= 6) {
			System.out.println("Pontos: 1 ponto");
		} else if(resultado >= 8 && resultado <= 13) {
			System.out.println("Pontos: 5 pontos");
		} else if(resultado >= 15 && resultado <= 20) {
			System.out.println("Pontos: 6 pontos");
		}
	}
}