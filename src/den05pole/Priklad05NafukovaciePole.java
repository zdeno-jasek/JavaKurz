package den05pole;

import java.util.Arrays;

// VYSVETLENIE
public class Priklad05NafukovaciePole {

	/**
	 * Program vytvorí nové pole, ktoré obsahuje rovnaké hodnoty ako predošlé,
	 * ale plus ešte jednu novú hodnotu navyše.
	 */
	public static void main(String[] args) {
		int[] pole = { 7, 12, 4, 32, 1, 22 }; //, 42
		int novaHodnota = 42;

		// Skopíruje celé pôvodné pole, t.j. každú jeho hodnotu, ale nové pole je o 1 dlhšie
		int[] vystup = Arrays.copyOf(pole, pole.length + 1 );
		// Na posledné miesto nového pole zaradíme novú hodnotu
		vystup[pole.length] = novaHodnota;

		for (int hodnota : vystup) {
			System.out.println( hodnota );
		}
	}
}
