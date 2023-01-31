package de.gds2;

// Dienstag 31.01.23

import java.util.Scanner;

public class BerechneFakRek {

	public static void main(String[] args) {
		
		// Init
		int fakultaetOut = 0;
		System.out.println("Eingabe: ");
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt(); //Wert den man einliest 
		
		fakultaetOut = fakBerechnung(i); //Berechnung - lassen arbeiten
		
		System.out.println(fakultaetOut);
		
		sc.close();
	
	}

	private static int fakBerechnung(int i) {
		int ergebnis = 0;
		
		if((i == 1) || (i == 0)) {
			ergebnis = 1;
		}
		else {
			ergebnis = i * fakBerechnung(i-1);
		}
		return ergebnis;
		
	}

}
