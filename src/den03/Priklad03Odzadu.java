package den03;

// ÚLOHA
public class Priklad03Odzadu {

	/*
	 * Program vypíše zadané slovo odzadu.
	 * 
	 * Príklad:
	 * Vstup:  slovo
	 * výstup: ovols
	 * 
	 * Pomôcky:
	 * 	length - počet znakov v slove
	 *  charAt - získa znak na danej pozícii
	 */
	public static void main(String[] args) {
		String slovo = "slovo";
		
		for (int i = 0; i < slovo.length(); i++) {
			System.out.print( slovo.charAt(slovo.length() - 1 - i) );			
		}
		
	}

}
