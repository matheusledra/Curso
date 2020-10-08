package projetoHerancaPrincipal;

import java.util.Scanner;
import projetoHerancaClasses.Aluno;
import projetoHerancaClasses.Professor;

public class ProjetoHerenca {
    
    public static void main(String[] args) {
        Scanner scEntrada = new Scanner(System.in);
        Professor prof = new Professor("Ramonzera");
        String turma, opcao;
        boolean continuaInserindo = true;
        
        System.out.print("Informe o nome da Turma: ");
        turma = scEntrada.nextLine();
        
        while(continuaInserindo) {
            System.out.println("Bem-Vindo!");
            System.out.println("1 - Inserir Aluno | 2 - Ver Alunos | 0 - Sair");
            opcao = scEntrada.nextLine();
            
            switch(opcao) {
                case "1":
                    Aluno novoAluno = new Aluno();
                    System.out.print("Qual o nome do Aluno? ");
                    novoAluno.setNome(scEntrada.nextLine());
                    novoAluno.setTurma(turma);
                    break;
                case "2":
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }
}
