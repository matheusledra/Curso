package Curso.Exercises;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ExerciciosRamon {
	
	public static int escolhaExercicio;
	
	public static void exerciciosRamon() throws InterruptedException {
		Scanner entradaValores = new Scanner(System.in);
		System.out.println("");
		System.out.println("1 -> Verificar se um triângulo é válido ou não, e o seu tipo");
		System.out.println("2 -> Verificar se um número é maior ou menor que zero");
		escolhaExercicio = entradaValores.nextInt();

		System.out.println("");
		System.out.println("Iniciando Exercício...");
		TimeUnit.SECONDS.sleep(1);

		switch (escolhaExercicio) {
		case 1:
			triangulo();
			break;
		case 2:
			maiorMenorZero();
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

}
