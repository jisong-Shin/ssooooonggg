--계정 변경 edu/1234
select* from tab;

drop table addressbook purge;

create table addressbook(
	num		number			primary key,
	name 	varchar2(10)	not null,
	phone	varchar2(15),
	addr	varchar(70)
	);
	
drop sequence num_seq;
create sequence num_seq increment by 1 start with 1 nocycle nocache;
insert into addressbook values(num_seq.nextval, 'aaa', '010-111-1111', '서울');
insert into addressbook values(num_seq.nextval, 'bbb', '010-222-2222', '울릉도');
insert into addressbook values(num_seq.nextval, 'ccc', '010-333-3333', '제주도');

update addressbook set phone='333-3333', addr='거제도'
where num=3

select * from addressbook;

delete from addressbook where num=3
