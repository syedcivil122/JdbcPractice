package Java;

import java.util.Scanner;

public class Challenge2 {      // class name
	
	// challenge Number 1
	public void findMinimumTwoNumbers() {      // instance method
		Scanner input = new Scanner(System.in);   // user input Scanner method
		System.out.println("Welcome to finding minimum");
		System.out.print("please enter your first number ");
		int num1 = input.nextInt();    // input int value
		System.out.print("Please enter your second number ");
		int num2 = input.nextInt();
		
		int min =min(num1, num2);     
		System.out.println("Minimum number is: "+min);
		
		input.close();
	}
	
	public int min(int num1, int num2) {
		return num1 < num2 ? num1 : num2;    //  condition ? Expression
//		if(num1<num2) {
//			return num1;
//		}else {
//			return num2;
//		}
	}
	
	
	// challenge Number 2
	
	public void oddEvenTernery() {
		Scanner input1= new Scanner(System.in);
		System.out.println("Welcome to Odd Even Number ");
		System.out.print("please enter a number ");
		int num1 = input1.nextInt();
		String result = num1 % 2 ==0 ? "Even" : "Odd";
		System.out.println("Your Enter number is "+result);
	}
	
	// challenge number 3
	public void absulateTernary() {
		Scanner input1= new Scanner(System.in);
		System.out.println("Welcome to Absulte Value ");
		System.out.print("please enter a number ");
		int num1 = input1.nextInt();
		int result = num1 >= 0 ? num1 : -num1;    // absulate number using Ternary Expression
		System.out.println("Absulte value is "+result);
	}
	
	// challenge number 4
	// craete a program to Based on a student's score
	public void studentScoreTernary() {
		Scanner input1= new Scanner(System.in);
		System.out.println("Welcome to Student Score ");
		System.out.print("please enter your marks ");
		int marks = input1.nextInt();
		String category =marks > 80 ? "High" :(marks >50 ? "Moderate" : "Low");  // nested Ternary
		System.out.println("your category is: "+category);
		
	}
	
	// challenge Number 5
	// create a program to print the month of the year
	public void monthSwitch() {
		Scanner input1= new Scanner(System.in);
		System.out.println("Welcome to Month Mapping");
		System.out.print("please enter your month number ");
		int monthNum = input1.nextInt();
		String monthName  = getMonthName(monthNum);
		System.out.println("Your month name is: "+monthName);
		
	}
	
	public String getMonthName(int monthNum) {
		return switch (monthNum) {
		case 1 -> "Janvary";
		case 2 -> "February";
		case 3 -> "March";
		case 4 -> "April";
		case 5 -> "May";
		case 6 -> "June";
		case 7 -> "Junly";
		case 8 -> "Aguest";
		case 9 -> "Setember";
		case 10 -> "October";
		case 11 -> "November";
		case 12 -> "December";
		default -> "invalid" ;
		};
		
		
	}
	
//	 create a program simple calculator that uses swith cases
	public void calculatorSwitch() {
		Scanner input1= new Scanner(System.in);
		System.out.println("Welcome to calculator");
		System.out.print("please enter your first number ");
		int num1 = input1.nextInt();
		System.out.print("please enter your second number ");
		int num2 = input1.nextInt();
		System.out.println("Now, enter the operation ");
		String operation = input1.next();
		int result = switch (operation) {
		case "+" -> num1 + num2;
		case "-" -> num1 - num2;
		case "*" -> num1 * num2;
		case "/" -> num1 / num2;
		case "%" -> num1 % num2;
		default -> -1;
		};
		System.out.println("your answr is: "+result);
	}
	public static void main(String[] args) {  // main method
		Challenge2 c =new Challenge2();  // create object
//		c.findMinimumTwoNumbers();   // method calling
//		c.oddEvenTernery();
//		c.absulateTernary();
//		c.studentScoreTernary();
//		c.monthSwitch();
		c.calculatorSwitch();
	}
}
