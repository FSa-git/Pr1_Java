package Altour2;

public class CHipKarte {

	protected int eigentümerNummer;
	protected String status;
	
	
	public int getEigentümerNummer() {
		return eigentümerNummer;
	}
	
	public void setEigentümerNummer(int eigentümerNummer) {
		this.eigentümerNummer = eigentümerNummer;
	}
	
	public void getStatus() {
		System.out.println(status);
	}
	
	public static void main(String[] args) {
		System.out.println("MainClass start");
	}
}
