package Aufgabe2;

import java.util.ArrayList;

public class Schueler extends Person {

	private Tablet SeinTablet;
	
	// private [int] MeineTablets;
	
	private ArrayList <Tablet> MeineTablets;

	public ArrayList <Tablet> getMeineTablets() {
		return MeineTablets;
	}

	public void setMeineTablets(ArrayList <Tablet> meineTablets) {
		MeineTablets = meineTablets;
	}

	public Schueler(String nr, Tablet SeinTablet) {
		super(nr);
		this.SeinTablet = SeinTablet;
	}

	public Tablet getSeinTablet() {
		return SeinTablet;
	}

	public void setSeinTablet(Tablet seinTablet) {
		SeinTablet = seinTablet;
	}
	
	
	
	
}
