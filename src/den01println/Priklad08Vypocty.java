package den01println;

public class Priklad08Vypocty {

	public static void main(String[] args) {
		int x = 5;

		// Pripočítaj k hodnote premennej x hodnotu 7
		x = x + 7;
		System.out.println("X+7 je " + x);
		// Detto
		x += 7;
		System.out.println("X+7 je " + x);
		// Zvýš hodnotu premennej x o 1 - inkrementuj
		x++;
		// Je to to iste ako x = x + 1;
		System.out.println("X+1 je " + x);
		// Zníž hodnotu premennej x o 1 - dekrementuj
		x--;
		System.out.println("X-1 je " + x);
		
	}
}
