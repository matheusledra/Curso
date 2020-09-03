package Curso.Estudos;

import java.awt.HeadlessException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class EstudoOptionPane {

	public static FileOutputStream criarArquivoLogin;
	public static DataOutputStream registrarLogin;
	public static FileInputStream carregarArquivoLogin;
	public static DataInputStream lerLogin;
	public static File login;

	public static void main(String[] args) throws InterruptedException, IOException {

		boolean sucesso = false;

		String textoBemVindo = "Olá, Bem-Vindo!" + "\nO que você deseja?" + "\n" + "\n1• Registrar" + "\n2• Logar"
				+ "\n3• Exlcuir sua Conta";

		String opcao = JOptionPane.showInputDialog(null, textoBemVindo, "Bem-Vindo", JOptionPane.QUESTION_MESSAGE);
		int opcaoEscolhida = Integer.parseInt(opcao);

		if (opcaoEscolhida == 1) {
			sucesso = registrar();
		} else if (opcaoEscolhida == 2) {
			sucesso = logar();
		} else if (opcaoEscolhida == 3) {
			excluirConta();
		} else {
			JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro!", JOptionPane.ERROR_MESSAGE);
		}

		if (sucesso) {
			JOptionPane.showMessageDialog(null, "Bem-Vindo nego tmj");
		}
	}

	public static boolean registrar() throws InterruptedException, IOException {

		boolean pastaExistente = (new File("Logins").isDirectory());
		if (!pastaExistente) {
			JOptionPane.showMessageDialog(null, "Criando banco de logins... 1 segundo!", "Banco de Logins!",
					JOptionPane.INFORMATION_MESSAGE);
			TimeUnit.SECONDS.sleep(1);
			boolean pastaCriada = (new File("Logins").mkdir());
			if (!pastaCriada) {
				JOptionPane.showMessageDialog(null, "Não foi possível criar o Banco de Logins!", "Erro!",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		String registrarUsario = JOptionPane.showInputDialog(null, "Digite um usuário", "Registro",
				JOptionPane.QUESTION_MESSAGE);

		String loginUsuario = "Logins//Login-" + registrarUsario + ".dat";
		boolean usuarioExistente = (new File(loginUsuario).exists());
		if (usuarioExistente) {
			JOptionPane.showMessageDialog(null, "Esse usuário já está cadastrado!", "Erro!", JOptionPane.ERROR_MESSAGE);
		} else {
			if (!registrarUsario.trim().isEmpty()) {
				if (registrarUsario.length() >= 6) {
					String registrarSenha = JOptionPane.showInputDialog(null, "Digite uma senha", "Registro",
							JOptionPane.QUESTION_MESSAGE);
					if (!registrarSenha.trim().isEmpty()) {
						if (registrarSenha.length() >= 8) {
							String registrarConfirmarSenha = JOptionPane.showInputDialog(null, "Confirme a Senha",
									"Registro", JOptionPane.QUESTION_MESSAGE);
							if (registrarConfirmarSenha.equals(registrarSenha)) {
								JOptionPane.showMessageDialog(null, "Registrado com Sucesso!", "Registrado!",
										JOptionPane.INFORMATION_MESSAGE);
								criarArquivoLogin = new FileOutputStream(loginUsuario);
								registrarLogin = new DataOutputStream(criarArquivoLogin);

								registrarLogin.writeUTF(registrarUsario);
								registrarLogin.writeUTF(registrarSenha);
								return true;
							} else {
								JOptionPane.showMessageDialog(null, "As senhas não coincidem!", "Erro",
										JOptionPane.ERROR_MESSAGE);
								return false;
							}
						} else {
							JOptionPane.showMessageDialog(null, "Sua senha não pode ser menos que 8 digitos!", "Erro",
									JOptionPane.ERROR_MESSAGE);
							return false;
						}
					} else {
						JOptionPane.showMessageDialog(null, "Sua senha não pode ficar em branco!", "Erro",
								JOptionPane.ERROR_MESSAGE);
						return false;
					}
				} else {
					JOptionPane.showMessageDialog(null, "Seu usuário precisa ter no minímo 6 digitos!", "Erro",
							JOptionPane.ERROR_MESSAGE);
					return false;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Seu usuário não pode ficar em branco!", "Erro",
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		}
		return false;
	}

	public static boolean logar() throws HeadlessException, IOException {
		String loginUsuario = JOptionPane.showInputDialog(null, "Digite seu usuário", "Login",
				JOptionPane.QUESTION_MESSAGE);

		String arquivoLogin = "Logins//Login-" + loginUsuario + ".dat";

		try {
			login = (new File(arquivoLogin));
			carregarArquivoLogin = new FileInputStream(arquivoLogin);
			lerLogin = new DataInputStream(carregarArquivoLogin);

			if (!login.exists()) {
				JOptionPane.showMessageDialog(null, "Esse Login não existe!", "Erro!", JOptionPane.ERROR_MESSAGE);
				return false;
			} else {
				String senhaLoginUsuario = JOptionPane.showInputDialog(null,
						"Bem-Vindo " + lerLogin.readUTF() + "!\nDigite sua senha", "Login",
						JOptionPane.QUESTION_MESSAGE);
				if (senhaLoginUsuario.equals(lerLogin.readUTF())) {
					JOptionPane.showMessageDialog(null, "Logado com sucesso!", "Bem-Vindo",
							JOptionPane.INFORMATION_MESSAGE);
					return true;
				} else {
					JOptionPane.showMessageDialog(null, "A senha está incorreta!", "Erro!", JOptionPane.ERROR_MESSAGE);
					return false;
				}
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Login inexistente!", "Erro!", JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}

	public static void excluirConta() throws HeadlessException, IOException {
		String conta = JOptionPane.showInputDialog(null, "Digite seu usuário", "Excluir Conta",
				JOptionPane.QUESTION_MESSAGE);
		
		try {
			String lerConta = "Logins//Login-" + conta + ".dat";

			login = (new File(lerConta));
			carregarArquivoLogin = new FileInputStream(lerConta);
			lerLogin = new DataInputStream(carregarArquivoLogin);

			if (login.exists()) {
				String verificarSenha = JOptionPane.showInputDialog(null,
						lerLogin.readUTF() + " para excluir sua conta, você precisa digitar sua senha!", "Excuir Conta",
						JOptionPane.INFORMATION_MESSAGE);

				if (verificarSenha.equals(lerLogin.readUTF())) {
					int confirmacaoExclusao = JOptionPane.showConfirmDialog(null, "Deseja realmente apagar sua conta?",
							"Confirmação", JOptionPane.WARNING_MESSAGE);
					
					if (confirmacaoExclusao == JOptionPane.YES_OPTION) {
						carregarArquivoLogin.close();
						lerLogin.close();
						login.delete();
						JOptionPane.showMessageDialog(null, "Conta excluída com sucesso!", "Conta excluida!",
								JOptionPane.INFORMATION_MESSAGE);
					} else if (confirmacaoExclusao == JOptionPane.CANCEL_OPTION) {
						JOptionPane.showMessageDialog(null, "Exclusão cancelada!", "Cancelado!",
								JOptionPane.INFORMATION_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Senha incorreta!", "Erro!", JOptionPane.ERROR_MESSAGE);
				}
			} 
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Essa conta não existe!", "Erro!", JOptionPane.ERROR_MESSAGE);
		}
	}
}