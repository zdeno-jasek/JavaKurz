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
		String nahodneMeno = mena[ (int) (Math.random() * mena.length) ];
		String nahodnePriezvisko = priezviska[ (int) (Math.random() * priezviska.length) ];
		
		System.out.println( String.format( "Vymyslel som meno %s %s. Mal som na výber z %d mien a %d priezvisk.",
				nahodneMeno, nahodnePriezvisko, mena.length, priezviska.length ) );
		
		
		System.out.println( "Vymyslel som meno "+nahodneMeno+" "+nahodnePriezvisko+". Pekné, že?");
	}
}
