package Aufgabe3;

public class Rezept {
	
	protected String name;
	protected double Wasser_Menge;
	protected double Kaffe_Menge;
	protected double Kakao_Menge;
	protected double Zucker_Menge;
	protected double Milch_Menge;
	
	public Rezept(String name) {
		this.name = name;
		
		switch (name) {
		
		case "Kaffe_Schwarz":{
			Wasser_Menge = 0.2;
			Kaffe_Menge = 0.02;
			Kakao_Menge = 0;
			Zucker_Menge = 0.2;
			Milch_Menge = 0;
		}
		case "Kaffe_Zucker":{
			Wasser_Menge = 0.2;
			Kaffe_Menge = 0.02;
			Kakao_Menge = 0;
			Zucker_Menge = 0.02;
			Milch_Menge = 0.2;
		}
		case "Kaffe_Milch_Zucker":{
			Wasser_Menge = 0.2;
			Kaffe_Menge = 0.02;
			Kakao_Menge = 0;
			Zucker_Menge = 0.2;
			Milch_Menge = 0;
		}
		case "Kakako":{
			Wasser_Menge = 0.2;
			Kaffe_Menge = 0.02;
			Kakao_Menge = 5;
			Zucker_Menge = 0.2;
			Milch_Menge = 0;
		}
		default:{
			System.out.println("Bitte treffen Sie einen von den folgenden Getränke: ");
			System.out.println(", Kaffee_Milch_Zucker, Kakao");
		}
		}
	}

}
