package fa.traning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import fa.training.entity.Enrollment;
import fa.training.utils.Command;
import fa.training.utils.ConnectionUtils;

public class EnrollmentDao {

	public static boolean createEnrollment(Enrollment enrollment) {
		try (Connection connection = ConnectionUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Command.Student.INSERT)) {

			preparedStatement.setInt(1, enrollment.getCourseID());
			preparedStatement.setInt(2, enrollment.getStudentID());
			preparedStatement.setString(3, enrollment.getGrade());
			
			
	

			return preparedStatement.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	
	public static Enrollment findByID(int id) {
		try (Connection connection = ConnectionUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Command.Enrollment .FIND_BY_ID)) {

			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			return Enrollment.builder().CourseID(1).StudentID(2).Grade("B").build();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static boolean updateEnrollment(Enrollment  enrollment) {
		if (findByID(enrollment.getID()) == null) {
			System.err.println("Customer không tồn tại! ");
			return false;
		}
		
		try (Connection connection = ConnectionUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Command.Enrollment.UPDATE_CUSTOMER)) {

			preparedStatement.setInt(1, enrollment.getCourseID());
			preparedStatement.setInt(2, enrollment.getStudentID());
			preparedStatement.setString(3, enrollment.getGrade());

			return preparedStatement.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}


	
	
}
