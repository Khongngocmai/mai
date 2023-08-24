package fa.training.entities;

public class Student extends Person {
	
	private String studentId;
	private double theory;
	private double practice;
	
	
	


	public Student(String fullName, String gender, String phoneNumber, String email, String studentId, double theory,
			double practice) {
		super(fullName, gender, phoneNumber, email);
		this.studentId = studentId;
		this.theory = theory;
		this.practice = practice;
	}

	
	

	public String getStudentId() {
		return studentId;
	}


	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}


	public double getTheory() {
		return theory;
	}


	public void setTheory(double theory) {
		this.theory = theory;
	}


	public double getPractice() {
		return practice;
	}


	public void setPractice(double practice) {
		this.practice = practice;
	}


	public double calculateFinalMark() {
	        return (this.theory + this.practice) / 2;
	    
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", theory=" + theory + ", practice=" + practice + super.toString()+ "]";
	}
	
}
