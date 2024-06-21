package Java;

public class FinalKeyword {
	
	final double PI = 3.1412;
	
	void testing() {
		PI = 34;
		System.out.println("This is method");
	}
	
	public static void main(String[] args) {
		FinalKeyword f= new FinalKeyword();
		         f.testing();
	}
}	
