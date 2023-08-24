package fa.training.main;

import fa.training.dao.CustomerDao;
import fa.training.entity.Customer;
import fa.training.view.View;

public class Main {
	static CustomerDao customerDao = new CustomerDao();
	public static void main(String[] args) {
		
		

	}
	
	public static void insert() {
		Customer customer = View.inputCustomer();
		System.out.println( customerDao.createCustomer(customer) );
	}

}
