-- CONSULTAS world
use world;

-- ¿Cuáles son los países que existen en la BDD ?
SELECT * FROM country;

-- ¿Cuántos son los países que existen en la BDD ?
SELECT COUNT(*) FROM country;

-- ¿Cuántos son los habitantes de cada país ?


-- ¿Cuál es el país que tiene más habitantes ?


-- ¿Cuál es el país que tiene más provincias ?


-- ¿Cuál es la provincia con más habitantes ?


-- ¿Cuál es el número total de habitantes en el mundo según los registros de nuestra BDD ?


-- ¿Cuáles son los lenguajes que existen en el mundo ?
SELECT * FROM countrylanguage;

-- ¿Cuántos lenguajes hay en el mundo ?
SELECT COUNT(*) FROM countrylanguage;

-- ¿Cuál es el porcentaje de personas que hablan cada lenguaje ?
SELECT countryCode, percentage FROM countrylanguage;