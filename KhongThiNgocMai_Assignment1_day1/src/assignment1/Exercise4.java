package assignment1;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The first binary number:");
		
		int num = sc.nextInt();
		
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.println("The second binary number:");
		
		int num2 = scanner2.nextInt();
		
		int max = num > num2 ? num : num2;
		
		
		System.out.println(max);
	}
	
}
