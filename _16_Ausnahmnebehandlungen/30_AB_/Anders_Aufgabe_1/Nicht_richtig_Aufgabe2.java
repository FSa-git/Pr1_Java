package Anders_Aufgabe_1;

public class Nicht_richtig_Aufgabe2 {
	
	private static double berechneWurzel(double zahl1) {
		
		double zahl = 0;
		String fehlermeldung  = "Die Zahl ist kleiner als 0";
		
		if (zahl < 0.0) {
			throw new ArithmeticException(fehlermeldung);
		} 
		else {
			zahl = Math.sqrt(zahl1);
			
		}
		return zahl;
	}
}
