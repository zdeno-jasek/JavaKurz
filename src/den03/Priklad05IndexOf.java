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
		System.out.println(slovo.charAt(poziciaPismenaF));
		// TODO: vypísať pozíciu písmena "x" v slove "Kufor"
		int poziciaX = slovo.indexOf( 'x' );
		System.out.println( poziciaX);
		// TODO: vypísať pozíciu písmena "F" v slove "Kufor"
		int poziciaF = slovo.indexOf( 'F' );
		System.out.println( poziciaF);
	}
}
