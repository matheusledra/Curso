package Curso.Estudos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class RefazendoExerciciosSwitch {

	public static void exercicio1() {
		Scanner scEntrada = new Scanner(System.in);
		String fruta;

		System.out.println("Frutas: Maçã, Kiwi, Melancia");
		System.out.print("Escolha uma fruta: ");
		fruta = scEntrada.next();

		switch (fruta.toLowerCase()) {
		case "maçã":
		case "maça":
		case "maca":
			System.out.println("Não vendemos esta fruta aqui!");
			break;
		case "kiwi":
			System.out.println("Estamos com escassez de kiwi!");
			break;
		case "melancia":
			System.out.println("Aqui está! São R$3,00 o quilo!");
			break;
		default:
			System.out.println("Fruta não encontrada!");
			break;
		}

		scEntrada.close();
	}

	public static void exercicio2() {
		Scanner scEntrada = new Scanner(System.in);
		String carroEscolhido, confirmacao;
		boolean confirmacaoCompra = false;
		
		do {
			System.out.println("Carros disponíveis: ");
			System.out.println("");
			System.out.println("Hatch");
			System.out.println("Sedan");
			System.out.println("Motocicleta");
			System.out.println("Caminhonete");
			System.out.println("");
			System.out.print("Escolha o modelo: ");
			carroEscolhido = scEntrada.next();
			
			switch (carroEscolhido.toLowerCase()) {
			case "hatch":
				System.out.println("Compra efetuada com sucesso! Parabéns!");
				confirmacaoCompra = true;
				break;
			case "sedan":
				System.out.println("Tem certeza que deseja comprar este modelo? (Sedan) S/N");
				confirmacao = scEntrada.next();
				confirmacaoCompra = (confirmacao.equalsIgnoreCase("S")) ? true : false;
				if(confirmacaoCompra) {
					System.out.println("Compra efetuada com sucesso! Parabéns!");
				}
				break;
			case "motocicleta":
				System.out.println("Tem certeza que deseja comprar este modelo? (Motocicleta) S/N");
				confirmacao = scEntrada.next();
				confirmacaoCompra = (confirmacao.equalsIgnoreCase("S")) ? true : false;
				if(confirmacaoCompra) {
					System.out.println("Compra efetuada com sucesso! Parabéns!");
				}
				break;
			case "caminhonete":
				System.out.println("Tem certeza que deseja comprar este modelo? (Caminhonete) S/N");
				confirmacao = scEntrada.next();
				confirmacaoCompra = (confirmacao.equalsIgnoreCase("S")) ? true : false;
				if(confirmacaoCompra) {
					System.out.println("Compra efetuada com sucesso! Parabéns!");
				}
				break;
			default:
				break;
			}
		} while(!confirmacaoCompra);
		
		scEntrada.close();
	}
	
	public static void exercicio3() {
		boolean verificacao = false, repeticao = false;
		int opcaoEscolhida, numeroUm, numeroDois;
		String textoUm = "Escolha uma opção: \n1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Dividir \n\n0 - Cancelar", resultado = "", repete = "";
		
		do {
			opcaoEscolhida = Integer.parseInt(JOptionPane.showInputDialog(null, textoUm, "Escolha", JOptionPane.QUESTION_MESSAGE));
			
			verificacao = (opcaoEscolhida >= 0 && opcaoEscolhida <= 4) ? true : false;
			
			if(verificacao) {
				numeroUm = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número", "Primeiro Número", JOptionPane.QUESTION_MESSAGE));
				numeroDois = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número", "Segundo Número", JOptionPane.QUESTION_MESSAGE));
				
				switch (opcaoEscolhida) {
				case 0:
					System.exit(0);
					break;
				case 1:
					resultado = "O resultado de " + numeroUm  + " + " + numeroDois + " é:" + "\n" + (numeroUm + numeroDois);
					break;
				case 2:
					resultado = "O resultado de " + numeroUm  + " - " + numeroDois + " é:" + "\n" + (numeroUm - numeroDois);
					break;
				case 3:
					resultado = "O resultado de " + numeroUm  + " * " + numeroDois + " é:" + "\n" + (numeroUm * numeroDois);
					break;
				case 4:
					resultado = "O resultado de " + numeroUm  + " / " + numeroDois + " é:" + "\n" + (numeroUm / numeroDois);
					break;
				default:
					break;
				}
				
				JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
				
				repete = JOptionPane.showInputDialog(null, "Deseja fazer outra operação? S/N", "Nova operação?", JOptionPane.QUESTION_MESSAGE);
				
				switch (repete) {
				case "S":
					repeticao = true;
					break;
				case "N":
					repeticao = false;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Erro! A opção não foi reconhecida " + repeticao + "\nEncerrando...");
					repeticao = false;
					break;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Erro! A opção não foi reconhecida " + opcaoEscolhida);
				repeticao = true;
			}
		} while (repeticao);
	}
	
	public static void exercicio4() {
		Scanner scEntrada = new Scanner(System.in);
		String produtoEscolhido;
		
		System.out.println("Produtos Dispoíveis: ");
		System.out.println(" ");
		System.out.println("--- Não-Perecíveis --- ");
		System.out.println("Arroz, feijão, café ");
		System.out.println(" ");
		System.out.println("--- Frutas --- ");
		System.out.println("Manga, banana, maçã ");
		System.out.println(" ");
		System.out.println("--- Bebidas --- ");
		System.out.println("Leite, sucos, refrigerantes ");
		System.out.println(" ");
		System.out.print("Escolha um produto: ");
		produtoEscolhido = scEntrada.next();
		
		switch (produtoEscolhido) {
		case "arroz":
			System.out.println("Produto escolhido: " + produtoEscolhido);
			break;
		case "feijão":
		case "feijao":
			System.out.println("Produto escolhido: feijão");
			break;
		case "café":
		case "cafe":
			System.out.println("Produto escolhido: café");
			break;
		case "manga":
			System.out.println("Produto escolhido: " + produtoEscolhido);
			break;
		case "banana":
			System.out.println("Produto escolhido: " + produtoEscolhido);
			break;
		case "maça":
		case "maca":
		case "macã":
		case "maçã":
			System.out.println("Produto escolhido: maçã");
			break;
		case "leite":
			System.out.println("Produto escolhido: " + produtoEscolhido);
			break;
		case "sucos":
			System.out.println("Produto escolhido: " + produtoEscolhido);
			break;
		case "refrigerantes":
			System.out.println("Produto escolhido: " + produtoEscolhido);
			break;
		default:
			System.out.println("Produto não encontrado no sistema: " + produtoEscolhido);
			break;
		}
		
		scEntrada.close();
	}
}
