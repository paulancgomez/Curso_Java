-- Si existe la BD 'clase20' la borra
DROP DATABASE IF EXISTS db_ejemplo;

-- Crea la base de datos
create database db_ejemplo;

-- Se le dice que usaremos la base de datos clase20 que acabamos de crear
use db_ejemplo;

-- Borramos la tabla ALUMNOS si existe
DROP TABLE IF EXISTS ALUMNO;


-- Borramos la tabla CARRERA si existe
DROP TABLE IF EXISTS CARRERA;

-- Creamos las tablas que usaremos
-- CREATE OBJETO_QUE_VOY_A_CREAR NOMBRE_OBJETO_SINGULAR
create table CARRERA(
	-- ATRIBUTOS DE LA ENTIDAD CARRERA
	id int auto_increment primary key,    -- Identificador: de tipo int con un auto_increment (va a ir aumentando de uno en uno). primary key (tiene que existir y tiene que ser unica en la tabla, me va a servir para establecer relaciones)
    nombre varchar(255) not null,         -- Nombre de la carrera: varchar quiere decir que es una cadena de caracteres con un maximo tamaño 255. not nul (no puede ser nulo)
	cant_materias int not null default 0  -- cantidad de materias: de tipo int. not null (no nulo). default 0 (el valor por defecto va a ser 0) 
);

create table ALUMNO(
	id int auto_increment primary key,
    nombre varchar(255) not null,
	apellido varchar(255) not null,
    carrera int,
	foreign key (carrera) references CARRERA(id) -- ESTABLEZCO RELACION: con foreign key estoy diciendo que mi atributo carrera va a hacer referencia a la tabla CARRERA al atributo id que es el primary key
);

-- Muesta las tablas creadas
show tables;

-- Insertamos la informacion de las carreras: Agregue varios de una sola vez
INSERT INTO CARRERA(nombre, cant_materias) -- Primero: Insertar dentro de la tabla CARRERA, voy a escribir en el orden que yo voy a pasar  
VALUES("Tecnicatura en Higiene y Seguridad", 20),
	  ("Licenciatura en Recursos Naturales", 26),
      ("Arquitectura", 30),
      ("Ingenieria Civil", 42), 
      ("Ingenieria Mecanica", 45), 
      ("Ingenieria Informatica", 43),
      ("Ingenieria Textil", 40),
      ("Ingenieria Electronica", 43);
    
    
-- Insertamos registros de alumnos: Agregamos fila por fila
INSERT INTO ALUMNO(nombre, apellido, carrera) VALUE("Gabriel", "Benitez", 2);
INSERT INTO ALUMNO(nombre, apellido, carrera) VALUE("David", "Perez", 5);
INSERT INTO ALUMNO(nombre, apellido) VALUE("Maria", "Villaroel");
INSERT INTO ALUMNO(nombre, apellido, carrera) VALUE("Monica", "Hurtado", 2);
INSERT INTO ALUMNO(nombre, apellido) VALUE("Damian", "Hurtado");
INSERT INTO ALUMNO(nombre, apellido, carrera) VALUE("Aldo", "Silvestre", 6);
INSERT INTO ALUMNO(nombre, apellido, carrera) VALUE("Gaston", "Gomez", 7);
INSERT INTO ALUMNO(nombre, apellido) VALUE("Enrique", "Silveira");
INSERT INTO ALUMNO(nombre, apellido, carrera) VALUE("Jose", "Santos", 4);
INSERT INTO ALUMNO(nombre, apellido, carrera) VALUE("Lucia", "Alvares", 3);

-- Muestra tabla ALUMNO
SELECT * FROM ALUMNO a; -- a ES UN ALIAS: Me sirve para hacer referencia a la tabla alumno por a (solo a)

-- Muestra la columna 'nombre' de la tabla ALUMNO
 SELECT nombre as n FROM ALUMNO a; -- n ES UN ALIAS que va a estar visualizada en la columna de nombre

