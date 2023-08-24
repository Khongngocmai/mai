package problem2.entities;


import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

 @Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Trainee {

	
	private int id;
	private String account;
	private String fullname;
	private boolean gender;
	private Date birthDate;
	private String phone;
	private String gpa;
	private String status;
	
	
}
