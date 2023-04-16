package den03;

// VYSVETLENIE
public class Priklad05IndexOf {

	/*
	 * Na objektoch typu String môžeme zavolať metódu indexOf(pismeno).
	 * Metóda vráti poradové číslo písmena v danom reťazci.
	 * Metóda vráti -1, ak sa písmeno v danom reťazci nenachádza.
	 */
	public static void main(String[] args) {
		String slovo = "Kufor";
		int poziciaPismenaF = slovo.indexOf( 'f' );
		System.out.println( "Pozicia pismena f je: " + poziciaPismenaF );
		// TODO: vypísať písmeno na pozícii "poziciaPismenaF"
		// TODO: vypísať pozíciu písmena "x" v slove "Kufor"
		// TODO: vypísať pozíciu písmena "F" v slove "Kufor"
	}
}
