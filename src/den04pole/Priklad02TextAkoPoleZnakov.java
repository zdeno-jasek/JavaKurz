package den04pole;

// VYSVETLENIE
public class Priklad02TextAkoPoleZnakov {

	/*
	 * Program vypíše zoznam všetkých znakov v texte.
	 * Vstup: "pokus"
	 * Výstup: 
	 * p
	 * o
	 * k
	 * u
	 * s
	 */
	public static void main(String[] args) {
		String vstup = "pokus";
		
		// Volanie vstup.toCharArray() vráti jednotlivé znaky z reťazca vstup.
		// Zápis s hranatými zátvorkami v Jave znamená pole. V tomto prípade ide o pole znakov - char[].
		// Rovnako je možné definovať aj pole čísel ako int[].
		char[] znaky = vstup.toCharArray();
						
		for (char c : znaky) {
			System.out.println(c);
		}
		
	}
}
