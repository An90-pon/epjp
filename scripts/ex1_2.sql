select first_name, last_name, department_name
from employees left outer join departments
using(department_id);

select first_name, last_name, job_title
from employees join jobs
using(job_id);

select first_name, last_name, job_title, salary
from employees join jobs
using(job_id)
where employees.salary = jobs.min_salary or employees.salary = jobs.max_salary;

select first_name, last_name, country_id
from employees join departments on employees.department_id = departments.department_id
join locations on departments.location_id = locations.location_id
where locations.country_id = 'UK';

select department_name, first_name, last_name
from departments join employees on departments.manager_id = employees.employee_id;

select department_name, first_name, last_name
from departments left outer join employees on departments.manager_id = employees.employee_id;

select department_name
from departments
where manager_id is null;

--First example
select e.first_name || ' ' || e.last_name as "employee", m.first_name || ' ' || m.last_name as "manager"
from employees m right outer join employees e
on(e.employee_id = m.manager_id);

--Second example
select e.first_name || ' ' || e.last_name as "employee", m.first_name || ' ' || m.last_name as "manager"
from employees e left outer join employees m
on(m.employee_id = e.manager_id);

--Not right way
--select first_name, last_name, job_id
--from employees
--where job_id not like '%_PRES' or job_id  not like '%_MAN' or job_id not like '%_MGR'; 


select e.first_name || ' ' || e.last_name as "employee"
from employees e left outer join employees m
on(e.manager_id = m.employee_id)
where e.employee_id not in m.manager_id;
