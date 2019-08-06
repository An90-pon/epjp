select round(avg(salary)), sum(salary)
from employees
where department_id = 50;

select count(rownum) -- per essere sicuro di non farmi passare il null
from employees;

select max(salary), min(salary)
from employees;

select median(salary), round(stddev(salary)), round(variance(salary))
from employees;
