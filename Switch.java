package Curso;

import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		
		String gen;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu genero (M,F,B...)");
		gen = sc.next();
		
		switch (gen) {
		case "M":
			System.out.println("Bem-Vindo");
			break;
			
		case "F":
			System.out.println("Bem-Vinda");
			break;
			
		default:
			System.out.println("Bem-Vindx");
			break;
		}
	}

}
