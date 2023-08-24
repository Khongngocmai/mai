package fa.training.utils;

public interface Command {

	interface Customer{
		String INSERT = "INSERT INTO [sales].customers "
				+ "(first_name, last_name, phone, email, street, city, state) "
				+ "VALUES(?,?,?,?,?,?,?)";
		String FIND_BY_ID = "SELECT * FROM [sales].customers WHERE [customer_id] = ?";
		
		String UPDATE_CUSTOMER = "Update  [sales].customers SET ... ";
		String DELETE_CUSTOMER = "delete  [sales].customers where customer_id = ? ";
	}
}
