package den03;

// ÚLOHA
public class Priklad06VetaRiesenie {

	/*
	 * Program rozdelí slová vo vete na samostatné riadky. 
	 * Vstup:"Toto je nejaka super veta" 
	 * Výstup: 
	 * Toto 
	 * je
	 * nejaka
	 * super
	 * veta
	 */
	public static void main(String[] args) {
		String veta = "Toto je nejaka super veta";
		
		for (int i = 0; i < veta.length(); i++) {
			char iTyZnakVoVete = veta.charAt(i);
			if ( iTyZnakVoVete == ' ' ) {
				System.out.println();
			} else {
				System.out.print( iTyZnakVoVete );			
			}
		}
	}

}
