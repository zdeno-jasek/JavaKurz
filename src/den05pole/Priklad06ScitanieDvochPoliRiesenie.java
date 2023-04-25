package den05pole;

// ÚLOHA
public class Priklad06ScitanieDvochPoliRiesenie {

	/*
	 * Program sčíta hodnoty dvoch rôzne veľkých polí 
	 * a výsledok uloží do nového poľa
	 * 
	 */
	public static void main(String[] args) {
		int[] scitanec1 = { 1, 3,  4, 5, 2, 3 };
		int[] scitanec2 = { 2, 3, 11, 4, 2 };
		// vysledok         3  6  15  9  4  3
				
		int[] vysledok = new int[ Math.max( scitanec1.length, scitanec2.length ) ];

		for (int i = 0; i < vysledok.length; i++) {
			if ( i < scitanec1.length ) {
				if ( i < scitanec2.length ) {
					vysledok[i] = scitanec1[i] + scitanec2[i];								
				} else {
					vysledok[i] = scitanec1[i];													
				}
			} else {
				vysledok[i] = scitanec2[i];																	
			}
		}
		
		for (int hodnota : vysledok) {
			System.out.println( hodnota );
		}
	}
}
