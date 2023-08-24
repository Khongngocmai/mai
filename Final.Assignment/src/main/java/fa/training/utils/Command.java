package fa.training.utils;

public interface Command {


	interface Customer{
		String SELECT="SELECT*FROM Customer customer_id, customer_name ";
		String INSERT = "INSERT INTO Customer (customer_id, customer_name) VALUES (?, ?)";
	}

	interface Order{
		String SELECT_BY_CUSTOMER_ID = "SELECT order_id, order_date, employee_id, total " +
                "FROM Orders WHERE customer_id = ?";
	}
	interface LineItem{
		String SELECT_BY_ORDER_ID = "SELECT * FROM LineItem WHERE order_id = ?";
	}
	
}
