use project;
create table books(
BookId integer(5),
Title varchar(30),
Topicld varchar(10),
PublisherName varchar(25),
PlaceOfPublication varchar(30),
Price integer(5),
PurchaseDate date,
ShelfNo varchar(3),
primary key(BookId,ShelfNo));
insert into books values(8293,'DBMS','DB1','PrenticeHall','Mumbai',255,'95/1/1','S11'),
				      (5645,'DBMS','DB1','PearsonEducation','Mumbai',655,'93/1/5','S12'),
                      (6565,'C','C1','TMH','Mumbai',840,'98/08/31','S66'),
                      (6567,'C++','Cplus1','ABCPublishes','Delhi','300','95/7/15','S77'),
                      (4576,'JAVA','JAVA1',"Guru Govind Publications",'Delhi',300,'97/6/15','S87'),
                      (3433,'OOPS','OOPS1','DavePublishers','Pune',600,'99/11/15','S56'),
                      (4655,'SAD','SAD1','SajanPublications','Cochin',700,'94/8/15','S76');
select * from books orderby BookId DESC;

