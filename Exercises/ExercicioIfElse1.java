package Curso.Exercises;

import java.util.Scanner;

public class ExercicioIfElse1 {

	public static void main(String[] args) {
		
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
}
