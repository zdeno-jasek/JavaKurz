package den04pole;

// ÚLOHA
public class Priklad04PoleStringov {

	/*
	 * int[] je pole celých čísel
	 * String[] je pole textových reťazcov 
	 * 
	 * Úloha
	 * Program má zoznam mien a zoznam priezvisk. Jeho úlohou je vyrobiť plné pomenovanie (meno+priezvisko) pre nového človeka.
	 * Výstup: Peter Krátky
	 */
	public static void main(String[] args) {
		String[] mena = { "Jozef", "Juraj", "Peter", "Andrej" };
		String[] priezviska = { "Široký", "Dlhý", "Bystrozraký", "Krátky", "Úzky", "Ďalekozraký" };
		
		// TODO zmenit program tak, aby boli mena naozaj nahodne
		String nahodneMeno = mena[2];
		String nahodnePriezvisko = priezviska[3];
		
		System.out.println( String.format( "Vymyslel som meno %s %s. Pekné, že?", nahodneMeno, nahodnePriezvisko));
	}
}
