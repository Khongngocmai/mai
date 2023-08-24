package assignment01;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Input of number terms: ");
		int n = scanner.nextInt();
		
		for ( int i= 1; i <= n; i++ ) {
            int cube = i * i * i; // double cube = Math.pow(i,3); 
			System.out.println("Number is: " + i + " and cube of " + i + " is: " + cube);
		}
		
		scanner.close();
		
		
	}

}
