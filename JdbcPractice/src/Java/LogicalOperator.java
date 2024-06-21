package Java;

import java.util.Scanner;

public class LogicalOperator {
public static void main(String[] args) {
//	Scanner input = new Scanner(System.in);
//	System.out.print("Please Enter Your age ");
//	int age = input.nextInt();
//	System.out.println("Are you Female? (true/false) ");
//	boolean isFemale = false;
//	
//	if(age<5) {
//		System.out.println("you are eligible for 75% discount");
//	}else if(isFemale){
//		System.out.println("you got 50% discount ");
//	}else if(age> 60 && !isFemale) {
//		System.out.println("you got 25% discount");
//	}else {
//		System.out.println("you got no discount");
//	}
	
	// challenges
	// create a program that determine if a number is positive or negative
//	Scanner input1 = new Scanner(System.in);
//	System.out.print("Please Enter number ");
//	int a = input1.nextInt();
//	
//	if(a>0) {
//		System.out.println("positive number");
//	}else if(a>=0){
//		System.out.println("zero number");
//	}else {
//		System.out.println("negative number");
//	}
	
	// create  a program if a number is odd or even numbers
	
//	Scanner input2 = new Scanner(System.in);
//	System.out.print("Please Enter a number ");
//	int i = input2.nextInt();
//	
//	if(i%2==0) {
//		System.out.println("even number");
//	}else {
//		System.out.println("odd number");
//	}
	
	// create a program greatest of the three numbers
//	Scanner input3 = new Scanner(System.in);
//	System.out.print("Welcome to the world three ");
//	System.out.print("please enter first number");
//	int a =input3.nextInt();
//	System.out.print("please enter second number");
//	int b =input3.nextInt();
//	System.out.print("please enter third number");
//	int c =input3.nextInt();
//	
//	if(a>=b && a>=c) {
//		System.out.println("first is a greater ");
//	}else if(b>=a && b>=c) {
//		System.out.println("second is a greater");
//	}else {
//		System.out.println("third is a number");
//	}
	
	// create a program that determines if a given year is leap year
//	Scanner input4 = new Scanner(System.in);
//	System.out.print("please enter the year");
//	int yr = input4.nextInt();
//	
//	if(yr%400 == 0) {
//		System.out.println("leap year");
//	}else if(yr % 100 ==0) {
//		System.out.println("your year is not a leap year");
//	}else if(yr % 4 == 0) {
//		System.out.println("your year is leap year");
//	}else {
//		System.out.println("your year is not leap year");
//		
//	}
	
	
//	if(yr % 400 ==0 || yr% 4 ==0 && yr% 100 !=0) {
//		System.out.println("your yr is a leap year");
//	}else {
//		System.out.println("your year is not leap year");
//		
//	}
	
	// create a program that calculate grade based
	
//	Scanner input5 = new Scanner(System.in);
//	System.out.println("welcome to grade calculator");
//	float percentage = input5.nextFloat();
//	
//	if(percentage >= 90) {
//		System.out.println("grade is above 90%");
//	}else if(percentage>= 75) {
//		System.out.println("grade is above 75%");
//	}else if(percentage >= 60) {
//		System.out.println("grade is above 60%");
//	}else if(percentage >=30) {
//		System.out.println("grade is above 30%");
//	}else {
//		System.out.println("sorry, you have got fail the test");
//	}
	
	// create a program that categroize the person age 
	Scanner input6 = new Scanner(System.in);
	System.out.println("welcome to the age calculator");
	System.out.println("please enter your age");
	int age = input6.nextInt();
	
	if(age >=60) {
		System.out.println("your age is senior citizen");
	}else if(age >= 20) {
		System.out.println("your age is adult");
	}else if(age >= 13) {
		System.out.println("your age is teenage");
	}else {
		System.out.println("your age is child");
	}
	
}
}
