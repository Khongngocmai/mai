package fa.training.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import fa.training.entities.Book;
import fa.training.entities.Magazine;



public class LibraryManagement {
	
	public static void intData() {
		
	List<Book> books = new ArrayList<>(); 
	
	books.add(new Book(2020, "NXB DH Ha Noi", new Date("2021/05/06"), "12645334",
			new HashSet<String>(List.of("Nguyen Van A")), "Ha noi"));
	books.add(new Book(2021, "NXB DH KIm Đoong", new Date("2020/05/07"), "12645-334",
			new HashSet<String>(List.of("Nguyen Van B")), "Kim Đồng"));
	
	System.out.println(books);
	

	List<Magazine> magazine = new ArrayList<>(); 
	magazine.add(new Magazine(2020, "NXB DH Ha Noi", new Date("2020/5/2"), "Tran Hoai An", 2, 4));
	magazine.add(new Magazine(2019,"NXB DH Ha Noi", new Date("2019/5/6"), "Tran Hoai An", 4, 2));
	
	System.out.println(magazine);

	}
	public static void main(String[] args) {
	
	
	}
}




