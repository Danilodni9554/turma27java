create database db_ecommerce;

	use db_ecommerce;
	
	Create table tb_produtos(
	id bigint(5) auto_increment,
	marca varchar(20) not null,
	modelo varchar(20) not null,
	preco decimal(10,2) not null,
	tamanho int(10) not null,
	primary key (id)
);

insert into tb_produtos(marca, modelo, preco, tamanho) values ("Samsung", "Galaxy A32", 1349.10, 10);
insert into tb_produtos(marca, modelo, preco, tamanho) values ("Motorola", "Moto G9", 1500.60, 10);
insert into tb_produtos(marca, modelo, preco, tamanho) values ("Samsung", "Galaxy A01", 616.55, 8);
insert into tb_produtos(marca, modelo, preco, tamanho) values ("Xiaomi", "Mi 11", 9300.00, 11);
insert into tb_produtos(marca, modelo, preco, tamanho) values ("LG", "K71", 1449.10, 9);
insert into tb_produtos(marca, modelo, preco, tamanho) values ("Apple", "Iphone 12", 7000.00, 10);
insert into tb_produtos(marca, modelo, preco, tamanho) values ("Samsung", "Galaxy A21", 1265.00, 12);
insert into tb_produtos(marca, modelo, preco, tamanho) values ("Apple", "Iphone 11", 5000.00, 10);

select * from tb_produtos where preco > 500;

select * from tb_produtos where preco < 500;

desc tb_produtos;

alter table tb_produtos
add column memoria int(3);

update tb_produtos set memoria = 64
where id = 2;

