package projetocurso.exercicios;

import javax.swing.JOptionPane;
import projetocurso.exercicios.CadUsuarioCarro.CadastroUsuario;
import projetocurso.exercicios.Compromissos.Pessoa;
import projetocurso.exercicios.Faculdade.Professor;
import projetocurso.exercicios.Funcionario.Atendente;
import projetocurso.exercicios.Funcionario.Funcionario;
import projetocurso.exercicios.Funcionario.Gerente;
import projetocurso.exercicios.PetShop.PetShop;

public class ClasseExecutora {

    public static void main(String[] args) {
        try {
            boolean executarNovamente = false;
            do {
                int opcaoEscolhida = 0;
                String exercicioOpcoes = "Escolha um exercício: \n"
                        + "\n1 - Orientação Objetos - Exerc 1 (Get/Set Cadastro Usuário)"
                        + "\n2 - Orientação Objetos - Exerc 2 (Pet Shop)"
                        + "\n3 - ArrayList/Orientação Objetos - Exerc 3 (Compromissos)"
                        + "\n4 - Orientação Objetos - Exerc 4 (Funcionário)";

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
                    case 3:
                        exerc3Compromissos();
                        executarNovamente = false;
                        break;
                    case 4:
                        exerc4Funcionario();
                        executarNovamente = false;
                        break;
                    case 5:
                        exerc5Faculdade();
                        executarNovamente = false;
                        break;
                    case 6:
                        exerc6Faculdade2();
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
        String nomeDono = "", nomePet = "", tipoPet = "", corPet = "";
        int idadeDono = 0;
        boolean camposVaziosDono = false, camposVaziosPet = false;

        JOptionPane.showMessageDialog(null, "Pet-Shop PetFeliz \n\nVamos começar o cadastro do seu pet", "Pet-Shop", JOptionPane.INFORMATION_MESSAGE);

        do {
            nomeDono = JOptionPane.showInputDialog(null, "Digite seu nome ", "Dono Pet", JOptionPane.QUESTION_MESSAGE);
            idadeDono = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade ", "Dono Pet", JOptionPane.QUESTION_MESSAGE));

            if (!"".equals(nomeDono) && idadeDono > 1) {
                camposVaziosDono = false;
            } else {
                camposVaziosDono = true;
            }
            petShop.setDonoPet(nomeDono, idadeDono);

        } while (camposVaziosDono);

        int qntdPets = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos pets você tem? ", "Quantidade Pets", JOptionPane.QUESTION_MESSAGE));

        for (int i = 0; i < qntdPets; i++) {
            do {
                nomePet = JOptionPane.showInputDialog(null, "Digite o nome do seu pet", "Pet", JOptionPane.QUESTION_MESSAGE);
                tipoPet = JOptionPane.showInputDialog(null, "Digite o tipo do seu pet \nCachorro, gato, etc. ", "Pet", JOptionPane.QUESTION_MESSAGE);
                corPet = JOptionPane.showInputDialog(null, "Digite a cor do seu pet ", "Pet", JOptionPane.QUESTION_MESSAGE);

                if (!"".equals(nomePet) && !"".equals(tipoPet) && !"".equals(corPet)) {
                    camposVaziosPet = false;
                } else {
                    camposVaziosPet = true;
                    JOptionPane.showMessageDialog(null, "Erro! \nUm ou mais campos ficaram vazios!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                petShop.setPet(nomePet, tipoPet, corPet);
                petShop.getDonoPet().addPet(nomePet);
                petShop.setPet();
            } while (camposVaziosPet);
        }

        String informacoesPet = "Informações do seu Pet: \n\nNome do Dono: " + petShop.getDonoPet().getNome()
                + "\nIdade do Dono: " + petShop.getDonoPet().getIdade()
                + "\n====================\n";
        for (int i = 0; i < petShop.getPets().size(); i++) {
            informacoesPet += "Nome do Pet: " + petShop.getPets().get(i).getNome()
                    + "\nTipo do Pet: " + petShop.getPets().get(i).getTipo()
                    + "\nCor do Pet: " + petShop.getPets().get(i).getCor()
                    + "\n====================\n";
        }

        JOptionPane.showMessageDialog(null, "Pet-Shop PetFeliz \n\n" + informacoesPet, "Pet-Shop", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void exerc3Compromissos() {
        try {
            Pessoa pessoa = new Pessoa();

            String nome = JOptionPane.showInputDialog(null, "Digite seu nome", "Nome", JOptionPane.QUESTION_MESSAGE);
            String sexo = JOptionPane.showInputDialog(null, "Digite seu sexo", "Sexo", JOptionPane.QUESTION_MESSAGE);

            pessoa.setPessoa(nome, sexo);

            int qntdCompromissos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos compromissos você tem?", "Quantidade Compromissos", JOptionPane.QUESTION_MESSAGE));

            for (int i = 0; i < qntdCompromissos; i++) {
                String titulo = JOptionPane.showInputDialog(null, "Digite o título do " + (i + 1) + "º compromisso", "Titulo", JOptionPane.QUESTION_MESSAGE);
                String tipo = JOptionPane.showInputDialog(null, "Digite o tipo do compromisso \n\nOnline, presencial, etc.", "Tipo", JOptionPane.QUESTION_MESSAGE);
                String data = JOptionPane.showInputDialog(null, "Digite a data do compromisso \n\nDD/MM/AAAA", "Data", JOptionPane.QUESTION_MESSAGE);
                String local = JOptionPane.showInputDialog(null, "Digite o local do compromisso", "Local", JOptionPane.QUESTION_MESSAGE);

                pessoa.setCompromisso(titulo, tipo, data, local);
                pessoa.setCompromisso();
            }

            String compromissosSalvos = "Compromissos de " + pessoa.getNome()
                    + "\n\n=====================================\n";

            for (int i = 0; i < qntdCompromissos; i++) {
                compromissosSalvos += "Compromisso " + (i + 1)
                        + "\nTítulo - " + pessoa.getCompromisso(i).getTitulo()
                        + "\nTipo - " + pessoa.getCompromisso(i).getTipo()
                        + "\nData - " + pessoa.getCompromisso(i).getData()
                        + "\nLocal - " + pessoa.getCompromisso(i).getLocal()
                        + "\n=====================================\n";

            }

            JOptionPane.showMessageDialog(null, compromissosSalvos, "Compromissos", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro!\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void exerc4Funcionario() {

        Gerente funGerente = new Gerente();
        Atendente funAtendente = new Atendente();

        String nome = JOptionPane.showInputDialog(null, "Digite o nome do funcionário", "Nome", JOptionPane.QUESTION_MESSAGE);
        String departamento = JOptionPane.showInputDialog(null, "Digite o departamento do funcionário", "Departamento", JOptionPane.QUESTION_MESSAGE);
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário do funcionário", "Salário", JOptionPane.QUESTION_MESSAGE));
        String rg = JOptionPane.showInputDialog(null, "Digite o rg do funcionário", "RG", JOptionPane.QUESTION_MESSAGE);
        String entrada = JOptionPane.showInputDialog(null, "Digite a data de entrada do funcionário", "Entrada", JOptionPane.QUESTION_MESSAGE);

        funAtendente.setNome(nome);
        funAtendente.setDepartamento(departamento);
        funAtendente.setSalario(salario);
        funAtendente.setRg(rg);
        funAtendente.setDataEntrada(entrada);

        JOptionPane.showMessageDialog(null, "Funcionário: \n\nNome: " + funAtendente.getNome() + "\nDepartamento: " + funAtendente.getDepartamento() + "\nSalario: R$" + funAtendente.getSalario() + "\nRG: " + funAtendente.getRg() + "\nData de Entrada: " + funAtendente.getEntradaBanco() + "\n\nGanho Anual: " + funAtendente.calculaGanhoAnual());

        boolean aumento = ("S".equalsIgnoreCase(JOptionPane.showInputDialog(null, "Deseja dar um aumento ao funcionário? S/N"))) ? true : false;

        if (aumento) {
            funAtendente.recebeAumento(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o aumento")));

            JOptionPane.showMessageDialog(null, "Funcionário: \n\nNome: " + funAtendente.getNome() + "\nDepartamento: " + funAtendente.getDepartamento() + "\nSalario: R$" + funAtendente.getSalario() + "\nRG: " + funAtendente.getRg() + "\nData de Entrada: " + funAtendente.getEntradaBanco() + "\n\nGanho Anual: " + funAtendente.calculaGanhoAnual());
        }
    }

    public static void exerc5Faculdade() {
        String nomeProfessor = JOptionPane.showInputDialog(null, "Digite o nome do professor");
        double salarioProfessor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário do professor"));
        int horasDeAula = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas de aula"));

        Professor prof = new Professor();
        prof.setNome(nomeProfessor);
        prof.setSalario(salarioProfessor);
        prof.setHorasDeAula(horasDeAula);

        JOptionPane.showMessageDialog(null, prof.getInfo());
    }
    
    public static void exerc6Faculdade2() {
        projetocurso.interfaces.Professor prof = new projetocurso.interfaces.Professor();
        
        prof.setNome("Prof");
        prof.setDepto("Aula");
        prof.setHorasDeAula(500);
        prof.setSalario(1500);
        
        System.out.println(prof.getInfo());
    }
}
