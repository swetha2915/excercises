use project;
create table programmer(
EmpNo integer(5) unique,
Projid varchar(5),
LastName varchar(30),
FirstName varchar(30),
HireDate date,
Language varchar(15),
TaskNo integer(2),
Privelege varchar(25));
insert into programmer (EmpNo,LastName,FirstName,HireDate,Projid,Language,TaskNo,Privelege) values (201,'Gupta','Saurav','95/1/1','NPR','VB',52,'Secret');
insert into programmer (EmpNo,LastName,FirstName,HireDate,Projid,Language,TaskNo,Privelege) values                                                                                                     (390,'Ghosh','Pinky','93/1/5','KCW','Java',11,'TopSecret'),
																									(789,'Agarwal','Praveen','98/08/31','Rnc','VB',11,'Secret'),
                                                                                                     (134,'Chaudhary','Supriyo','95/07/15','TIPPS','C++',52,'Secret'),
                                                                                                     (896,'Jha','Ranjit','97/06/15','KCW','Java',10,'topSecret'),
                                                                                                     (345,'John','peter','99/11/15','TIPPS','Java',52,' '),
	                                                                                     (563,'Anderson','Andy','94/08/15','NITTS','C++',89,'Confidential');
update programmer set Language='C++' ,Projid='NITTS' where LastName='Gupta' and FirstName='Saurav';
select * from programmer;
delete from programmer where LastName='Chaudhary' and FirstName='Supriyo';
select * from programmer;


