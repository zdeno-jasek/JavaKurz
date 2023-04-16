package den04while;

// ÚLOHA
public class Priklad03MalePismena {

	/*
	 * Program má napísať, koľko malých písmen je na začiatku textu po prvé veľké písmeno.
	 * Vstup: toto je veta z Malých písmen
	 * výstup: 11 (počítajú sa iba písmená, nie medzery alebo čísla alebo znaky)
	 * 
	 * Pomôcky:
	 * 		Character.isUpperCase( 'A' ) - vráti TRUE, ak je znak v zátvorkách veľké písmeno
	 *  	Character.isAlphabetic( 'A' ) - vráti TRUE, ak je znak v zátvorkách písmeno
	 */
	public static void main(String[] args) {
		String vstup = "toto je veta z Malých písmen";

		if ( Character.isUpperCase( 'A' ) ) {
			System.out.println( "velke pismeno");
		}
		
		if ( Character.isAlphabetic( 'A' ) ) {
			System.out.println( "pismeno");
		}
				
	}
}
