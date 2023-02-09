package Aufgabe9;

public class RabattierteRechnung extends Rechnung {

	private double rabatt;
	
	public RabattierteRechnung(double rabatt, double gesamtbetrag, double mehrwertsteuer) {
		super(gesamtbetrag, mehrwertsteuer);
		this.rabatt = rabatt;
	}

	protected double bruttobetragBerechnen() {
		double betrag;
		betrag = this.gesamtbetrag + this.gesamtbetrag * this.mehrwertsteuer;
		return betrag;
	}
	
}
