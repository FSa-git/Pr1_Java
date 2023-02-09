package projektMitarbeiter;

public class TestKlasse {

	public static void main(String[] args) {
		
		// Erzeuge ein neuen Mitarbeiter 
		Mitarbeiter Wa = new Mitarbeiter("Wellstein","Andreas",1600.00);
		Mitarbeiter Dit = new Mitarbeiter("Dietrich","Hans-Martin",1650.00);
		Fuehrungskraft Krp = new Fuehrungskraft("Krapper", "Joachim", 4000.00);
		
		System.out.println(Krp.position);
		

	}

}
