package fa.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fa.training.entity.Customer;
import fa.training.utils.Command;
import fa.training.utils.ConnectionUtils;

public class CustomerDao {

	public boolean createCustomer(Customer customer) {
		try (Connection connection = ConnectionUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Command.Customer.INSERT)) {

			preparedStatement.setString(1, customer.getFirstName());
			preparedStatement.setString(2, customer.getLastName());
			preparedStatement.setString(3, customer.getPhone());
			preparedStatement.setString(4, customer.getEmail());
			preparedStatement.setString(5, customer.getStreet());
			preparedStatement.setString(6, customer.getCity());
			preparedStatement.setString(7, customer.getState());
		

			return preparedStatement.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public Customer findByID(int id) {
		try (Connection connection = ConnectionUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Command.Customer.FIND_BY_ID)) {

			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			return Customer.builder().firstName(resultSet.getString("first_name"))
					.lastName(resultSet.getString("last_name")).phone(resultSet.getString("phone")).build();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean updateCustomer(Customer customer) {

		if (findByID(customer.getId()) == null) {
			System.err.println("Customer không tồn tại! ");
			return false;
		}

		try (Connection connection = ConnectionUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Command.Customer.FIND_BY_ID)) {

			preparedStatement.setString(1, customer.getFirstName());
			preparedStatement.setString(2, customer.getLastName());

			return preparedStatement.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean deleteCustomer(int id) {

		if (findByID(id) == null) {
			System.err.println("Customer không tồn tại! ");
			return false;
		}

		try (Connection connection = ConnectionUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Command.Customer.FIND_BY_ID)) {

			preparedStatement.setInt(1, id);

			return preparedStatement.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
