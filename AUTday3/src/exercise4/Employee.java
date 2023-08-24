package exercise4;

public class Employee {
	
	public double salary;
	public int hours;
	
	public void getInfo(double salary, int hours) {
		this.salary = salary;
		this.hours = hours;
	}
	
	public void AddSal() {
		if(salary < 500) {
			 salary += 10;
		}
	}
	
	public void addWork() {
		if(hours > 6) {
			 salary += 5;
		}
	}
	public void printFinalSalary() {
	    System.out.println("Final Salary: $" + salary);
	}
}
