package exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> lst = new ArrayList<>();
		
		do {
			System.out.println("Nhap number: ");
			int number = Integer.parseInt(sc.nextLine());
			if(number>=1 && number <=64) {
				lst.add(number);
			}
			
			System.out.println("Continue y/n");
			String cont =  sc.nextLine();

			if("y".equalsIgnoreCase(cont)) {
				break;
			}
		} while (true);
		Collections.reverse(lst);
		System.out.println(lst);
		
	}
		
//		int[] numbers = new int[64];
//		for(int i = 0;i<64;i++) {
//			numbers[i] = i+1;
//		}
//		
//		for(int i=63;i>=0;i--) {
//			System.out.print(numbers[i]+ " ");
//		S
}
