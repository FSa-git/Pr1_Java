package Aufgabe1;

public class Immobilien {

	private String ort;
	private int baujahr;
	private int wohnflaeche;
	private double preis;
	private int grundstücksflaeche;
	
	public int getGrundstücksflaeche() {
		return grundstücksflaeche;
	}

	public void setGrundstücksflaeche(int grundstücksflaeche) {
		this.grundstücksflaeche = grundstücksflaeche;
	}

	public Immobilien(String ort, int baujahr, int wohnflaeche, double preis) {
		this.ort = ort;
		this.baujahr = baujahr;
		this.wohnflaeche = wohnflaeche;
		this.preis = preis;
	}

	public String getOrt() {
		return ort + ",";
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public int getBaujahr() {
		return baujahr;
	}

	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public int getWohnflaeche() {
		return wohnflaeche;
	}

	public void setWohnflaeche(int wohnflaeche) {
		this.wohnflaeche = wohnflaeche;
	}
	
	
}
