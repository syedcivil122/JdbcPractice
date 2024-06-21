package Java;

public class StringFormat {
	public static void main(String[] args) {
		String name = "Sandeep";
		int marks = 12345;
		float percentage = 65.4f;
		boolean present = true;
		
		System.out.println("Hello "+ name +", your marks are: " + marks+", percentage is "+ percentage + ", present "+present);
		System.out.printf("Hello %s, your marks are: %d, percentage is %.2f, is present %b",  name, marks, percentage, present);
		System.out.printf("\n Hello %-10S, your marks are: %5d, percentage is %.2f, is present %10b", name, marks, percentage, present);
}
}
