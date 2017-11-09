create database if not exists lovefood;

use lovefood;

create or replace table funcionario (
	id BIGINT PRIMARY KEY auto_increment,
	nome varchar(150) not null,
	login varchar(50) not null unique,
	senha varchar(255) not null,
	nivel enum('ADMIN', 'NORMAL')
);

select * from funcionario;

create or replace table cliente(
	id BIGINT PRIMARY KEY auto_increment,
	nome varchar(150) not null,
	login varchar(50) not null unique,
	senha varchar(255) not null,
	cpf int not null,
	endereco varchar(250) not null,
	telefone int
);

select * from cliente;