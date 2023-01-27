package gds2.pr1_27_01_23;

import java.util.Scanner;

public class Rekursion {

	public static void main(String[] args) {
		System.out.println("Geben Sie eine Zeile ein, solange die Zeile nicht mit _ anfängt geht es weiter.");
        liesZeichen();
        System.out.println("Ende der Rekursion.");
    }

    public static void liesZeichen () {
        Scanner sc = new Scanner(System.in);
        char z;
        z = sc.nextLine().charAt(0);

        if ( z != '_' ) {
            liesZeichen();
        }
        System.out.println(z);
        sc.close();
    }

}
