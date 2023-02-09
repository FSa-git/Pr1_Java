package projektMitarbeiter;

public class Auszubildender extends Mitarbeiter{

//	protected String vorname;
//	protected String nachname;
	protected String ausbildungsberuf;
	protected int ausbildungsjahr;
	
	public Auszubildender() {
		super(); 
	}
	


	public Auszubildender(String name, String vorname, double gehalt, String ausbildungsberuf, int ausbildungsjahr) {
		super(name, vorname, gehalt);
		this.ausbildungsberuf = ausbildungsberuf;
		this.ausbildungsjahr = ausbildungsjahr;
	}



	public String getAusbildungsberuf() {
		return ausbildungsberuf;
	}

	public void setAusbildungsberuf(String ausbildungsberuf) {
		this.ausbildungsberuf = ausbildungsberuf;
	}

	public int getAusbildungsjahr() {
		return ausbildungsjahr;
	}

	public void setAusbildungsjahr(int ausbildungsjahr) {
		this.ausbildungsjahr = ausbildungsjahr;
	}
	
	
	
	
}
