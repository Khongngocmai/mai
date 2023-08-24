package fa.traning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fa.training.entity.Course;
import fa.training.utils.Command;
import fa.training.utils.ConnectionUtils;

public class CourseDao {

	public static boolean createCourse(Course course) {
		try (Connection connection = ConnectionUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Command.Student.INSERT)) {

			preparedStatement.setString(1, course.getTitle());
			preparedStatement.setInt(2, course.getCredits());
			
			
	

			return preparedStatement.executeUpdate() >0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	
}
