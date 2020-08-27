package Curso.Exercises;

import java.util.Scanner;

public class ExercicioIfElse8 {

	public static void main(String[] args) {
		
		int valor1, valor2, valor3;
		Scanner entradaValor = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		valor1 = entradaValor.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = entradaValor.nextInt();
		System.out.print("Digite o terceiro valor: ");
		valor3 = entradaValor.nextInt();
		
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
