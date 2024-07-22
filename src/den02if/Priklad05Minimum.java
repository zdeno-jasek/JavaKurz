package den02if;

public class Priklad05Minimum {

	/**
	 * Pre zadané čísla program vypíše najmenšie. Ak sa čísla rovnajú, vypíše
	 * "rovnajú sa".
	 */
	public static void main(String[] args) {
		int x = 10;
		int y = 20;

		if (x < y) {
			System.out.println(x);
		} else if (x == y) {
			System.out.println("rovnaju sa");
		} else {
			System.out.println(y);
		}
	}

}
