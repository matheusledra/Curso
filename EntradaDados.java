package Curso;

import java.util.*;

public class EntradaDados {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = sc.nextLine();
		
		System.out.println("Digite sua idade");
		int idade = sc.nextInt();
		
		System.out.println("Digite sua altura");
		float altura = sc.nextFloat();
		
		System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos e tenho " + altura + " metros de altura");
		
		sc.close();
	}

}
