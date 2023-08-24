package exercise4;


public class Main {



	public static void main(String[] args) {
		
		 Author author = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');
		
		System.out.println("Name: "+  author.getName());
		System.out.println("Email: "+  author.getEmail());
		System.out.println("Gender: "+  author.getGender());
		
		
		System.out.println("Author=[name: "+ author.getName() + ",email: "+ author.getEmail()+", gender: "+ author.getGender()+"]");
		
		

	}

}
