package Aufgabe11;

public class Lehrer extends Schulverwaltungssoftware{

	private String uFach;
	
	public Lehrer(int alter, String uFach) {
		super(name, alter);
		this.uFach = uFach;
	}

	public String getuFach() {
		return uFach;
	}

	public void setuFach(String uFach) {
		this.uFach = uFach;
	}

}
