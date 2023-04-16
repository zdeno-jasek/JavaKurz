package den04while;

// VYSVETLENIE
public class Priklad01WhileCyklus {

	/*
	 * Tento program iba demonštruje WHILE cyklus.
	 * Na začiatok ide o jednoduchý prepis FOR cyklu pomocou WHILE cyklu.
	 * V praxi to však takto nerobíme - ak sa dá FOR cyklus použiť,
	 * vždy ho uprednostníme.
	 * 
	 * Sú však prípady, kedy nám FOR cyklus nestačí.
	 */
	public static void main(String[] args) {
		System.out.println( "10 čísel pomocou WHILE cyklu");
		// Vo WHILE cykle dávam do zátvoriek podmienku, 
		// ktorá musí byť splnená na to,
		// aby cyklus mohol pokračovať.
		// Cyklus skončí, ak podmienka splnená nie je.
		int i = 1;
		while ( i <= 10 ) {
			System.out.println(i);
			i++;
		}
		
		System.out.println( "10 čísel pomocou FOR cyklu");
		// Na porovnanie FOR-cyklus, ktorý robí to isté:
		for (int j = 1; j <= 10; j++) {
			System.out.println(j);			
		}
		
	}
}
