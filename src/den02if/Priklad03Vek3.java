package den02if;

public class Priklad03Vek3 {
	
	public static void main(String[] args) {
		int vek = 223;
		
		// Ak je vek väčší ako 150 rokov ALEBO menší ako 0, vtedy je nesprávne zadaný
		// Na logickú spojku ALEBO používa Java znak ||
		// Na logickú spoju A ZÁROVEŇ používa Java znak &&
		// Negácia sa zapisuje ako výkričník
		if ( vek >= 0 && vek < 150 ) {
			// Ak vek je väčší alebo rovný 0 a zároveň menší ako 150 ...
			if ( vek <= 18 ) {	// vnorený IF
				System.out.println( "Ty si mladý");
			} else {			
				System.out.println( "Ty si starý");
			}
		} else {
			System.out.println( "Nespravne zadany vek");
		}
	}

}
