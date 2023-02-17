package Aufgabe2;

public class Person {

	private String nr;
	private String name;
	private String vorname;
	
	public Person(String nr, String name, String vorname) {
			this.nr = nr;
			this.name = name;
			this.vorname = vorname;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
