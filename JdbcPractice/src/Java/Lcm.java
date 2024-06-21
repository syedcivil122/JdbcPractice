package Java;

import java.util.Scanner;

public class Lcm {
	
	public static void main(String[] args) {
	// create a program to find the Least Common Multiple (LCM) of two numbers
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome to LCM");
	System.out.print("please enter a number");
	int first = input.nextInt();
	System.out.print("please enter your number");
	int second = input.nextInt();
	int lcm = lcm(first, second);
	System.out.println("LCM of the two numbers is: "+lcm);
	}
	
	public static int lcm(int first,int second ) {
		int i = 1;
		while (true) {
			int factor = first*i;
			if(factor % second == 0) {
				return factor;
			}
			i++;
		}
		
	}

}
