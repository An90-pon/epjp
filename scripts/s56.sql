update regions
set region_name = 'Region ' || region_id
where region_id > 10;

select *
from regions;

select *
from regions
where region_id > 10;

