package gds2.de;

import java.util.Scanner;

// Dienstag 31.01.23 

public class Aufgabe1 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eingabe: ");
		n = sc.nextInt();
		
		
        //int maxZahl = n;
        for (int i = 0; i < n; i++){
            System.out.print(getFibonacciFolge(i) + ", ");
        }
    }

    public static int getFibonacciFolge(int zahl) {
//        System.out.println(zahl);
        if (zahl == 0){
            return 0;
        }
        else if (zahl == 1 || zahl == 2){
            return 1;
        }
        return getFibonacciFolge(zahl - 1) + getFibonacciFolge(zahl - 2);
    }

}
