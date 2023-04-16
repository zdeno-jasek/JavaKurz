package den03;

// DOMÁCA ÚLOHA
public class Priklad07Adresa {

	/*
	 * Program načíta adresu zo zadaného vstupu.
	 * Vstup: Záhradnícka 20, 82108 Bratislava
	 * Výstup:
	 *   Ulica: Záhradnícka 20
	 *   PSČ: 82108
	 *   Obec: Bratislava
	 */
	public static void main(String[] args) {
		String adresa = "Záhradnícka 20, 82108 Bratislava";
		String ulica = "";
		String psc = "";
		String obec = "";
		
		System.out.println( "Adresa " + adresa + ":" );
		System.out.println( "Ulica: " + ulica );
		System.out.println( "PSC: " + psc );
		System.out.println( "Obec: " + obec );
	}
}
