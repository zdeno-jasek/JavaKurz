package den03;

// VYSTVETLENIE
public class Priklad12equals {

	/*
	 * Porovnávanie dvoch stringov v Jave nerobíme pomocou ==
	 * ale pomocou volania metódy equals().
	 * Operátor == pri objektoch zisťuje, či je to ten istý objekt,
	 * t.j. na tej istej adrese v pamäti.
	 */
	public static void main(String[] args) {
		String a1 = "komar";
		//String a2 = "komar";
		String a2 = a1.replace('k', 's').replace('s', 'k');
		
		System.out.println( "Hodnota a1: " + a1 );
		System.out.println( "Hodnota a2: " + a2 );
		
		System.out.print( "Porovnanie cez == : ");
		if (a1 == a2) {
			System.out.println( "rovnajú sa " );
		} else {
			System.out.println( "nerovnajú sa ");
		}
		
		System.out.print( "Porovnanie cez equals : ");
		if (a1.equals( a2 ) ) {
			System.out.println( "rovnajú sa " );
		} else {
			System.out.println( "nerovnajú sa ");
		}
	}
}
