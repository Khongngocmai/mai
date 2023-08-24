package fa.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fa.training.entities.LineItem;
import fa.training.utils.Command;
import fa.training.utils.ConnectionUtils;


public class  LineItemDao {
    
    public List<LineItem> getAllItemsByOrderId(int orderId) {
        List<LineItem> lineItems = new ArrayList<>();

        try (Connection connection = ConnectionUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(Command.LineItem.SELECT_BY_ORDER_ID)) {

            preparedStatement.setInt(1, orderId);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int productId = resultSet.getInt("product_id");
                int quantity = resultSet.getInt("quantity");
                double price = resultSet.getDouble("price");
                LineItem lineItem = new LineItem(orderId, productId, quantity, price);

                lineItems.add(lineItem);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lineItems;
    }
    // Add other methods if needed
}
