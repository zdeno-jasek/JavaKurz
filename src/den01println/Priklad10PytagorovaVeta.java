package den01println;

public class Priklad10PytagorovaVeta {

	public static void main(String[] args) {
		double a = 3;
		double b = 4;

		// Trieda Math poskytuje rôzne matematické operácie ako odmocninca, mocnina, kosinus, sinus,
		// absolútna hodnota, random apod.
		double c = Math.sqrt( Math.pow( a, 2) + b * b );

		System.out.println("Velkosť uhlopriečky pravouhlého trojuholníka so stranami "
		+ a + " a " + b + " je " + c);
		
		System.out.println( 2 + 8 * Math.random() );
	}

}
