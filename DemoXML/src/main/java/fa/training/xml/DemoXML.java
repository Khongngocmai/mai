package fa.training.xml;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class DemoXML {

	public static void main(String[] args) throws JAXBException, IOException {
		
		File file = new File ("./src/main/resources/employee.xml");
		if(!file.exists()) {
			file.createNewFile();
		}
		
		JAXBContext context  = JAXBContext.newInstance(Employee.class);
		
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Address [] addresses = {new Address("12","Duy Tan","HN"),new Address("124","Duy Tan4","HN")};
		Employee  e = new Employee("1", "Name", new Date(), 1000, addresses);
		marshaller.marshal(e, new FileOutputStream(file));
	}
	
}