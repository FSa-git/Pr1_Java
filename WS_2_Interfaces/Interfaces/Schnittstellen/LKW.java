package Schnittstellen;

public class LKW implements Driveable {

	@Override
	public void beschleunigen(double a) {
		// Hereingeben --> a = 0,5 m/s^2, v = 100 km/h = 27,8 m/s Formel: t = v / a
		double v = 27.8;
		double t = v / a;
		
		System.out.println("Zeit von 0 auf 100 km/h beträgt: " + t + " Sekunden");

	}

	@Override
	public void verzeogern(double a) {
		// TODO Auto-generated method stub

	}

}
