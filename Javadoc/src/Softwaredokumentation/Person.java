package Softwaredokumentation;

/**
 * Die Klasse repräsentiert eine Person mit Informationen wie Vorname, Nachname, Alter und Adresse.
 * 
 * @author openai
 * @version 1.0
 */
public class Person {

	/**
	 * Felder der Klasse Person
	 */
	private String firstName;
	private String lastName;
	private int age;
	private String adress;
	
	/**
	 * Konstruktor
	 * 
	 * @param firstName Vorname
	 * @param lastName Nachname
	 * @param age Alter
	 * @param adress Adresse
	 */
	public Person(String firstName, String lastName, int age, String adress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.adress = adress;
	}
	
}
