package Lösungen_WS;

public class Wurzel {

	public static void main(String[] args) {
		
		double input = 42;
		double ergebnis;
		
		try {
			ergebnis = berechneWurzel(input);
			System.out.println("wurzel" + ergebnis);
			
		} 
		catch (ArithmeticException e) { // Arithmetische Exception
			System.out.println("Hier behandelt Dr.Painless");
			System.out.println(e.getMessage());
		}
		catch (Exception e) { // Allgemeine Exception
			e.printStackTrace();
		}
	}
	
	static double berechneWurzel(double x) {

        return Math.sqrt(x);
    }
}
