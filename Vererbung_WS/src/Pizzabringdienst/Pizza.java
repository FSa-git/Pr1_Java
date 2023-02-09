package Pizzabringdienst;

// Aufgabe Vererbung-6

public class Pizza {
	
	private String name = "KrosseKrabbePizza";
	private float preis = 12.50f;
	
	
	public Pizza(String name, float preis) {
		super();
		this.name = name;
		this.preis = preis;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPreis() {
		return preis;
	}
	public void setPreis(float preis) {
		this.preis = preis;
	}
	
	

}
