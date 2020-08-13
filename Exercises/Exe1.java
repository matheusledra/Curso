package Curso.Exercises;

import java.util.*;

public class Exe1 {

    /*    Faca um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
        mostre-a expressa em dias. Leve em consideracao o ano com 365 dias e o mes com 30.
        (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
     */

    public static void main(String[] args) {

        int anos;
        int meses;
        int dias;

        int anosDias;
        int mesesDias;

        int diasVividos;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos anos tem, meses e dias (3 2 15): ");
        anos = sc.nextInt();
        meses = sc.nextInt();
        dias = sc.nextInt();

        anosDias = anos * 365;
        mesesDias = meses * 30;

        diasVividos = dias + anosDias + mesesDias;

        System.out.println("Você viveu " + diasVividos + " dias!");

    }

}
