package den04pole;

// VYSVETLENIE
public class Priklad01PoleCelychCiselRiesenie {

	/*
	 * V Jave je možné vytvoriť jednu premennú, ktorá v sebe obsahuje viacero hodnôt rovnakého typu.
	 * Napríklad viacero celých čísel je možné uložiť do jednej premennej takto:
	 * int[] sestCisel = { 12, 4, 45, 33, 22, 1 };
	 * K jednotlivým číslam je možné pristupovať cez hranaté zátvorky, čiže:
	 * sestCisel[0] == 12
	 * sestCisel[1] == 4
	 * sestCisel[2] == 45
	 * atď
	 * 
	 * Program vypíše zoznam čísel vytiahnutých v športke.
	 * 
	 * Pomôcka:
	 * 		hranaté zátvorky sa dajú napísať cez pravé tlačidlo ALT+F
	 * 		Eclipse k ľavej zátvorke automaticky dopíše pravú
	 */
	public static void main(String[] args) {
		int[] vytiahnuteCisla = { 12, 4, 45, 33, 22, 1 };
		
		// TODO Prepísať pomocou for-cyklu
		for (int i = 0; i < vytiahnuteCisla.length; i++) {
			System.out.println( "Ako " + (i+1) + ". bolo vytiahnuté číslo " + vytiahnuteCisla[i] );			
		}
	}
}
