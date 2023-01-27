select* from tab;

drop table userinfo purge;
create table userinfo(
	num 	number(5) 	  	primary key,
	id 		varchar2(10) 	 unique,
	passwd	varchar2(10)	not null,
	name 	varchar2(10)	not null,
	score	number(7, 2)	check(score>=0 and score<=100)
	);

drop sequence stu_seq;
create sequence stu_seq increment by 1 start with 1 nocycle nocache;

insert into userinfo values(stu_seq.nextval, 'aa', '1111', 'kim', 75.4);
insert into userinfo values(stu_seq.nextval, 'bb', '1111', 'lee', 90.5);

select*from userinfo;