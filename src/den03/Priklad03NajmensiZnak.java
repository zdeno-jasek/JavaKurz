package den03;

// ÚLOHA
public class Priklad03NajmensiZnak {

	/*
	 * Program vypíše najmenší znak v texte, t.j. znak, ktorý je abecedne prvý v poradí. 
	 * Vstup: "pokus" 
	 * Výstup: "k"
	 * 
	 * Vstup: "dcbaxyz" 
	 * Výstup: "a"
	 * 
	 */
	public static void main(String[] args) {
		String text = "dcbaxyz";

		char najmensiePismeno = text.charAt(0);
		for (int i = 1; i < text.length(); i++) {
			if ( najmensiePismeno > text.charAt(i) ) {
				najmensiePismeno = text.charAt(i);
			}
		}
		System.out.println( "Najmensie pismeno v slove " + text + " je " + najmensiePismeno );
	}
}
