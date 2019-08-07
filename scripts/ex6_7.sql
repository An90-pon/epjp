select e.job_id as "Job", avg(e.salary) as "Average salary", trunc(max(e.salary)) as "Max Salary", 
        min(e.salary) as "Min Salary", sum(e.salary) as "Salary sum"
from employees e
group by job_id
order by 1;

select e.job_id as "Job", count(rowid) job_count
from employees e
group by job_id;

select region_name, country_count 
from regions natural join (    select region_id, count(rowid) country_count    from countries    group by region_id);

--not right way
select distinct count(e.manager_id)
from employees e
where e.manager_id is not null;

select  j.job_id as "Job", abs(j.min_salary - j.max_salary) as "Difference"
from jobs j;

select e.manager_id as "Sub manager" , min(e.salary) as "Minimum wage"
from employees e
where manager_id is not null
group by manager_id
having min(e.salary) > 6000;

select country_id as "Country_id" , street_address as "Street address", city as "City", state_province "SProvince"
from locations join countries 
using(country_id);

select last_name as "Employee", department_name as "Department name"
from employees join departments  on employees.department_id = departments.department_id
join locations on departments.location_id = locations.location_id
where city = 'Toronto';

select last_name as "Employee"
from employees
where hire_date > (select hire_date from employees where last_name = 'Lee');

select last_name as "Employee"
from employees 
where hire_date < (select hire_date from employees where employee_id is in employees.manager_id );
