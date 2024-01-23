REM   Script: Session 01
REM   Basic SQL 

create table customers(customerid int, customername varchar(20) not null, designation varchar(20), address varchar(60), city varchar(20), postalcode varchar(20), country varchar(20));

describe customers


create table customers(customerid int, customername varchar(20) not null, designation varchar(20), address varchar(60), city varchar(20), postalcode varchar(20), country varchar(20));

describe customers 


insert into customers 
values(1, John, Developer, Nagar, Banglore, 400078, India );

insert into customers 
values(1, John, Developer, Nagar, Banglore, 400078, India );

insert into customers(customerid, customername, designation) 
values(1, John, Developer);

insert into customers(customerid, customername, designation) 
values(1, John, Developer);

create table customers(customerid int, customername varchar(20) not null, designation varchar(20), address varchar(60), city varchar(20), postalcode varchar(20), country varchar(20));

describe customers 


insert into customers(customerid, customername, designation)values(1, John, Developer) 
 
;

create table customers(customerid int, customername varchar(20) not null, designation varchar(20), address varchar(60), city varchar(20), postalcode varchar(20), country varchar(20));

describe customers 


insert into customers(customerid, customername, designation)values(1, 'John', 'Developer') 
 
;

insert into customers(customerid, customername, designation)values(1, 'John', 'Developer');

create table customers(customerid int, customername varchar(20) not null, designation varchar(20), address varchar(60), city varchar(20), postalcode varchar(20), country varchar(20));

describe customers 


insert into customers(customerid, customername, designation)values(1, 'John', 'Developer');

insert into customers values(2, ganesh, testor, nagar, yamunanagar, 400068, India);

create table customers(customerid int, customername varchar(20) not null, designation varchar(20), address varchar(60), city varchar(20), postalcode varchar(20), country varchar(20));

describe customers 


insert into customers(customerid, customername, designation)values(1, 'John', 'Developer') 
insert into customers values(2, 'ganesh', 'testor', 'nagar', 'yamunanagar', '400068', 'India') 
 
;

insert all 
		into customers values(3, 'ram', 'manager', '11th street', 'lucknow', '400067', 'USA') 
		into customers values(4, 'Han', 'associate', '12th street', 'srinagar', '400065', 'Srilanka');

create table customers(customerid int, customername varchar(20) not null, designation varchar(20), address varchar(60), city varchar(20), postalcode varchar(20), country varchar(20));

describe customers 


insert into customers(customerid, customername, designation)values(1, 'John', 'Developer') 
insert into customers values(2, 'ganesh', 'testor', 'nagar', 'yamunanagar', '400068', 'India') 
insert all 
		into customers values(3, 'ram', 'manager', '11th street', 'lucknow', '400067', 'USA') 
		into customers values(4, 'Han', 'associate', '12th street', 'srinagar', '400065', 'Srilanka') 
select 1 from dual 
 
 
;

insert all 
		into customers values(3, 'ram', 'manager', '11th street', 'lucknow', '400067', 'USA') 
		into customers values(4, 'Han', 'associate', '12th street', 'srinagar', '400065', 'Srilanka') 
select 1 from dual;

select * from customers;

insert into customers values(2, 'ganesh', 'testor', 'nagar', 'yamunanagar', '400068', 'India');

select * from customers;

select customename,customerid from customers where customerid=4;

create table customers(customerid int, customername varchar(20) not null, designation varchar(20), address varchar(60), city varchar(20), postalcode varchar(20), country varchar(20));

describe customers 


insert into customers(customerid, customername, designation)values(1, 'John', 'Developer') 
insert into customers values(2, 'ganesh', 'testor', 'nagar', 'yamunanagar', '400068', 'India') 
insert all 
		into customers values(3, 'ram', 'manager', '11th street', 'lucknow', '400067', 'USA') 
		into customers values(4, 'Han', 'associate', '12th street', 'srinagar', '400065', 'Srilanka') 
select 1 from dual 
select * from customers 
select customername,customerid from customers where customerid=4 
 
 
;

select customername,customerid from customers where customerid=4;

select customername,customeraddress from customers where customerid=4;

create table customers(customerid int, customername varchar(20) not null, designation varchar(20), address varchar(60), city varchar(20), postalcode varchar(20), country varchar(20));

describe customers 


insert into customers(customerid, customername, designation)values(1, 'John', 'Developer') 
insert into customers values(2, 'ganesh', 'testor', 'nagar', 'yamunanagar', '400068', 'India') 
insert all 
		into customers values(3, 'ram', 'manager', '11th street', 'lucknow', '400067', 'USA') 
		into customers values(4, 'Han', 'associate', '12th street', 'srinagar', '400065', 'Srilanka') 
