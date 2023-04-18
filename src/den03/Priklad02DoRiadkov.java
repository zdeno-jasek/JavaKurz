package den03;

// ÚLOHA
public class Priklad02DoRiadkov {

	/*
	 * Program napíše zadané slovo do tak, že do každého riadku zapíše jedno písmeno:
	 * slovo = "pokus"
	 * výstup:
	 * p
	 * o
	 * k
	 * u
	 * s
	 * 
	 * Pomôcka:
	 * 	charAt(x) - vráti znak na pozícii x
	 *  length() - vráti počet znakov v stringu
	 */
	public static void main(String[] args) {
		String slovo = "Na nejaký iný text";

		for (int i = 0; i < slovo.length(); i++) {
			System.out.println( slovo.charAt(i) );			
		}
	}
}
