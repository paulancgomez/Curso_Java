-- EJERCICIO 13: Realizar las sigueintes Consultas en un Query en SQL para obtener de la BDD universidad los siguientes datos

use universidad;

-- A. Todas las personas que tengan como valor 'M' en su atributo sexo.
SELECT * FROM persona where (sexo = 'M');

-- B. Todas las personas que tengan como valor 'profesor' en su atributo tipo c.
SELECT * FROM persona where (tipo = 'profesor');

-- C. Existe algun profesor hombre en la universidad?
SELECT * FROM persona where (sexo= "H" and tipo = 'profesor');

-- D. Cuantos son los alumnos Hombres en la Universidad?
SELECT COUNT(*) cant FROM persona where (sexo= "H" and tipo = 'alumno');

-- E. Nombre de alumno/s que empieza con la letra 'J'
SELECT * FROM persona where nombre LIKE 'J%';

-- F. Cual es el numero de telefono del registro de la tabla persona cuyo atributo nombre es 'Juan' y su atributo apellido1 es 'Saez'
SELECT telefono FROM persona WHERE (nombre = 'Juan' and apellido1 = 'Saez');

-- G. Ordenar alfabeticamente por apellido1 los alumnos.
SELECT count(id), apellido1, nombre FROM persona WHERE (tipo = 'alumno') GROUP BY nombre ORDER BY apellido2;

-- EJERCICIO 14: Utilizando JOINS

-- A. Selecciona el nombre y apellido1 de las personas que son profesores.
SELECT nombre, apellido1 FROM persona INNER JOIN profesor ON persona.id = profesor.id_profesor;

-- B. Selecciona los departamentos que tienen un profesor asignado.
SELECT nombre FROM departamento INNER JOIN profesor ON departamento.id = profesor.id_departamento;

-- C. Selecciona las asignarutas que tienen un profesor asignado.
SELECT nombre FROM asignatura INNER JOIN profesor ON asignatura.id_profesor = profesor.id_profesor;

-- OTROS

-- Alumnos matriculos en la asignatura Calculo
SELECT nombre FROM alumno_se_matricula_asignatura INNER JOIN persona ON alumno_se_matricula_asignatura.id_alumno = persona.id WHERE id_asignatura = 2;
