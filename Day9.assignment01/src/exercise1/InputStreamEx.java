package exercise1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamEx {

	public static void main(String[] args) {
		write("Day la file cua toi");

	}

	private static void readFile() {
		
		
		try (FileInputStream inputStream = new FileInputStream("./resources/exercise1.txt")){
			
			int b = 0;
			while ((b= inputStream.read()) !=-1) {
				System.out.print((char)b);
				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();		
			
		
		} catch (IOException e) {
			e.printStackTrace();		
			
		}
		
	}

	public static void write(String exercise1) {
		try (FileOutputStream outputstream = new FileOutputStream("./resources/exercise1.txt")){
			byte [] b = exercise1.getBytes();
			for(int i =0 ; i < b.length; i++) {
				outputstream.write(b[i]);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
