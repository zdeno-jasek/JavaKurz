package den03;

// ÚLOHA
public class Priklad04ICO {

	/*
	 * Program napíše, či je na vstupe IČO.
	 * IČO má dĺžku 8 číslic (neobsahuje písmená)
	 * 
	 * Príklad:
	 * Vstup: 12345678
	 * výstup: je to IČO

	 * Vstup: 12345d78
	 * výstup: nie je to IČO
	 * 
	 * Treba použiť metódu Character.isDigit(), ktorá vie pre daný znak rozhodnúť,
	 * či je to číslo.
	 * 
	 */
	public static void main(String[] args) {
		String vstup = "1234fff8";
		
		if ( vstup.length() == 8 ) {
			// System.out.println( "Je to IČO");
			String vypis = "Je to IČO";
			for (int i = 0; i < vstup.length(); i++) {
				if ( ! Character.isDigit( vstup.charAt(i) ) ) {
					vypis = "Nie je to IČO";
				}
			}
			System.out.println(vypis);
		} else {
			// vstup.length() != 8
			System.out.println( "Nie je to IČO");
		}
		System.out.println("KONIEC");
	}
}
