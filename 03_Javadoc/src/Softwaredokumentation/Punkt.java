package Softwaredokumentation;

/**
 * @author fsa-git
 *
 */
public class Punkt {

    private double x;
    private double y;

    /**
     * Konstruktor // [Beschreibe hier was es ist]
     * 
     * @param x x-Koordinate
     * @param y y-Koordinate
     */
    public Punkt ( double x, double y ) {
        this.x = x;
        this.y = y;
    }

    /**
     * Distanz zwischen 2 Punkte berchnen // oder auch: diese Methode addiert 2 Punkte
     * 
     * @param p1 Punkt p1
     * @param p2 Punkt p2
     * @return Abstand
     */
    public static double dist ( Punkt p1, Punkt p2 ) {
        return Math.sqrt(Math.pow(( p1.x - p2.x ), 2) + Math.pow(( p1.y - p2.y ), 2));
    }

    /**
     * Distanz zwischen zwei Punkten berechnen (als Klassen-Methode)
     * 
     * @param p2 p2 wird verglichen
     * @return distance
     */
    public double dist ( Punkt p2 ) {
        return Math.sqrt(Math.pow(( this.x - p2.x ), 2) + Math.pow(( this.y - p2.y ), 2));
    }

    /**
     * @param p2 p2 wird verglichen
     * @return gleichheit (wenn sie die gleichen Koordinaten haben) 
     */
    public boolean gleichheit ( Punkt p2 ) {
        return this.x == p2.x && this.y == p2.y;
    }

    /**
     * Getter für die X-Koordinate
     * 
     * @return x-Koordinate
     */
    public double getX () {
        return this.x;
    }

    /**
     * Setter für die x-Koordinate
     * 
     * @param x x-Koordinate
     */
    public void setX ( double x ) {
        this.x = x;
    }

    /**
     * Gibt den Punkt mit den Koordinaten aus
     */
    public void drucken () {
        System.out.println("Punkt: (" + this.x + ", " + this.y + ")");
    }

    /**
     * @param text Text, der mitausgegeben werden soll
     */
    public void drucken ( String text ) {
        System.out.println(text);
        System.out.println("Punkt: (" + this.x + ", " + this.y + ")");
    }

}
