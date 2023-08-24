package assignment;

import java.util.Scanner;

public class LogicalExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        System.out.print(" first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("second integer: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber != secondNumber) {
            System.out.println(firstNumber + " != " + secondNumber);
        }

        if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " < " + secondNumber);
        }

        if (firstNumber <= secondNumber) {
            System.out.println(firstNumber + " <= " + secondNumber);
        }

        scanner.close();
	}

}
