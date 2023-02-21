package Aufgabe1;

public class SparKonto extends Bankkonto {


	private double zinsSatz;
	
	public SparKonto(double anfangsBetrag, double zinsSatz) {
		super(anfangsBetrag);
		this.zinsSatz = zinsSatz;
	}
	
	public void zinsenAnrechnen() {
		this.kontoStand = (this.kontoStand/100);
	}
	
	@Override public void auszahlen(double x) {
		this.kontoStand += x - this.gebuehr;
	}

	
}


