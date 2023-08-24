package exercise3;

public class Main {

	public static void main(String[] args) {
		
		employee employee1 = new employee("Robert", 1994, 50000, "64C- WallsStreat");
        employee employee2 = new employee("Sam", 2000, 60000, "68D- WallsStreat");
        employee employee3 = new employee("John", 1999, 55000, "26B- WallsStreat");
        
        System.out.println("Name \t Year of joining \t Salary \t Address");
        System.out.println(employee1.name + "\t\t" + employee1.year_of_joining + "\t\t" + employee1.salary + "\t\t" + employee1.address);
        System.out.println(employee2.name + "\t\t" + employee2.year_of_joining + "\t\t" + employee2.salary + "\t\t" + employee2.address);
        System.out.println(employee3.name + "\t\t" + employee3.year_of_joining + "\t\t" + employee3.salary + "\t\t" + employee3.address);

	}

}
