package Java;

public class Car {

	int noOfWheels;
	int noOfDoors;
	int maxSpeed;
	String name;
	String modelNumber;
	String company;
	
	public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
		super();
		this.noOfWheels = noOfWheels;
		this.noOfDoors = noOfDoors;
		this.maxSpeed = maxSpeed;
		this.name = name;
		this.modelNumber = modelNumber;
		this.company = company;
	}
	
	

	@Override
	public String toString() {
		return "Car [noOfWheels=" + noOfWheels + ", noOfDoors=" + noOfDoors + ", maxSpeed=" + maxSpeed + ", name="
				+ name + ", modelNumber=" + modelNumber + ", company=" + company + "]";
	}



	public static void main(String[] args) {
		Car c = new Car(4, 4, 180, "Swift", "SW876", "Maruti");
		System.out.println(c);
	}
	
}
