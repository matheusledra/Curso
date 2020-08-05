package Curso;

import java.util.Scanner;

public class MediaValores {
	
	public static void main(String[] args) {

		double n1;
		double n2;
		double n3;
		double n4;
		double soma;
		double media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira seus valores para média:");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		
		soma = n1 + n2 + n3 + n4;
		media = soma / 4;
		
		System.out.println("A média dos valores inseridos é: " + media);
		
		sc.close();
	}

}
