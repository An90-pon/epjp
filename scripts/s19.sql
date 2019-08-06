select last_name
from employees
where last_name like '_ul%';

select *
from regions
where region_id not in (2, 3);

-- !! NOT IN(..., NULL) -> FALSE !!
select *
from regions
where region_id not in (2, 3, null);

select *
from regions
where region_id between 2 and 3;

select *
from employees
where manager_id is null;

select first_name 
from employees
where last_name like 'p%';