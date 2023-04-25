use mybatis;
create table tb_brand(
	id int primary key auto_increment,
    brand_name varchar(50),
    company_name varchar(50),
    ordered int,
    description varchar(100),
    status int
);
desc tb_brand;
insert into tb_brand (brand_name, company_name, ordered, description, status) 
values
("三只松鼠", '三只松鼠有限责任公司', 5,  "好吃不上火", 0),
('小米', '小米科技有限公司', 50,  'are you ok', 1),
('华为', '华为科技有限公司', 100,  '万物互联', 1);

select * from tb_brand;

delete from tb_brand where id between 0 and 100000;
alter table tb_brand drop id;
alter table tb_brand
add id int not null auto_increment first,
add primary key(id);