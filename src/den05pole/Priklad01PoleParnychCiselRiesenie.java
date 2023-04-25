package den05pole;

// ÚLOHA
public class Priklad01PoleParnychCiselRiesenie {

	/*
	 * Program vytiahne zo zadaného poľa iba párne čísla a tie skopíruje do
	 * výstupného poľa 
	 * Vstup: 1, 2, 3, 4, 5 
	 * Výstup: 2, 4
	 */
	public static void main(String[] args) {
		int[] pole = { 7, 12, 5, 32, 1, 22 };

		// Najprv zistím, koľko mám v poli párnych čísel
		int pocetParnychCisel = 0;
		for (int cislo : pole) {
			if (cislo % 2 == 0) {
				pocetParnychCisel++;
			}
		}

		// Vytvorí pole dĺžky length, ktorého hodnoty sú samé nuly:
		int[] vystup = new int[pocetParnychCisel];
		int index = 0;
		// { 12, 4, 32, 22, 0, 0 }
		for (int cislo : pole) {
			if (cislo % 2 == 0) {	// kontrola na parne cislo
				vystup[index++] = cislo;
				// index = index + 1; - je to to iste
			}
		}
		
		for (int x : vystup) {
			System.out.println(x);
		}
		
	}
}
