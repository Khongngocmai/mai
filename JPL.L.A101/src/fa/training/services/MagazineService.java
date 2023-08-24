package fa.training.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import fa.training.entities.Magazine;

public class MagazineService {

private List<Magazine> magazines;
	
	public MagazineService() {
		this.magazines = new ArrayList<>();
		
	}
	
	public void addBook(String isbn, Set<String> author, String publicationPlace, int publicationYear,
			String publisher, Date publicationDate) {
        Magazine newBook = new Magazine();
        magazines.add(newBook);
    }

}
