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

create table board(
num			number	primary key,
id			varchar2(10),
subject		varchar2(10),
content		varchar2(10),
write_data	date	default	sysdate,
read_count	number	default	0
)

create sequence board_seq
	start with 1
	increment by 1