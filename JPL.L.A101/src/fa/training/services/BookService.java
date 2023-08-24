package fa.training.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import fa.training.entities.Book;

public class BookService {
	
	private List<Book> books;
	
	public BookService() {
		this.books = new ArrayList<>();
		
	}
	
	public void addBook(String isbn, Set<String> author, String publicationPlace, int publicationYear,
			String publisher, Date publicationDate) {
        Book newBook = new Book();
        books.add(newBook);
    }

}
