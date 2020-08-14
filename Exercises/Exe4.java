package Curso.Exercises;

import java.util.Scanner;

public class Exe4 {
	
	//Escrever um algoritmo que lê:
	//- a porcentagem do IPI a ser acrescido no valor das peças
	//- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
	//- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
	//O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
	//Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

	public static void main(String[] args) {
		
		double IPI;
		double porc;
		double valorAdicional;
		
		double cod1;
		double val1;
		double qntd1;
		double valorTotalPecas1;
		
		double cod2;
		double val2;
		double qntd2;
		double valorTotalPecas2;
		
		double somas;
		double valorFinal;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("");
		System.out.print("Digite a porcentagem IPI: ");
		IPI = sc.nextDouble();
		
		System.out.println("");
		System.out.print("Digite o codigo da peca 1: ");
		cod1 = sc.nextInt();
		

		System.out.println("");
		System.out.print("Digite o valor da peca 1: ");
		val1 = sc.nextInt();
		
		System.out.println("");
		System.out.print("Quantidade de pecas 1: ");
		qntd1 = sc.nextInt();
		
		System.out.println("");
		System.out.print("Digite o codigo da peca 2: ");
		cod2 = sc.nextInt();
		

		System.out.println("");
		System.out.print("Digite o valor da peca 2: ");
		val2 = sc.nextInt();
		
		System.out.println("");
		System.out.print("Quantidade de pecas 2: ");
		qntd2 = sc.nextInt();
		
		valorTotalPecas1 = val1 * qntd1;
		valorTotalPecas2 = val2 * qntd2;
		
		somas = valorTotalPecas1 + valorTotalPecas2;
		
		porc = IPI / 100;
		
		valorAdicional = somas * porc;
		
		valorFinal = somas + valorAdicional;
		
		System.out.println("Valor final a ser pago: R$" + valorFinal);
	}
}
