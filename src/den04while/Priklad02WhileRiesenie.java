package den04while;

// ÚLOHA
public class Priklad02WhileRiesenie {

	/*
	 * Pre zadaný text odstráň všetky medzery na začiatku textu.
	 * Vstup: "     Toto je zadaný text"
	 * Výstup: "Toto je zadaný text" 
	 */
	public static void main(String[] args) {
		String vstup = "    Toto je zadaný text   ";
		
		int j = 0;
		while ( vstup.charAt(j) == ' ') {
			j++;
		}
		
		for (int i = j; i < vstup.length(); i++) {
			System.out.print( vstup.charAt(i));
		}
	}
}
