create database dBforoApi;
use dbForoApi;

create table usuarios (
	id bigint not null auto_increment,
    nombre varchar(100) not null,
    email varchar(100) not null,
    contrasena varchar (300) not null,
    primary key (id)
);

create table cursos (
	id bigint not null auto_increment,
    nombre varchar(100) not null,
    categoria varchar(100) not null,
    primary key (id)
);
