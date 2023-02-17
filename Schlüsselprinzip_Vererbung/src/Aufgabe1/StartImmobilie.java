package Aufgabe1;

// Projektname: projektImmoGmbH

public class StartImmobilie {

	public static void main(String[] args) {
		
		Immobilien haus1 = new Immobilien("Ulm", 2005, 85, 185000.00);
		Immobilien haus2 = new Immobilien("Esslingen", 1996, 180, 575000.00);
		
		haus2.setGrundstücksflaeche(450);

		
		System.out.println(haus1.getOrt()+" Bauhjahr "+haus1.getBaujahr()+", "+"Wohnfläche "+haus1.getWohnflaeche()+" Quadratmeter,"+" Preis "+haus1.getPreis()+" €");
		System.out.println(haus2.getOrt()+" Bauhjahr "+haus2.getBaujahr()+", "+"Wohnfläche "+haus2.getWohnflaeche()+" Quadratmeter,"+" Preis "+haus2.getPreis()+" €, "+haus2.getGrundstücksflaeche()+" qm");
	}

}
