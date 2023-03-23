package _20_AB;

import java.util.Iterator;

// Nur wenn die Klasse sich in einem anderen Package befindet.

//import _20_AB.Circle;
//import _20_AB.Figure;
//import _20_AB.Square;
//import _20_AB.Triangle;


public class FigureContainerTestDriver {

	public static void main(String[] args) {
		
		FigureContainer container = new FigureContainer();
		
		for (int i = 1; i <= 100; i++) {
			
			if(i % 3 == 0) {
				container.add(new Circle(i));
			}
			else if(i % 3 == 1) {
				container.add(new Triangle(i));
			}
			else {
				container.add(new Square(i));
			}
		}
		
		
		System.out.println("Anzahl der Elemente : " + container.size() );
		System.out.println("Enthält id 42		: " + container.contains(42) );
		System.out.println("-- Objekt 			: " + container.getFigure(42) );
		System.out.println("Enthält id 8015 	: " + container.contains(8015) );
		System.out.println("-- Objekt 			: " + container.getFigure(8015) );
		
		int count = 0;
		Iterator itr = container.iterator();
		while(itr.hasNext()) {
			itr.next();
			count++;
		}
		System.out.println("Ermittelte Anzahl der Elemente: " + count);
		
		container.drawAll();
	}
	
}
