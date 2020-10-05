package Curso.Estudos;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

public class RefazendoExerciciosMatrizes {

	public static void exercicio1() {
//		Leia uma matriz 10 x 10 e escreva a localização (linha e a coluna) do maior valor
		
		int[][] matrizNumeros = new int[10][10];
		int maior = 0;
		String maiorNumero = "";
									  
		System.out.println("____——————=====[!] Matriz Gerada [!]=====——————____");
		for (int i = 0; i < matrizNumeros.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < matrizNumeros.length; j++) {
				matrizNumeros[i][j] = ThreadLocalRandom.current().nextInt(1, 100);
				System.out.print(String.format("%2d | ", matrizNumeros[i][j]));
				
				if(matrizNumeros[j][j] > maior) {
					maior = matrizNumeros[i][j];
					maiorNumero = "\nMaior Valor: " + maior + "\nLinha: " + (i + 1) + "\nColuna: " + (j + 1);
				}
			}
			System.out.println("");
		}                       								
		System.out.println("¯¯¯¯——————=====[!] Matriz Gerada [!]=====——————¯¯¯¯");
		
		System.out.println(maiorNumero);
	}

	public static void exercicio2() {
//		Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal 
//		e com 0 os demais elementos. Escreva ao final a matriz obtida. 
//		(Diagonal principal, os índices são iguais: array[1][1], array[2][2], array[3][3], etc...)
		
		int[][] matrizNumeros = new int[5][5];
		
		System.out.println("Matriz Gerada:");
		for (int i = 0; i < matrizNumeros.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < matrizNumeros.length; j++) {
				if(i == j) {
					matrizNumeros[i][j] = 1;
				} else {
					matrizNumeros[i][j] = 0;
				}
				System.out.print(matrizNumeros[i][j] + " | ");
			}
			System.out.println("");
		}
	}

	public static void exercicio3() {
//		Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores elementos entre as primeiras

		int[][] matrizNumerosUm = new int[4][4];
		int[][] matrizNumerosDois = new int[4][4];
		int[][] matrizMaioresNumeros = new int[4][4];
		int[] maior = new int[16];
		String[] textoMatrizesGeradas = { "Números na primeira matriz: ", "Números na segunda matriz: ",
				"Números na matriz de maiores números:" };

		for (int i = 0; i < matrizMaioresNumeros.length; i++) {
			textoMatrizesGeradas[0] += "\n| ";
			textoMatrizesGeradas[1] += "\n| ";
			for (int j = 0; j < matrizMaioresNumeros.length; j++) {
				matrizNumerosUm[i][j] = ThreadLocalRandom.current().nextInt(1, 100);
				matrizNumerosDois[i][j] = ThreadLocalRandom.current().nextInt(1, 100);

				textoMatrizesGeradas[0] += String.format("%2d | ", matrizNumerosUm[i][j]);
				textoMatrizesGeradas[1] += String.format("%2d | ", matrizNumerosDois[i][j]);
			}
		}

		System.out.println(textoMatrizesGeradas[0] + "\n");
		System.out.println(textoMatrizesGeradas[1] + "\n");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 4; j++) {
				for (int x = 0; x < 4; x++) {
					if (matrizNumerosUm[j][x] > maior[i]) {
						maior[i] = matrizNumerosUm[j][x];
					}
					if (matrizNumerosDois[j][x] > maior[i + 8]) {
						maior[i + 8] = matrizNumerosDois[j][x];
					}
				}
			}

			for (int j = 0; j < 4; j++) {
				for (int x = 0; x < 4; x++) {
					if (maior[i] == matrizNumerosUm[j][x]) {
						matrizNumerosUm[j][x] = 0;
					}
					if (maior[i + 8] == matrizNumerosDois[j][x]) {
						matrizNumerosDois[j][x] = 0;
					}
				}
			}
		}
			for (int j = 0; j < 4; j++) {
				matrizMaioresNumeros[0][j] = maior[j];
				matrizMaioresNumeros[1][j] = maior[j + 4];
				matrizMaioresNumeros[2][j] = maior[j + 8];
				matrizMaioresNumeros[3][j] = maior[j + 12];
			}

		for (int i = 0; i < matrizMaioresNumeros.length; i++) {
			textoMatrizesGeradas[2] += "\n| ";
			for (int j = 0; j < matrizMaioresNumeros.length; j++) {
				textoMatrizesGeradas[2] += String.format("%2d | ", matrizMaioresNumeros[i][j]);
			}
		}
		System.out.println(textoMatrizesGeradas[2]);
	}

	public static void exercicio4() {
//		Leia uma matriz 6 x 6, conte e escreva quantos valores maiores que 10 ela possui
		
		int[][] matrizNumeros = new int[6][6];
		int maioresQue10 = 0;
		String textoMaioresQue10 = "\nMaiores que 10 na matriz: \n";
		
		System.out.println("Matriz Gerada: ");
		for (int i = 0; i < matrizNumeros.length; i++) {
			textoMaioresQue10 += "| ";
			System.out.print("| ");
			for (int j = 0; j < matrizNumeros.length; j++) {
				matrizNumeros[i][j] = ThreadLocalRandom.current().nextInt(1, 20);
				System.out.print(String.format("%2d | ", matrizNumeros[i][j]));
				
				if(matrizNumeros[i][j] > 10) {
					textoMaioresQue10 += String.format("%2d | ", matrizNumeros[i][j]);
					maioresQue10++;
				} else {
					textoMaioresQue10 += "   | ";
				}
			}
			textoMaioresQue10 += "\n";
			System.out.println("");
		}
		
		System.out.println(textoMaioresQue10);
		System.out.println("No total são " + maioresQue10 + " números maiores que 10");
	}
	
	public static void exercicio5() {
//		Leia uma matriz 20 x 20. Leia também um valor X. O programa deverá 
//		fazer uma busca desse valor na matriz e, ao final escrever a localização 
//		(linha e coluna) ou uma mensagem de “não encontrado”
		
		Scanner entradaValores = new Scanner(System.in);
		boolean numeroEncontrado = false;
		int[][] matrizNumeros = new int[20][20];
		int numeroProcura;
		
		System.out.println("Números na Matriz: ");
		for (int i = 0; i < matrizNumeros.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < matrizNumeros.length; j++) {
				matrizNumeros[i][j] = ThreadLocalRandom.current().nextInt(1, 500);
				System.out.print(String.format("%3d | ", matrizNumeros[i][j]));
			}
			System.out.println("");
		}
		
		System.out.println("\nDigite um número para procurar na Matriz: ");
		numeroProcura = entradaValores.nextInt();
		
		System.out.println("------------");
		for (int i = 0; i < matrizNumeros.length; i++) {
			for (int j = 0; j < matrizNumeros.length; j++) {
				if(numeroProcura == matrizNumeros[i][j]) {
					System.out.println("Linha: " + (i + 1));
					System.out.println("Coluna: " + (j + 1));
					System.out.println("------------");
					numeroEncontrado = true;
				} 
			}
		}
		if (!numeroEncontrado) {
			System.out.println("Número não encontrado!");
			System.out.println("------------");
		}
		
		entradaValores.close();
	}

	public static void exercicio6() {
//		Leia uma matriz 100 x 10 que se refere respostas de 10 questões de múltipla escolha, 
//		referentes a 100 alunos. Leia também um vetor de 10 posições contendo o gabarito de 
//		respostas que podem ser a, b, c ou d. Seu programa deverá comparar as respostas de 
//		cada candidato com o gabarito e emitir um vetor Resultado, contendo a pontuação correspondente

		try {
			int quantidadeAlunos = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de alunos na sala"));
			
			boolean letraInvalida = false;
			int acertos = 0;
			String[][] matrizRespotasAlunos = new String[quantidadeAlunos][11];
			int[] quantidadeAcertos = new int[quantidadeAlunos];
			String[] gabaritoRespostas = new String[10];
			String[] alunosAcertos = { "Acertos:\n ", "Erros:\n " };
			String[] textoAlunos = new String[quantidadeAlunos];
			String resposta = "";

			for (int i = 1; i < 11; i++) {
				do {
					resposta = "" + JOptionPane.showInputDialog(null,
							"Gabarito de Respostas: \nDigite a " + i + "º resposta:");

					if(resposta.equalsIgnoreCase("null")) {
						System.exit(0);
					}
					if (resposta.length() == 1) {
						gabaritoRespostas[i - 1] = resposta;
						letraInvalida = false;
					} else {
						JOptionPane.showMessageDialog(null,
								"Erro! Você digitou uma resposta de " + resposta.length() + " letras!");
						letraInvalida = true;
					}
				} while (letraInvalida);
			}

			for (int i = 0; i < matrizRespotasAlunos.length; i++) {
				matrizRespotasAlunos[i][0] = JOptionPane.showInputDialog(null,
						"Digite o nome do " + (i + 1) + "º aluno:");
				if(matrizRespotasAlunos[i][0].equalsIgnoreCase("null")) {
					System.exit(0);
				}
				for (int j = 1; j < 11; j++) {
					matrizRespotasAlunos[i][j] = JOptionPane.showInputDialog(null,
							"Digite a " + j + "º resposta do Aluno: ");
					if(matrizRespotasAlunos[i][j].equalsIgnoreCase("null")) {
						System.exit(0);
					}
				}
			}

			for (int i = 0; i < matrizRespotasAlunos.length; i++) {
				alunosAcertos[0] = "• Acertos:\n";
				alunosAcertos[1] = "• Erros:\n";
				acertos = 0;
				for (int j = 1; j < 11; j++) {
					if (matrizRespotasAlunos[i][j].equalsIgnoreCase(gabaritoRespostas[j - 1])) {
						alunosAcertos[0] += "Questão " + j + " -> " + matrizRespotasAlunos[i][j] + "\n";
						acertos++;
					} else {
						alunosAcertos[1] += "Questão " + j + " -> " + matrizRespotasAlunos[i][j] + " (Resposta certa: "
								+ gabaritoRespostas[j - 1] + ")\n";
					}
					quantidadeAcertos[i] = acertos;

				}
				textoAlunos[i] = "• O aluno " + matrizRespotasAlunos[i][0] + " teve " + quantidadeAcertos[i]
						+ " acertos!\n" + alunosAcertos[0] + "\n" + alunosAcertos[1];
			}

			for (int i = 0; i < matrizRespotasAlunos.length; i++) {
				JOptionPane.showMessageDialog(null, textoAlunos[i]);

			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro! " + e.getMessage());
			System.exit(0);
		}
	}



}
