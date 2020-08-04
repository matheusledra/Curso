package Curso;

import java.util.Scanner;

public class CalculadoraScanner {

	public static void main(String[] args) { 
		
		System.out.println("==================");
		System.out.println("Escolha uma opção:");
		System.out.println("Adição = 1");
		System.out.println("Subtração = 2");
		System.out.println("Multiplicação = 3");
		System.out.println("Divisão = 4");
		System.out.println("==================");
		
		Scanner ope = new Scanner(System.in);
		int operacao = ope.nextInt();
		
		if(operacao == (1)) {
			Scanner num = new Scanner(System.in);
			
			System.out.println("Primeiro número:");
			double num1 = num.nextDouble();
			System.out.println("Segundo número:");
			double num2 = num.nextDouble();
			
			double resultado = num1 + num2;
			
			System.out.println("O resultado é: " + resultado);
		}
		if(operacao == (2)) {
			Scanner num = new Scanner(System.in);
			
			System.out.println("Primeiro número:");
			double num1 = num.nextDouble();
			System.out.println("Segundo número:");
			double num2 = num.nextDouble();
			
			double resultado = num1 + num2;
			
			System.out.println("O resultado é: " + resultado);
		}
		if(operacao == (3)) {
			Scanner num = new Scanner(System.in);
			
			System.out.println("Primeiro número:");
			double num1 = num.nextDouble();
			System.out.println("Segundo número:");
			double num2 = num.nextDouble();
			
			double resultado = num1 + num2;
			
			System.out.println("O resultado é: " + resultado);
		}
		if(operacao == (4)) {
			Scanner num = new Scanner(System.in);
			
			System.out.println("Primeiro número:");
			double num1 = num.nextDouble();
			System.out.println("Segundo número:");
			double num2 = num.nextDouble();
			
			double resultado = num1 + num2;
			
			System.out.println("O resultado é: " + resultado);
		}
		
	}
	
}