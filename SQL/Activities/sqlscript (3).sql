REM   Script: Joins
REM   Joins

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

create table emp(empid int, ename varchar2(20), deptid int) 
create table dept(deptid int, deptname varchar(20));

create table emp(empid int, ename varchar2(20), deptid int) 
create table dept(deptid int, deptname varchar2(20));

create table emp(empid int, ename varchar2(20), deptid int) 
create table dept(deptid int, deptname varchar2(20));

create table emp(empid int, ename varchar2(20), deptid int) 
create table dept(deptid int, dname varchar2(20));

create table emp(empid int, ename varchar2(20), deptid int) 
create table dept(deptid int, dname varchar2(20)) 
insert all 
	into emp values(1, ram, 444) 
	into emp values(1, ram, 445) 
	into emp values(1, ram, 446) 
	into emp values(1, ram, 444) 
	into emp values(1, ram, 448) 
select 1 from dual;

insert all 
	into emp values(1, ram, 444) 
	into emp values(1, ram, 445) 
	into emp values(1, ram, 446) 
	into emp values(1, ram, 444) 
	into emp values(1, ram, 448) 
select 1 from dual;

create table emp(empid int, ename varchar2(20), deptid int) 
create table dept(deptid int, dname varchar2(20)) 
insert all 
	into emp values(1, 'ram', 444) 
	into emp values(2, 'raj', 445) 
	into emp values(3, 'rao', 446) 
	into emp values(4, 'rahul', 444) 
	into emp values(5, 'rahim', 448) 
select 1 from dual;

insert all 
	into emp values(1, 'ram', 444) 
	into emp values(2, 'raj', 445) 
	into emp values(3, 'rao', 446) 
	into emp values(4, 'rahul', 444) 
	into emp values(5, 'rahim', 448) 
select 1 from dual;

create table emp(empid int, ename varchar2(20), deptid int) 
create table dept(deptid int, dname varchar2(20)) 
insert all 
	into emp values(1, 'ram', 444) 
	into emp values(2, 'raj', 445) 
	into emp values(3, 'rao', 446) 
	into emp values(4, 'rahul', 444) 
	into emp values(5, 'rahim', 448) 
select 1 from dual 
;

create table emp(empid int, ename varchar2(20), deptid int) 
create table dept(deptid int, dname varchar2(20)) 
insert all 
	into emp values(1, 'ram', 444) 
	into emp values(2, 'raj', 445) 
	into emp values(3, 'rao', 446) 
	into emp values(4, 'rahul', 444) 
	into emp values(5, 'rahim', 448) 
select 1 from dual;

create table emp(empid int, ename varchar2(20), deptid int) 
create table dept(deptid int, dname varchar2(20)) 
insert all 
	into emp values(1, 'ram', 444) 
	into emp values(2, 'raj', 445) 
	into emp values(3, 'rao', 446) 
	into emp values(4, 'rahul', 444) 
	into emp values(5, 'rahim', 448) 
select 1 from dual 
insert all 
	into dept values(6, 'sales') 
	into dept values(7, 'marketing') 
select 1 from dual;

create table toys(toyid int, tname varchar2(20), tcolour varchar2(20)) 
create table brick(bid int, bcolour varchar(20), bshape varchar2(20));

insert all 
	into toys values(1, 'turtle', 'green') 
	into toys values(2, 'girafee', 'yellow') 
	into toys values(3, 'owl', 'black') 
select 1 from dual;

create table toys(toyid int, tname varchar2(20), tcolour varchar2(20)) 
create table brick(bid int, bcolour varchar(20), bshape varchar2(20));

create table toys(toyid int, tname varchar2(20), tcolour varchar2(20));

create table brick(bid int, bcolour varchar(20), bshape varchar2(20));

insert all 
	into toys values(1, 'turtle', 'green') 
	into toys values(2, 'girafee', 'yellow') 
	into toys values(3, 'owl', 'black') 
select 1 from dual;

insert all 
	into brick values(2, 'red', 'square') 
	into brick values(3, 'black', 'circle') 
	into brick values(4, 'brown', 'rectangle') 
select 1 from dual;

select * from toys inner join brick on toyid=bid;

select * from toys left join brick on toyid=bid;

select * from toys inner join brick on toyid=bid;

select * from toys left join brick on toyid=bid and bcolour='red';

select * from toys right join brick on toyid=bid;

select * from toys full join brick on toyid=bid;

