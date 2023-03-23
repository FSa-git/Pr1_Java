package Einführung;

import java.util.Vector;
import java.util.List;

public class MAddierer {

	public static void main(String[] args) {
		
		int sum = 0;
		Integer zahl1 = 100; 
		String name = "eins";
		List myList = new Vector(); // ähnlich wie ein Array aber man muss nicht sagen, ein Objekt was viele Einzelstücke beinhaltet. Dafür gibt es die Vektor klasse und das ist eine Liste
		
		
		// Wie bei einem Array (hier sagt die IDE/Eclipse was)
		myList.add(zahl1);
		myList.add(10);
		myList.add(15);
		// myList.add(name);
		
		// Addition aller Werte
		for (Object object : myList ) {
			sum = sum + ((Integer) object).intValue();
		}
		System.out.println(sum);
	}

}
