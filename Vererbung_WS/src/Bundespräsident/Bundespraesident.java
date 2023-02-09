package Bundespräsident;

public class Bundespraesident extends Kunde {

	private int rabattProzent;

	public Bundespraesident(int rabattProzent, String name, int kontonummer) {
		super(name, kontonummer);
		this.rabattProzent = rabattProzent;
		this.getRabattProzent();
	}

	public int getRabattProzent() {
		return rabattProzent;
	}

	public void setRabattProzent(int rabattProzent) {
		this.rabattProzent = rabattProzent;
	}
	
	
	
}
