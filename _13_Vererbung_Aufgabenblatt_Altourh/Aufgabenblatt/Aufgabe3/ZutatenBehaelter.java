package Aufgabe3;

public class ZutatenBehaelter extends Behealter {

	private String name;
	
	public ZutatenBehaelter(double fuellstand, double max, String name) {
		super(fuellstand, max);
		this.name = name;
	}
	
	void Entnehmen(double menge) {
		if(fuellstand - menge < 0) {
			System.out.println("Bitte füllen sie mich nach");
		}
	}
	
}
