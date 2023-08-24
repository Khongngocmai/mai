package exercise1;

public class Student {
	public String name;
	public int roll_no;
	
	public Student() {
		
	}

	public Student(String name, int roll_no) {
		super();
		this.name = name;
		this.roll_no = roll_no;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + "]";
	}
}
