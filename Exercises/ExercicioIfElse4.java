package Curso.Exercises;

import java.util.Scanner;

public class ExercicioIfElse4 {

	public static void main(String[] args) {

		String codigoProduto;
		Scanner entradaCodigo = new Scanner(System.in);

		System.out.print("Digite o cóigo do produto: ");
		codigoProduto = entradaCodigo.next();

		if (codigoProduto.equals("001")) {
			System.out.println("Código 001");
			System.out.println("Produto - Arroz");
		} else if (codigoProduto.equals("002")) {
			System.out.println("Código 002");
			System.out.println("Produto - Feijão");
		} else if (codigoProduto.equals("003")) {
			System.out.println("Código 003");
			System.out.println("Produto - Farinha");
		} else {
			System.out.println("Código " + codigoProduto);
			System.out.println("Diversos");
		}

	}
}
