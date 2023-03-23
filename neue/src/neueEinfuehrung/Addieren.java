package neueEinfuehrung;

import java.util.List;
import java.util.Vector;

public class Addieren {

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
		for (int i = 0; i < myList.size(); i++) {
			
			// Casten auf Integer
			sum = sum + ((Integer) myList.get(i)).intValue();			
		}
		System.out.println(sum);
		
		for (Object object : myList ) {
			sum = sum + ((Integer) object).intValue();
		}
	}

	
}
