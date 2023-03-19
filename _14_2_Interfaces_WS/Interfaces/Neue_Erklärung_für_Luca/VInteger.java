package Neue_Erklärung_für_Luca;

public class VInteger extends Integer implements Vergleichbar {

	// Extended und implementiert mit dem Inteface
	
	
	public VInteger(int wert) {
		super(wert);
		
	}

	
	@Override
	public int vergleichenMit(Vergleichbar obj) {
		// (Demnächst öfters so machen)
		int ergebnis = 0;
		VInteger VIntobi = (VInteger) obj;
		
		if(this.wert > VIntobi.wert) {
			ergebnis = -1;
		}
		
		if(this.wert == VIntobi.wert) {
			ergebnis = 0;
		}
		
		if(this.wert < VIntobi.wert) {
			ergebnis = 1;
		}
		
		
		return ergebnis;

	}

}
