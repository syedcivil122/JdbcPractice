package Java;

import java.util.Scanner;

public class RelationalOperator {
	public static void main(String[] args) {
		
	
	Scanner input  = new Scanner(System.in);
	System.out.println("welcome to driverinh licence portal ");
	System.out.print("please enter your age ");
	int age = input.nextInt();
	
	if(age>=18) {
		System.out.println("you are elible to driving lience");
	}else {
		System.out.println("beta cycle chalo");
	}
	
	}
}
