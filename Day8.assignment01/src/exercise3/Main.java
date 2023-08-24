package exercise3;

import java.util.Collections;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.add(2);
		stack.add(6);
		stack.add(5);
	
	
		stack.push(8);
		
		
		stack.pop();
		

		stack.size();	
	
		
		Collections.max(stack);
		
		
		Collections.min(stack);
		
		
		stack.search(2);
	
		
	}

}
