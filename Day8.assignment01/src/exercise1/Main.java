package exercise1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> arraylist = new ArrayList<>(); 
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		
		System.out.println(arraylist);
		arraylist.set(1, 4);
		System.out.println(arraylist);
	}

}
