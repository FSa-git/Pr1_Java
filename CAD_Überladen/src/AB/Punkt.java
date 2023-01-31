package AB;

/**
 * @author fsa-git
 *
 */
public class Punkt {

	// INIT
	private double x;
	private double y;
	
	
	/**
	 * @param x
	 * @param y
	 */
	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	//Gleichheit überprüfen
	/**
     * Gleichheit von zwei Punkten prüfen
     *
     * @param p2 Zu vergleichender Punkt
     * @return gleichheit (haben Punkte die gleichen Koordinaten)
     */
	public boolean gleichheit(Punkt p2) {
		return this.getX() == p2.getX() && this.getY() == p2.getY();
	}
	
	/*
	 * Gibt den Punkt in Koordinaten aus.
	 * */
	public void drucken() {
		System.out.println("Punkt: " + this.getX() + ", " + this.getY());
	}
	
	// Überladen, da die Signatur sich nur durch die Parameter unterscheidet
	
	public void drucken(String text) {
		System.out.println("Beliebiger Text");
		System.out.println("Punkt: " + this.getX() + ", " + this.getY());
	}
	
}
