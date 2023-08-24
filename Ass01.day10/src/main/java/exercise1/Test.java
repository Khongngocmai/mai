package exercise1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class Test {

	public static void main(String[] args) throws IOException, JAXBException {
		
			

		JAXBContext context = JAXBContext.newInstance(Students.class);
		Marshaller marshaller = context.createMarshaller();
		
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		Student  student1 = new Student("Student 1","Rick Grimes",35,"Maths", false);
		Student  student2 = new Student("Student 2","Daryl Dixon",33,"Science", false);
		Student  student3 = new Student("Student 3","Maggie",36,"Arts", true);
		
		List<Student>studentList = new ArrayList<>();
		Collections.addAll(studentList,student1,student2,student3);
		
		Students students  = new Students(studentList);
		
		marshaller.marshal(students ,new FileOutputStream("./src/main/resources/Student.xml"));
	}

}
