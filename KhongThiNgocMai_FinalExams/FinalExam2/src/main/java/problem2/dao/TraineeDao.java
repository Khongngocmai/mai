package problem2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import problem2.utils.Command;
import problem2.utils.ConnectionUtils;
import problem2.entities.Trainee;

public class TraineeDao {

	
	
	public static boolean save(Trainee trainee) {
		try (Connection connection = ConnectionUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Command.Trainee.INSERT)) {

			preparedStatement.setString(1, trainee.getAccount());
			preparedStatement.setString(2, trainee.getFullname());
			preparedStatement.setBoolean(3, trainee.isGender());
			preparedStatement.setDate(4, trainee.getBirthDate());
			preparedStatement.setString(5, trainee.getPhone());
			preparedStatement.setString(6, trainee.getGpa());
			preparedStatement.setString(7, trainee.getStatus());
			
			return preparedStatement.executeUpdate() >0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public static Trainee findByID(int id) {
		
		try (Connection connection = ConnectionUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Command.Trainee .FIND_BY_ID)) {

			
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			return Trainee.builder().account("mai").fullname("ngocmai").build();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	public static boolean update(Trainee trainee) {
		try {
			if (findByID(trainee.getId()) == null) {
				System.err.println("Customer không tồn tại! ");
				return false;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		try (Connection connection = ConnectionUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Command.Trainee.UPDATE_TRAINEE)) {

			preparedStatement.setString(1, trainee.getAccount());
			preparedStatement.setString(2, trainee.getFullname());
			preparedStatement.setBoolean(3, trainee.isGender());
			preparedStatement.setDate(4, trainee.getBirthDate());
			preparedStatement.setString(5, trainee.getPhone());
			preparedStatement.setString(6, trainee.getGpa());
			preparedStatement.setString(7, trainee.getStatus());

			return preparedStatement.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static void remove() {
		
		try(Connection connection = ConnectionUtils.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(Command.Trainee.DELETE)) {
			
			int row = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<Trainee> findIncompletedTrainee(){
		
		List <Trainee > incompletedTrainee= new ArrayList<>();
		try(Connection connection = ConnectionUtils.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(Command.Trainee.Select_findIncompletedTrainee)) {
			
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				int trainee_id = rs.getInt("trainee_id");
				String  account = rs.getString("account");
				String fullname = rs.getString("fullname");
				
				String status= rs.getString("status");
				
				 Trainee traineees=  new Trainee();
				 incompletedTrainee.add(traineees);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return incompletedTrainee;
		
	}
	
	public static  List<Trainee> findExcellentTrainee(){
		
		List <Trainee > excellentTrainee = new ArrayList<>();
		try(Connection connection = ConnectionUtils.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(Command.Trainee.select_findExcellentTrainee)) {
			
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				int trainee_id = rs.getInt("trainee_id");
				String  account = rs.getString("account");
				String fullname = rs.getString("fullname");
				String gender =rs.getString("gender");
				String status= rs.getString("status");
				Date birthdate = rs.getDate("birthday");
				String gpa= rs.getString("gpa");
				
				 Trainee traineees=  new Trainee();
				 excellentTrainee.add(traineees);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return excellentTrainee;
		
	}
}
