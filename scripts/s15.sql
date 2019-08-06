select first_name || ' ' || last_name as "Employee's name"
from employees; --seleziona la concatenazione di first name name last name dandogli nome 

-- SKING: 24000

select EMAIL || ':' || ' ' || salary as  "@ salary"
from employees;

select first_name, last_name, 12 * salary * commission_pct
from employees;

select first_name, last_name, 12 * salary * nvl(commission_pct, 0) -- qui con la funzione built-in mi ritorna 0 al posto di null, se c'è null
from employees;

select first_name, last_name, 12 * salary * nvl(commission_pct,1)
from employees;

select first_name, last_name, 12 * salary + 12 * salary*nvl(commission_pct,0) as "Salary + commision"
from employees;





