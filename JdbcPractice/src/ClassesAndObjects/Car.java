package ClassesAndObjects;

public class Car {
//     these properties are instance variables
	int noOfWheels;  // declare instance variables
	String colour;    // declare instance variables
	int maxOfSeats;    // declare instance variables
	float currentFuelInLiters;   // declare instance variables
	float maxSpeed;    // declare instance variables
	static int noOfCarsSold;
	
	
	static{
		    noOfCarsSold = 0;
		    System.out.println("i'm in static block");
	}
	
	{
		noOfCarsSold++;
		System.out.println("i'm in instance block");
	}
	Car (String colour){   // Constructor
		
		noOfWheels = 4;
		this.colour = colour;
		maxOfSeats = 5;
		maxSpeed = 150;
		currentFuelInLiters = 2;
		
	}
	
Car (){   // Constructor
		
		this.colour = "bLACK";
	}
	public Car start() {
		if(currentFuelInLiters == 0) {
			System.out.println("Car is out of fuel, cannot be start ");
		}else if(currentFuelInLiters < 5) {
			System.out.println("Car is reserverd mode, please refuel");
		}else {
			System.out.println("Car is started..");
		}
		return this;
		
	}
	
	public void Drive() {  // instance methods
//		if(currentFuelInLiters == 0) {
//			System.out.println("Car is out of fuel ");
//		}else if(currentFuelInLiters < 5) {
//			System.out.println("Car is reserverd mode, please refuel");
//			currentFuelInLiters--;
//		}else {
//			System.out.println("Car is Driving");
//			currentFuelInLiters--;
//		}
		currentFuelInLiters--;
		System.out.println("Car is driving");
		
	}
	
	public void addfuel(float currentFuelInLiters) {  // instance methods
		System.out.println("Add fuel");
		this.currentFuelInLiters+= currentFuelInLiters;
	}
	
	public float getCurrentFuelLevel() {
		System.out.println("get fuel");
		return currentFuelInLiters;
	}
	
	
	

}
