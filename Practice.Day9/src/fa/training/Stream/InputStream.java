package fa.training.Stream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStream {

	public static void main(String[] args) throws IOException {
		//readFile();
		writeFile("Day la lop aut");

	}
	// read()=> binary => number => ascii => character
	// đọc theo kí tự
	public static void readFile() throws IOException {
		try(FileInputStream inputStream = new FileInputStream ("./resources/test.txt")) {
			int b = 0 ;
			while((b= inputStream.read()) !=-1) {
				System.out.print((char)b);
			}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public static void writeFile(String text) {
		try(FileOutputStream outputStream = new FileOutputStream("./resources/test.txt")) {
		
			// ghi file theo  ký tự 
//			for(int i = 0; i <= text.length();i++) {
//				char c = text.charAt(i);
//				outputStream.write((char)c);
//			}
			
			// ghi file theo mảng
			
			byte [] b = text.getBytes();
			outputStream.write(b);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}

