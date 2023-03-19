package Aufgabe1;

public class SparKonto extends Bankkonto {


	private double zinsSatz;
	private double gebuehr;
	
	public SparKonto(double anfangsBetrag, double zinsSatz) {
		super(anfangsBetrag);
		this.zinsSatz = zinsSatz;
	}
	
	public void zinsenAnrechnen() {
		this.kontoStand = (this.kontoStand/100);
	}
	
	public void auszahlen(double x) { // @Override?
		this.kontoStand += x - this.gebuehr;
	}

	
}


