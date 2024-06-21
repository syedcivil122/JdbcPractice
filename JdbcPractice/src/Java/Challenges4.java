package Java;

public class Challenges4 {
	
	// define a student class with fields like name and age and use toString to print student details
	String name ;  // instance variable
	int age;    // instance variable
	
	public Challenges4(String name, int age) {  // constructor
		super();
		this.name = name;    
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Challenges4 [name=" + name + ", age=" + age + "]";
	}

	// Concatenate and Convert: Take two strings, concatenate them, and convert the result to uppercase
	public void concatenateString() {
		String city = "hyderabad";
		String location = "Telangana";
		
//		String srea = city.concat(" "+location);
		String srea = city.concat(" ").concat(location);
		System.out.println(srea);
		String st = city.toUpperCase();
		String st1 = location.toUpperCase();
		
		System.out.println(city.toUpperCase() +" "+ location.toUpperCase());
//		System.out.println(st);
//		System.out.println(st1);
		
	}
	
	
	
	public static void main(String[] args) {
		Challenges4 c = new Challenges4("syed", 25);
		System.out.println(c);
		c.concatenateString();
	}
	
	
}
