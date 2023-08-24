package assignment01;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("number of rows: ");
		int numRows = scanner.nextInt();
		
		for (int i = 1; i <= numRows; i++) {
            // Inner loop to print the numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
		scanner.close();
	}

}
