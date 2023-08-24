package fa.training.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fa.training.dao.CustomerDao;
import fa.training.dao.LineItemDao;
import fa.training.dao.OrderDao;
import fa.training.entities.Customer;
import fa.training.entities.LineItem;
import fa.training.entities.Order;
import fa.training.utils.ConnectionUtils;

public class SaleManagement {

	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		try(Connection connection = ConnectionUtils.getConnection();
				Statement statement = connection.createStatement()) {
				ResultSet result = statement.executeQuery("SELECT * FROM Customer ");
				
				while(result.next()) {
					 int customerId = result.getInt("customer_id");
		                String customerName = result.getString("customer_name");
		                Customer customer = new Customer(customerId, customerName);
		                
		                customers.add(customer);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		 OrderDao orderDao = new OrderDao();

	     int customerIdToRetrieve = 123;
	     
	     List<Order> ordersForCustomer = orderDao.getAllOrdersByCustomerId(customerIdToRetrieve);

	     if (!ordersForCustomer.isEmpty()) {
	         System.out.println("Orders for Customer ID " + customerIdToRetrieve + ":");
	         for (Order order : ordersForCustomer) {
	             System.out.println("Order ID: " + order.getOrderId());
	             System.out.println("Order Date: " + order.getOrderDate());
	             System.out.println("Employee ID: " + order.getEmployeeId());
	             System.out.println("Total: " + order.getTotal());
	         }
	     } else {
	         System.out.println("No orders found for Customer ID " + customerIdToRetrieve);
	     }
	     
	     
	     LineItemDao lineItemDAO = new LineItemDao();
	       
	        int orderIdToRetrieve = 456; 
	        List<LineItem> lineItemsForOrder = lineItemDAO.getAllItemsByOrderId(orderIdToRetrieve);

	        if (!lineItemsForOrder.isEmpty()) {
	            System.out.println("Line Items for Order ID " + orderIdToRetrieve + ":");
	            for (LineItem lineItem : lineItemsForOrder) {
	                System.out.println("Order ID: " + lineItem.getOrderId());
	                System.out.println("Product ID: " + lineItem.getProductId());
	                System.out.println("Quantity: " + lineItem.getQuatity());
	                System.out.println("Price: " + lineItem.getPrice());
	                System.out.println("-----------------------");
	            }
	        } else {
	            System.out.println("No line items found for Order ID " + orderIdToRetrieve);
	        }
	        
	        
	        CustomerDao customerDao = new CustomerDao();
	       
	        Customer newCustomer = new Customer(1001, "John Doe"); 
	        boolean isCustomerAdded = customerDao.addCustomer(newCustomer);

	        if (isCustomerAdded) {
	            System.out.println("Customer added successfully!");
	        } else {
	            System.out.println("Failed to add customer.");
	        }
	    }
	
	
}

	
	

