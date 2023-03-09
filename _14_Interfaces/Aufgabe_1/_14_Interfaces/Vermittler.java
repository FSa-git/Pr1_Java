package _14_Interfaces;

import java.util.Vector;

public class Vermittler implements NachrichtenEmpfaenger, NachrichtenQuelle{

	Vector<Vermittler> MeineVermittlerObjs = new Vector <Vermittler>();
	
	// Man ist gezwungen die Methoden von dem Interface zu implementieren
	
	@Override
	public void anmelden(NachrichtenEmpfaenger empf) {
		// neue Zuhörer zu der Liste:
		MeineVermittlerObjs.add(empf);
		
	}

	@Override
	public void abmelden(NachrichtenEmpfaenger empf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendeNachricht(String nachricht) {
		// Gebe Nachricht an alle angemeldeten Personen weiter
		for (int i = 0; i < MeineVermittlerObjs.size(); i++) {
			NachrichtenEmpfaenger ref = MeineVermittlerObjs.elementAt(i);
			ref.empfangeNachrichten(nachricht);
			System.out.println(" Vermittler sende: " + i);
		}
		
	}

	@Override
	public void empfangeNachrichten(String nachricht) {
		System.out.println("____Vermittler empfaengt Nachricht und sendet die weiter___");
		sendeNachricht(nachricht);
	}

	
	
}
