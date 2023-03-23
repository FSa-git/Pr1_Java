package Einführung;

import java.util.List;
import java.util.Vector;

public class MAddierer2SAFE {

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
		sum = addiere(myList);
		System.out.println(sum);
		
	}

	private static int addiere(List myList) {
		int result = 0;
		
		for (Object timoobject : myList ) {
			if (timoobject instanceof Integer) {
				result = result + ((Integer) timoobject).intValue(); // Die Hosenträger, früher hat man das gemacht..
			}else {
				throw new ClassCastException("Keine Liste von Integern");
			}
			
		}
		return result;
	}

}
