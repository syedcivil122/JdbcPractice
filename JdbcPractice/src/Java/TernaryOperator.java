package Java;

import java.util.Scanner;

public class TernaryOperator {
	
   public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    System.out.println("Welcome to the ternary Operator");
	    System.out.print("Enter the number");
	    int num1 = input.nextInt();
	    System.out.println("Enter the second number");
	    int num2 = input.nextInt();
	    
//	    if(num1>num2) {
//	    	System.out.println("greaterthan  number is  "+ num1);
//	    }else {
//	    	System.out.println("greaterthan number is " + num2);
//	    }
	    
//	    int greaterNumber;
//	    if(num1 > num2) {
//	    	greaterNumber = num1;
//	    }else {
//	    	greaterNumber = num2;
//	    }System.out.println("greaterthan value is " + greaterNumber);
	    
	    
	    int greaterNumber = num1 > num2 ?  num1 : num2;   // Ternary Operator
	    System.out.println("greater number " + greaterNumber);
	    
}
}
