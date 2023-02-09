package Pizzabringdienst;

public class PizzaSpecial2012 extends Pizza {

	private String saucentyp;
	private int schaerfegrad;
	
	public PizzaSpecial2012(String name, float preis) {
		super(name, preis);
		// TODO Auto-generated constructor stub
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
