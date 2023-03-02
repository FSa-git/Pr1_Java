package Aufgabe2;

public class Tablet {

	private String Modelbezeichnung;
	private double Groesse;
	
	public Tablet(String modelbezeichnung, double groesse) {
		//super();
		Modelbezeichnung = modelbezeichnung;
		Groesse = groesse;
	}
	
	
	public String getModelbezeichnung() {
		return Modelbezeichnung;
	}
	public void setModelbezeichnung(String modelbezeichnung) {
		Modelbezeichnung = modelbezeichnung;
	}
	public double getGroesse() {
		return Groesse;
	}
	public void setGroesse(double groesse) {
		Groesse = groesse;
	}
	
	
	
}
