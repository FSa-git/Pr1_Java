package Ausgabe_1;

public class Wurzelrechner {

	static double berechneWurzel(double x) throws Exception {
        if (x < 0) throw new Exception("Deine Zahl muss größer als 0 sein");
        return Math.sqrt(x);
        
        
    }
	
}
