package Bundespräsident;

public class Bundespraesident extends Kunde {

	private int rabattProzent;

	public Bundespraesident(String name, int rabattProzent) {
		super(name);
		this.rabattProzent = rabattProzent;
	}

	public int getRabattProzent() {
		return rabattProzent;
	}

	public void setRabattProzent(int rabattProzent) {
		this.rabattProzent = rabattProzent;
	}
	
	
}
