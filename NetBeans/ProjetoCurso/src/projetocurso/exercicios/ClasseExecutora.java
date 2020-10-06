package projetocurso.exercicios;

import javax.swing.JOptionPane;

public class ClasseExecutora {

    public static void main(String[] args) {
        try {
            boolean executarNovamente = false;
            do {
                String exercicioOpcoes = "Escolha um exercício: \n\n"
                        + "1 - Orientação Objetos - Exerc 1 (Get/Set Cadastro Usuário)";

                int opcaoEscolhida = Integer.parseInt(JOptionPane.showInputDialog(null, exercicioOpcoes, "Exercícios", JOptionPane.QUESTION_MESSAGE));

                switch (opcaoEscolhida) {
                    case 1:
                        exerc1CadastroUsuario();
                        executarNovamente = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Exercício inválido! \"" + opcaoEscolhida + "\"");
                        executarNovamente = true;
                        break;
                }

                if (!executarNovamente) {
                    String execNovamente = JOptionPane.showInputDialog(null, "Deseja voltar a lista de exercícios? S/N", "Voltar?", JOptionPane.QUESTION_MESSAGE);

                    executarNovamente = (execNovamente.equalsIgnoreCase("S")) ? true : false;
                }

            } while (executarNovamente);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro! \n" + e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
        } finally {
            System.exit(0);
        }
    }

    public static void exerc1CadastroUsuario() {
        CadastroUsuario cadastroUsuario = new CadastroUsuario();

        cadastroUsuario.setName(JOptionPane.showInputDialog(null, "Digite o nome do usuário", "Cadastro", JOptionPane.QUESTION_MESSAGE));
        cadastroUsuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do usuário", "Cadastro", JOptionPane.QUESTION_MESSAGE)));

        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso! \n\nNome: " + cadastroUsuario.getName() + "\nIdade: " + cadastroUsuario.getIdade(), "Cadastrado!", JOptionPane.INFORMATION_MESSAGE);
    }
}
