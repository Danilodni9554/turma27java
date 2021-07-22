create database escola;

	use escola;
	
	Create table tb_estudantes(
		id bigint(5) auto_increment,
		nome varchar(20) not null,
		nascimento date not null,
    		serie int(1) not null,
		aprovado boolean,
		nota int(10)
		primary key (id)
	);

insert into tb_estudantes(nome, nascimento, serie, aprovado) values ("Mateus", '2007-11-14', 8, true);
insert into tb_estudantes(nome, nascimento, serie, aprovado) values ("Marcos", '2008-01-11', 7, true);
insert into tb_estudantes(nome, nascimento, serie, aprovado) values ("Lucas", '2009-12-13', 6, false);
insert into tb_estudantes(nome, nascimento, serie, aprovado) values ("Joao", '2010-05-12', 5, true);
insert into tb_estudantes(nome, nascimento, serie, aprovado) values ("Pedro", '2011-07-07', 4, true);
insert into tb_estudantes(nome, nascimento, serie, aprovado) values ("Lucas", '2012-03-08', 3, false);
insert into tb_estudantes(nome, nascimento, serie, aprovado) values ("Paulo", '2013-10-12', 2, false);
insert into tb_estudantes(nome, nascimento, serie, aprovado) values ("Barnabe", '2014-11-14', 1, true);

select * from tb_estudantes where nota > 7;


select * from tb_estudantes where nota < 7;



desc tb_produtos;

alter table tb_estudantes
add column nota int(10);

update tb_estudantes set nota = 8
where id = 1;

