package Curso.Exercises;

import java.util.Scanner;

public class ExercicioConhecimentos {

	public static void main(String[] args) {
		
		int opcao, operacao, idade, anoNasc;
		double num1, num2, resultado, antecessor, sucessor;
		String msg = "", opcoes, conversa, opcaoConversa;
		boolean menu1 = false, menu2 = false, opcoesmenu = false, invalidOption = false;
		
		Scanner sc = new Scanner(System.in);
		
		try { // tente fazer isso...
			do { // faca o que estiver aqui...
				System.out.println("");
				System.out.println("Selecione a opcao desejada: ");
				System.out.println("");
				System.out.println("1 - Calculadora | 2 - Antecessor e Sucessor de um numero");
				System.out.println("3 - Verificar maior de Idade | 4 - Calcular Idade");
				System.out.println("5 - Conversa | 6- Cancelar");
				opcao = sc.nextInt();
				
				switch(opcao) { // verifica a opcao selecionada
				case 1:  // se a opcao selecionada for 1, faca isso...
					do { // faca o que estiver aqui...
						System.out.println("");
						System.out.println("Escolha uma operacao matematica:");
						System.out.println("");
						System.out.println("1 - Somar | 2 - Subtrair");
						System.out.println("3- Multiplicar | 4 - Dividir");
						System.out.println("");
						operacao = sc.nextInt();
						
						if(operacao == 1) { // se...
							System.out.println("");
							System.out.print("Digite o primeiro numero: ");
							num1 = sc.nextDouble();

							System.out.print("Digite o segundo numero: ");
							num2 = sc.nextInt();
							
							resultado = num1 + num2;
							
							msg = "O resultado da soma e: " + resultado;
							menu2 = false;
						} else if(operacao == 2) { // se nao, se...
							System.out.println("");
							System.out.print("Digite o primeiro numero: ");
							num1 = sc.nextDouble();

							System.out.print("Digite o segundo numero: ");
							num2 = sc.nextInt();
							
							resultado = num1 - num2;
							
							msg = "O resultado da subtracao e: " + resultado;
							menu2 = false;
						} else if(operacao == 3) { // se nao, se...
							System.out.println("");
							System.out.print("Digite o primeiro numero: ");
							num1 = sc.nextDouble();

							System.out.print("Digite o segundo numero: ");
							num2 = sc.nextInt();
							
							resultado = num1 * num2;
							
							msg = "O resultado da multiplicacao e: " + resultado;
							menu2 = false;
						} else if(operacao == 4) { // se nao, se...
							System.out.println("");
							System.out.print("Digite o primeiro numero: ");
							num1 = sc.nextDouble();

							System.out.print("Digite o segundo numero: ");
							num2 = sc.nextInt();
							
							resultado = num1 / num2;
							
							msg = "O resultado da divisao e: " + resultado;
							menu2 = false;
						} else if(operacao == 5) { // se nao, se...
							System.out.println("");
							System.out.print("Digite a porcentagem: ");
							num1 = sc.nextDouble();

							System.out.print("Digite o valor inteiro: ");
							num2 = sc.nextInt();
							
							resultado = (num1*num2)/100;
							
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
							
							opcoes = sc.next();
							
							if(opcoes.equalsIgnoreCase("Operacoes")) { // se...
								System.out.println("");
								System.out.println("Voltando ao menu de operacoes...");
								System.out.println("");
								menu2 = true;
							} else if(opcoes.equalsIgnoreCase("Principal")) { // se nao, se...
								System.out.println("");
								System.out.println("Voltando ao menu principal...");
								System.out.println("");
								menu2 = false;
								menu1 = true;
							} else if(opcoes.equalsIgnoreCase("Encerrar")) { // se nao, se...
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
						} while(opcoesmenu); // While do menu de menus, repita se opcoesmenu for true
					} while(menu2); // While do menu de operacoes, repita se menu2 for true
					break; // Pare aqui
				case 2: // se a opcao selecionada for 2, faca isso...
					do { // faca o que estiver aqui
						System.out.println("");
						System.out.print("Digite o numero a ser verificado: ");
						num1 = sc.nextInt();
						sucessor = num1 + 1;
						antecessor = num1 - 1;

						System.out.println("");
						System.out.println("Numero escolhido: " + num1);
						System.out.println("Sucessor do numero: " + sucessor);
						System.out.println("Antecessor do numero: " + antecessor);
						
						do { // faca o que estiver aqui
							System.out.println("");
							System.out.println("-----------------------");
							System.out.println("Deseja verificar mais um numero, voltar ao menu principal ou deseja encerrar?");
							System.out.println("Use: Ante/Suce, Principal ou Encerrar");
							System.out.println("-----------------------");
							
							opcoes = sc.next();
							
							if(opcoes.equalsIgnoreCase("Ante/Suce")) { // se...
								System.out.println("");
								System.out.println("Voltando para verificar mais um numero...");
								System.out.println("");
								menu2 = true;
							} else if(opcoes.equalsIgnoreCase("Principal")) { // se nao, se...
								System.out.println("");
								System.out.println("Voltando ao menu principal...");
								System.out.println("");
								menu2 = false;
								menu1 = true;
							} else if(opcoes.equalsIgnoreCase("Encerrar")) { // se nao, se...
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
						} while(opcoesmenu); // While do menu de menus, repita se opcoesmenu for true
					} while(menu2); // While do Antecessor/Sucessor, repita se menu2 for true
					break; // pare aqui
				case 3: // se a opcao selecionada for 3, faca isso...
					do { // faca o que estiver aqui
						do { // faca o que estiver aqui
							System.out.println("");
							System.out.println("Deseja verificar pela idade ou pelo ano de nascimento? (I/A)");
							
							opcoes = sc.next();
							
							if(opcoes.equalsIgnoreCase("I")) { // se...
								System.out.println("");
								System.out.print("Digite a idade da pessoa:");
								
								idade = sc.nextInt();
								
								if(idade >= 18) { // se...
									System.out.println("");
									System.out.println("A pessoa é maior de idade!");
								} else { // se mao...
									System.out.println("");
									System.out.println("A pessoa é menor de idade!");
								}
								invalidOption = false;
							} else if(opcoes.equalsIgnoreCase("A")) { // se nao, se...
								System.out.println("");
								System.out.print("Digite o ano de nascimento: ");
								
								anoNasc = sc.nextInt();
								
								idade = 2020 - anoNasc;
								
								if(idade >= 18) { // se...
									System.out.println("");
									System.out.println("A pessoa é maior de idade!");
								} else { // se nao...
									System.out.println("");
									System.out.println("A pessoa é menor de idade!");
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
							System.out.println("Deseja verificar mais uma idade, voltar ao menu principal ou deseja encerrar?");
							System.out.println("Use: Idade, Principal ou Encerrar");
							System.out.println("-----------------------");
							
							opcoes = sc.next();
							
							if(opcoes.equalsIgnoreCase("Idade")) { // se...
								System.out.println("");
								System.out.println("Voltando para verificar mais uma idade...");
								System.out.println("");
								menu2 = true;
							} else if(opcoes.equalsIgnoreCase("Principal")) { // se nao, se
								System.out.println("");
								System.out.println("Voltando ao menu principal...");
								System.out.println("");
								menu2 = false;
								menu1 = true;
							} else if(opcoes.equalsIgnoreCase("Encerrar")) { // se nao, se...
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
						} while(opcoesmenu); // While do menu de menus, repita se opcoesmenu for true
					} while(menu2); // While do Verificador de maior de idade, repita se menu2 for true
					break; // pare aqui
				case 4: // se a opcao selecionada for 4, faca isso...
					do { // faça o que estiver aqui...
						System.out.println("");
						System.out.print("Digite o ano de nascimento da pessoa: ");
						
						anoNasc = sc.nextInt();
						
						idade = 2020 - anoNasc;
						
						System.out.println("");
						System.out.println("A pessoa tem " + idade + " anos!");
						do { // faça o que estiver aqui...
							System.out.println("");
							System.out.println("-----------------------");
							System.out.println("Deseja verificar mais uma idade, voltar ao menu principal ou deseja encerrar?");
							System.out.println("Use: Idade, Principal ou Encerrar");
							System.out.println("-----------------------");
							
							opcoes = sc.next();
							
							if(opcoes.equalsIgnoreCase("Idade")) { // se...
								System.out.println("");
								System.out.println("Voltando para verificar mais uma idade...");
								System.out.println("");
								menu2 = true;
							} else if(opcoes.equalsIgnoreCase("Principal")) { // se não, se...
								System.out.println("");
								System.out.println("Voltando ao menu principal...");
								System.out.println("");
								menu2 = false;
								menu1 = true;
							} else if(opcoes.equalsIgnoreCase("Encerrar")) { // se não, se...
								System.out.println("");
								System.out.println("Encerrando...");
								menu1 = false;
								menu2 = false;
								opcoesmenu = false;
							} else { // se não...
								System.out.println("");
								System.out.println("Opcao invalida... Tente novamente!");
								menu1 = false; 
								menu2 = false; 
								opcoesmenu = true; 
							}
						} while(opcoesmenu); // While do menu de menus, repita se opcoesmenu for true
					} while(menu2); // While da calculadora de idade, repita se menu2 for true
					break; // pare aqui
				case 5:
					do {
						System.out.println("");
						System.out.println("Olá, tudo bem? S/N");
						opcaoConversa = sc.next();
						
						conversa = (opcaoConversa.equalsIgnoreCase("S")) ? "Que bom!" : "Espero que melhore!";
						
						System.out.println(conversa + " Seu dia foi bom? S/N");
						
						opcaoConversa = sc.next();
						
						conversa = (opcaoConversa.equalsIgnoreCase("S")) ? "Que legal!" : "Puts, que chato cara :(";
						
						System.out.println(conversa + " Ja bebeu agua hoje? S/N");
						
						opcaoConversa = sc.next();
						
						conversa = (opcaoConversa.equalsIgnoreCase("S")) ? "Que bom! Nao podemos nos esquecer de se idratar" : "Nao? Entao vai beber!";
						
						System.out.println(conversa + "\nEstou indo agora, ok? Ok/Bye");
						
						opcaoConversa = sc.next();
						
						conversa = (opcaoConversa.equalsIgnoreCase("Ok")) ? "Até mais" : "Bye";
						
						System.out.println(conversa);
						
						do { // faça o que estiver aqui...
							System.out.println("");
							System.out.println("-----------------------");
							System.out.println("Deseja reiniciar a conversa, voltar ao menu principal ou deseja encerrar?");
							System.out.println("Use: Conversa, Principal ou Encerrar");
							System.out.println("-----------------------");
							
							opcoes = sc.next();
							
							if(opcoes.equalsIgnoreCase("Conversa")) { // se...
								System.out.println("");
								System.out.println("Reiniciando a conversa...");
								System.out.println("");
								menu2 = true;
							} else if(opcoes.equalsIgnoreCase("Principal")) { // se não, se...
								System.out.println("");
								System.out.println("Voltando ao menu principal...");
								System.out.println("");
								menu2 = false;
								menu1 = true;
							} else if(opcoes.equalsIgnoreCase("Encerrar")) { // se não, se...
								System.out.println("");
								System.out.println("Encerrando...");
								menu1 = false;
								menu2 = false;
								opcoesmenu = false;
							} else { // se não...
								System.out.println("");
								System.out.println("Opcao invalida... Tente novamente!");
								menu1 = false; 
								menu2 = false; 
								opcoesmenu = true; 
							}
						} while(opcoesmenu); // While do menu de menus, repita se opcoesmenu for true
					} while(menu2);
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
			} while(menu1); // While do meunu principal, repita se menu1 for true
		} catch(Exception e) { // Caso ocorra um erro, faca isso...
			System.out.println("Um erro ocorreu... Encerrando!");
		}
		sc.close(); // Fecha o Escaneamento do cmd
	}
}