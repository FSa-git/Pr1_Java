package Aufgabe1;

public class Immobilien {

	private String ort;
	private int baujahr;
	private int wohnflaeche;
	private int preis;
	
	public Immobilien(String ort, int baujahr, int wohnflaeche, int preis) {
		this.ort = ort;
		this.baujahr = baujahr;
		this.wohnflaeche = wohnflaeche;
		this.preis = preis;
	}

	public String getOrt() {
		return ort;
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

	public int getWohnflaeche() {
		return wohnflaeche;
	}

	public void setWohnflaeche(int wohnflaeche) {
		this.wohnflaeche = wohnflaeche;
	}

	public int getPreis() {
		return preis;
	}

	public void setPreis(int preis) {
		this.preis = preis;
	}
	
	
}
