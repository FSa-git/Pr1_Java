package Neue_Erklärung_für_Luca;

public class StarterTesterKlasse {

	
	public static void main(String[] args) {
		
		Vergleichbar meins1 = new VInteger(42);
		Vergleichbar meins2 = new VInteger(43);
		Vergleichbar meins3 = new VInteger(44);
		Vergleichbar meins4 = new VInteger(45);
		
		Vergleichbar[] myelements = new Vergleichbar[4];
		
		myelements[0] = meins1;
		myelements[1] = meins2;
		myelements[2] = meins3;
		myelements[3] = meins4;
		
		VInteger ergebnis = (VInteger) NuetzlicheFunktionen.kleinstesElement(myelements);
		
		System.out.println(ergebnis.wert);
	}
	
}
