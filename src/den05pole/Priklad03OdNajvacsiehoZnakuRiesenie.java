package den05pole;

import java.util.Arrays;

// ÚLOHA
public class Priklad03OdNajvacsiehoZnakuRiesenie {

	/*
	 * Program usporiada písmená v zadanom texte od najväčšieho znaku po najmenší.
	 * Vstup: "pokus"
	 * Výstup: "uspok"
	 */
	public static void main(String[] args) {
		String vstup = "abc";
		
		// Najprv si prevedieme celý vstup do poľa znakov.
		char[] znaky = vstup.toCharArray();
		Arrays.sort(znaky);
		
		System.out.println( "Abecedne: " );
		System.out.println( znaky );
		for (int i = 0; i < znaky.length / 2; i++) {
			char temp = znaky[i];
			znaky[i] = znaky[znaky.length - 1 - i];
			znaky[znaky.length - 1 - i] = temp;			
		}
		System.out.println( "Naopak: " );
		System.out.println( znaky );

		// u s p o k
	}
}
