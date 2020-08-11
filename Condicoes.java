package antigoeclipse;

import java.io.PrintStream;
import java.util.Scanner;

public class Condicoes {
	
	public static void main(String[] args) {

		double n1;
		double n2;
		double calculo=0;
		int opcao;
		String msg = "";
		PrintStream sys = System.out;
		Scanner sc = new Scanner(System.in);
		
		sys.println("");
		sys.println("Digite a opção desejada");
		sys.println("");
		sys.println("1- Somar | 2- Subtrair | 3- Multiplicar | 4- Dividir");
		sys.println("");
		
		opcao = sc.nextInt();
		
		sys.println("");
		sys.println("-> Digite o primeiro valor <-");
		n1 = sc.nextDouble();
		sys.println("");
		sys.println("-> Digite o segundo valor <-");
		n2 = sc.nextDouble();
		
		if(opcao == 1) {
			
			calculo = n1 + n2;

			msg = "Resultado da soma -> " + calculo;
		} else if(opcao == 2) { 
			
			calculo = n1 - n2;
			
			msg = "Resultado da subtração -> " + calculo;
		} else if(opcao == 3) {
			
			calculo = n1 * n2;
			
			msg = "Resultado da multiplicação -> " + calculo;
		} else if(opcao == 4) {
			
			calculo = n1 / n2;
			
			msg = "Resultado da divisão -> " + calculo;
		} else {
			msg = "->!!!<- Opção inválida! ->!!!<-";
		}
		
		sys.println("");
		sys.println(msg);
	}
}