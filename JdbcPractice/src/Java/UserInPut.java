package Java;

import java.util.Scanner;

public class UserInPut {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		System.out.println("Welcome "+name);
		System.out.print("tell me your age ");
		
		int age = input.nextInt();
		System.out.println(" age is "+ age);
		
		System.out.println("tell me your sal: ");
		float sal = input.nextFloat();
		System.out.println(sal);
		
		System.out.println("tell me your number: ");
		long mobile = input.nextLong();
		System.out.println("my number is "+mobile);
		
		
		
		input.close();
		
		
//	Challenge Questions
		// Create a program to input name of the person and respond with "WELCOME NAME to kg coding"
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name; ");
		String nam = scan.nextLine();
		System.out.println("WELCOME " +nam + " to kg coding");
		
		scan.close();
		
//		create a program to add numbers
		
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Enter a number; ");
		int num1 = scan1.nextInt();
		System.out.print("Enter a 2nd number; ");
		int num2 = scan1.nextInt();
		int sum = num1 + num2;
		System.out.println("sum "+sum);
		scan1.close();
		
		
	}
}
