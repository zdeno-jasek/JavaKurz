package den03;

// ÚLOHA
public class Priklad10Sifrovanie {

	/*
	 * Zašifruj text Cézarovou šifrou, čiže posuň každé písmenko o tri znaky.
	 * Text obsahuje iba písmená bez diakritiky, medzera sa nešifruje.
	 * Vstup:  abc   toto   ahoj    xyz
	 * Výstup: def   wrwr   dkrm    abc
	 */
	public static void main(String[] args) {
		String textNaZasifrovanie = "toto je tajna sprava xyz";		
		String zasifrovanyText = "";
		
		char c = 'a';
		c = (char) (c + 3);
		System.out.println( c );
		
		System.out.println( "Text na zasifrovanie je " + textNaZasifrovanie);
		System.out.println( "Zasifrovany text je " + zasifrovanyText);
	}
}
