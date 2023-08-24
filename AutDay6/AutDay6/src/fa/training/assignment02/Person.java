package fa.training.assignment02;

public abstract class Person {

	private String name;
	private boolean gender;
	private String phone;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Person(String name, boolean gender, String phone, String email) {
		super();
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return " name=" + name + ", gender=" + gender + ", phone=" + phone + ", email=" + email ;
	}
	
	
	
}
