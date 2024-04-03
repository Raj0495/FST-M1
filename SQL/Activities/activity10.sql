REM   Script: Activity 8
REM   Activity 8

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

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select customer_id, max(purchase_amount) from orders group by purchase_amount;

select max(purchase_amount) from orders group by customer_id and max(purchase_amount);

select max(purchase_amount) from orders group by customer_id and max(purchase_amount);

select max(purchase_amount) from orders group by customer_id and purchase_amount;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

SELECT customer_id, MAX(purchase_amount) AS "Max Amount" FROM orders GROUP BY customer_id;

SELECT customer_id, MAX(purchase_amount) AS "Max Amount" FROM orders GROUP BY customer_id;

SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders  
WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

SELECT customer_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders 
GROUP BY customer_id, order_date 
HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);

