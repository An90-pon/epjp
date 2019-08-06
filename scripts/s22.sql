select *
from employees
order by last_name asc, first_name asc;

select employee_id, first_name, last_name
from employees
where first_name = 'David' or first_name = 'Peter';

select employee_id, first_name, last_name
from employees
where department_id = 60;

select employee_id, first_name, last_name
from employees
where department_id = 30 or department_id = 50;

select employee_id, first_name, last_name
from employees
where salary > 10000;

select employee_id, first_name, last_name
from employees
where salary < 4000 or salary > 15000;

select employee_id, first_name, last_name
from employees
where department_id = 50 or department_id = 80 and (salary < 4000 or salary > 15000);

select employee_id, first_name, last_name
from employees
where hire_date like '%2005%';


select employee_id, first_name, last_name
from employees
where last_name like '%a%' or first_name like '%a%';

select employee_id, first_name, last_name
from employees
where last_name like '%a%' and first_name like '%a%'

select employee_id
from employees
order by employee_id asc;

select employee_id, first_name, last_name, commission_pct
from employees
where commission_pct is not NULL;

select department_name
from departments
order by department_name asc;

select location_id, country_id, street_address
from locations
where country_id = 'IT';

select first_name, last_name, department_name
from employees right outer join departments
using(department_id)
where department_id between 110 and 120;




