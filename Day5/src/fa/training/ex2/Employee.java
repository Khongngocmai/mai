package fa.training.ex2;

public class Employee {

		private String name;
		private int id;
		private String address;
		private double salary;
		
		public Employee(String name, int id, String address, double salary) {
			super();
			this.name = name;
			this.id = id;
			this.address = address;
			this.salary = salary;
		}

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		

		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + ", address=" + address + ", salary=" + salary
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}

		
}
