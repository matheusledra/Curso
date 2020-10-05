package Curso.Exercises;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ExerciciosCleiton {

	static int escolhaExercicio;
	
	public static void exerciciosCleiton() throws InterruptedException {
		Scanner entradaValores = new Scanner(System.in);
		System.out.println("");
		System.out.println("1 -> Conhecimentos do Java");
		System.out.println("2 -> Verificar se uma nota é ruim, boa ou excelente");
		System.out.println("3 -> Verificar se o aluno passou pela notas ou quantidade de maçãs");
		escolhaExercicio = entradaValores.nextInt();

		System.out.println("");
		System.out.println("Iniciando Exercício...");
		TimeUnit.SECONDS.sleep(1);

		switch (escolhaExercicio) {
		case 1:
			conhecimentosJava();
			break;
		case 2:
			notas();
			break;
		case 3:
			notasMacas();
			break;
		default:
			System.out.println("Exercício não encontrado...");
			break;
		}
		entradaValores.close();
	}

	public static void conhecimentosJava() {

		int opcao, operacao, idade, anoNaentradaValores;
		double num1, num2, resultado, antecessor, sucessor;
		String msg = "", opcoes, conversa, opcaoConversa;
		boolean menu1 = false, menu2 = false, opcoesmenu = false, invalidOption = false;

		Scanner entradaValores = new Scanner(System.in);

		try { // tente fazer isso...
			do { // faca o que estiver aqui...
				System.out.println("");
				System.out.println("Selecione a opcao desejada: ");
				System.out.println("");
				System.out.println("1 - Calculadora | 2 - Antecessor e Sucessor de um numero");
				System.out.println("3 - Verificar maior de Idade | 4 - Calcular Idade");
				System.out.println("5 - Conversa | 6- Cancelar");
				opcao = entradaValores.nextInt();

				switch (opcao) { // verifica a opcao selecionada
				case 1: // se a opcao selecionada for 1, faca isso...
					do { // faca o que estiver aqui...
						System.out.println("");
						System.out.println("EentradaValoresolha uma operacao matematica:");
						System.out.println("");
						System.out.println("1 - Somar | 2 - Subtrair | 3 - Multiplicar");
						System.out.println("4 - Dividir | 5 - Porcentagem");
						System.out.println("");
						operacao = entradaValores.nextInt();

						if (operacao == 1) { // se...
							System.out.println("");
							System.out.print("Digite o primeiro numero: ");
							num1 = entradaValores.nextDouble();

							System.out.print("Digite o segundo numero: ");
							num2 = entradaValores.nextInt();

							resultado = num1 + num2;

							msg = "O resultado da soma e: " + resultado;
							menu2 = false;
						} else if (operacao == 2) { // se nao, se...
							System.out.println("");
							System.out.print("Digite o primeiro numero: ");
							num1 = entradaValores.nextDouble();

							System.out.print("Digite o segundo numero: ");
							num2 = entradaValores.nextInt();

							resultado = num1 - num2;

							msg = "O resultado da subtracao e: " + resultado;
							menu2 = false;
						} else if (operacao == 3) { // se nao, se...
							System.out.println("");
							System.out.print("Digite o primeiro numero: ");
							num1 = entradaValores.nextDouble();

							System.out.print("Digite o segundo numero: ");
							num2 = entradaValores.nextInt();

							resultado = num1 * num2;

							msg = "O resultado da multiplicacao e: " + resultado;
							menu2 = false;
						} else if (operacao == 4) { // se nao, se...
							System.out.println("");
							System.out.print("Digite o primeiro numero: ");
							num1 = entradaValores.nextDouble();

							System.out.print("Digite o segundo numero: ");
							num2 = entradaValores.nextInt();

							resultado = num1 / num2;

							msg = "O resultado da divisao e: " + resultado;
							menu2 = false;
						} else if (operacao == 5) { // se nao, se...
							System.out.println("");
							System.out.print("Digite a porcentagem: ");
							num1 = entradaValores.nextDouble();

							System.out.print("Digite o valor inteiro: ");
							num2 = entradaValores.nextInt();

							resultado = (num1 * num2) / 100;

							msg = "O resultado da porcentagem e: " + resultado;
						} else { // se nao...
							msg = "Opcao invalida! '" + operacao + "' Tente novamente!";
							menu2 = true;
						}
						System.out.println(msg);
						do { // faca o que estiver aqui
							System.out.println("");
							System.out.println("-----------------------");
							System.out.println("Deseja voltar ao menu de operacoes, ao principal ou deseja encerrar?");
							System.out.println("Use: Operacoes, Principal ou Encerrar");
							System.out.println("-----------------------");

							opcoes = entradaValores.next();

							if (opcoes.equalsIgnoreCase("Operacoes")) { // se...
								System.out.println("");
								System.out.println("Voltando ao menu de operacoes...");
								System.out.println("");
								menu2 = true;
							} else if (opcoes.equalsIgnoreCase("Principal")) { // se nao, se...
								System.out.println("");
								System.out.println("Voltando ao menu principal...");
								System.out.println("");
								menu2 = false;
								menu1 = true;
							} else if (opcoes.equalsIgnoreCase("Encerrar")) { // se nao, se...
								System.out.println("");
								System.out.println("Encerrando...");
								menu1 = false;
								menu2 = false;
								opcoesmenu = false;
							} else { // se nao...
								System.out.println("");
								System.out.println("Opcao invalida... Tente novamente!");
								menu1 = false;
								menu2 = false;
								opcoesmenu = true;
							}
						} while (opcoesmenu); // While do menu de menus, repita se opcoesmenu for true
					} while (menu2); // While do menu de operacoes, repita se menu2 for true
					break; // Pare aqui
				case 2: // se a opcao selecionada for 2, faca isso...
					do { // faca o que estiver aqui
						System.out.println("");
						System.out.print("Digite o numero a ser verificado: ");
						num1 = entradaValores.nextInt();
						sucessor = num1 + 1;
						antecessor = num1 - 1;

						System.out.println("");
						System.out.println("Numero eentradaValoresolhido: " + num1);
						System.out.println("Sucessor do numero: " + sucessor);
						System.out.println("Antecessor do numero: " + antecessor);

						do { // faca o que estiver aqui
							System.out.println("");
							System.out.println("-----------------------");
							System.out.println(
									"Deseja verificar mais um numero, voltar ao menu principal ou deseja encerrar?");
							System.out.println("Use: Ante/Suce, Principal ou Encerrar");
							System.out.println("-----------------------");

							opcoes = entradaValores.next();

							if (opcoes.equalsIgnoreCase("Ante/Suce")) { // se...
								System.out.println("");
								System.out.println("Voltando para verificar mais um numero...");
								System.out.println("");
								menu2 = true;
							} else if (opcoes.equalsIgnoreCase("Principal")) { // se nao, se...
								System.out.println("");
								System.out.println("Voltando ao menu principal...");
								System.out.println("");
								menu2 = false;
								menu1 = true;
							} else if (opcoes.equalsIgnoreCase("Encerrar")) { // se nao, se...
								System.out.println("");
								System.out.println("Encerrando...");
								menu1 = false;
								menu2 = false;
								opcoesmenu = false;
							} else { // se nao...
								System.out.println("");
								System.out.println("Opcao invalida... Tente novamente!");
								menu1 = false;
								menu2 = false;
								opcoesmenu = true;
							}
						} while (opcoesmenu); // While do menu de menus, repita se opcoesmenu for true
					} while (menu2); // While do Antecessor/Sucessor, repita se menu2 for true
					break; // pare aqui
				case 3: // se a opcao selecionada for 3, faca isso...
					do { // faca o que estiver aqui
						do { // faca o que estiver aqui
							System.out.println("");
							System.out.println(
									"Deseja verificar pela idade ou pelo ano de naentradaValoresimento? (I/A)");

							opcoes = entradaValores.next();

							if (opcoes.equalsIgnoreCase("I")) { // se...
								System.out.println("");
								System.out.print("Digite a idade da pessoa:");

								idade = entradaValores.nextInt();

								if (idade >= 18) { // se...
									System.out.println("");
									System.out.println("A pessoa e maior de idade!");
								} else { // se mao...
									System.out.println("");
									System.out.println("A pessoa e menor de idade!");
								}
								invalidOption = false;
							} else if (opcoes.equalsIgnoreCase("A")) { // se nao, se...
								System.out.println("");
								System.out.print("Digite o ano de naentradaValoresimento: ");

								anoNaentradaValores = entradaValores.nextInt();

								idade = 2020 - anoNaentradaValores;

								if (idade >= 18) { // se...
									System.out.println("");
									System.out.println("A pessoa e maior de idade!");
								} else { // se nao...
									System.out.println("");
									System.out.println("A pessoa e menor de idade!");
								}
								invalidOption = false;
							} else { // se nao...
								System.out.println("");
								System.out.println("Opcao invalida! Tente novamente!");
								invalidOption = true;
							}
						} while (invalidOption); // While de opcao invalida, repita se invalidOption for true
						do { // faca o que estiver aqui
							System.out.println("");
							System.out.println("-----------------------");
							System.out.println(
									"Deseja verificar mais uma idade, voltar ao menu principal ou deseja encerrar?");
							System.out.println("Use: Idade, Principal ou Encerrar");
							System.out.println("-----------------------");

							opcoes = entradaValores.next();

							if (opcoes.equalsIgnoreCase("Idade")) { // se...
								System.out.println("");
								System.out.println("Voltando para verificar mais uma idade...");
								System.out.println("");
								menu2 = true;
							} else if (opcoes.equalsIgnoreCase("Principal")) { // se nao, se
								System.out.println("");
								System.out.println("Voltando ao menu principal...");
								System.out.println("");
								menu2 = false;
								menu1 = true;
							} else if (opcoes.equalsIgnoreCase("Encerrar")) { // se nao, se...
								System.out.println("");
								System.out.println("Encerrando...");
								menu1 = false;
								menu2 = false;
								opcoesmenu = false;
							} else { // se nao...
								System.out.println("");
								System.out.println("Opcao invalida... Tente novamente!");
								menu1 = false;
								menu2 = false;
								opcoesmenu = true;
							}
						} while (opcoesmenu); // While do menu de menus, repita se opcoesmenu for true
					} while (menu2); // While do Verificador de maior de idade, repita se menu2 for true
					break; // pare aqui
				case 4: // se a opcao selecionada for 4, faca isso...
					do { // faça o que estiver aqui...
						System.out.println("");
						System.out.print("Digite o ano de naentradaValoresimento da pessoa: ");

						anoNaentradaValores = entradaValores.nextInt();

						idade = 2020 - anoNaentradaValores;

						System.out.println("");
						System.out.println("A pessoa tem " + idade + " anos!");
						do { // faça o que estiver aqui...
							System.out.println("");
							System.out.println("-----------------------");
							System.out.println(
									"Deseja verificar mais uma idade, voltar ao menu principal ou deseja encerrar?");
							System.out.println("Use: Idade, Principal ou Encerrar");
							System.out.println("-----------------------");

							opcoes = entradaValores.next();

							if (opcoes.equalsIgnoreCase("Idade")) { // se...
								System.out.println("");
								System.out.println("Voltando para verificar mais uma idade...");
								System.out.println("");
								menu2 = true;
							} else if (opcoes.equalsIgnoreCase("Principal")) { // se nao, se...
								System.out.println("");
								System.out.println("Voltando ao menu principal...");
								System.out.println("");
								menu2 = false;
								menu1 = true;
							} else if (opcoes.equalsIgnoreCase("Encerrar")) { // se nao, se...
								System.out.println("");
								System.out.println("Encerrando...");
								menu1 = false;
								menu2 = false;
								opcoesmenu = false;
							} else { // se nao...
								System.out.println("");
								System.out.println("Opcao invalida... Tente novamente!");
								menu1 = false;
								menu2 = false;
								opcoesmenu = true;
							}
						} while (opcoesmenu); // While do menu de menus, repita se opcoesmenu for true
					} while (menu2); // While da calculadora de idade, repita se menu2 for true
					break; // pare aqui
				case 5:
					do {
						System.out.println("");
						System.out.println("Olá, tudo bem? S/N");
						opcaoConversa = entradaValores.next();

						conversa = (opcaoConversa.equalsIgnoreCase("S")) ? "Que bom!" : "Espero que melhore!";

						System.out.println(conversa + " Seu dia foi bom? S/N");

						opcaoConversa = entradaValores.next();

						conversa = (opcaoConversa.equalsIgnoreCase("S")) ? "Que legal!" : "Puts, que chato cara :(";

						System.out.println(conversa + " Ja bebeu agua hoje? S/N");

						opcaoConversa = entradaValores.next();

						conversa = (opcaoConversa.equalsIgnoreCase("S"))
								? "Que bom! Nao podemos nos esquecer de se idratar"
								: "Nao? Entao vai beber!";

						System.out.println(conversa + "\nEstou indo agora, ok? Ok/Bye");

						opcaoConversa = entradaValores.next();

						conversa = (opcaoConversa.equalsIgnoreCase("Ok")) ? "Ate mais" : "Bye";

						System.out.println(conversa);

						do { // faça o que estiver aqui...
							System.out.println("");
							System.out.println("-----------------------");
							System.out.println(
									"Deseja reiniciar a conversa, voltar ao menu principal ou deseja encerrar?");
							System.out.println("Use: Conversa, Principal ou Encerrar");
							System.out.println("-----------------------");

							opcoes = entradaValores.next();

							if (opcoes.equalsIgnoreCase("Conversa")) { // se...
								System.out.println("");
								System.out.println("Reiniciando a conversa...");
								System.out.println("");
								menu2 = true;
							} else if (opcoes.equalsIgnoreCase("Principal")) { // se nao, se...
								System.out.println("");
								System.out.println("Voltando ao menu principal...");
								System.out.println("");
								menu2 = false;
								menu1 = true;
							} else if (opcoes.equalsIgnoreCase("Encerrar")) { // se nao, se...
								System.out.println("");
								System.out.println("Encerrando...");
								menu1 = false;
								menu2 = false;
								opcoesmenu = false;
							} else { // se nao...
								System.out.println("");
								System.out.println("Opcao invalida... Tente novamente!");
								menu1 = false;
								menu2 = false;
								opcoesmenu = true;
							}
						} while (opcoesmenu); // While do menu de menus, repita se opcoesmenu for true
					} while (menu2);
					break;
				case 6: // se a opcao selecionada for 6, faca isso...
					System.out.println("");
					System.out.println("Cancelando...");
					menu1 = false;
					break;
				default: // Caso seja selecionada uma opcao inexistente...
					System.out.println("");
					System.out.println("Opcao invalida! Tente novamente...");
					menu1 = true;
					break;
				}
			} while (menu1); // While do meunu principal, repita se menu1 for true
		} catch (Exception e) { // Caso ocorra um erro, faca isso...
			System.out.println("Um erro ocorreu... Encerrando!");
		}
		entradaValores.close(); // Fecha o EentradaValoresaneamento do cmd
	}

	public static void notas() {
		double nota = 0.0;
		Scanner entradaValores = new Scanner(System.in);

		System.out.print("EentradaValoresreva a nota: ");
		nota = entradaValores.nextDouble();

		if (nota <= 3) {
			System.out.println("Nota ruim");
		} else if (nota > 3 && nota < 6) {
			System.out.println("Nota satisfatoria");
		} else if (nota > 6 && nota < 8) {
			System.out.println("Nota boa");
		} else if (nota > 8 && nota < 10) {
			System.out.println("Nota otima!");
		} else {
			System.out.println("A Nota maxima é 10");
		}
		entradaValores.close();
	}

	public static void notasMacas() {
		double nota = 0.0;
		int macas = 0;
		Scanner entradaValores = new Scanner(System.in);

		System.out.print("EentradaValoresreva a nota: ");
		nota = entradaValores.nextDouble();

		System.out.print("EentradaValoresreva o numero de macas: ");
		macas = entradaValores.nextInt();

		if (nota < 10 || macas < 10) {
			System.out.println("Nota top");
		} else if (nota < 8 || macas < 8) {
			System.out.println("Nota satisfatoria");
		} else if (nota < 6 || macas < 6) {
			System.out.println("Nota boa");
		} else if (nota < 3 || macas < 3) {
			System.out.println("Nota otima!");
		} else {
			System.out.println("A Nota maxima é 10");
		}
		entradaValores.close();
	}

}
