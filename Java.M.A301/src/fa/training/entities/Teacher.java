package fa.training.entities;

public class Teacher extends Person {
	
	private double basicSalary;
    private double subsidy;
		
	public Teacher(String fullName, String gender, String phoneNumber, String email, double basicSalary,
			double subsidy) {
		super(fullName, gender, phoneNumber, email);
		this.basicSalary = basicSalary;
		this.subsidy = subsidy;
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getSubsidy() {
		return subsidy;
	}
	public void setSubsidy(double subsidy) {
		this.subsidy = subsidy;
	}

	public double calculateSalary() {
	        return this.basicSalary + this.subsidy;
	 }

	@Override
	public String toString() {
		return "Teacher [basicSalary=" + basicSalary + ", subsidy=" + subsidy + super.toString()+ "]";
	}
	
}
