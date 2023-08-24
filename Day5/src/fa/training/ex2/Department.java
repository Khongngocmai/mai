package fa.training.ex2;

import java.util.List;

public class Department  {

		private Employee[] employees = new Employee[1000];
		private static int count;
		
		public void add(Employee employee) {
			employees[count++] = employee;
		}
		public void remove() {
			
		}
}

