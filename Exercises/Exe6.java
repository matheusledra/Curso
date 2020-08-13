package Curso.Exercises;

import java.util.*;

public class Exe6 {

    // Desenvolva um algoritmo em Java que leia um numero inteiro e imprima o seu
    // antecessor e seu sucessor.

    public static void main(String[] args) {

        int num;
        int antecessor;
        int sucessor;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        num = sc.nextInt();

        antecessor = num - 1;
        sucessor = num + 1;

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

    }

}
