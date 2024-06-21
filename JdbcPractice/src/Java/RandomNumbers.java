package Java;

import java.util.Iterator;

public class RandomNumbers {
	
	public static void main(String[] args) {
		System.out.println(Math.abs(-99));
		System.out.println(Math.ceil(5.07));
		System.out.println(Math.floor(5.07));
		System.out.println(Math.round(5.5));
		System.out.println(Math.random());
		System.out.println(Math.PI);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		}
		
		for (int i = 0; i < 10; i++) {
			double random = Math.random() * 100;
			System.out.println(random);
		}
	}

}
