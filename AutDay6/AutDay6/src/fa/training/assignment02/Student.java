package fa.training.assignment02;

public class Student extends Person {

	private String studentID;
	private double theory;
	private double practice;
	
	public Student(String name, boolean gender, String phone, String email, String studentID, double theory,
			double practice) {
		super(name, gender, phone, email);
		this.studentID = studentID;
		this.theory = theory;
		this.practice = practice;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
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
	
	public double calcFinalMark() {
		return (this.theory + this.practice)/2;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", theory=" + theory + ", practice=" + practice + super.toString()+ "]";
	}
	
	
}
