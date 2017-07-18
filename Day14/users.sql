create table users(
	id			varchar2(10),
	pw			varchar2(10),
	name		varchar2(10),
	profile		varchar2(15),
	ref_date	date	default sysdate,
	constraint id_pk primary key (id)
);

select * from users;

insert into USERS(id,pw,name,profile) values('ssd','4321','Á¦´Ï','asd.jpg');