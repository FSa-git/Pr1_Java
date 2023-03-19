package Aufgabe11;

public class Schueler extends Schulverwaltungssoftware{

	private String uFach;
	private int klassenstufe;
	private int beitrag;
	
	public Schueler(String name, int alter, String uFach,int klassenstufe, int beitrag) {
		super(name, alter);
		this.uFach = uFach;
		this.klassenstufe = klassenstufe;
		this.beitrag = beitrag;
		
	}

	public int getKlassenstufe() {
		return klassenstufe;
	}

	public void setKlassenstufe(int klassenstufe) {
		this.klassenstufe = klassenstufe;
	}

	public int getBeitrag() {
		return beitrag;
	}

	public void setBeitrag(int beitrag) {
		this.beitrag = beitrag;
	}
	
	
	
}
