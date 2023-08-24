package problem2.utils;

public interface Command {

	interface Trainee{
	String INSERT = "INSERT INTO Trainee "
			+ "(account,full_name,gender,birth_date,phone_number,gpa,status) "
			+ "VALUES(?,?,?,?,?,?,?)";
	String FIND_BY_ID = "SELECT * FROM Trainee WHERE trainee_id = ?";
	
	String DELETE  =" Delete FROM Trainee WHERE status =in-active " ;
	
	String UPDATE_TRAINEE ="UPDATE Trainee SET accout = ? WHERE trainee_id = ?";
	
	String Select_findIncompletedTrainee="select * from Trainee where status ='active' and gpa<6";
	
	String select_findExcellentTrainee ="select* from Trainee where gpa between 90 and 100";
	}
}
