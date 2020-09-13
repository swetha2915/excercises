use  project;

create table weather(
City varchar(30),
State varchar(30),
High int(5),
Low int(5));
insert into weather (City,State,High,Low) values ('Calcutta','WestBengal',105,90),
													('Trivendram','Kerala',101,92),
                                                    ('Mumbai','Maharastra',88,69),
                                                    ('Banglore','Karnataka',77,60),
                                                    ('NewDelhi',' ',80,72);
select * from weather;
alter table weather add column Climate varchar(30);

                                                    