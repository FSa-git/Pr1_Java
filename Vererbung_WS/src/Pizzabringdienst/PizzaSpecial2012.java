package Pizzabringdienst;

public class PizzaSpecial2012 extends Pizza {

	private String saucentyp;
	private int schaerfegrad;
	
	
	
	public PizzaSpecial2012(String saucentyp, int schaerfegrad, String name, float preis) {
		super(name, preis);
		this.saucentyp = saucentyp;
		this.schaerfegrad = schaerfegrad;
	}
	public String getSaucentyp() {
		return saucentyp;
	}
	public void setSaucentyp(String saucentyp) {
		this.saucentyp = saucentyp;
	}
	public int getSchaerfegrad() {
		return schaerfegrad;
	}
	public void setSchaerfegrad(int schaerfegrad) {
		this.schaerfegrad = schaerfegrad;
	}
	
	
	
}
