package intro;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello wold!");
			
		// 1- VARIABLES
		// Java'da değişken isimlendirmeleri, camelCase yazılır.
		String ortaMetin = "İlginizi çekebilir.";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		
		//integer : tam sayı
		int vade = 10;
		
		// double : ondalıklı sayı 	 	
		double dolarDun = 28;
		double dolarBugun = 14.25;
		
	        // boolean : mantıksal ifade
		boolean dolarDustuMu = true;
		boolean dolarYukseldiMi = false;
		
		
		// 2- CONDITION STATES
		String okYonu = ""; // null variable
		
		if (dolarBugun < dolarDun){ // 28 < 14.25 -> true
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun == dolarDun) {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		
		
		// 3- ARRAY
		String[] krediler = {"Hızlı Kredi", "Maaşını Halkbaktan", "Mutlu Emeklilik"};
		System.out.println(krediler[0]);	
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		// 4- LOOP
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}

}
