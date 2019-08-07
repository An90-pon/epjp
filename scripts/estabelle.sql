insert into coders values(201, 'Maria', 'Rossi', sysdate, 5000);

insert into coders values(202, 'Franco', 'Bianchi', sysdate,4500);

update coders set first_name = 'Mariangela' 
where first_name = 'Maria';

update coders set salary = salary + 500
where salary < 6000;

delete from coders
where coder_id = 202;

commit;