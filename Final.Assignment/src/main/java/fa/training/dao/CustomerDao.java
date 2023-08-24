package fa.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fa.training.entities.Customer;
import fa.training.utils.Command;
import fa.training.utils.ConnectionUtils;

public class CustomerDao {
	
	public  List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<>();
		try (Connection connection = ConnectionUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Command.Customer.SELECT)) {
			
			ResultSet resultSet = preparedStatement.executeQuery();					
			while(resultSet.next()) {
				 int customerId = resultSet.getInt("customer_id");
	                String customerName = resultSet.getString("customer_name");
	                Customer customer = new Customer(customerId, customerName);
	                
	                customers.add(customer);
			}
																	
	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customers;
		
	}
	 public boolean addCustomer(Customer customer) {
	        try (Connection connection = ConnectionUtils.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(Command.Customer.INSERT)) {

	            preparedStatement.setInt(1, customer.getCustomerId());
	            preparedStatement.setString(2, customer.getCustomerName());

	            return preparedStatement.executeUpdate() > 0;

	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
}
																	