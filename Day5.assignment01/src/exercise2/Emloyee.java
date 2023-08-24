package exercise2;

public class Emloyee extends Person {
	
	private double salary;
	private int startYear;
	private String nationalnsurance;
	

	

	public Emloyee(String name, double salary, int startYear, String nationalnsurance) {
		this.salary = salary;
		this.startYear = startYear;
		this.nationalnsurance = nationalnsurance;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getStartYear() {
		return startYear;
	}

	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	public String getNationalnsurance() {
		return nationalnsurance;
	}

	public void setNationalnsurance(String nationalnsurance) {
		this.nationalnsurance = nationalnsurance;
	}
	


	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Emloyee other = (Emloyee) obj;
        return this.getNationalnsurance().equals(other.getNationalnsurance());
    }
}
