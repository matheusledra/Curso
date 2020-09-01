package Curso.Exercises;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ExerciciosSwitch {

	public static int escolhaExercicio;

	public static void exerciciosSwitch() throws InterruptedException {
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
		entradaValores.close();
	}

	// -----===[|> <!!!> <|]===---- \\
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
			System.out.println("Fruta não está sendo reconhecida...");
			break;
		}
		entradaValores.close();
	}

	public static void exercicioSwitch2() {
		Scanner entradaValores = new Scanner(System.in);
		System.out.println("Bem-Vindo, qual modelo de automóvel você vai querer?");
		System.out.println("Informe o código de veículo desejado: ");
		System.out.println("CH - Carros Hatch");
		System.out.println("CS - Carros Sedan");
		System.out.println("M - Motocicletas");
		System.out.println("CNT - Caminhonetes");

		String codigoVeiculo = entradaValores.next();

		switch (codigoVeiculo.toLowerCase()) {
		case "ch":
			System.out.println("Compra de um Hatch efetuada com sucesso!");
			break;
		case "cs":
			System.out.println("Tem certeza que prefere este modelo? S/N");
			String confirmacaoSedan = entradaValores.next();

			String compraSedan = confirmacaoSedan.equalsIgnoreCase("S") ? "Compra de um Sedan efetuada com sucesso!"
					: confirmacaoSedan.equalsIgnoreCase("N") ? "Compra cancelada!"
							: "Opção inválida '" + confirmacaoSedan + "'";

			System.out.println(compraSedan);
			break;
		case "m":
			System.out.println("Tem certeza que prefere este modelo? S/N");
			String confirmacaoMotocicleta = entradaValores.next();

			String compraMotocicleta = confirmacaoMotocicleta.equalsIgnoreCase("S")
					? "Compra de um Sedan efetuada com sucesso!"
					: confirmacaoMotocicleta.equalsIgnoreCase("N") ? "Compra cancelada!"
							: "Opção inválida '" + confirmacaoMotocicleta + "'";

			System.out.println(compraMotocicleta);
			break;
		case "cnt":
			System.out.println("Tem certeza que prefere este modelo? S/N");
			String confirmacaoCaminhonete = entradaValores.next();

			String compraCaminhonete = confirmacaoCaminhonete.equalsIgnoreCase("S")
					? "Compra de um Sedan efetuada com sucesso!"
					: confirmacaoCaminhonete.equalsIgnoreCase("N") ? "Compra cancelada!"
							: "Opção inválida '" + confirmacaoCaminhonete + "'";

			System.out.println(compraCaminhonete);
			break;
		default:
			System.out.println("Código inválido '" + codigoVeiculo + "'");
			break;
		}
		entradaValores.close();
	}

	public static void exercicioSwitch3() {
		Scanner entradaValores = new Scanner(System.in);
		System.out.println("Escolha uma operação: +, -, x, /");
		String operacao = entradaValores.next();
		int numero1 = 0, numero2 = 0;
		Integer resultado = null;

		if (operacao.equals("+") || operacao.equals("-") || operacao.equals("x") || operacao.equals("/")) {
			System.out.print("Digite o primeiro número: ");
			numero1 = entradaValores.nextInt();
			System.out.print("Digite o segundo número: ");
			numero2 = entradaValores.nextInt();
		} else {
			System.out.println("Operação não reconhecida '" + operacao + "'");
		}
		switch (operacao) {
		case "+":
			resultado = numero1 + numero2;
			break;
		case "-":
			resultado = numero1 - numero2;
			break;
		case "x":
			resultado = numero1 * numero2;
			break;
		case "/":
			resultado = numero1 / numero2;
			break;
		default:
			break;
		}
		entradaValores.close();
		if (resultado != null) {
			System.out.println("O resultado de " + numero1 + " " + operacao + " " + numero2 + " é: " + resultado);
		}

	}

	public static void exercicioSwitch4() {
		Scanner entradaValores = new Scanner(System.in);

		System.out.println("Escolha uma categoria: ");
		System.out.println("1 - Produtos não-perecíveis");
		System.out.println("2 - Frutas");
		System.out.println("3 - Bebidas");

		int escolhaCategoria = entradaValores.nextInt();

		switch (escolhaCategoria) {
		case 1:
			System.out.println("Arroz, feijão, café");
			break;
		case 2:
			System.out.println("Maçã, banana, manga, melancia");
			break;
		case 3:
			System.out.println("Energético, suco, leite, refrigerante");
			break;
		default:
			System.out.println("Produto não reconhecido!");
			break;
		}
		entradaValores.close();
	}

	public static void exercicioSwitch5() {
		Scanner entradaValores = new Scanner(System.in);
		int numeroPrograma = ThreadLocalRandom.current().nextInt(1, 20);

		System.out.println("---< 21 >---");
		System.out.println("Você informa número entre 1 e 20");
		System.out.println("O sistema irá gerar um número entre 1 e 20");
		System.out.println("Se o resultado for:");
		System.out.println("7 = 10 Pontos");
		System.out.println("14 = 14 Pontos");
		System.out.println("21 = 21 Pontos");
		System.out.println("Entre 1 e 6 = 1 Ponto");
		System.out.println("Entre 8 e 13 = 5 Pontos");
		System.out.println("Entre 15 e 20 = 6 Pontos");
		System.out.println("---< 21 >---");
		System.out.println("");
		System.out.print("Informe um número entre 1 e 20: ");
		int numeroJogador = entradaValores.nextInt();

		if(numeroJogador > 20) {
			int resultadoPontuacao = numeroJogador + numeroPrograma;

			switch (resultadoPontuacao) {
			case 7:
				System.out.println("Pontos: " + resultadoPontuacao + " pontos");
				break;
			case 14:
				System.out.println("Pontos: " + resultadoPontuacao + " pontos");
				break;
			case 21:
				System.out.println("Pontos: " + resultadoPontuacao + " pontos");
				break;
			default:
				break;
			}
			if (resultadoPontuacao >= 1 && resultadoPontuacao <= 6) {
				System.out.println("Pontos: 1 ponto");
			} else if (resultadoPontuacao >= 8 && resultadoPontuacao <= 13) {
				System.out.println("Pontos: 5 pontos");
			} else if (resultadoPontuacao >= 15 && resultadoPontuacao <= 20) {
				System.out.println("Pontos: 6 pontos");
			} else if (resultadoPontuacao > 21) {
				System.out.println("Pontos: " + resultadoPontuacao + "\nVocê Perdeu ;(");
			}
		} else {
			System.out.println("Você inseriu um número maior que 20!");
		}
		entradaValores.close();
	}
}