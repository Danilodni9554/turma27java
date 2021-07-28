db_generation_game_online;

use db_generation_game_online;

Create table tb_classe(
	id bigint(5) auto_increment,
	titulo varchar(20) not null,
	genero varchar(20) not null,
	lancamento data not null
	primary key (id)

insert into tb_classe(titulo, genero, lancamento) values ("God of War", "Ação", '2005-03-22');
insert into tb_classe(titulo, genero, lancamento) values ("Super Mario", "Aventura", '2007-11-01');
insert into tb_classe(titulo, genero, lancamento) values ("GTA V", "Ação", '2013-09-17');
insert into tb_classe(titulo, genero, lancamento) values ("Tony Hawks", "Esporte", '2000-09-19');
insert into tb_classe(titulo, genero, lancamento) values ("Zelda", "Aventura", '1998-11-21');

Create table tb_personagem(
	id bigint(5) auto_increment,
	nome varchar(20) not null,
	poderataque int(20) not null,
	poderdefesa int(20) not null
	sexo varchar (10)not null

	primary key (id)
	foreign key (classe_id) references tb_classe (id)

insert into tb_personagem(nome, poderataque, poderdefesa, sexo, classe_id) values ("Kratos", 2500, 2000, "Masculino", 2);
insert into tb_personagem(nome, poderataque, poderdefesa, sexo, classe_id) values ("Mario", 1800, 1200, "Masculino", 3);
insert into tb_personagem(nome, poderataque, poderdefesa, sexo, classe_id) values ("Trevor", 2200, 1800, "Masculino", 4);
insert into tb_personagem(nome, poderataque, poderdefesa, sexo, classe_id) values ("Tony", 1000, 800, "Masculino", 5);
insert into tb_personagem(nome, poderataque, poderdefesa, sexo, classe_id) values ("Link", 2100, 1500, "Masculino", 6);

select * from tb_personagem where poderataque > 2000;

select * from tb_personagem where poderdefesa > 1000 and poderdefesa < 2000;

select * from tb_personagem where tb_personagem.nome Like "%C%"

select * from tb_personagem 
	inner join tb_classe on tb_classe.id = tb_personagem.classe_id

select * from tb_classe where tb_classe.genero = "Aventura"






	

