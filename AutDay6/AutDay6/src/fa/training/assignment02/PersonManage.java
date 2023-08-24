package fa.training.assignment02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonManage {
	Scanner sc = new Scanner(System.in);
	public Teacher inputTeacher() {
		return null;
	}
	
	public Student inputStudent() {
		return null;
	}
	
	public List<Person> inputPerson(){
		List<Person> persons = new ArrayList<>();
		
		String type = "";
		for(int i = 0; i< 10; i++) {
			
			System.out.println("Type person: ");
			type = sc.nextLine();
			
			
			if(type.equals("Student"))
				persons.add(inputStudent()); // Person p = new Student();
			else
				persons.add(inputTeacher());
		}
		return persons;
	}
	
	public void displayTeacher(List<Person> persons) {
		for(Person p: persons) {
			
			if(p instanceof Teacher && ((Teacher) p).calcSalary() > 1000) {
				
				System.out.println(p);
			
			}
		}
		
	}
	
	public static void main(String[] args) {
		
	}

}
