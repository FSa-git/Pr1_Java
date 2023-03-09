package _14_Interfaces;

interface NachrichtenQuelle {

	/*
	 * Interfaces sind so gesehen Tool, es ist eine static class aber ich kann nur Methoden rein definieren. 
	 * Man kann nur funktionen definieren bzw. deklarieren. 
	 * Wieso nicht alles in einer Klasse? Main Klasse würde zu riesig und unordentlich sein und man kann nur eine Klasse erben, aber aus verschiedenen Interfaces erben.
	 * 
	 * */
	
	
	// Interessierte können sich bei der Quelle anmelden 
	// (falls sie noch nicht angemeldet sind)
	public void anmelden(NachrichtenEmpfaenger empf);
	
	// Angemeldete können sich bei der Quelle wieder abmelden 
	// (falls sie angemeldet sind)
	public void abmelden(NachrichtenEmpfaenger empf);
	
	// neue Nachricht wird an alle angemeldet 
	// Empfaenger uebergeben
	// (Aufruf deren Methode empfangeNachricht)
	public void sendeNachricht(String Nachricht);
}
