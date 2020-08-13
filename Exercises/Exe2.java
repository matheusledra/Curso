package Curso.Exercises;

public class Exe2 {

    /*    Fazer um programa que imprima a media aritmatica dos numeros 8,9 e 7. A media dos
        numeros 4, 5 e 6. A soma das duas medias. A media das medias.
     */

    public static void main(String[] args) {

        int sete = 7;
        int oito = 8;
        int nove = 9;

        int quatro = 4;
        int cinco = 5;
        int seis = 6;

        int mediaMaiores;
        int mediaMenores;

        double somaMedias;

        double mediaMedias;

        mediaMaiores = (sete + oito + nove) / 3;
        System.out.println("Media maiores: " + mediaMaiores);   // 8

        mediaMenores = (quatro + cinco + seis) / 3;
        System.out.println("Media menores: " + mediaMenores);   // 5

        somaMedias = mediaMaiores + mediaMenores;
        System.out.println("Soma das medias: " + somaMedias);   // 13

        mediaMedias = somaMedias / 2;
        System.out.println("Media das medias: " + mediaMedias);  // 6/7 - 6,5

    }

}
