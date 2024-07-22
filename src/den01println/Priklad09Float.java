package den01println;

public class Priklad09Float {

	public static void main(String[] args) {
		// double je typ, ktorý znamená "reálne číslo" s dvojitou presnosťou
		// K nemu existuje typ float, ktorý je s normálnou presnosťou
		// float je číslo s plávajúcou desatinnou čiarkou
		// NIE JE vhodné na počítanie peňazí!!!
		// Číslo 5.000002E7 znamená 5.000002 krát 10 na siedmu
		float x = 50_000_000;
		// Keď má číslo v sebe desatinnú bodku, je jasné, že je double.
		float y = 0.02f;
		
		System.out.println( x + y );
		System.out.println( x - y );
		// Výsledkom delenia 5/20 je nula, lebo sme v celých číslach, t.j. desatinné čísla sú ignorované
		System.out.println( x / y );
		// Pripísaním "f" za číslo viem povedať Jave, že nejde o celé číslo,
		// ale o reálne číslo.
		// Tým pádom delenie dá presný výsledok 0.99, nie 0 ako je to pri celých číslach.
		// Keď Jave nenapíšem o čísle nič, tak si myslí, že je to celé číslo.
		System.out.println( 99f / 100f );
		System.out.println( x * y );
		
		// Pripočítaj k hodnote premennej x hodnotu 7
		x = x + 7;
		System.out.println( "X+7 je " + x );
		// Detto
		x += 7;
		System.out.println( "X+7 je " + x );
		// Zvýš hodnotu premennej x o 1 - inkrementuj
		x++;
		System.out.println( "X+1 je " + x );
		// Zníž hodnotu premennej x o 1 - dekrementuj
		x--;	// zníž o jednu
		System.out.println( "X-1 je " + x );
	
		/*
		 * Pozor, teraz príde BOOLEAN!!!
		 */
		int vek = 10;
		// Premenná typu boolean môže mať hodnoty iba true alebo false
		boolean mlady = vek < 18;
		
		// Príkaz IF robí vždy s booleanom
		if ( mlady ) {
			System.out.println( "Mlady");
		}
		if ( ! mlady ) {
			System.out.println( "Stary" );
		}
	}
}
