package den03;

// VYSVETLENIE
public class Priklad01String {

	/*
	 * Dátový typ String umožňuje pracovať so znakmi.
	 * Pod pojmom "znak" chápeme písmeno, číslo alebo symbol - t.j. hocičo zobraziteľné na obrazovke.
	 * String môže obsahovať veľmi veľa znakov (cca 2 miliardy) a môže byť aj prázdny.
	 * 
	 * String je trieda, čiže môžeme na nej volať metódy:
	 * length = vráti počet znakov v reťazci
	 * charAt = vráti znak na konkrétnej pozícii.
	 */
	public static void main(String[] args) {
		String meno = "Napoleon";

		System.out.println( "Tvoje meno " + meno + " ma " + 7 + " znakov a začína sa na písmeno " + "N" );
	}
}
