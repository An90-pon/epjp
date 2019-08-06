select e.first_name || ' ' || e.last_name as "Employee", e.salary as "Current Salary", e.salary + e.salary*0.085 as "ISalary",
       abs(e.salary - e.salary - e.salary*0.085) as "Delta"        
from employees e;

--previous example
select first_name, last_name
from employees
where last_name like '%a%' or first_name like '%a%';

--with regexp
select e.first_name, e.last_name
from employees e
where regexp_like(first_name, '[a]', 'i') or regexp_like(last_name, '[a]', 'i');

select e.last_name as "Employee", trunc(months_between(sysdate,hire_date)) as "Months hired"
from employees e;

select e.last_name as "Employee" , RPAD('*', trunc(e.salary/1000),  '*') as "Rank"
from employees e;

select e.last_name as "Employee", nvl2(commission_pct, to_char(e.commission_pct, '0.9'), 'no value') as "Commission"
from employees e;