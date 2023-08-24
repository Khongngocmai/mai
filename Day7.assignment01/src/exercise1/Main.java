package exercise1;

public class Main {

	public static void main(String[] args) {
		
	try {
		throwException();
		
	} catch (CustomException e) {
		System.out.println("Catch Exception: "+ e.getMessage());
	}finally {
		System.out.println("finally");
	}
	 
	}
	
	public static void throwException() throws CustomException{
		
		throw new CustomException(" exception message");
	}
	
	static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }
}
