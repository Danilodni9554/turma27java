create database db_farmacia;

use db_farmacia;

create table tb_categoria(
	id bigint(5) auto_increment,
	tipo varchar(20) not null,
	corredor int not null,
	primary key (id)
);

create table tb_produto(
	id bigint(5) auto_increment,
	nome varchar(20) not null,
	preco decimal(10,2) not null,
	categoria_id bigint not null,
	primary key (id),
	foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_categoria(tipo, corredor) values ("Remédio", 1);
insert into tb_categoria(tipo, corredor) values ("Higienie", 2);
insert into tb_categoria(tipo, corredor) values ("Beleza", 3);

insert into tb_produto(nome, preco, categoria_id) values ("Buscopan", 14.90, 1);
insert into tb_produto(nome, preco, categoria_id) values ("Advil", 19.90, 1);
insert into tb_produto(nome, preco, categoria_id) values ("Escova de dentes", 14.90, 2);
insert into tb_produto(nome, preco, categoria_id) values ("Absorvente", 9.90, 2);
insert into tb_produto(nome, preco, categoria_id) values ("Batom", 24.90, 3);
insert into tb_produto(nome, preco, categoria_id) values ("Esmalte", 5.90, 3);

select * from tb_produto where nome like "b%";
select * from tb_produto where preco > 50.00;
select * from tb_produto where preco >= 3.00 and preco <= 60.00;

select * from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select * from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
where tb_categoria.id = 3;

update tb_categoria set tipo = "Higiene" where id = 2;
