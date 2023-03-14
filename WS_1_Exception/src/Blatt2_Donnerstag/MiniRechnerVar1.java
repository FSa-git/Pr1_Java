package Blatt2_Donnerstag;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MiniRechnerVar1 {

	public static void main(String[] args) {
		
		try {
		
		// Deklaration
		int zaehler, nenner, divison;
		
		Scanner sc = new Scanner(System.in); System.out.println("Division zweier int-Zahlen"); 
		System.out.println("**********************"); 
		System.out.println("Bitte geben Sie den Zähler ein: "); 
		zaehler = sc.nextInt();
		
		System.out.println("Bitte geben Sie den Nenner ein: "); 
		nenner = sc.nextInt();
		divison = zaehler / nenner; 
		System.out.println("Ergebnis aus " + zaehler + " / " + nenner + " = " + divison); 
		sc.close();
		} 
		
		catch (InputMismatchException e) { System.out.println("Sie hätten bei der Eingabe besser aufpassen sollen"); 
		System.out.println(e.getMessage());
		}
		catch (ArithmeticException e) {
		String name = e.getClass().getName();
		String msg = e.getMessage();
		String toStr = e.toString();
		System.out.println( "********************************" ); 
		System.out.println( name );
		System.out.println( msg );
		System.out.println( toStr );
		System.out.println( "********************************" ); 
		e.printStackTrace();
		}
	
}
}
