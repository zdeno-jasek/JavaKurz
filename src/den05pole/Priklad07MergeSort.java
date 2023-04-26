package den05pole;

// ÚLOHA
public class Priklad07MergeSort {

	/*
	 * Program zoberie dve usporiadané polia a spojí ich prvky dohromady tak,
	 * aby výsledkom bolo znovu usporiadané pole.
	 */
	public static void main(String[] args) {
		int[] prvePole =  { 1, 2, 9, 15, 28 };
		int[] druhePole = { 2, 4, 5, 11, 12 };
		// vysledok = 1, 2, 2, 4, 5, 9, 11, 12, 15, 28

		int[] vysledok = new int[ prvePole.length + druhePole.length ];
		
		int indexPrvy = 0;
		int indexDruhy = 0;
		int indexVysledok = 0;

		while ( indexPrvy + indexDruhy < vysledok.length ) {
			// najprv je osetrenie hranic, aby sa nestalo, ze index > dlzka pola
			if ( indexPrvy >= prvePole.length ) {
				// prve pole sa uz minulo
				vysledok[indexVysledok++] = druhePole[indexDruhy++];				
			} else if ( indexDruhy >= druhePole.length ) {
				// druhe pole sa uz minulo
				vysledok[indexVysledok++] = prvePole[indexPrvy++];				
			} else 
				// porovnanie prvkov a vybranie najmensieho
			if ( prvePole[indexPrvy] <= druhePole[indexDruhy] ) {
				vysledok[indexVysledok++] = prvePole[indexPrvy++];
			} else {
				vysledok[indexVysledok++] = druhePole[indexDruhy++];
			}
		}
		
		for (int hodnota : vysledok) {
			System.out.println(hodnota);
		}
		
	}
}
