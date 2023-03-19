package Aufgabe2;

import java.util.ArrayList;

public class Schueler extends Person{

	private Tablet seinTablet;
	private ArrayList<Tablet> tablets;

	public Schueler(String nr, String name, String vorname) {
		super(nr, name, vorname);
	}

	public void setSeinTablet(Tablet seinTablet) {
		this.seinTablet = seinTablet;
	}
	
	
	
	
}
