package assignment01;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        double number = scanner.nextDouble();

        System.out.println("input number: " + number);
        
        if (number == 0) {
            System.out.println("zero");
        } else if (number > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

        double absoluteValue = Math.abs(number);

        if (absoluteValue < 1) {
            System.out.println(" small");
        } else if (absoluteValue > 1000000) {
            System.out.println(" large");
        }

        scanner.close();
    
	}
}
