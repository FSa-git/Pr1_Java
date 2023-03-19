package de.gds2.abstarcktesZeug;

// Blatt Aufgabe UML Dienstag, 14_02_23

public abstract class Bankkonto {

	protected double kontostand;
	
	/**
	 * @param kontostand
	 */
	public Bankkonto(double kontostand) {
		this.kontostand = kontostand;
	}
	
	public double getKontostand() {
		return kontostand;
	}
	
	public abstract void einzahlen(double x);
	public abstract void abheben(double x);
	
}
