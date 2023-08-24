package fa.training.main;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

import fa.training.entity.Customer;
import fa.training.utils.ConnectionUtils;


public class Main {
	public static void main(String[] args) {
		
		
		try(Connection connection = ConnectionUtils.getConnection();
				Statement statement = connection.createStatement()) {
				ResultSet result = statement.executeQuery("SELECT * FROM Customers WHERE customer_id = 1 ");
				
				while (result.next()) {
					int id = result.getInt("id");
					String name = result.getString("customer_name");
					String address = result.getString("customer_address");
					String phone = result.getString("phone");
					String email = result.getString("email");
					Customer customer = new Customer(id, name, phone, email, address);
					System.out.println(customer);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	
}
