package Curso.Estudos;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class RevisaoProva1 {

	public static void exercicio1If() {
		int numerosGerados;
		int qntdDentroDoIntervalo = 0;

		System.out.println("Números gerados");
		for (int i = 0; i < 50; i++) {
			numerosGerados = ThreadLocalRandom.current().nextInt(1, 150);
			System.out.println(String.format("| %3d |", numerosGerados));

			if (numerosGerados >= 10 && numerosGerados <= 100) {
				qntdDentroDoIntervalo++;
			}
		}

		System.out.println("\nA quantidade de números dentro do intervalo é: " + qntdDentroDoIntervalo);
	}

	public static void exercicio2If() {
		int numerosGerados;
		int maiorPar = 0;

		System.out.println("Vetor gerado: ");
		for (int i = 0; i < 50; i++) {
			numerosGerados = ThreadLocalRandom.current().nextInt(1, 600);
			System.out.println(String.format("| %3d |", numerosGerados));

			if (numerosGerados % 2 == 0) {
				if (numerosGerados > maiorPar) {
					maiorPar = numerosGerados;
				}
			}
		}

		System.out.println("\nO maior número par: " + maiorPar);
	}

	public static void exercicio3Switch() {
		Scanner scEntrada = new Scanner(System.in);
		int ordemNumeros, numeroA, numeroB, numeroC;

		System.out.println("Escreva o primeiro número: ");
		numeroA = scEntrada.nextInt();
		System.out.println("Escreva o segundo número: ");
		numeroB = scEntrada.nextInt();
		System.out.println("Escreva o terceiro número: ");
		numeroC = scEntrada.nextInt();

		System.out.println("");
		System.out.println("Escolha uma ordem para mostrar os números: ");
		System.out.println("1 - Ordem crescente");
		System.out.println("2 - Ordem decrescente");
		System.out.println("3 - Maior número no meio");
		System.out.println("");
		ordemNumeros = scEntrada.nextInt();

		switch (ordemNumeros) {
		case 1:
			if (numeroA < numeroB && numeroA < numeroC) {
				if (numeroB < numeroC) {
					System.out.println(numeroA + ", " + numeroB + ", " + numeroC);
				} else {
					System.out.println(numeroA + ", " + numeroC + ", " + numeroB);
				}
			} else if (numeroB < numeroA && numeroB < numeroC) {
				if (numeroA < numeroC) {
					System.out.println(numeroB + ", " + numeroA + ", " + numeroC);
				} else {
					System.out.println(numeroB + ", " + numeroC + ", " + numeroA);
				}
			} else {
				if (numeroA < numeroB) {
					System.out.println(numeroC + ", " + numeroA + ", " + numeroB);
				} else {
					System.out.println(numeroC + ", " + numeroB + ", " + numeroA);
				}
			}
			break;
		case 2:
			if (numeroA > numeroB && numeroA > numeroC) {
				if (numeroB > numeroC) {
					System.out.println(numeroA + ", " + numeroB + ", " + numeroC);
				} else {
					System.out.println(numeroA + ", " + numeroC + ", " + numeroB);
				}
			} else if (numeroB > numeroA && numeroB > numeroC) {
				if (numeroA > numeroC) {
					System.out.println(numeroB + ", " + numeroA + ", " + numeroC);
				} else {
					System.out.println(numeroB + ", " + numeroC + ", " + numeroA);
				}
			} else {
				if (numeroA > numeroB) {
					System.out.println(numeroC + ", " + numeroA + ", " + numeroB);
				} else {
					System.out.println(numeroC + ", " + numeroB + ", " + numeroA);
				}
			}
			break;
		case 3:
			if (numeroA > numeroB && numeroA > numeroC) {
				System.out.println(numeroB + ", " + numeroA + ", " + numeroC);
			} else if (numeroB > numeroA && numeroB > numeroC) {
				System.out.println(numeroA + ", " + numeroB + ", " + numeroC);
			} else {
				System.out.println(numeroA + ", " + numeroC + ", " + numeroB);
			}
			break;
		default:
			System.out.println("Ordem inválida!");
			break;
		}

		scEntrada.close();
	}

	public static void exercicio4While() {
		Scanner scEntrada = new Scanner(System.in);
		int qntdNumeros = 0;
		double valorLido = 0, soma = 0, media;

		while (valorLido >= 0) {
			qntdNumeros++;
			System.out.print("Informe o " + qntdNumeros + " número: ");
			valorLido = scEntrada.nextInt();

			if (valorLido >= 0) {
				soma += valorLido;
			} else {
				qntdNumeros--;
			}
		}

		media = soma / qntdNumeros;

		System.out.println("Foram digitados " + qntdNumeros + " números!");
		System.out.println("A soma total foi " + soma);
		System.out.println("A média resultante é: " + media);

		scEntrada.close();
	}

	public static void exercicio5While() {
		Scanner scEntrada = new Scanner(System.in);
		String mediasAlunos = "";
		int codigoAluno = 1;
		double notaUm, notaDois, notaTres, mediaAluno;

		while (codigoAluno > 0) {
			System.out.print("Digite o código do aluno: ");
			codigoAluno = scEntrada.nextInt();
			if (codigoAluno > 0) {
				System.out.print("Digite a primeita nota do aluno: ");
				notaUm = scEntrada.nextInt();
				System.out.print("Digite a segunda nota do aluno: ");
				notaDois = scEntrada.nextInt();
				System.out.print("Digite a terceira nota do aluno: ");
				notaTres = scEntrada.nextInt();

				mediaAluno = (notaUm + notaDois + notaTres) / 3;

				mediasAlunos += "Código do Aluno: " + codigoAluno + "\nMedia do Aluno: " + mediaAluno + "\n\n";
			}
			System.out.println("");
		}

		System.out.println(mediasAlunos);

		scEntrada.close();
	}

	public static void exercicio6While() throws InterruptedException {
		Scanner scEntrada = new Scanner(System.in);
		int limpaAnterior = 0, voto = 1, totalVotosCleitinho = 0, totalVotosRogerinho = 0, totalVotosPaulinha = 0,
				totalVotosSerginho = 0, totalVotosNulos = 0, totalVotosBranco = 0;

		while (voto > 0) {
			while (limpaAnterior < 100) {
				System.out.println("");
				limpaAnterior++;
			}
			limpaAnterior = 0;

			System.out.println("Bem-Vindo a eleição!");
			System.out.println("");
			System.out.println("Candidatos: ");
			System.out.println("1 - Cleitinho ");
			System.out.println("2 - Rogerinho");
			System.out.println("3 - Paulinha");
			System.out.println("4 - Serginho");
			System.out.println("");
			System.out.println("5 - Voto nulo");
			System.out.println("6 - Voto em branco");
			System.out.println("");
			System.out.print("Digite seu voto: ");
			voto = scEntrada.nextInt();

			System.out.println("");
			switch (voto) {
			case 0:
				System.out.println("Votação Encerrada!");
				System.out.println("");
				break;
			case 1:
				System.out.println("Voto dado para Cleitinho!");
				totalVotosCleitinho++;
				TimeUnit.SECONDS.sleep(5);
				break;
			case 2:
				System.out.println("Voto dado para Rogerinho!");
				totalVotosRogerinho++;
				TimeUnit.SECONDS.sleep(5);
				break;
			case 3:
				System.out.println("Voto dado para Paulinha!");
				totalVotosPaulinha++;
				TimeUnit.SECONDS.sleep(5);
				break;
			case 4:
				System.out.println("Voto dado para Serginho!");
				totalVotosSerginho++;
				TimeUnit.SECONDS.sleep(5);
				break;
			case 5:
				System.out.println("Voto Nulo!");
				totalVotosNulos++;
				TimeUnit.SECONDS.sleep(5);
				break;
			case 6:
				System.out.println("Voto em Branco!");
				totalVotosBranco++;
				TimeUnit.SECONDS.sleep(5);
				break;
			default:
				System.out.println("Opção inválida!");
				TimeUnit.SECONDS.sleep(5);
				break;
			}
		}

		System.out.println("A quantidade de Votos para cada cantidato foi:");
		System.out.println("");
		System.out.println("Cleitinho - " + totalVotosCleitinho);
		System.out.println("Rogerinho - " + totalVotosRogerinho);
		System.out.println("Paulinha - " + totalVotosPaulinha);
		System.out.println("Serginho - " + totalVotosSerginho);
		System.out.println("");
		System.out.println("Votos Nulos - " + totalVotosNulos);
		System.out.println("Votos em Branco - " + totalVotosBranco);
		System.out.println("");
		scEntrada.close();

	}

	public static void exercicio7For() {
		int numeroGerado, maior = 0, menor = 201;

		System.out.println("Números gerados: ");
		for (int i = 0; i < 50; i++) {
			numeroGerado = ThreadLocalRandom.current().nextInt(1, 200);
			System.out.println(String.format("| %3d |", numeroGerado));

			if (numeroGerado < menor) {
				menor = numeroGerado;
			}
			if (numeroGerado > maior) {
				maior = numeroGerado;
			}
		}
		System.out.println("\nO maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
	}

	public static void exercicio8For() {
		int somaTotal = 0, media, numerosGerados, maior = 0, menor = 10001;
		
		for (int i = 0; i < 500; i++) {
			numerosGerados = ThreadLocalRandom.current().nextInt(1, 10000);
			somaTotal += numerosGerados;
			
			if(numerosGerados > maior) {
				maior = numerosGerados;
			}
			if (numerosGerados < menor) {
				menor = numerosGerados;
			}
		}
		
		media = somaTotal / 500;
		
		System.out.println("Foram gerados 500 números entre 1 e 10000");
		System.out.println("\nO maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
		System.out.println("A média é: " + media);
	}

	public static void exercicio9For() {
		int numerosGerados, qntdDentroIntervalo = 0, qntdForaIntervalo = 0;

		System.out.println("Números gerados: ");
		for (int i = 0; i < 10; i++) {
			numerosGerados = ThreadLocalRandom.current().nextInt(1, 50);
			System.out.println(String.format("| %3d |", numerosGerados));

			if (numerosGerados >= 10 && numerosGerados <= 20) {
				qntdDentroIntervalo++;
			} else {
				qntdForaIntervalo++;
			}
		}
		
		System.out.println("\nA quantidade de números dentro do intervalo é: " + qntdDentroIntervalo);
		System.out.println("\nA quantidade de números fora do intervalo é: " + qntdForaIntervalo);
	}

	public static void exercicio10For() {
		Scanner scEntrada = new Scanner(System.in);
		double altura, mediaAlturas, mediaAlturasMulheres, somaAlturas = 0, somaAlturaMulheres = 0, maiorAltura = 0.0, menorAltura = 3.0;
		int sexo, qntdMulheres = 0;

		System.out.println("Sexos: 1 - Masculino | 2 - Feminino");
		for (int i = 0; i < 50; i++) {
			System.out.print("Informe o sexo do " + (i + 1) + "º aluno: ");
			sexo = scEntrada.nextInt();
			System.out.print("Informe a altura do " + (i + 1) + "º aluno: ");
			altura = scEntrada.nextDouble();

			somaAlturas += altura;
			if (sexo == 2) {
				somaAlturaMulheres += altura;
				qntdMulheres++;
			}
			
			if(altura > maiorAltura) {
				maiorAltura = altura;
			}
			if(altura < menorAltura) {
				menorAltura = altura;
			}
			System.out.println("");
		}
		
		mediaAlturasMulheres = somaAlturaMulheres / qntdMulheres;
		mediaAlturas = somaAlturas / 5;
		
		System.out.println("");
		System.out.print("O aluno mais alto tem ");
		System.out.printf("%.2f", maiorAltura);
		System.out.print(" metros\n" + "O aluno mais baixo tem ");
		System.out.printf("%.2f", menorAltura);
		System.out.print(" metros\n" + "A média das alturas das mulheres é ");
		System.out.printf("%.2f", mediaAlturasMulheres);
		System.out.print(" metros\n" + "A média das alturas da turma é ");
		System.out.printf("%.2f", mediaAlturas);
		System.out.print(" metros");

		scEntrada.close();
	}
}
