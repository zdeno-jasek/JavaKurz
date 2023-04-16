package den03;

// ÚLOHA
public class Priklad08ZlucRetazce {

	/*
	 * Program zlúči dva texty do jedného tak, že zoberie prvé písmeno z prvého a za
	 * ním vloží prvé písmeno z druhého textu. Potom pokračuje druhým písmenom.
	 * Vstup: 
	 * 		prvyText =  "abc" 
	 * 		druhyText = "123" 
	 * Vystup: a1b2c3
	 */
	public static void main(String[] args) {
		String prvyText =  "abcdefgh";
		String druhyText = "12345678";
		
		String vystup = "";
		
		System.out.println("Text '" + prvyText + "' zlúčený s textom '" + druhyText + "' je '" + vystup + "'");

	}
}
