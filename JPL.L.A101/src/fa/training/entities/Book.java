package fa.training.entities;

import java.util.Date;
import java.util.Set;

public class Book extends Publication{
	
	private String isbn;
	private Set<String> author ;
	private String publicationPlace;
	
	
	
	public Book(int publicatonYear, String publisher, Date publicationDate, String isbn, Set<String> author,
			String publicationPlace) {
		super(publicatonYear, publisher, publicationDate);
		this.isbn = isbn;
		this.author = author;
		this.publicationPlace = publicationPlace;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int publicatonYear, String publisher, Date publicationDate) {
		super(publicatonYear, publisher, publicationDate);
		// TODO Auto-generated constructor stub
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Set<String> getAuthor() {
		return author;
	}
	public void setAuthor(Set<String> author) {
		this.author = author;
	}
	public String getPublicationPlace() {
		return publicationPlace;
	}
	public void setPublicationPlace(String publicationPlace) {
		this.publicationPlace = publicationPlace;
	}
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", author=" + author + ", publicationPlace=" + publicationPlace + "]"
				+  ", year =" + getPublicationYear() + ", publisher =" + getPublisher()
				+ ", publicationDate()=" + getPublicationDate() + "]\n";
	}
	
	public void display() {
		System.out.println(this);
	}
}
