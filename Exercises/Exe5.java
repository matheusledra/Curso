package Curso.Exercises;

import java.util.Scanner;

public class Exe5 {

    //Crie um algoritmo que leia o valor do salario minimo e o valor do salario de um usuario,
    //calcule a quantidade de salarios minimos esse usuario ganha e imprima o resultado.
    //(1SM=R$1045,00)

    public static void main(String[] args) {

        double salarioMinimo = 1045;
        double salarioUsuario;
        double salarios;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario do usuario: ");
        salarioUsuario = sc.nextDouble();

        salarios = salarioUsuario / salarioMinimo;

        System.out.println("Este usuario ganha " + salarios + " salarios minimos!");

    }
}
