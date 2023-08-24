package exercise2;

public class MyCustomException extends Exception {

	private String message;

	public MyCustomException(String message) {
		this.message = message;
	}
	
	public void printMessage() {
		System.out.println("Exception" +message);
	}
}
  
class Test {
    public static void main(String[] args) {
        try {
            throwExceptionMethod();
        } catch (MyCustomException e) {
            e.printMessage();
        }
    }
    public static void throwExceptionMethod() throws MyCustomException {
        boolean isError = true;

        if (isError) {
            throw new MyCustomException(" Custom exception message.");
        }
    }
}