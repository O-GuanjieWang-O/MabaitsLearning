create database mybatis;
use mybatis;
drop table if exists tb_user;
create table tb_user(
	id int primary key auto_increment,
    username varchar(20),
    password varchar(20),
    gender char(1),
    addr varchar(30)
);

insert into tb_user values(1, 'zhansan', '123', '男', '北京');
insert into tb_user values(2, '李四', '234', '男', '北京');
insert into tb_user values(3, '王五', '24', '男', '北京');
update tb_user set addr = '西安' where id = 3;

select * from tb_user;