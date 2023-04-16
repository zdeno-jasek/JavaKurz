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

	 * Vstup: 12345d
	 * výstup: nie je to IČO
	 * 
	 * Treba použiť metódu Character.isDigit(), ktorá vie pre daný znak rozhodnúť,
	 * či je to číslo.
	 * 
	 */
	public static void main(String[] args) {
		String vstup = "1s345678";
		
		if ( Character.isDigit( vstup.charAt(0) ) ) {
			System.out.println("Je to cislo");
		} else {
			System.out.println( "Nie je to cislo");
		}
	}
}
