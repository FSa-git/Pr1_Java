package Afugabe1;

import java.util.HashMap;

// Hashmap setzt Wert bereit 

public class KFZMapping {
	
	private static HashMap<String, String> map = new HashMap<String, String>(); //Key und Value, Map ist hier ein Merker

	public static void insert (String kennzeichen, String Landkreis)
	{
		map.put(kennzeichen, Landkreis);
	}
	
	public static void remove(String kennzeichen) {
		map.remove(kennzeichen);
	}
	
	public static void printlandkreis(String kennzeichen) {
		System.out.println(map.get(kennzeichen));
	}
	
	// Main
	public static void main(String[] args) {
		insert("S","Stuggi");
		insert("BB", "Böblingen");
		printlandkreis("BB");
		remove("BB");
		printlandkreis("BB");
		printlandkreis("S"); // Wenn key nicht eindeutig ist überschreibt er den nächtsten Key 
		
		insert("willi", null);
		printlandkreis("willi");
		
		insert(null, "Daisy");
		System.out.println("***");
		printlandkreis(null);
		
	}
	
}
