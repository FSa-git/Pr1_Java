package Enum2;

public class Main {

	public static void main(String[] args) {
		
		Transport t1 = Transport.TRAIN; 
		Transport t2 = Transport.BIKE;
		
//		switch (t1) {
//			case TRAIN -> System.out.println("It is a Train!");
//			case BIKE -> System.out.println("It is a Bike");
//			case default -> System.out.println("It is smt else..");
//		}

		switch (t2) {
		case TRAIN:  System.out.println("It is a Train");
		case BIKE:  System.out.println("It is a fkn Bike");
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + t2);
		}
		
	}

}
