-- EJERCICIO 15

-- Me va a traer todos los registros que existen en la tabla country
SELECT * FROM country;

-- Me va a traer el code y el name de cada pais
SELECT Code, Name FROM country;

-- Cuantos 'paises' existen en esta base de datos?
SELECT Count(Code), Name FROM country;

-- Tabla ciudades
SELECT * FROM city;

-- Total de ciudades
SELECT count(*) FROM city;

-- Tabla de country Language
SELECT * FROM countrylanguage;

-- Cantidad de country language
SELECT count(*) FROM countrylanguage;