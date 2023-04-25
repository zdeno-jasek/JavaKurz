package den03;

// ÚLOHA
public class Priklad10SifrovanieRiesenie {

	/*
	 * Zašifruj text Cézarovou šifrou, čiže posuň každé písmenko o tri znaky.
	 * Text obsahuje iba písmená bez diakritiky, medzera sa nešifruje.
	 * Vstup:  abc   toto   ahoj    xyz
	 * Výstup: def   wrwr   dkrm    abc
	 */
	public static void main(String[] args) {
		String textNaZasifrovanie = "toto je tajna sprava xyz";		
		String zasifrovanyText = "";
		
		int dlzkaCelejAbecedy = 'z' - 'a' + 1;
		
		for (int i = 0; i < textNaZasifrovanie.length(); i++) {
			char c = textNaZasifrovanie.charAt(i);
			if ( c != ' ') {
				char a = (char) (c + 3);
				if ( a > 'z' ) {
					a = (char) (a - dlzkaCelejAbecedy);
				}
				zasifrovanyText += a;
			} else { // c == ' '
				zasifrovanyText += ' ';
			}
		}
		
		System.out.println( "Text na zasifrovanie je " + textNaZasifrovanie);
		System.out.println( "Zasifrovany text je " + zasifrovanyText);
	}
}
