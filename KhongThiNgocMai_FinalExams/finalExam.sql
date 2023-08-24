create database FAS
go

use FAS
go

create table Trainee(
	trainee_id      int           primary key        identity,
	account         varchar(30)     not null        unique,
	full_name       nvarchar(100) not null,
	gender          bit ,
	birth_date      date,
	phone_number    varchar(30),
	gpa             nchar(10),
	status          varchar(10)

)

insert into Trainee (account,full_name,gender,birth_date,phone_number,gpa,status)
values ('tuan','ngoc tuan ',0,'2001/04/10','0369921696','91','in-active'),
       
	    ('hung','nguyen hung',1,'2001/05/10','0369921543','98','active')

	   select * from Trainee

	    Delete FROM Trainee WHERE trainee_id=7
		Delete FROM Trainee WHERE status ='in -active' 
		select * from Trainee where status ='active' and gpa<6
		select* from Trainee where gpa between 90 and 100