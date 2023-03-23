package Lösungen_WS;

import java.util.Scanner;

public class Quersumme {

	public static void main ( String[] args ) {

        try ( Scanner sc = new Scanner(System.in) ) {
            System.out.print("Bitte gebe eine Zahl ein: ");
            int zahl = sc.nextInt();

            System.out.println(berechneQuersumme(zahl));
        } catch ( IllegalArgumentException e ) {
            System.out.println(e.getMessage());
        } catch ( Exception e ) {
            System.out.println("Es ist ein Fehler aufgetreten");
        } finally {
            System.out.println("Danke für die Nutzung");
        }

    }

    public static int berechneQuersumme ( int zahl ) {
        if ( zahl < 0 ) {
            throw new IllegalArgumentException("Deine Zahl muss größer als 0 sein");
        }

        int quersumme = 0;

        while ( zahl > 0 ) {
            quersumme += zahl % 10;
            zahl /= 10;
        }

        return quersumme;
    }
}
