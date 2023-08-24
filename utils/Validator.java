package fa.training.utils;

import java.util.Scanner;

public class Validator {

	private static Scanner scanner = new Scanner(System.in);

	public static String inputString(String message) {
		System.out.println(message);
		return scanner.nextLine();
	}

	public static Integer inputNumber(String message, String error) {
		while (true) {
			try {
				System.out.println(message);
				return Integer.parseInt(scanner.nextLine());

			} catch (NumberFormatException e) {
				System.err.println(error);
			}
		}
	}
	public static String inputEmail(String message, String error) {
		while (true) {
			try {
				System.out.println(message);
				String email = scanner.nextLine();
				String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
				        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
				
				if(email.matches(regexPattern)) {
					return email;
				}

			} catch (NumberFormatException e) {
				System.err.println(error);
			}
			
		}
	}
}
