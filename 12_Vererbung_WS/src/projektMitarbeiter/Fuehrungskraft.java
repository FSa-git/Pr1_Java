package projektMitarbeiter;

public class Fuehrungskraft extends Mitarbeiter {

	public String position;
	
	public Fuehrungskraft() {
		super(); // Immer erster Aufruf 
	}

	// Generate Constructor using Superclass..
	public Fuehrungskraft(String name, String vorname, double gehalt) {
		super(name, vorname, gehalt);
		//hier müssen die Attribute hin
		position = "A Boss";
	}

//	public String getPosition() {
//		return position;
//	}
//
//	public void setPosition(String position) {
//		this.position = position;
//	}
	

}
