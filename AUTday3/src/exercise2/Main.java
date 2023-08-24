package exercise2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("length = ");
		double length = sc.nextDouble();
		
		System.out.print("breadth = ");
		double breadth = sc.nextDouble();
		
		Area rectangle = new Area(length, breadth);
		
		double area = rectangle.returnArea();
        System.out.print("Area of the rectangle is: " + area);

        sc.close();
		
	}
	
}
