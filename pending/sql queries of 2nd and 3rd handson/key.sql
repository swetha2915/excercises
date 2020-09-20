create database details;
create table customer(
CustId numeric(20) primary key,
Fname char(30),
Lname char(30),
Address varchar(30),
PhoneNo numeric(20) not null,
City varchar(20),
Country varchar(20),
DateFirstPurchased date,
SupplierId numeric references Supplier(SupplierId));
insert into customer 
values (1001,'Das','Jeyaseelan','119, park Avenue,II street,',9841093428,'Coimbatore','India','2004-02-10',1),
       (2001,'Gopi','Govindraj','241,Ifloor,Kamarajstreet,Madippakkam',9444124590,'Chennai','India','2005-03-25',4),
       (1201,'Dilip','Kishore','43, II Avenue, Anna Nagar',9997234534,'Bangalore','India','2004-08-20',2),
       (1300,'Aanand','Chowdhury','42/1 sector 1, II Street',9841054348,'Bangalore','India','2005-05-15',2),
       (1220,'Chandra','Nagarajan','83, lal bagh',98410672356,'Bangalore','India','2006-02-12',4),
       (1221,'Abhishek','Kumar','13,kishori park,',94447623901,'Chennai','India','2004-05-15',1),
       (1320,'Nikhil','Pandit','218, alwaanya street',9444892309,'Salem','India','2006-04-21',3),
       (1222,'Meenu','Monica','C11,churchroad',98410563421,'Trichy','India','2004-08-30',1),
      (1225,'Pavan','Kumar','128/A, North Mada Street',99934782103,'maduari','India','2004-08-18',4);
      alter table customer modify column Address varchar(50);
      select * from customer;


create table Supplier(
SupplierId numeric(20) primary key,
Sname varchar(30),
Scity varchar(30),
Sphone numeric(20) not null,
Email varchar(50) unique
);
insert into Supplier(SupplierId,Sname,Scity,Sphone,Email) values (1,'Dilip','Chennai',8999900000,'dilip@abc.co.in'),
																(2,'Tarun','Madurai',8999911111,'tarun@xyz.com'),
                                                                (3,'Naresh','Coimbatore',8999922222,'g.naresh@xyzl.com'),
                                                                (4,'Ganesan','Trichy',8999933333,'Ganesan_83@ijk.com');




create table Orders(
OrderId numeric(20) primary key,
OrderDate date,
CustId numeric(20),
Quantity numeric(20) check(quantity>0),
ItemId numeric references Items(ItemId));


insert into Orders values (1,'2004-01-12',1001,30,25),
							(2,'2005-05-06',1202,38,24),
                            (3,'2006-12-16',1220,10,22),
                            (4,'2004-05-21',1233,12,21);

create table Items(
ItemId int(10) primary key ,
ItemName varchar(35) not null,
SupplierId int references Supplier(SupplierId),
Minqty int(20) not null,
Maxqty int(20) not null,
Price numeric(5,2));
insert into Items values(20,'Pears Soap',4,7,20,30.00),
						(21,'V.V.D. Coconut oil 200 ml',2,8,15,79.00),
                        (22,'Ponds powder 400g',3,6,25,106.00),
                        (23,'Reynolds pen- blue',1,10,30,15.00),
                        (24,'Reynolds pen- black',1,10,30,16.00),
                        (25,'Mysore sandal soap',4,7,25,25.00),
                        (26,'Fair & lovely cream- 50g',3,5,15,55.00),
                        (27,'Rexono deo spary',2,5,20,100.00),
					(28,'Dove soap',4,7,15,85.00);
select * from customer where City='Chennai';
select * from customer where SupplierId=2;
select CustId,Fname,Lname from customer where DateFirstPurchased>31-01-2005;
select * from Supplier where Scity='Coimbatore';
select * from Supplier where Sname like 'G%';
select * from customer where Lname not like '%e';
select * from customer where DateFirstPurchased like'2006%';
select * from Orders where Quantity<35;
select * from Items where SupplierId=4;
select * from Items where SupplierId=3 and Minqty>7 order by ItemId;
select max(Price) from Items ;
select Price from Items order by ItemId desc limit 1;
select ItemName,max(price),min(price) from Items where price>190.00;
select CustId,count(ItemId) from Orders;
use details;
replace into customer (CustId,City) values (1225,'Madurai');
select * from customer;
update customer set City='Madurai' where Fname='Pavan';
select Fname,City,Country from customer where City in('Chennai','Salem','Madurai');
select customer.CustId,customer.Fname,customer.Lname,customer.DateFirstPurchased,Items.ItemName,Items.Price from customer left join Items on customer.SupplierId=Items.SupplierId;
select * from Items where ItemName=(select ItemName from Items order by ItemId desc limit 1);



