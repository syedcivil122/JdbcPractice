package ClassesAndObjects;

import java.awt.Color;

public class Driver {
	public static void main(String[] args) {
//		Car mycar =new Car();
//		mycar.addfuel(6);
//		mycar.Drive();
//		mycar.Drive();
//		mycar.Drive();
//		mycar.addfuel(3);
//		mycar.Drive();
//		mycar.Drive();
//		mycar.Drive();
//		mycar.Drive();
//		mycar.Drive();
//		mycar.Drive();
//		mycar.Drive();
//		System.out.println(mycar.getCurrentFuelLevel());
		
//		Car swift = new Car();
//		swift.addfuel(6);
//		swift.start();
//		swift.Drive();
//		System.out.println(swift.colour);
		
		Car swift1 = new Car("Red");
//		swift1.addfuel(7);
//		Car startedCar = swift1.start();
//		startedCar.Drive();
		swift1.start().Drive();    // we can call this way also
		System.out.println(swift1.colour);
		
		
		
		
		
	}

	

}
