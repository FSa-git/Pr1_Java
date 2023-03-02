package Aufgabe3;

public abstract class Behealter {

	protected double fuellstand;
	protected double Max;
	
	
	public Behealter(double fuellstand, double max) {
		fuellstand = fuellstand;
		Max = max;
	}
	
	@Override
	public abstract String toString();
	
}
