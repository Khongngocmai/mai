package fa.training.entities;

import java.util.Date;

public abstract class Publication {
	
	public int publicationYear;
	public String publisher;
	public Date publicationDate;
	
	
	public Publication(int publicatonYear, String publisher, Date publicationDate) {
		super();
		this.publicationYear = publicatonYear;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
	}


	public Publication() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getPublicationYear() {
		return publicationYear;
	}


	public void setPublicationYear(int publicatonYear) {
		this.publicationYear = publicatonYear;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public Date getPublicationDate() {
		return publicationDate;
	}


	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}


	
	
	
}
