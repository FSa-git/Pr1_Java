package Schnittstellen;

public interface Driveable {

	int RAEDER = 2; // Konstante
					// implizit public static final bzw. der Int ist public static final (unveränderbar)
	
	void beschleunigen(double a); // Methoden die sich von hieraus implementiert werden 
	void verzeogern(double a);
	
}
