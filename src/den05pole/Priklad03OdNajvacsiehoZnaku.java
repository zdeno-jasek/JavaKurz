package den05pole;

import java.util.Arrays;

// ÚLOHA
public class Priklad03OdNajvacsiehoZnaku {

	/*
	 * Program usporiada písmená v zadanom texte od najväčšieho znaku po najmenší.
	 * Vstup: "pokus"
	 * Výstup: "uspok"
	 */
	public static void main(String[] args) {
		String vstup = "pokus";
		
		// Najprv si prevedieme celý vstup do poľa znakov.
		char[] znaky = vstup.toCharArray();
		Arrays.sort(znaky);
		// znaky = k o p s u

		// TODO
	}
}
