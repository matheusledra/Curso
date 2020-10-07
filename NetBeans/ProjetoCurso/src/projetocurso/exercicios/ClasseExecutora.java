package projetocurso.exercicios;

import javax.swing.JOptionPane;

public class ClasseExecutora {

    public static void main(String[] args) {
        try {
            boolean executarNovamente = false;
            do {
                int opcaoEscolhida = 0;
                String exercicioOpcoes = "Escolha um exercício: \n"
                        + "\n1 - Orientação Objetos - Exerc 1 (Get/Set Cadastro Usuário)"
                        + "\n2 - Orientação Objetos - Exerc 2 (Pet Shop)";

                String opcaoEscolhidaString = JOptionPane.showInputDialog(null, exercicioOpcoes, "Exercícios", JOptionPane.QUESTION_MESSAGE);
                
                if (!(opcaoEscolhidaString == null)) {
                    opcaoEscolhida = Integer.parseInt(opcaoEscolhidaString);
                } else {
                    System.exit(0);
                }

                switch (opcaoEscolhida) {
                    case 1:
                        exerc1CadastroUsuario();
                        executarNovamente = false;
                        break;
                    case 2:
                        exerc2PetShop();
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

        String informacoesUsuario = "Cadastrado com sucesso! \n\nNome: " + cadastroUsuario.getName() + "\nIdade: " + cadastroUsuario.getIdade();

        String usuarioTemCarro = JOptionPane.showInputDialog(null, "Você tem um carro? S/N", "Tem carro?", JOptionPane.QUESTION_MESSAGE);

        if (usuarioTemCarro.equalsIgnoreCase("S")) {
            String nomeCarro = JOptionPane.showInputDialog(null, "Digite o nome do carro", "Cadastro", JOptionPane.QUESTION_MESSAGE);
            int anoCarro = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano do carro", "Cadastro", JOptionPane.QUESTION_MESSAGE));

            cadastroUsuario.setCarro(nomeCarro, anoCarro);
            informacoesUsuario += "\n\nNome do carro do usuário: " + cadastroUsuario.getCarro().getNomeCarro() + "\nAno do carro: " + cadastroUsuario.getCarro().getAnoCarro();
        }

        JOptionPane.showMessageDialog(null, informacoesUsuario, "Cadastrado!", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void exerc2PetShop() {
        PetShop petShop = new PetShop();
        String nomeDono = "", nomePet = "", tipoPet = "", corPet = "", idadeDonoString = "";
        int idadeDonoInt = 0;
        boolean camposVazios = false;

        JOptionPane.showMessageDialog(null, "Pet-Shop PetFeliz \n\nVamos começar o cadastro do seu pet", "Pet-Shop", JOptionPane.INFORMATION_MESSAGE);

        do {
            nomeDono = JOptionPane.showInputDialog(null, "Digite seu nome ", "Dono Pet", JOptionPane.QUESTION_MESSAGE);
            idadeDonoString = JOptionPane.showInputDialog(null, "Digite sua idade ", "Dono Pet", JOptionPane.QUESTION_MESSAGE);
            nomePet = JOptionPane.showInputDialog(null, "Digite o nome do seu pet", "Pet", JOptionPane.QUESTION_MESSAGE);
            tipoPet = JOptionPane.showInputDialog(null, "Digite o tipo do seu pet \nCachorro, gato, etc. ", "Pet", JOptionPane.QUESTION_MESSAGE);
            corPet = JOptionPane.showInputDialog(null, "Digite a cor do seu pet ", "Pet", JOptionPane.QUESTION_MESSAGE);

            if (!"".equals(nomeDono) && !"".equals(idadeDonoString) && !"".equals(nomePet) && !"".equals(tipoPet) && !"".equals(corPet)) {
                camposVazios = false;
                idadeDonoInt = Integer.parseInt(idadeDonoString);
            } else {
                camposVazios = true;
                JOptionPane.showMessageDialog(null, "Erro! \nUm ou mais campos ficaram vazios!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (camposVazios);

        petShop.setDonoPet(nomeDono, idadeDonoInt, nomePet);
        petShop.setPet(nomePet, tipoPet, corPet);

        String informacoesPet = "Informações do seu Pet: \n\nNome do Dono: " + petShop.getDonoPet().getNome()
                + "\nIdade do Dono: " + petShop.getDonoPet().getIdade()
                + "\n\nNome do Pet: " + petShop.getPet().getNome()
                + "\nTipo do Pet: " + petShop.getPet().getTipo()
                + "\nCor do Pet: " + petShop.getPet().getCor();

        JOptionPane.showMessageDialog(null, "Pet-Shop PetFeliz \n\n" + informacoesPet, "Pet-Shop", JOptionPane.INFORMATION_MESSAGE);
    }
}
