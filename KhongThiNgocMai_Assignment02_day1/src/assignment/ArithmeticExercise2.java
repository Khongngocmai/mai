package assignment;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" first number:");
		int a = scanner.nextInt();
		System.out.println(" first number:");
		int b = scanner.nextInt();
		
		
		
		System.out.println(a +" + " + b +" = " + (a+b));
		System.out.println(a +" - " + b +" = " + (a-b));
		System.out.println(a +" * " + b +" = " + (a*b));
		System.out.println(a +" / " + b +" = " + (a/b));
		System.out.println(a +" % " + b +" = " + (a%b));
		
		scanner.close();
		
	}

}
