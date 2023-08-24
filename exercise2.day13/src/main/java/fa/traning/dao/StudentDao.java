package fa.traning.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fa.training.entity.Student;
import fa.training.utils.Command;
import fa.training.utils.ConnectionUtils;

public class StudentDao {

	public static boolean createStudent(Student student) {
		try (Connection connection = ConnectionUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Command.Student.INSERT)) {

			preparedStatement.setString(1, student.getLastName());
			preparedStatement.setString(2, student.getFirstName());
			preparedStatement.setDate(3, student.getEnrollmentDate());
			
	

			return preparedStatement.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	
}
