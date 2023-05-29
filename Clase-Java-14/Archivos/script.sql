show databases;
create database escuela;
use escuela;
create table alumnos (
	id int not null auto_increment,
    nombre varchar(255) not null,
    edad int not null,
    primary key alumnos(id)
);

show tables;