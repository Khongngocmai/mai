package fa.training.main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fa.training.entity.Course;
import fa.training.entity.Enrollment;
import fa.training.entity.Student;
import fa.traning.dao.CourseDao;
import fa.traning.dao.EnrollmentDao;
import fa.traning.dao.StudentDao;


public class Main {
	public static void main(String[] args) {
		
		Student student = Student.builder().firstName("MAi").lastName("khổng").enrollmentDate(new Date(2023,8,21)).build();
		StudentDao.createStudent(student);
		
		Course course = Course.builder().title("Math").Credits(3).build();
		CourseDao.createCourse(course);
		
		Enrollment enrollment = Enrollment.builder().CourseID(1).StudentID(2).Grade("B").build();
		EnrollmentDao.createEnrollment(enrollment);
		
		
		
		
		Enrollment updatedEnrollment = Enrollment.builder()
                .ID(1)  
                .CourseID(2)  
                .StudentID(3) 
                .Grade("A")   
                .build();
	    EnrollmentDao enrollmentDao = new EnrollmentDao();
		boolean updated = EnrollmentDao.updateEnrollment(updatedEnrollment);
		if (updated) {
            System.out.println("Cập nhật thông tin Enrollment thành công!");
        } else {
            System.out.println("Cập nhật thông tin Enrollment thất bại.");
        }
		
		
	}
	
}
