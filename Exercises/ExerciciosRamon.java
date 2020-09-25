package Curso.Exercises;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class ExerciciosRamon {

	public static void exerciciosRamon() throws InterruptedException {
		int escolhaExercicio;
		escolhaExercicio = -1;
		Scanner entradaValores = new Scanner(System.in);
		escolhaExercicio = 0;
		System.out.println("");
		System.out.println("1 -> Verificar se um triângulo é válido ou não, e o seu tipo");
		System.out.println("2 -> Verificar se um número é maior ou menor que zero");
		System.out.println("3 -> Jogo 21");
		System.out.println("4 -> Verificar o menor entre 10 números com while");
		System.out.println("5 -> Apresentar números gerados aleatoriamente numa matriz");
		System.out.println("6 -> Apresentar dados de usuário guardados em uma matriz");
		System.out.println("7 -> Gerar números em um vetor e no outro transforma em binário");
		System.out.println("8 -> Gera um vetor de 100 números aleatórios que não existam ainda no vetor");
		System.out.println("");
		System.out.println("0 -> Sair");

		escolhaExercicio = entradaValores.nextInt();

		if (escolhaExercicio != 0) {
			System.out.println("");
			System.out.println("Iniciando Exercício...");
			TimeUnit.SECONDS.sleep(1);
		}

		switch (escolhaExercicio) {
		case 0:
			System.out.println("Saindo...");
			break;
		case 1:
			triangulo();
			break;
		case 2:
			maiorMenorZero();
			break;
		case 3:
			jogo21ComJOptionPane();
			break;
		case 4:
			whileMenorNumero();
			break;
		case 5:
			gerarNumerosAleatoriosAprensentarMatriz();
			break;
		case 6:
			armazenaDadosListaDados();
			break;
		case 7:
			geraTransformaBinario();
			break;
		case 8:
			geraCemNumerosDiferentes();
			break;
		case 9:
			vetoresMetadeUm();
			break;
		case 10:
			pesoIdeal();
			break;
		default:
			System.out.println("Exercício não encontrado...");
			break;
		}
		entradaValores.close();
	}

	public static void triangulo() {
		Scanner entradaValores = new Scanner(System.in);
		int iLado1, iLado2, iLado3, iSoma1, iSoma2, iSoma3;

		System.out.print("Digite o comprimento do primeiro lado: ");
		iLado1 = entradaValores.nextInt();
		System.out.print("Digite o comprimento do segundo lado: ");
		iLado2 = entradaValores.nextInt();
		System.out.print("Digite o comprimento do terceiro lado: ");
		iLado3 = entradaValores.nextInt();

		iSoma1 = iLado1 + iLado2;
		iSoma2 = iLado2 + iLado3;
		iSoma3 = iLado3 + iLado1;

		if (iSoma1 > iLado3 && iSoma2 > iLado1 && iSoma3 > iLado2) {
			System.out.println("O Triângulo é Válido!");
			if (iLado1 == iLado2 && iLado2 == iLado3) {
				System.out.println("Triângulo Equilátero");
			} else if (iLado1 == iLado2 || iLado2 == iLado3 || iLado3 == iLado1) {
				System.out.println("Triângulo IsóentradaValoreseles");
			} else {
				System.out.println("Triângulo EentradaValoresaleno");
			}
		} else {
			System.out.println("O Triângulo é Inválido!");
		}
		entradaValores.close();
	}

	public static void maiorMenorZero() {
		Scanner entradaValores = new Scanner(System.in);
		int iNumero;

		System.out.print("Digite um número: ");
		iNumero = entradaValores.nextInt();

		if (iNumero < 0) {
			System.out.println("O número é negativo!");
		} else if (iNumero > 0) {
			System.out.println("O número é positivo!");
		} else {
			System.out.println("O número é igual a zero");
		}
		entradaValores.close();
	}

	public static void jogo21ComJOptionPane() {
		int numeroAleatorioJogador = ThreadLocalRandom.current().nextInt(1, 21);

		String infoJogo = "---< 21 >---" + "\nVocê informa número entre 1 e 20"
				+ "\nO sistema irá gerar um número entre 1 e 20" + "\nSe o resultado for:" + "\n7 = 10 Pontos"
				+ "\n14 = 14 Pontos" + "\n21 = 21 Pontos" + "\nEntre 1 e 6 = 1 Ponto" + "\nEntre 8 e 13 = 5 Pontos"
				+ "\nEntre 15 e 20 = 6 Pontos" + "\n---< 21 >---" + "\n" + "\nInforme um número entre 1 e 20";

		String entradaValor = JOptionPane.showInputDialog(null, infoJogo);

		int numeroJogador = Integer.parseInt(entradaValor);

		if (numeroJogador > 20) {
			int resultadoPontuacao = numeroJogador + numeroAleatorioJogador;

			switch (resultadoPontuacao) {
			case 7:
				JOptionPane.showMessageDialog(null, "Pontos: " + resultadoPontuacao + " pontos", "Pontuação",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			case 14:
				JOptionPane.showMessageDialog(null, "Pontos: " + resultadoPontuacao + " pontos", "Pontuação",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			case 21:
				JOptionPane.showMessageDialog(null, "Pontos: " + resultadoPontuacao + " pontos", "Pontuação",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			default:
				break;
			}
			if (resultadoPontuacao >= 1 && resultadoPontuacao <= 6) {
				JOptionPane.showMessageDialog(null, "Pontos: 1 ponto", "Pontuação", JOptionPane.INFORMATION_MESSAGE);
			} else if (resultadoPontuacao >= 8 && resultadoPontuacao <= 13) {
				JOptionPane.showMessageDialog(null, "Pontos: 5 pontos", "Pontuação", JOptionPane.INFORMATION_MESSAGE);
			} else if (resultadoPontuacao >= 15 && resultadoPontuacao <= 20) {
				JOptionPane.showMessageDialog(null, "Pontos: 6 pontos", "Pontuação", JOptionPane.INFORMATION_MESSAGE);
			} else if (resultadoPontuacao > 21) {
				JOptionPane.showMessageDialog(null, "Resultado: " + resultadoPontuacao + "\nVocê perdeu ;(",
						"Pontuação", JOptionPane.INFORMATION_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Você inseriu um número maior que 20" + numeroJogador, "Pontuação",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public static void whileMenorNumero() {

		Scanner entradaNumero = new Scanner(System.in);

		int[] arrayNumeros = new int[10];
		int menor = 10000;
		int contador = 0;

		while (contador < 10) {
			System.out.println("Informe o " + (contador + 1) + " numero");
			arrayNumeros[contador] = entradaNumero.nextInt();
			contador++;
		}
		entradaNumero.close();

		contador = 0;
		while (contador < 10) {
			System.out.println("Posição " + (contador + 1) + " - " + arrayNumeros[contador]);
			contador++;
		}

		contador = 0;
		while (contador < 10) {
			int valorArray = arrayNumeros[contador];
			if (valorArray < menor) {
				menor = valorArray;
			}
			contador++;
		}

		contador = 0;
		while (contador < 10) {
			if (arrayNumeros[contador] == menor) {
				System.out.println("Posição do menor número no Indice " + contador);
			}
			contador++;
		}

		System.out.println("O menor número é: " + menor);

	}

	public static void gerarNumerosAleatoriosAprensentarMatriz() {
		int[][] numerosAleatorios = new int[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				numerosAleatorios[i][j] = ThreadLocalRandom.current().nextInt(1, 1200);
			}
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(String.format("%4d | ", numerosAleatorios[i][j]));
			}
			System.out.println("");
		}

	}

	public static void armazenaDadosListaDados() {
		Scanner entradaDados = new Scanner(System.in);
		String[][] dadosUsuario = new String[10][3];

		for (int i = 0; i < 10; i++) {
			System.out.println("---[ " + (i + 1) + "º Usuário ]---");
			System.out.print("Informe o nome do usuário: ");
			dadosUsuario[i][0] = entradaDados.nextLine();
			System.out.print("Informe a idade do usuário: ");
			dadosUsuario[i][1] = entradaDados.nextLine();
			System.out.print("Informe a cidade do usuário: ");
			dadosUsuario[i][2] = entradaDados.nextLine();
			System.out.println("");
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("---[ " + (i + 1) + "º Usuário ]---");
			System.out.println("Nome do usuário: " + dadosUsuario[i][0]);
			System.out.println("Idade do usuário: " + dadosUsuario[i][1]);
			System.out.println("Cidade do usuário: " + dadosUsuario[i][2]);
			System.out.println("");
		}
		entradaDados.close();
	}

	public static void geraTransformaBinario() {
		int[] numeros = new int[20];
		int[] binario = new int[20];
		
		System.out.println("Números no primeiro vetor: ");
		for (int i = 0; i < binario.length; i++) {
			numeros[i] = ThreadLocalRandom.current().nextInt(1, 100);
			System.out.println("numeros[" + i + "] " + numeros[i]);
			if(numeros[i] % 2 == 0) {
				binario[i] = 0;
			} else {
				binario[i] = 1;
			}
		}
		
		System.out.println("\nNúmeros no segundo vetor: ");
		for (int i = 0; i < binario.length; i++) {
			System.out.println("binario[" + i + "] " + binario[i]);
		}
	}
	
	public static void geraCemNumerosDiferentes() {
		boolean colocaNumero = false;
		int[] numerosAleatorios = new int[100];
		int auxiliar;

		System.out.println("Números gerados:");
		for (int i = 0; i < numerosAleatorios.length; i++) {
			colocaNumero = true;
			auxiliar = ThreadLocalRandom.current().nextInt(1, 100);

			for (int j = i; j > 0; j--) {
				if (numerosAleatorios[j] == auxiliar) {
					colocaNumero = false;
					break;
				}
			}

			if (colocaNumero) {
				numerosAleatorios[i] = auxiliar;
				System.out.println(String.format("|%3d | ", numerosAleatorios[i]));
			} else {
				i--;
			}
		}

	}

	public static void vetoresMetadeUm() {
		int[] vetorUm = new int[20];
		int[] vetorDois = new int[20];
		
		System.out.println("Primeiro vetor gerado:");
		for (int i = 0; i < vetorUm.length; i++) {
			vetorUm[i] = ThreadLocalRandom.current().nextInt(1, 40);
			System.out.println("vetorUm[" + i + "] " + vetorUm[i]);
		}
		
		System.out.println("\nSegundo vetor gerado: ");
		for (int i = 0; i < vetorDois.length; i++) {
			switch (vetorUm[i]) {
			case 1:
			case 2:
			case 3:
			case 4:
				vetorDois[i] = 0;
				break;
			default:
				vetorDois[i] = (vetorUm[i] / 2);
				break;
			}
			System.out.println("vetorDois[" + i + "] " + vetorDois[i]);
		}
	}

	public static void pesoIdeal() {
		Scanner scEntrada = new Scanner(System.in);
		boolean sexoInvalido = false;
		double altura, pesoIdeal = 0.0;
		int sexo;
		
		System.out.print("Informa sua altura: ");
		altura = scEntrada.nextDouble();
		System.out.print("Informe seu sexo (1- Feminino | 2- Masculino): ");
		sexo = scEntrada.nextInt();
		
		if(sexo == 1) {
			pesoIdeal = (62.1 * altura) - 44.7;
			sexoInvalido = false;
		} else if (sexo == 2) {
			pesoIdeal = (72.7 * altura) - 58;
			sexoInvalido = false;
		} else {
			System.out.println("Sexo iválido! " + sexo);
			sexoInvalido = true;
		}
		
		if(!sexoInvalido) System.out.println("O seu peso ideal é: " + pesoIdeal);
		
		scEntrada.close();
	}

	public static void poligonosUm() {
		Scanner scEntrada = new Scanner(System.in);
		String textoResultado = "";
		int qntdLados, ladoUm, ladoDois;
		double areaPoligono = 0.0;

		System.out.print("Digite a quantidade de lados do polígono (3 a 5): ");
		qntdLados = scEntrada.nextInt();

		if (qntdLados == 3) {
			System.out.println("Digite o tamanho em cm da base do triângulo: ");
			ladoUm = scEntrada.nextInt();
			System.out.println("Digite a altura em cm do triângulo: ");
			ladoDois = scEntrada.nextInt();

			areaPoligono = (ladoUm * ladoDois) / 2;
			textoResultado = "Triângulo! Área: " + areaPoligono + "cm";
		} else if (qntdLados == 4) {
			System.out.println("Digite o tamanho em cm do primeiro lado: ");
			ladoUm = scEntrada.nextInt();
			System.out.println("Digite o tamanho em cm do segundo lado: ");
			ladoDois = scEntrada.nextInt();

			areaPoligono = ladoUm * ladoDois;
			textoResultado = "Quadrado! Área: " + areaPoligono + "cm";
		} else if (qntdLados == 5) {
			System.out.println("Digite o tamanho em cm do primeiro lado: ");
			ladoUm = scEntrada.nextInt();
			System.out.println("Digite o tamanho em cm da apótema do pentágono: ");
			ladoDois = scEntrada.nextInt();

			areaPoligono = (5 * ladoUm) * ladoDois;
			textoResultado = "Pentágono! Área: " + areaPoligono + "cm";
		}

		System.out.println(textoResultado);
		scEntrada.close();
	}

	public static void poligonosDois() {
		Scanner scEntrada = new Scanner(System.in);
		String textoResultado = "";
		int qntdLados, ladoUm, ladoDois;
		double areaPoligono = 0.0;

		System.out.print("Digite a quantidade de lados do polígono (3 a 5): ");
		qntdLados = scEntrada.nextInt();

		if (qntdLados == 3) {
			System.out.println("Digite o tamanho em cm da base do triângulo: ");
			ladoUm = scEntrada.nextInt();
			System.out.println("Digite a altura em cm do triângulo: ");
			ladoDois = scEntrada.nextInt();

			areaPoligono = (ladoUm * ladoDois) / 2;
			textoResultado = "Triângulo! Área: " + areaPoligono + "cm";
		} else if (qntdLados == 4) {
			System.out.println("Digite o tamanho em cm do primeiro lado: ");
			ladoUm = scEntrada.nextInt();
			System.out.println("Digite o tamanho em cm do segundo lado: ");
			ladoDois = scEntrada.nextInt();

			areaPoligono = ladoUm * ladoDois;
			textoResultado = "Quadrado! Área: " + areaPoligono + "cm";
		} else if (qntdLados == 5) {
			System.out.println("Digite o tamanho em cm do primeiro lado: ");
			ladoUm = scEntrada.nextInt();
			System.out.println("Digite o tamanho em cm da apótema do pentágono: ");
			ladoDois = scEntrada.nextInt();

			areaPoligono = (5 * ladoUm) * ladoDois;
			textoResultado = "Pentágono! Área: " + areaPoligono + "cm";
		} else if (qntdLados > 5) {
			textoResultado = "Polígono não identificado!";
		} else if (qntdLados < 3) {
			textoResultado = "Não é um polígono!";
		}

		System.out.println(textoResultado);
		scEntrada.close();
	}
}