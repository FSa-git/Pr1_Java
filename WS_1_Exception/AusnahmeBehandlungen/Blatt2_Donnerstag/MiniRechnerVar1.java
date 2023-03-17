package Blatt2_Donnerstag; // 16.03.23

import java.util.InputMismatchException;
import java.util.Scanner;

public class MiniRechnerVar1 {

	public static void main(String[] args) {
		
		// Deklaration
		double zaehler, nenner, division;
		
		try {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Division zweier int-Zahlen"); 
		System.out.println("**********************"); 
		System.out.println("Bitte geben Sie den Zähler ein: "); 
		zaehler = sc.nextDouble();
		
		System.out.println("Bitte geben Sie den Nenner ein: "); 
		nenner = sc.nextDouble();
		division = berechneDivision(zaehler, nenner);
		 
		System.out.println("Ergebnis aus " + zaehler + " / " + nenner + " = " + division); 
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
		finally {
			
		}
		
		}

	private static double berechneDivision(double zaehler, double nenner) {
		double division = 0.0;
		String fehlermeldung  = "Durch 0 teilen geht doch net";
		
		// System.out.println("Moinsen");
		
		/* Variante 1 mit Ausklammern */
		//
		if (nenner == 0.0) {
			throw new ArithmeticException(fehlermeldung);// Konstruktor nimmt irgendeine Fehlermeldung
		} // Wirf mir einen Fehler (throw)
		else {
			division = zaehler / nenner;
		}
		//

		return division;
		
		// Da wo das Problem aftretet, da bearbeite ich das Problem
	}
}
