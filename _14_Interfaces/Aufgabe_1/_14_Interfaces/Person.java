package _14_Interfaces;

public class Person implements NachrichtenEmpfaenger{

	private String Nachname;
	private String Vorname;
	
	
	public Person(String nachname, String vorname) {
		super();
		Nachname = nachname;
		Vorname = vorname;
	}
	
	
	public void setNachname(String nachname) {
		Nachname = nachname;
	}
	public String getVorname() {
		return Vorname;
	}
	public void setVorname(String vorname) {
		Vorname = vorname;
	}


	@Override
	public void empfangeNachrichten(String nachricht) {
		System.out.println("Nachrichten an : " + Nachname + ", " + Vorname + "Inhalt: " + nachricht);
		
	}
	
	
	
}
