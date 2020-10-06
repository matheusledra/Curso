package projetocurso;

import java.util.concurrent.ThreadLocalRandom;

public class PrimeiroExercNetBeans {

    public static void main(String[] args) {
    }

    public static void exercicio1() {
        /*
         *  Criar um vetor de 20 números, preencher com números aleatórios,
         *  fazer um segundo vetor, contendo somente os números pares, nos
         *  ímpares colocar o valor 0.
        */
        
        int[] vetNumeros = new int[20];
        int[] vetNumerosPares = new int[20];

        System.out.println("Vetor gerado: ");
        for (int i = 0; i < vetNumeros.length; i++) {
            vetNumeros[i] = ThreadLocalRandom.current().nextInt(1, 50);
            System.out.println("vetNumeros[" + i + "] " + vetNumeros[i]);

            if (vetNumeros[i] % 2 == 0) {
                vetNumerosPares[i] = vetNumeros[i];
            } else {
                vetNumerosPares[i] = 0;
            }
        }

        System.out.println("\nSegundo vetor: ");
        for (int i = 0; i < vetNumerosPares.length; i++) {
            System.out.println("vetNumerosPares[" + i + "] " + vetNumerosPares[i]);
        }
    }
    
    public static void exercicio2() {
        /*
         * Criar uma matriz 10x5 com valores aleatórios e apresentala.
        */
        int[][] matrizNumeros = new int[10][5];

        for (int[] i : matrizNumeros) {
            System.out.print("| ");
            for (int j : i) {
                j = ThreadLocalRandom.current().nextInt(1, 500);
                System.out.print(String.format("%3d | ", j));
            }
            System.out.println("");
        }
    }
}
