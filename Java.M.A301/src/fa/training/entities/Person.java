package fa.training.entities;

public class Person {

		public String fullName;
		public String Gender;
		public String phoneNumber;
		public String email;
		
		
		public Person() {
			super();
			// TODO Auto-generated constructor stub
		}



		public Person(String fullName, String gender, String phoneNumber, String email) {
			super();
			this.fullName = fullName;
			this.Gender = gender;
			this.phoneNumber = phoneNumber;
			this.email = email;
		}

		
		
		public String getFullName() {
			return fullName;
		}



		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getGender() {
			return Gender;
		}

		public void setGender(String gender) {
			Gender = gender;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}


		@Override
		public String toString() {
			return "Person [fullName=" + fullName + ", Gender=" + Gender + ", phoneNumber=" + phoneNumber + ", email="
					+ email + "]";
		}
		
		
}
