package Java;

import java.util.Scanner;

public class Circle {
	
	// calculate the area and circumference of a circle for a given radius using Math,PI
	double radiusInMm;
	
	public Circle(double radiusInMm) {
		super();
		this.radiusInMm = radiusInMm;
	}
	
		double getcircumference() {
			return 2 * radiusInMm * Math.PI;
		}
		
		double getArea() {
			return Math.PI * Math.pow(radiusInMm, 2);
			
		}

		
	@Override
		public String toString() {
			return "Circle radiusInMm=" + radiusInMm  +", Circumference in mm: " + getcircumference()
			        + ", Area in mm2: " + getArea();
		}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Circle area ");
		System.out.print("please enter the radius value ");
		double radius = input.nextDouble();
		Circle circle = new Circle(radius);
		System.out.println(circle);
	}
		
		
}
