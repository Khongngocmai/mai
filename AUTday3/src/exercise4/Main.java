package exercise4;

public class Main {

	public static void main(String[] args) {
		
	        Employee employee1 = new Employee();
	        employee1.getInfo(450, 8);
	        employee1.AddSal();
	        employee1.addWork();
	        employee1.printFinalSalary();

	        Employee employee2 = new Employee();
	        employee2.getInfo(600, 7);
	        employee2.AddSal();
	        employee2.addWork();
	        employee2.printFinalSalary();
	    }
	

}
