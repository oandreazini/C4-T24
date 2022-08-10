DROP table IF EXISTS trabajador;

create table trabajador(
    id int auto_increment,
    nombre varchar(250),
    trabajador enum('programador', 'deveops', 'analista'),
    salario double
);

insert into trabajador (nombre, trabajador,salario)values('Pepito','programador', 0);
insert into trabajador (nombre, trabajador,salario)values('Pepe','deveops', 0);
insert into trabajador (nombre, trabajador,salario)values('Laura','programador', 0);
insert into trabajador (nombre, trabajador,salario)values('Daniel','analista', 0);