package Java;

public class Parameter {
	public static void main(String[] args) {
		System.out.println(sumNumbers(4,7));
		System.out.println(sumNumbers(5,9));
		System.out.println(sumNumbers(-67,67));
		
	}
	
	public static int sumNumbers(int first, int second) {// parameters & arguments
		System.out.println("First Number received: "+first);
		System.out.println("Second Number received: "+second);
		int sum = first+second;
		return sum;
	}

}
