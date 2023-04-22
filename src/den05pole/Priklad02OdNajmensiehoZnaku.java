package den05pole;

import java.util.Arrays;

// VYSVETLENIE
public class Priklad02OdNajmensiehoZnaku {

	/*
	 * Program usporiada písmená v zadanom texte od najmenšieho znaku po najväčší.
	 * Vstup: "pokus"
	 * Výstup: "kopsu"
	 */
	public static void main(String[] args) {
		String vstup = "pokus";
		
		// Najprv si prevedieme celý vstup do poľa znakov.
		char[] znaky = vstup.toCharArray();
		// Usporiada všetky prvky v poli vzostupne
		Arrays.sort(znaky);
		
		System.out.println( znaky );

	}
}
