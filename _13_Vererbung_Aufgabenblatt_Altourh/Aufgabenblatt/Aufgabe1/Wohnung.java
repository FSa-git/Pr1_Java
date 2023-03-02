package Aufgabe1;

public class Wohnung {

	protected String ort;
	protected int baujahr;
	protected double preis;
	
	
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




	public double getPreis() {
		return preis;
	}




	public void setPreis(double preis) {
		this.preis = preis;
	}




	public Wohnung(String ort, int baujahr, double preis) {
		this.ort = ort;
		this.baujahr = baujahr;
		this.preis = preis;
	}


	
	
	
}
