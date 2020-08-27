package Curso.Exercises;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {

		int iLado1, iLado2, iLado3, iSoma1, iSoma2, iSoma3;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o comprimento do primeiro lado: ");
		iLado1 = sc.nextInt();
		System.out.print("Digite o comprimento do segundo lado: ");
		iLado2 = sc.nextInt();
		System.out.print("Digite o comprimento do terceiro lado: ");
		iLado3 = sc.nextInt();

		iSoma1 = iLado1 + iLado2;
		iSoma2 = iLado2 + iLado3;
		iSoma3 = iLado3 + iLado1;

		if (iSoma1 > iLado3 && iSoma2 > iLado1 && iSoma3 > iLado2) {
			System.out.println("O Triângulo é Válido!");
			if (iLado1 == iLado2 && iLado2 == iLado3) {
				System.out.println("Triângulo Equilátero");
			} else if (iLado1 == iLado2 || iLado2 == iLado3 || iLado3 == iLado1) {
				System.out.println("Triângulo Isósceles");
			} else {
				System.out.println("Triângulo Escaleno");
			}
		} else {
			System.out.println("O Triângulo é Inválido!");
		}
		

	}
}
