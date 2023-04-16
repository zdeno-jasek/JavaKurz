package den04pole;

public class Priklad06CamelCase {

	/*
	 * Napíšte program, ktorý zo vstupnej vety vyhodí medzery 
	 * a každé prvé písmeno v novom slove prehodí na veľké začiatočné.
	 * Vstup: Toto je nejaky vstup
	 * Vystup: TotoJeNejakyVstup
	 * 
	 * Pomôcky:
	 * 		Character.toUpperCase( 'a' ) vráti A
	 */
	public static void main(String[] args) {
		String vstup = "Toto je nejaky vstup";
		String vystup = "";
		
		System.out.println( Character.toUpperCase('a') );
				
		System.out.println( vstup );
		System.out.println( "CamelCase: " + vystup );	// TotoJeNejakyVystup
		
	}
}
