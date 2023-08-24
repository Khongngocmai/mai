package fa.training.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {

	private static Connection connection;
	private static String connectionString = "jdbc:sqlserver://localhost:1433;databaseName=Store;encrypt=true;trustServerCertificate=true";
	private static String username = "sa";
	private static String password = "04102001";
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		if(connection == null || connection.isClosed())
			
			connection  =  DriverManager.getConnection(connectionString,username, password);
		return connection;
	}
}
