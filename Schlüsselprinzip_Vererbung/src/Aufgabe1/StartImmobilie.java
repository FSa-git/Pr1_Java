package Aufgabe1;

import java.text.DecimalFormat;

// Projektname: projektImmoGmbH



public class StartImmobilie {

	public static void main(String[] args) {
		
		Immobilien haus1 = new Immobilien("Ulm", 2005, 85, 185000.00);
		Immobilien haus2 = new Immobilien("Esslingen", 1996, 180, 575000.00);
		
		haus2.setGrundstücksflaeche(450);

		DecimalFormat dm = new DecimalFormat("0.00");
		
		System.out.println(haus1.getOrt()+" Bauhjahr "+haus1.getBaujahr()+", "+"Wohnfläche "+haus1.getWohnflaeche()+" Quadratmeter,"+" Preis "+dm.format(haus1.getPreis())+" €");
		System.out.println(haus2.getOrt()+" Bauhjahr "+haus2.getBaujahr()+", "+"Wohnfläche "+haus2.getWohnflaeche()+" Quadratmeter,"+" Preis "+dm.format(haus2.getPreis())+" €, "+haus2.getGrundstücksflaeche()+" qm");
	}

}
