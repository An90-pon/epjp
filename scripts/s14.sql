select job_title, min_salary as original, min_salary salary
from jobs;

select job_title, min_salary + 2000 "increased min salary" --se on ci mettevo i doppi apici non la riconosceva come stringa. apice doppio solo con l'alias
from jobs;

select job_title, min_salary + 2000 "increased min salary"
from jobs;