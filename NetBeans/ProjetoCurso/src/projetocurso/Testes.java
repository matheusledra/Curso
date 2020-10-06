package projetocurso;

import java.util.Scanner;

public class Testes {

    public static void main(String[] args) {
        Scanner scEntrada = new Scanner(System.in);
        Pessoa aluno = new Pessoa();
        int anoNasc;

        aluno.setNome("Matheus");
        aluno.setAltura(1.70);
        aluno.setVoz("Blá Blá");

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Altura: " + aluno.getAltura());
        System.out.println("Voz: " + aluno.getVoz());

        System.out.println("Digite o ano de nascimento para saber a idade: ");
        anoNasc = scEntrada.nextInt();

        System.out.println("Idade: " + aluno.getIdadeAnoNasc(anoNasc));
    }
}
