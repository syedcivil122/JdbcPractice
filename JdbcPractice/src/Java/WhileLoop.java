package Java;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		int num = 1; //inisilization
		while(num<=10) {
			System.out.print(num+" ");
			num = num+1;
		}System.out.println();
		
		int i = 500;
		while(i>=200) {
			System.out.print(i+" ");
			i=i-1;
		}System.out.println();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers ");
		int j =0;
		
		while(j<5) {
			int inp = input.nextInt();
			System.out.println("Number is: "+inp);
			j++;
		}
	}

}
