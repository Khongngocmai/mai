package fa.training.entities;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class PersonManage {
	

	private static final Student[] Student = null;
	Scanner sc = new Scanner(System.in);
	
	public Teacher inputTeacher() {
		System.out.println("teacher's full name:");
	    String fullName = sc.nextLine();

	    System.out.println("teacher's gender:");
	    String gender = sc.nextLine();

	    System.out.println("teacher's phone number:");
	    String phone = sc.nextLine();
	    
	    System.out.println("teacher's email:");
	    String email = sc.nextLine();
	    
	    System.out.println("teacher's basic salary:");
	    double basicSalary = sc.nextDouble();

	    System.out.println("teacher's subsidy:");
	    double subsidy = sc.nextDouble();
	    
	    sc.nextLine(); 
	    
		return new Teacher(fullName, gender, phone, email, basicSalary, subsidy);
	    
		
	}
	public Student inputStudent() {
		System.out.println("student's full name:");
	    String fullName = sc.nextLine();

	    System.out.println("student's gender:");
	    String gender = sc.nextLine();

	    System.out.println("student's phone number:");
	    String phone = sc.nextLine();

	    System.out.println("student's email:");
	    String email = sc.nextLine();

	    System.out.println("student's ID:");
	    String studentId = sc.nextLine();

	    System.out.println("student's theory :");
	    double theory = sc.nextDouble();

	    System.out.println("student's practice :");
	    double practice = sc.nextDouble();

	    sc.nextLine();

	    return new Student(fullName, gender, phone, email, studentId, theory, practice);
	}
	
	public List<Person> inputPerson(){
		List<Person> persons = new ArrayList<>();
		String type = "";
		for(int i=0; i<=10;i++) {
			System.out.println("Type person: ");
			type = sc.nextLine();
			if(type.equals("Student"))
				persons.add(inputStudent());
			else 
				persons.add(inputTeacher());
			
		}
		return persons;
		
	}
	
	public void displayTeacher(List<Person> persons) {
		for(Person p: persons) {
			
			if(p instanceof Teacher && ((Teacher) p).calculateSalary()>1000) {
				System.out.println(p);
				
			}
		}
	}
	
	private void displayStudents() {
        System.out.println("Qualified students with final mark >= 6:");
        for (Student student : Student) {
            double finalMark = student.calculateFinalMark();
            if (finalMark >= 6.0) {
                System.out.println(student.getFullName() + " - Final Mark: " + finalMark);
            }
        }
	}
	public static void main(String[] args) {
		
		 PersonManage personManage = new PersonManage();
		    List<Person> persons = personManage.inputPerson();

		    System.out.println("Displaying qualified teachers:");
		    personManage.displayTeacher(persons);

		    System.out.println("Displaying qualified students:");
		    personManage.displayStudents();

	}

}
