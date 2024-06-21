package Java;

import java.util.Scanner;

public class ArrayOccurances {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Array Occurances");
		int[] numArr = ArrayUtility.inputArray();
		System.out.print("Please Enter the number ");
		int num = input.nextInt();
		int oocurances = occurances(numArr, num);
		System.out.println("your element was found "+ occurances(numArr, num));
	}
	
	public static  int occurances(int [] numArr, int num) {
		int occo = 0;
		int i = 0;
		while(i < numArr.length) {
			if(numArr[i] == 0) {
				occo++;
			}
			i++;
		}
		
		return occo;
		
	}

}
