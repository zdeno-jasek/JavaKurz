package den03;

// ÚLOHA
public class Priklad09NahodneSlovo {

	/*
	 * Program vymyslí náhodné slovo dĺžky 5 až 15 znakov.
	 * weroyex
	 * aljior
	 * adsgahgboaerirh
	 */
	public static void main(String[] args) {
		// Náhodné písmeno je možné v Jave vytvoriť pomocou Math.random()
		// Táto metóda vráti náhodné číslo od 0 po 1
		char c = (char) ('a' + (int) ( Math.random() * 25 ) );
		System.out.println( c );
	}
}
