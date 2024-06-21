package Java;

import java.util.Scanner;

public class ShortHandOperator {
	public static void main(String[] args) {
		
		int a = 12;
		
		System.out.println("Enter a number; ");
		Scanner input = new Scanner(System.in);
		int x1 = input.nextInt();
		//a= a+x1;
		a+=x1;
		a-=x1;
		a*= x1;
		a-= x1;
		a/= x1;
		a%= x1;
		System.out.println(a);
		
		int x2 = input.nextInt();
		a = a+x2;
		a+=x2;
		a-=x2;
		a*= x2;
		a-= x2;
		a/= x2;
		a%= x2;
		
		System.out.println(a);
		
		int x3 = input.nextInt();
		//a = a+x3;
		a+= x3;
		a-=x3;
		a*= x3;
		a-= x3;
		a/= x3;
		a%= x3;
		
		System.out.println(a);
		
		int x4 = input.nextInt();
		//a = a+x4;
		a+= x4;  // shorthand operators
		a-= x4;
		a*= x4;
		a-= x4;
		a/= x4;
		a%= x4;
		System.out.println(a);
		
		input.close();
		
		System.out.println();
	}

}
