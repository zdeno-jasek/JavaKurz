package den02if;

public class Priklad04ParneNeparne {

	/**
	 * Ak je X párne číslo, program vypíše "parne", inak vypíše "neparne"
	 */
	public static void main(String[] args) {
		int x = 11;
			
		if (x % 2 == 1) {
			System.out.print( "ne" );
		}
		System.out.println( "parne" );		
	}

}
