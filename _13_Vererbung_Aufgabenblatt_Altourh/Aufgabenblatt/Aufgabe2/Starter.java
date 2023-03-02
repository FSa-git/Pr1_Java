package Aufgabe2;

import java.util.ArrayList;

public class Starter {

	public static void main(String[] args) {
		
		Tablet iPad = new Tablet("iPad", 37.5);
		Tablet Samsung = new Tablet("Samsung", 37.5);
		String Temp = "";
		
		
		Schueler Hans = new Schueler("1", Samsung);
		
		System.out.println("Das haupt Tablet von Hans ist: " + Hans.getSeinTablet().getModelbezeichnung());
		
		
		ArrayList <Tablet> Tablets_Array_List_1 = new ArrayList<Tablet>();
		Tablets_Array_List_1.add(Samsung);
		Tablets_Array_List_1.add(iPad);
		
		for (int i = 0; i < Tablets_Array_List_1.size(); i++) {
			Temp = Tablets_Array_List_1.get(i).getModelbezeichnung();
			Temp += ", ";
			Temp += Tablets_Array_List_1.get(i).getGroesse();
		}
	}

}