select 1 from dual 
select * from customers 
select customername,address from customers where customerid=4 
 
 
;

select customername,address from customers where customerid=4;

select distinct country from customers;

alter table customers add Dateofbirth date;

create table customers(customerid int, customername varchar(20) not null, designation varchar(20), address varchar(60), city varchar(20), postalcode varchar(20), country varchar(20));

describe customers 


insert into customers(customerid, customername, designation)values(1, 'John', 'Developer') 
insert into customers values(2, 'ganesh', 'testor', 'nagar', 'yamunanagar', '400068', 'India') 
insert all 
		into customers values(3, 'ram', 'manager', '11th street', 'lucknow', '400067', 'USA') 
		into customers values(4, 'Han', 'associate', '12th street', 'srinagar', '400065', 'Srilanka') 
select 1 from dual 
select * from customers 
select customername,address from customers where customerid=4 
select distinct country from customers 
alter table customers add Dateofbirth date 
describe customers 
 
 
;

describe customers


create table customers(customerid int, customername varchar(20) not null, designation varchar(20), address varchar(60), city varchar(20), postalcode varchar(20), country varchar(20));

describe customers 


insert into customers(customerid, customername, designation)values(1, 'John', 'Developer') 
insert into customers values(2, 'ganesh', 'testor', 'nagar', 'yamunanagar', '400068', 'India') 
insert all 
		into customers values(3, 'ram', 'manager', '11th street', 'lucknow', '400067', 'USA') 
		into customers values(4, 'Han', 'associate', '12th street', 'srinagar', '400065', 'Srilanka') 
select 1 from dual 
select * from customers 
select customername,address from customers where customerid=4 
select distinct country from customers 
alter table customers add Dateofbirth date 
describe customers 
alter table cuctomers drop column Dateofbirth 
 
 
;

alter table cuctomers drop column Dateofbirth;

alter table customers drop column Dateofbirth;

describe customers


alter table customers modify address varcher(100);

alter table customers modify address varchar(100);

describe customers


update customers set designation='Architect', city='Hongkong' where customerid=1;

describe customers


Select all from tabel customers;

Select all from table customers;

Select * from table customers;

Select * from table customers();

select * from customers order by country;

select * from customers order by country desc;

delete from customers where customerid =1;

select * from customers;

create table customers(customerid int, customername varchar(20) not null, designation varchar(20), address varchar(60), city varchar(20), postalcode varchar(20), country varchar(20));

describe customers 


insert into customers(customerid, customername, designation)values(1, 'John', 'Developer') 
insert into customers values(2, 'ganesh', 'testor', 'nagar', 'yamunanagar', '400068', 'India') 
insert all 
		into customers values(3, 'ram', 'manager', '11th street', 'lucknow', '400067', 'USA') 
		into customers values(4, 'Han', 'associate', '12th street', 'srinagar', '400065', 'Srilanka') 
select 1 from dual 
select * from customers 
select customername,address from customers where customerid=4 
select distinct country from customers 
alter table customers add Dateofbirth date 
describe customers 
alter table customers drop column Dateofbirth 
describe customers 
alter table customers modify address varchar(100) 
describe customers 
update customers set designation='Architect', city='Hongkong' where customerid=1 
select * from customers order by country 
select * from customers order by country desc 
delete from customers where customerid =1 
select * from customers 
update customers set country='london' where customerid=2 
 
 
 
;

update customers set country='london' where customerid=2;

create table customers(customerid int, customername varchar(20) not null, designation varchar(20), address varchar(60), city varchar(20), postalcode varchar(20), country varchar(20));

describe customers 


insert into customers(customerid, customername, designation)values(1, 'John', 'Developer') 
insert into customers values(2, 'ganesh', 'testor', 'nagar', 'yamunanagar', '400068', 'India') 
insert all 
		into customers values(3, 'ram', 'manager', '11th street', 'lucknow', '400067', 'USA') 
		into customers values(4, 'Han', 'associate', '12th street', 'srinagar', '400065', 'Srilanka') 
select 1 from dual 
select * from customers 
select customername,address from customers where customerid=4 
select distinct country from customers 
alter table customers add Dateofbirth date 
describe customers 
alter table customers drop column Dateofbirth 
describe customers 
alter table customers modify address varchar(100) 
describe customers 
update customers set designation='Architect', city='Hongkong' where customerid=1 
select * from customers order by country 
select * from customers order by country desc 
delete from customers where customerid =1 
select * from customers 
update customers set country='london' where customerid=2 
select *from customers 
 
 
 
;

select * from customers;

update customers set country='London' where customerid=2;

select * from customers desc;

select * from customers order by country desc;

select * from customers order by country asc, customername desc;

