package practice1;

public class Teacher extends Person {
	
	private double salary;

	public Teacher(String name, int age, String address, double salary) {
		super(name, age, address);
		this.salary = salary;
		
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Salary: " + salary);
	}

}
