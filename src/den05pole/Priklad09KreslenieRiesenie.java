package den05pole;

// ÚLOHA
public class Priklad09KreslenieRiesenie {

	/*
	 * Program vypíše všetky hodnoty z daného vzoru na obrazovku,
	 * ale pritom nahradí každú 0 za medzeru a každú 1 za X.
	 * Čo je v riadku, treba vypísať v riadku (System.out.print)
	 * a potom zariadkovať System.out.println().
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] vzor = {
				{ 0, 0, 1, 1, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0, 1, 0 },
				{ 1, 0, 0, 1, 0, 1, 0, 0, 1 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 1, 0, 0, 0, 1, 0, 1 },
				{ 1, 0, 0, 1, 1, 1, 0, 0, 1,},
				{ 0, 1, 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 1, 1, 1, 1, 1, 0 },
		};

		for (int riadok = 0; riadok < vzor.length; riadok++) {
			for (int stlpec = 0; stlpec < vzor[riadok].length; stlpec++) {
				if ( vzor[riadok][stlpec] == 0 ) {
					System.out.print( ' ');
				} else {
					System.out.print( 'X');					
				}
			}
			System.out.println();
		}
		
	}
}
