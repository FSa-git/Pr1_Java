package Einführung;

import java.util.List;
import java.util.Vector;

public class MAddierer2SAFE2 {

	public static void main(String[] args) {
		
		int sum = 0;
		Integer zahl1 = 100; 
		String name = "eins";
		List<Integer> myList = new Vector<Integer>(); // In spitzen Klammern kommt die Klasse 
		
		// 
		myList.add(zahl1);
		myList.add(10);
		myList.add(15);
		
		// Addition aller Werte
		sum = addiere(myList);
		System.out.println(sum);
		
	}

	private static int addiere(List<Integer> myList) {
		int result = 0;
		
		for (Integer timoobject : myList ) {
			
				result = result + timoobject.intValue();
			
		}
		
		return result;
	}

}
