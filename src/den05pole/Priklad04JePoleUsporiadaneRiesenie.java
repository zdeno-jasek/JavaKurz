package den05pole;

// ÚLOHA
public class Priklad04JePoleUsporiadaneRiesenie {

	/*
	 * Program vypíše pre dané pole, či je usporiadané.
	 * Vstup: 1, 7, 10
	 * Výstup: áno
	 */
	public static void main(String[] args) {
		int[] pole = { 7, 12, 12, 32, 1, 220 };
		
		boolean poleJeUsporiadane = true;
		for (int i = 0; i < pole.length - 1; i++) {
			// poleJeUsporiadane &= pole[i] <= pole[i+1]; - alternativa
			if ( pole[i] > pole[i+1] ) {
				poleJeUsporiadane = false;
			}
		}
		
		if ( poleJeUsporiadane ) {
			System.out.println("Toto pole je usporiadané.");
		} else {
			System.out.println("Toto pole nie je usporiadané.");
		}
		
	}
}
