package fa.training.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import fa.training.entities.Order;
import fa.training.utils.Command;
import fa.training.utils.ConnectionUtils;



public class OrderDao {
	
	 public List<Order> getAllOrdersByCustomerId(int customerId) {
	        List<Order> orders = new ArrayList<>();

	        try (Connection connection = ConnectionUtils.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(Command.Order.SELECT_BY_CUSTOMER_ID)) {

	            preparedStatement.setInt(1, customerId);
	            ResultSet resultSet = preparedStatement.executeQuery();

	            while (resultSet.next()) {
	                int orderId = resultSet.getInt("order_id");
	                Date orderDate = resultSet.getDate("order_date");
	                int employeeId = resultSet.getInt("employee_id");
	                double total = resultSet.getDouble("total");
	                Order order = new Order(orderId, orderDate, customerId, employeeId, total);

	                orders.add(order);
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return orders;
	    }
}
