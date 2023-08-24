package fa.training.utils;

public interface Command {

	interface Student{
		String INSERT = "INSERT INTO Student "
				+ "( LastName,FirstName, EnrollmentDate) "
				+ "VALUES(?,?,?)";
		//String FIND_BY_ID = "SELECT * FROM [sales].customers WHERE [customer_id] = ?";
		
		//String UPDATE_CUSTOMER = "Update  [sales].customers SET ... ";
		//String DELETE_CUSTOMER = "delete  [sales].customers where customer_id = ? ";
	}
	interface Course {
		String INSERT = "INSERT INTO Course "
				+ "( Title,Credits) "
				+ "VALUES(?,?)";
	}
	
	interface Enrollment{
		String INSERT = "INSERT INTO Enrollment "
				+ "( CourseID, StudnetID, Grade) "
				+ "VALUES(?,?,?)";
		String FIND_BY_ID = "SELECT * FROM [sales].customers WHERE [customer_id] = ?";
		String UPDATE_CUSTOMER ="UPDATE Student SET EnrollmentDate = ? WHERE ID = ?";
	}
}
