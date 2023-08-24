package exercise2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class InputSrteam {

	public static void main(String[] args) {
		
		readObject();
		

	}

	public static void writeObject( Student student) {
		try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("./resources/exercise1.txt"))) {
			
			outputStream.writeObject(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void readObject( ) {
		try(ObjectInputStream outputStream = new ObjectInputStream(new FileInputStream("./resources/exercise1.txt"))) {
			
			Student student1 = (Student)outputStream.readObject();
			System.out.println(student1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

