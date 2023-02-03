package Altour2;

public class Mensakarte extends CHipKarte{

	protected int anzahlEssen;
	protected int mensaStandort;
	
	void aufladen(int Add_AnzahlEssen) {
		anzahlEssen += Add_AnzahlEssen;
	}
	
	public int getMensaStandort() {
		return mensaStandort;
	}
	
	public void setMensaStandort(int mensaStandort) {
		this.mensaStandort = mensaStandort;
	}
	
}
