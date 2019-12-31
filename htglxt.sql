create database htglxt;
use htglxt;

create table khb( id int primary key auto_increment, name varchar(64) , card varchar(32) unique , phone varchar(16) );
create table xmb( id int primary key auto_increment, name varchar(64) , number varchar(16) , stime datetime , ftime datetime , money float);
create table htb( id int primary key auto_increment, name varchar(64) , number varchar(16) , qtime datetime , kh_id int , xm_id int , foreign key (kh_id) references khb (id) , foreign key (xm_id) references xmb (id));

insert into khb( id , name , card , phone)values(1 , 'A' , '610323200001010001' , '18877771111');
insert into khb( id , name , card , phone)values(2 , 'B' , '610323200001010002' , '18877772222');
insert into khb( id , name , card , phone)values(3 , 'C' , '610323200001010003' , '18877773333');
insert into khb( id , name , card , phone)values(4 , 'D' , '610323200001010004' , '18877774444');
insert into khb( id , name , card , phone)values(5 , 'E' , '610323200001010005' , '18877775555');


insert into xmb( id , name , number , stime , ftime , money)values(1 , 'AA' , '200001010001' , '2020-01-01' , '2020-05-05' , 100000);
insert into xmb( id , name , number , stime , ftime , money)values(2 , 'BB' , '200001010002' , '2020-02-01' , '2020-05-05' , 2000000);
insert into xmb( id , name , number , stime , ftime , money)values(3 , 'CC' , '200001010003' , '2020-03-01' , '2020-06-06' , 30000);

insert into htb( id , name , number , qtime , kh_id , xm_id)values(1 , 'AAA' , '10001' , '2020-01-01' , 1 , 1);
insert into htb( id , name , number , qtime , kh_id , xm_id)values(2 , 'ABB' , '10002' , '2020-01-01' , 2 , 1);
insert into htb( id , name , number , qtime , kh_id , xm_id)values(3 , 'BAA' , '10003' , '2020-01-02' , 1 , 2);
insert into htb( id , name , number , qtime , kh_id , xm_id)values(4 , 'BBB' , '10004' , '2020-01-02' , 3 , 2);
insert into htb( id , name , number , qtime , kh_id , xm_id)values(5 , 'BCC' , '10005' , '2020-01-02' , 4 , 2);
insert into htb( id , name , number , qtime , kh_id , xm_id)values(6 , 'CAA' , '10006' , '2020-01-03' , 5 , 3);