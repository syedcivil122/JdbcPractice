package Java;

import java.util.Scanner;

public class UnaryOperator {
public static void main(String[] args) {
	
	int p =10;
	
//	System.out.println(p++); // pre increment
//	System.out.println(p);
//	
//	System.out.println(p--); // pre decrement
//	System.out.println(p);
//	
//	int q=5;
//	System.out.println(--q); //post increment
//	System.out.println(q);
//	
//	System.out.println(q--);
//	System.out.println(q);
//	
	
//	challenges 
	// create a program that takes two numbers and show result of all arithmetic operators (+,-,*,/,%)
	
//	Scanner scan = new Scanner(System.in);
//	System.out.print("enter a number ");
//	int a = scan.nextInt();
//	System.out.print("now, enter a second number ");
//	int b = scan.nextInt();
//	
//	int add = a+b;
//	int sub = a-b;
//	int mul = a*b;
//	int div = a/b;
//	int rem = a%b;
//	
//	System.out.println("addition "+add);
//	System.out.println("subtraction "+sub);
//	System.out.println("multifilcation "+mul);
//	System.out.println("division "+div);
//	System.out.println("remendor "+rem);
	
	// create a program to calculate the product of two floating points numbers.
	 
//	Scanner scan1 = new Scanner(System.in);
//	System.out.print(" enter a float value ");
//	double a1 = scan1.nextFloat();
//	
//	System.out.println("enter a second value ");
//	double b1 = scan1.nextFloat();
//	
//	double mul1 = a1*b1;
//	
//	System.out.println("multiplication float values "+mul1);
//	
//	// create a program to calculate parameter of a rectangle.  Perimeter of rectangle ABCD = A+B+C+D
//	
//	Scanner scan2 = new Scanner(System.in);
//	System.out.print(" enter a  value ");
//	int A = scan2.nextInt();
//	System.out.print("enter a B value ");
//	int B = scan2.nextInt();
//	System.out.print("enter a C value ");
//	int C = scan2.nextInt();
//	System.out.print("enter a D value ");
//	int D = scan2.nextInt();
//	
//	
//	System.out.println("parameter of Rectangle "+(A+B+C+D)+"cm");
//	
//	// create a program to calculate the Area of Triangle. Area of Triangle = 1/2*B*H
//	System.out.println(" welcome to area of triangle  ");
//	Scanner scan3 = new Scanner(System.in);
//	System.out.print("enter a breadth value");
//	int B1 = scan3.nextInt();
//
//	System.out.print("enter a height value ");
//	int H = scan3.nextInt();
//	
//	
//	System.out.println("Area of Triangle "+(0.5*B1*H));
	
//	// create a program to calculate simple interest. Simple Interest=(P*T*R)/100
//	System.out.println(" calculate the simple interset  ");
//	Scanner scan3 = new Scanner(System.in);
//	System.out.print("enter a principle amount Rs ");
//	int P= scan3.nextInt();
//	
//	System.out.print("enter a rate of interest ");
//	double R = scan3.nextDouble();
//	System.out.print("tell me how many years are the borrowing this money ");
//	float T = scan3.nextFloat();
//	
//	
//	System.out.println("your simple interest is " +(P*T*R)/100);
//	
	// create a program to calculate compound interest. Compound interset = P(1+R/100)t
	
//	System.out.println(" calculate the simple interset  ");
//	Scanner scan3 = new Scanner(System.in);
//	System.out.print("enter a principle amount Rs ");
//	int P= scan3.nextInt();
//	
//	System.out.print("enter a rate of interest ");
//	float  R = scan3.nextFloat();
//	System.out.print("tell me how many years are the borrowing this money ");
//	float t = scan3.nextFloat();
//	
//	double compound = P*Math.pow((1+R/100),t);
//	System.out.println("your compound interest is Rs " +compound );
	
	// create a program to convert Fahrenhit to celsius.
	
	Scanner scan4 = new Scanner(System.in);
	System.out.println("welcome to temperature converter ");
	System.out.println("enter your temp in F ");
	float fah= scan4.nextFloat();
	float cel = (fah - 32 ) * 5.0f/9.0f;
	
	System.out.println("your temperater is "+ cel +" C");
	
	
	
	
	
}
}
