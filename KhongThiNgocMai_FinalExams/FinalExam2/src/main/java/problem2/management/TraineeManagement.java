package problem2.management;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import problem2.dao.TraineeDao;
import problem2.entities.Trainee;
import problem2.utils.Command;
import problem2.utils.ConnectionUtils;

public class TraineeManagement {

	public static void main(String[] args) {
		
		Trainee trainee = Trainee.builder().account("anhnq2").fullname("Nguyen Quang Anh").gender(false)
				.phone("0763527432").gpa("4").status("active").build();
		TraineeDao.save(trainee);
		
		
		Trainee updated = Trainee.builder().account("dieunt1").fullname("Nguyen thi dieu").status("in-active").build();
               
	    TraineeDao traineeDao = new TraineeDao();
		boolean updated1 = TraineeDao.save(updated);
		if (updated1) {
            System.out.println("Cập nhật thông tin thành công!");
       } else {
            System.out.println("Cập nhật thông tin thất bại.");
        }
		
		 Trainee remove = Trainee.builder().account("dieunt1").fullname("Nguyen Thi dieu").build();
		 
		 
	
		
	}
	public void menu() {
		 
		 TraineeDao traineedao = new TraineeDao();
		 Scanner sc= new Scanner (System.in);
		 while (true) {
			 System.out.println("Menu");
			 System.out.println("Create Trainee");
			 System.out.println("Update Trainee");
			 System.out.println("Remove ");
			 System.out.println("Report ");
			 System.out.println("List excelent");
			 System.out.println("Exit");
			 System.out.println("Your choice");
			 
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				 try {
					Trainee newTrainee = Trainee();
					TraineeDao.save(newTrainee);
					System.out.println("Successfully");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
				
			case 2:
				 try {
					Trainee updateTrainee = Trainee();
					TraineeDao.update(updateTrainee);
					System.out.println("Successfully");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 3:
				 try {
					
					TraineeDao.remove();
					System.out.println("Successfully");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 4:
				 try {
					List<Trainee> incompleteTrainees = TraineeDao.findIncompletedTrainee();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 5:
				 try {
					 List<Trainee> excellentTrainee = TraineeDao.findExcellentTrainee();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 6:
				 System.out.println("Exit");
				 
				default :
					System.out.println("Your choice");
					
			}
		 }
	}
	private Trainee Trainee() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
