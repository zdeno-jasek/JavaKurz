package den04pole;

// VYSVETLENIE
public class Priklad01PoleCelychCisel {

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
		
		System.out.println( "Ako " + 1 + ". bolo vytiahnuté číslo " + vytiahnuteCisla[0] );
		System.out.println( "Ako " + 2 + ". bolo vytiahnuté číslo " + vytiahnuteCisla[1] );
		System.out.println( "Ako " + 3 + ". bolo vytiahnuté číslo " + vytiahnuteCisla[2] );
		System.out.println( "Ako " + 4 + ". bolo vytiahnuté číslo " + vytiahnuteCisla[3] );
		System.out.println( "Ako " + 5 + ". bolo vytiahnuté číslo " + vytiahnuteCisla[4] );
		System.out.println( "Ako " + 6 + ". bolo vytiahnuté číslo " + vytiahnuteCisla[5] );
		
		// TODO Prepísať pomocou for-cyklu
		
	}
}
