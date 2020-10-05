package Curso;

import java.util.Comparator;
import java.util.Random;
import java.util.Vector;

public class Vec {

	public static void main(String[] args) {
		Random rdNumeros = new Random();
		Vector vetNumeros = new Vector();

		for (int i = 0; i < 100; i++) {
			vetNumeros.add(i, rdNumeros.nextInt(1000));
		}
		vetNumeros.sort(Comparator.naturalOrder());
		for (int i = 0; i < vetNumeros.size(); i++) {
			System.out.println("[" + i + "] = " + vetNumeros.get(i));
		}

		System.exit(0);
	}
}
