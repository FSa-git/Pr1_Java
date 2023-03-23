package Lösungen_WS;

import java.util.Scanner;

public class BMI {

	public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);
        Scanner sd = null; // Variante 2 Scanner

        System.out.print("Bitte gebe deine Körpergröße ein: ");
        double koerpergroesse = sc.nextDouble();

        System.out.print("Bitte gebe dein Gewicht ein: ");
        double gewicht = sc.nextDouble();

        try {
        	sd = new Scanner(System.in); // Variante 2 Scanner
            System.out.println(berechneBMI(koerpergroesse, gewicht));
        } 
        catch (IllegalArgumentException e) {
        	System.out.println("Hier bin ich");
        	System.out.println(e.getMessage());
        }
        catch ( Exception e ) {
            System.out.println(e.getMessage());
        }
        
        // Variante 2 Scanner
        finally {
        	sd.close();
        }
        
        sc.close();
    }

    static double berechneBMI ( double gewicht, double groesse ) throws Exception {
        if ( groesse <= 0 || groesse > 3 ) throw new IllegalArgumentException("Die Körpergröße ist nicht möglich");
        if ( gewicht <= 0 || gewicht > 500 ) throw new Exception("Das Gewicht ist nicht möglich");
        return gewicht / ( groesse * groesse );
    }
	
}
