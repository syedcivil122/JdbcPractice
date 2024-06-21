package Java;

import java.util.Scanner;

public class BitewiseOperator {
public static void main(String[] args) {
	// crate a program bitewise AND two operators
	Scanner input = new Scanner(System.in);
	System.out.println("welcome to grade calculator");
	int first = input.nextInt();
	System.out.print("Now enter the other number ");
	int second = input.nextInt();
	
	int result = first & second;
	System.out.println("Result is "+result);
	
	
	// crate a program bitewise OR two operators
		Scanner input1 = new Scanner(System.in);
		System.out.println("welcome to grade calculator");
		int first1 = input1.nextInt();
		System.out.print("Now enter the other number ");
		int second1 = input1.nextInt();
		
		int result1 = first1 | second1;
		System.out.println("Result is "+result1);
		
		
		// crate a program bitewise XOR two operators
		Scanner input2 = new Scanner(System.in);
		System.out.println("welcome to grade calculator");
		int firs = input2.nextInt();
		System.out.print("Now enter the other number ");
		int secon = input2.nextInt();
		
		int resul = firs ^ secon;
		System.out.println("Result is "+resul);
		
		// crate a program bitewise compliment operators
		Scanner input3 = new Scanner(System.in);
		System.out.println("welcome to grade calculator");
		System.out.print("Now enter the other number ");
		int num = input3.nextInt();
		
		int resu = ~num;
		System.out.println("Result is "+resu);
		
		// create a program Left shift
		
		Scanner scan = new Scanner(System.in);
		System.out.println("welcome to showcase leftshift ");
		System.out.println("please enter your number");
		int r = scan.nextInt();
		
		int res = r << 4;
		System.out.println("Result is "+res);
		
		// create a program Right shift
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("welcome to showcase leftshift ");
		System.out.println("please enter your number");
		int nu = scan.nextInt();
		
		int rest = nu >> 1;
		System.out.println("Result is "+rest);
		
		// create a program even or odd number using bitwise compliment 
		
		Scanner sca = new Scanner(System.in);
		System.out.println("welcome to Odd/Even numbers ");
		System.out.println("Please enter your number;");
		int num1 = sca.nextInt();
		
		if((num1 & 1) ==1) {
			System.out.println("your number is Odd number");
		}else {
			System.out.println("your number is Even number");
		}
	
}
}
