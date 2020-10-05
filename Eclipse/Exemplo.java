package Curso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo {
    
    //Classe Main - de execução
    public static void main(String[] args) {
        
        //scanner de entradas no sistema
        Scanner sc = new Scanner(System.in);
        //inicialização de variável nome
        int idade = 0;
        
        //tente fazer isso
        try {
            //imprimindo texto
            System.out.println("Escreva sua idade:");
            //o valor esperado em idade é um inteiro, digite um texto e ira gerar erro
            idade = sc.nextInt();
        } catch (InputMismatchException e) {//tratamento e/ou mensagem para erro especifico,
            //neste caso tentar buscar um valor inteiro do scanner quando se recebeu uma string
            System.out.println("Erro na entrada do valor de idade.");
            e.printStackTrace();
        } catch (Exception e) {//se der erro o capture e faça isso
            //tratamento e/ou mensagem para erro genérico
            System.out.println("Erro generico.");
            e.printStackTrace();            
        } finally {//independente do que se tente ou consiga fazer, execute isso
            //o scanner sempre deve ser fechado para não alocar recurso
            sc.close();
        }
    }
}