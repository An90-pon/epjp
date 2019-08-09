create table books (
    book_id integer 
    constraint book_id_pk primary key,
    title varchar2(1000)
    )
    
create table junctions (
        book_id integer 
        constraint book_id_fk references books(book_id),
        author_id integer 
        constraint author_id_fk references authors(author_id),
        constraint book_author_couple unique(book_id,author_id)
        )


create table authors (
        author_id integer 
        constraint author_id_pk primary key,
        author_name varchar2(1000),
        author_surname varchar2(1000)
        )
        
create table yusers (
        user_id integer
        constraint user_id_pk primary key,
        user_name varchar2(1000)
        )
    
--create table borrowers(
        borrowed_id integer
        constraint borrowed_id_pk primary key,
        book_id integer
        constraint book_id_borrowers_fk references books(book_id), 
        user_id integer
        constraint user_id_borrowers_fk references yusers(user_id),
        start_date date,
        end_date date
        )--

create table outs(
	borrowed_id integer
	constraint borrowed_id_pk primary key,
	book_id integer
	constraint book_id_outs_fk references books(book_id),
	user_id integer
	constraint user_id_outs_fk references yusers(user_id),
	end_date date 
)

create table history(
	h_id integer
	constraint h_id_pk primary key,
	book_id integer
	constraint book_id_fk references books(book_id),
	borrowing_date date
)


create sequence myhistory;

create or replace trigger outs_update(
before update of borrowed_id, book_id, user_id,end_date on outs
begin
	insert into log values(
	:myhistory.nextval,:new.book_id,: new.borrowing_date);
end outs_update;
/

update users
set user_id = 2001;
set user_name = 'Antonio';

update outs
set borrowed_id = 3001;
set book_id = 2;
set user_id = 2001;
set end_date = '';

