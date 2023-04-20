package den03;

// ÚLOHA
public class Priklad09NahodneSlovoRiesenie {

	/*
	 * Program vymyslí náhodné slovo dĺžky 5 až 15 znakov.
	 * weroyex
	 * aljior
	 * adsgahgboaerirh
	 */
	public static void main(String[] args) {
		// Náhodné písmeno je možné v Jave vytvoriť pomocou Math.random()
		// Táto metóda vráti náhodné číslo od 0 po 1

		String slovo = "";
		int nahodnaDlzka = 5 + (int) (Math.random() * 10);	// náhodné číslo od 5 do 15
		for (int i = 0; i < nahodnaDlzka; i++) {
			char nahodnePismeno = (char) ('a' + (int) ( Math.random() * 25 ) );
			slovo = slovo + nahodnePismeno;
		}
		System.out.println( slovo );
	}
}
