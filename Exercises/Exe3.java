package Curso.Exercises;

import java.util.*;

public class Exe3 {

    // Informar um saldo e imprimir o saldo com reajuste de 1%

    public static void main(String[] args) {

        double saldo;
        double reajuste;
        double saldoFinal;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um saldo: ");
        saldo = sc.nextDouble();

        reajuste = saldo * 0.01;
        saldoFinal = reajuste + saldo;

        System.out.println(saldoFinal);

    }

}
