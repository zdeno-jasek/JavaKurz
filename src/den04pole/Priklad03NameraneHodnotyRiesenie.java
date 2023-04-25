package den04pole;

// ÚLOHA
public class Priklad03NameraneHodnotyRiesenie {

	/*
	 * Program spočíta priemernú teplotu nameraných hodnôt.
	 * Vstup: namerané hodnoty v stupňoch Celzia
	 * Výstup: priemerná hodnota
	 */
	public static void main(String[] args) {
		double[] nameraneHodnoty = { 22.3, 25, 22.8, 27.3, 27.1, 25.1, 29 };
		
		double spolu = 0;
		for (double nameranaHodnota : nameraneHodnoty) {
			spolu += nameranaHodnota;
		}

//		for (int i = 0; i < nameraneHodnoty.length; i++) {
//			spolu += nameraneHodnoty[i];
//		}
		double priemernaHodnota = spolu / nameraneHodnoty.length;
		System.out.println( priemernaHodnota );
	}
}
