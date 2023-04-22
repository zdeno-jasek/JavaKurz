package den05pole;

public class Priklad07MergeSort {

	/**
	 * Program zoberie dve usporiadané polia a spojí ich prvky dohromady tak,
	 * aby výsledkom bolo znovu usporiadané pole.
	 */
	public static void main(String[] args) {
		int[] prvePole =  { 1, 2, 9, 15, 28 };
		int[] druhePole = { 2, 4, 5, 11, 12 };
		// vysledok = 1, 2, 2, 4, 5, 9, 11, 12, 15, 28

		int[] vysledok = new int[ prvePole.length + druhePole.length ];
		
		// TODO
		
		for (int hodnota : vysledok) {
			System.out.println(hodnota);
		}
		
	}
}
