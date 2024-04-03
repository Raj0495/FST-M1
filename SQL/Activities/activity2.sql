REM   Script: Practice 1
REM   Activities

create table salesman(salesman_id int, salesman_name varchar2(20), salesman_city varchar(20), commission int) 
describe salesman 
insert into salesman  
    values(1, 'John', 'Delhi', 444 );

insert all  
	into salesman values(2, 'Matthew', 'Kerala', 445 ) 
	into salesman values(3, 'Alex', 'Jammu', 446 ) 
	into salesman values(4, 'Dennis', 'Goa', 447 ) 
	into salesman values(5, 'Nike', 'Mumbai', 448 ) 
select 1 from dual;

select * from salesman;

select salesman_id, salesman_city from salesman;

select * from salesman where salesman_city='Delhi';

select salesman_id, commission from salesman where salesman_name='Alex';

