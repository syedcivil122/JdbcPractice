package Java;

import java.util.Scanner;

public class Assignment {
	//Assignment Operator
	public static void main(String[] args) {
		// Assign the right-hand operate value to left-hand operate.
		int myNumber =10;
		System.out.println(myNumber);
		int yourNumber = myNumber;
		System.out.println(yourNumber);
		
		// Challenge write a program swap a two number
		
//		int a =10, b= 20,c;
//		
//		c = a;
//		a = b;
//		b = c;
//		System.out.println(a);
//		System.out.println(b);
		
		System.out.println("write a program swap a two numbers ");
		Scanner input=new Scanner(System.in);
		System.out.print("enter a number; ");
		int a1 = input.nextInt();
		System.out.print("enter a second number ");
		int b1 = input.nextInt();
		int c1 = a1;
		a1 = b1;
		b1 = c1;
		System.out.println(a1);
		System.out.println(b1);
		input.close();
		
		
		
	}

}
