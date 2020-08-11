package Curso;

import java.util.Scanner;

public class MaiorDeIdade {

	public static void main(String[] args) {

		String nome;
		int idade;
		int restante;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome?");
		nome = sc.nextLine();

		System.out.println("Digite sua idade?");
		idade = sc.nextInt();

		System.out.print(nome + " voce e ");

		if (idade >= 18) {
			System.out.println("maior de idade!");
		} else {
			restante = 18 - idade;
			System.out.println("menor de idade, faltam ainda " + restante + " anos!");
		}
	}
}
