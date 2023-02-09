package projektMitarbeiter;

public class Mitarbeiter {

	protected String name;
	protected String vorname;
	protected double gehalt;
	
	
	// leerer Mitarbeiter + Getters and setters aber leer auswählen 
	public Mitarbeiter() {
		super();
	}

	// Konstruktor
	public Mitarbeiter(String name, String vorname, double gehalt) {
		this.name = name;
		this.vorname = vorname;
		this.gehalt = gehalt;
	}
	
	public String getName() {
		return name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public double getGehalt() {
		return gehalt;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void gehaltErhoehen(double betrag) {
		this.gehalt += betrag;
	}
	
	
	
	
}
