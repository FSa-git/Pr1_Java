package AusnahmeBehandlungen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Probe1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
        
        System.out.println("Gib die zu dividierende Zahl ein:");
        int dividend = scanner.nextInt();

        System.out.println("Gib den Divisor ein:");
        int divisor = scanner.nextInt();
        
        double result = divide(dividend, divisor);
        System.out.println("Ergebnis: " + result);
        
        }
        catch(ArithmeticException e) {
        	System.out.println("Du hast den falschen Wert eingegeben");
        	String name = e.getClass().getName(); //Wichtig_1
        	System.out.println(name);                        // Wichtig_2
        }
        catch(InputMismatchException ex) {
        	System.out.println("Du sollst eine Zahl eingeben" + ex.getMessage());
        }
        catch(Exception exception) {
        	System.out.println("Es steht hier ein Fehler" + exception.getMessage() + exception.getStackTrace());
        }
        finally {
        	scanner.close();
        	System.out.println("Ende des Programms!");
        }

        }
	
	public static double divide(int dividend, int divisor) throws ArithmeticException { // Wichtig_3
        if (divisor == 0) {
            throw new ArithmeticException();
        }
        return (double) dividend / divisor;
    }
	
    }