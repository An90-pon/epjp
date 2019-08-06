select e.job_id as "Job", avg(e.salary) as "Average salary", trunc(max(e.salary)) as "Max Salary", 
        min(e.salary) as "Min Salary", sum(e.salary) as "Salary sum"
from employees e
group by job_id
order by 1;

select e.job_id as "Job", count(rowid) job_count
from employees e
group by job_id;

select first_name, last_name 
from employees e
where employee_id in(select distinct manager_id from employees where manager_id is not null) 
order by 2;