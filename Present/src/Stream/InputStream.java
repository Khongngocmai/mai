package Stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Arrays;

public class InputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//readFile();
		//writeFile("This is ");
		//bufferedInputStream();
		bufferOutputStream(" My name");
		//readBatchFile();

	}

	public static void readFile() throws FileNotFoundException, IOException {
		try(FileInputStream inputStream = new FileInputStream("./resourcse/text.txt")) {
		int b = 0 ;
		while ((b = inputStream.read()) != -1 ){
			System.out.print((char) b);
		} 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void readBatchFile() throws FileNotFoundException, IOException {
		try(FileInputStream inputStream = new FileInputStream("./resourcse/text.txt")) {
			
			byte [] b = new byte [5];
			while ( (inputStream.read(b)) != -1 ){
				System.out.println(Arrays.toString(b));
				String str = new String(b);
				System.out.println( str.trim());
				
		} 
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	public static void writeFile(String text ) {
		try(FileOutputStream outputStream = new FileOutputStream("./resourcse/text.txt")) {
			
	    byte [] b = text.getBytes();
		outputStream.write(b);
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void bufferedInputStream () {
		try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("./resourcse/buffered.txt"))) {
			
			int c = 0;
			while ((c  = bufferedInputStream.read()) !=-1 ) {
				System.out.print((char)c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void bufferOutputStream(String context) {
		try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("./resourcse/buffered.txt"))) {
			
			byte [] b = context.getBytes();
			for (int i = 0; i< b.length; i++){
				bufferedOutputStream.write(b[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

