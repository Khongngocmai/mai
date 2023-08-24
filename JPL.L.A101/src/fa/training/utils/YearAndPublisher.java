package fa.training.utils;

import java.util.Objects;

public class YearAndPublisher {

	private int  year;
	private String publisher;
	
	
	public YearAndPublisher(int year, String publisher) {
		super();
		this.year = year;
		this.publisher = publisher;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	@Override
	public int hashCode() {
		return Objects.hash(publisher, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		YearAndPublisher other = (YearAndPublisher) obj;
		return Objects.equals(publisher, other.publisher) && year == other.year;
	}


	@Override
	public String toString() {
		return "YearAndPublisher [year=" + year + ", publisher=" + publisher + "]";
	}
	
	
	
}
