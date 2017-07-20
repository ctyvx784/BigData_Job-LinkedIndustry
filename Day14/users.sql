create table users(
	id			varchar2(10),
	pw			varchar2(10),
	name		varchar2(10),
	profile		varchar2(15),
	ref_date	date	default sysdate,
	constraint id_pk primary key (id)
);

select * from users;

insert into USERS(id,pw,name,profile) values('ssd','4321','제니','asd.jpg');

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
	
insert into board
values(board_seq.nextval,'test','수학','테스트',default,default)

insert into board
values(board_seq.nextval,'test','과학','테스트',default,default)

select * from board

create table comments(
comment_num			number	primary key,
id					varchar2(20),
write_date			date		default sysdate,
num					number	references	board(num)  
)
alter table comments add(content varchar2(1000));
create sequence comments_seq
	start with 1
	increment by 1
	
insert into comments
values(comments_seq.nextval,'제니',default,2,'블랙핑크 멤버');

select*from comments;