package den02if;

public class Priklad02Vek2 {
	
	/* Našou úlohou je napísať vyhodnocovanie veku tak,
	 *  že ak je vek pod 18 rokov, na konzolu sa vypíše text "ty si mladý"
	 *  inak sa napíše "ty si starý"
	 */
	public static void main(String[] args) {
		int vek = 23;
		
		if ( vek <= 18 ) { // Príkaz IF porovná obsah premennej vek s hodnotou 18
			// Príkazy za IF sa vykonajú iba vtedy, ak je podmienka splnená
			System.out.println( "Ty si mladý");
		} else {			
			// vetva ELSE sa vykoná iba vtedy, ak podmienka IF nie je splnená
			System.out.println( "Ty si starý");
		}
	}

}
