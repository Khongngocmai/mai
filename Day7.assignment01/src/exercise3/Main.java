package exercise3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Exception1 extends Exception{

	public Exception1(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

class Exception2 extends Exception1{

	public Exception2(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

class Exception3 extends Exception1{

	public Exception3(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}


class A{
	protected  Number test () throws Exception1{
		return 1;
	}
}

class B extends A{
	public Integer test () throws Exception1{
		 return 1;
	}
}

class C extends B{
	public Integer test () throws Exception1{
		return 1;
	}
}