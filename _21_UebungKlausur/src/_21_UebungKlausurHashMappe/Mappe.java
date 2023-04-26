package _21_UebungKlausurHashMappe;

import java.util.HashMap;

public class Mappe {
	
	// MAP
	private static HashMap<String, String> map = new HashMap<String, String>();
	
	public static void insert(String landkreis, String stadt) {
		map.put(landkreis, stadt);
	}
	
	public static void sageKennzeichen(String stadt) {
		System.out.println(map.get(stadt));
	}
	
	// Main 
	public static void main(String[] args) {
		
		insert("BW","Stuttgart");
		insert("BB","Böblingen");
		
		System.out.println("\n Mein auto kommt aus: ");
		sageKennzeichen("BW");
		
	}
	
}
