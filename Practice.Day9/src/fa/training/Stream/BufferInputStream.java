package fa.training.Stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInputStream {

	public static void main(String[] args) throws IOException {
		//bufferInputStream();
		bufferOutputStream("MY apple");
	}
	public  static void bufferInputStream( )throws IOException {
		
		try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("./resources/Buffer.txt"))) {
			int b = 0 ;
			while((b= inputStream.read()) !=-1) {
				System.out.print((char)b);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	public static void bufferOutputStream(String text) {
		try(BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("./resources/Buffer.txt"))) {
			
			byte [] b = text.getBytes();
			for( int i =0; i>= b.length; i++) {
				outputStream.write(b[i]);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

