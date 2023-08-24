package exercise2;

public class Main {
	
	public static void main(String[] args) {
       
        Emloyee emp1 = new Emloyee("mai", 50000, 2015, "XYZ789");
        Emloyee emp2 = new Emloyee("khánh", 60000, 2018, "XYZ789");
        Emloyee emp3 = new Emloyee("đức", 55000, 2015, "ABC123"); 
        Emloyee emp4 = new Emloyee("mạnh", 55000, 2020, "DEF456");

        
        System.out.println("Employee 1 name: " + emp1.getName());
        System.out.println("Employee 2 salary: " + emp2.getSalary());
        System.out.println("Employee 3 start year: " + emp3.getStartYear());

        
        System.out.println("Employee 1 equals Employee 3? " + emp1.equals(emp3)); 
        System.out.println("Employee 1 equals Employee 2? " + emp1.equals(emp2)); 
        System.out.println("Employee 1 equals Employee 4? " + emp1.equals(emp4)); 
    }
}
