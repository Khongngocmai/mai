package fa.training.assignment02;

public class Teacher extends Person {

	private double salary;
	private double subsidy;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name, boolean gender, String phone, String email, double salary, double subsidy) {
		super(name, gender, phone, email);
		this.salary = salary;
		this.subsidy = subsidy;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSubsidy() {
		return subsidy;
	}
	public void setSubsidy(double subsidy) {
		this.subsidy = subsidy;
	}
	
	public double calcSalary() {
		return this.salary + this.subsidy;
	}
	@Override
	public String toString() {
		return "Teacher [salary=" + salary + ", subsidy=" + subsidy + super.toString()+ " ]";
	}
	
}
