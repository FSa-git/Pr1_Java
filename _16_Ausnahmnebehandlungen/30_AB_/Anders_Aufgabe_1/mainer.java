package Anders_Aufgabe_1;

import java.util.Scanner;

public class mainer {

	public static void main(String[] args) {
		
		System.out.println("Bitte gebe deinen Wert hier ein: ");
		
	}
	
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
	
	private static double berechneBMI(double koerpergewicht, double koerpergroesse) {
		double BMI = koerpergewicht / koerpergroesse;
		String fehlermeldung  = "Die Zahl ist kleiner als 0";
		
		if (BMI < 0.0) {
			throw new ArithmeticException(fehlermeldung);
		} 
		else {
			BMI = Math.sqrt(BMI);
			
		}
		return BMI;
		
	}
	
	
	
}
