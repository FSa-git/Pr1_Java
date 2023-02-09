package Pizzabringdienst;

public class Sonderangebot extends Pizza {

	private float rabatt = 25.0f;

	public Sonderangebot(String name, float preis) {
		super(name, preis);
		// TODO Auto-generated constructor stub
	}
	
	public float getRabatt() {
		return rabatt;
	}

	public void setRabatt(float rabatt) {
		this.rabatt = rabatt;
	}
	
	
}
