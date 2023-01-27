package de.gds2.pr1_29_11_22;

public class Parameteruebergabe {

	public static void main(String[] args) {
		
		// Standardkonstruktor 
		Point pointA = new Point();
		Point pointB = new Point(94,172);

		pointA.move(45, 82);

		// zuerst Kalkulation danach wird Ergebnis weitergegeben 
		pointB.move(24 -12, 34*3 -45);

		// geht auch so 
		int x = 87;
		int y = 55;

		pointA.move(x, y);

		// auch Gleichungen gehen 
		pointB.move(x- 4, y*2+34);

		// Typecast 
		pointB.move((int)14.3305, (int)(34.9 -12.6));

		System.out.println("Neue Position: " + pointB);



		}
		
}
