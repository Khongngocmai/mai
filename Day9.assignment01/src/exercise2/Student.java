package exercise2;

import java.io.Serializable;

public class Student implements Serializable {

	String First;
	String Last;
	String email;
	
	public Student(String first, String last, String email) {
		super();
		First = first;
		Last = last;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [First=" + First + ", Last=" + Last + ", email=" + email + "]";
	}
	
	
}
