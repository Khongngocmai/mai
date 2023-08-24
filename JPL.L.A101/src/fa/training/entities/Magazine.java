package fa.training.entities;

import java.util.Date;

public class Magazine extends Publication {

	private String author;
	private int volum;
	private int edition;
	
	public Magazine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Magazine(int publicatonYear, String publisher, Date publicationDate, String author, int volum, int edition) {
		super(publicatonYear, publisher, publicationDate);
		this.author = author;
		this.volum = volum;
		this.edition = edition;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getVolum() {
		return volum;
	}

	public void setVolum(int volum) {
		this.volum = volum;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	
	@Override
	public String toString() {
		return "Magazine [author=" + author + ", volum=" + volum + ", edition=" + edition + "]" + ", publicationYear ="
				+ getPublicationYear() + ", publisher =" + getPublisher() + ", publicationDate =" + getPublicationDate()
				+ "]\n";
	}

	public void display() {
		System.out.println(this);
	}
	
}
