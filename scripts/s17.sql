select manager_id
from employees;

select distinct manager_id
from employees;

select first_name, last_name
from employees
where last_name = 'King';

select distinct job_id
from employees
where manager_id = 103 OR manager_id = 100;

