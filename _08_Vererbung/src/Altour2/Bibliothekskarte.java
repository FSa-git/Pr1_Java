package Altour2;

public class Bibliothekskarte extends CHipKarte {

	protected int AnzahlentlieheneBuecher;

	public int getAnzahlentlieheneBuecher() {
		return AnzahlentlieheneBuecher;
	}

	public void setAnzahlentlieheneBuecher(int anzahlentlieheneBuecher) {
		AnzahlentlieheneBuecher = anzahlentlieheneBuecher;
	}
	
	public void StatusAnzeigen() {
		System.out.println("StatusAnzeigen in Bibliothek: ");
	}
	
	public static void main(String[] args) {
		System.out.println();
	}
	
}
