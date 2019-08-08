delete from regions
where region_id > 10; --finchè non faccio commit i cambiamenti sono reversibii

select * 
from regions
where region_id > 10;