-- Usando INNER JOIN: Muestra los alumnos que estan cursando una carrera
SELECT * FROM ALUMNO a INNER JOIN CARRERA c ON a.carrera = c.id; -- INNER JOIN (junta las tablas con una cierta condicion). ON (donde la carrera del ALUMNO es igual a id de la CARRERA)

-- Lo mismo que el anterior solo que aqui vemos que al poner solo JOIN lo toma como INNER JOIN
SELECT * FROM ALUMNO a JOIN CARRERA c ON a.carrera = c.id; 

-- Usando LEFT JOIN: Muestra todo los alumnos y los alumnos que estan cursando una carrera
SELECT * FROM ALUMNO a LEFT JOIN CARRERA c ON a.carrera = c.id;

-- Usando RIGHT JOIN: Muestra todo las carreras y los carreras que estan siendo cursadas por alumnos
SELECT * FROM ALUMNO a RIGHT JOIN CARRERA c ON a.carrera = c.id;

-- Lo mismo que el anterior pero solo mostrando el nombre, apellido y nombre de la carrera
SELECT a.nombre, a.apellido, c.nombre FROM ALUMNO a RIGHT JOIN CARRERA c ON a.carrera = c.id;

-- Lo mismo que el anterior solo que poniendole un alias 'carrera' en la columna de las carreras
SELECT a.nombre, a.apellido, c.nombre as carrera FROM ALUMNO a RIGHT JOIN CARRERA c ON a.carrera = c.id;

-- 
SELECT a.nombre, a.apellido, c.nombre as 'carrera cursada' FROM ALUMNO a JOIN CARRERA c ON a.carrera = c.id ; 

-- Muestra los alumnos cuyo nombre contiene M
SELECT * FROM ALUMNO a WHERE a.nombre like '%M%'; -- WHERE: condicion de registros. LIKE: se usa para comparar cadenas. %M%: contiene M.

-- M%: Comience con M.
SELECT * FROM ALUMNO a WHERE a.nombre like 'M%';

-- %M: termina con M
SELECT * FROM ALUMNO a WHERE a.nombre like '%M';

-- Donde el nombre del alumno
SELECT * FROM ALUMNO a WHERE a.carrera IS NOT NULL AND (a.nombre like 'G%' OR a.nombre like 'A%'); 

-- Contar la cantidad de registros que tiene CARRERA (son 8 materias las que tengo)
SELECT COUNT(*) as 'cantidad registros' FROM CARRERA c;

-- Contar cuantas personas tienen el mismo apellido 
SELECT COUNT(*) as cant, a.apellido FROM ALUMNO a GROUP BY a.apellido;

-- Lo mismo que el anterior solo que la cantidad de apellidos sea mayor que 1
SELECT COUNT(*) as cant, a.apellido FROM ALUMNO a GROUP BY a.apellido HAVING COUNT(*) > 1;

-- Sumar la catidad de materias de todas las carreras
SELECT SUM(c.cant_materias) FROM CARRERA c;

-- Ordenar alfabeticamente la tabla CARRERA por nombre (por defecto ordena ascendentemente)
SELECT * from CARRERA c ORDER BY c.nombre;

-- De forma ascendente
SELECT * from CARRERA c ORDER BY c.nombre ASC;

-- De forma descendente
SELECT * from CARRERA c ORDER BY c.nombre DESC;

-- ORDENA DESCENDENTEMENTE POR LA CANTIDAD DE MATERIAS
SELECT * from CARRERA c ORDER BY c.cant_materias DESC;

-- MUESTRA TABLA CARRERA
SELECT * from CARRERA c ;

-- ¡CUIDADO! Actualiza todo sin importar que: Perdida de datos, ya no se recupera.
UPDATE CARRERA SET nombre = 'carrera nueva'; -- Todos los campos de nombre van a decir 'carrera nueva'

-- ¡CUIDADO! Borra toda la tabla ALUMNO. 
DELETE FROM ALUMNO;