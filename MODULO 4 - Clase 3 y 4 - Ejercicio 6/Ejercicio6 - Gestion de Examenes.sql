/*	Ejercicio 6
	Guiandote con la siguiente Narrativa de un Colegio que necesita poder administrar la informacion de los examenes Diseñar la BDD
    e insertar Valores dentro de cada una de las tablas desde JAVA.
*/

DROP DATABASE IF EXISTS examenes;
CREATE DATABASE examenes CHARACTER SET utf8mb4;
use examenes;


/*	Los ALUMNOS estan definidos por su:
	- n° de matricula.
    - nombre.
    - grupo al que asisten a clase.
*/
CREATE TABLE alumnos(
	id INT UNSIGNED AUTO_INCREMENT ,
    num_matricula INT UNSIGNED,
    nombre VARCHAR(50),
    grupo ENUM('M', 'T'), -- Mañana o Tarde
    primary key(id)
);


/*CONTROLES ESCRITOS: Dichos alumnos realizan dos tipos de controles a lo largo del curso academico, y se definen por el:
	- n° de control.
    - n° de preguntas de que consta.
    - fecha de realizacion (la misma para todos los alumnos que realizan el mismo control).
    - nota de cada alumno por control.
*/
CREATE TABLE escrito(
	num_control INT UNSIGNED AUTO_INCREMENT,
    id_alumno INT UNSIGNED,
    num_preguntas INT UNSIGNED,
    fecha DATE NOT NULL,
    nota_alumno INT UNSIGNED,
    PRIMARY KEY (num_control),
    FOREIGN KEY (id_alumno) REFERENCES alumnos(id)
);


/*	En cuanto a los PROFESORES, unicamente interesa conocer (ademas de sus datos personales: DNI y nombre), quien es el que ha
	diseñado cada practica, sabiendo que en el diseño de una practica puede colaborar mas de uno, y que un profesor puede diseñar
    mas de una practica. Interesa, ademas, la fecha en que ha sido diseñada cada practica por el profesor correspondiente.
*/
CREATE TABLE profesor(
	id INT UNSIGNED auto_increment,
    nombre VARCHAR(50),
    dni INT UNSIGNED,
    PRIMARY KEY (id)
);


/*	PRACTICAS: se realiza un n° indeterminado de ellas durante el curso academico, algunas seran en grupo y otras individuales.
	Se definen por un codigo de practica, titulo y el grado de dificultad. En este caso los alumnos pueden examinarse de cualquier
    practica cuando lo deseen, debiendose almacenar la fecha y nota obtenida.
*/
CREATE TABLE practica(
	cod_practica INT UNSIGNED AUTO_INCREMENT,
    titulo VARCHAR(50),
    dificultad ENUM('A', 'I', 'B'), -- ALTA BAJA O INTERMEDIA
    fecha_diseño DATE NOT NULL,
    id_profesor INT UNSIGNED,
    nota INT UNSIGNED,
    PRIMARY KEY (cod_practica),
    FOREIGN KEY (id_profesor) REFERENCES profesor(id)
);

CREATE TABLE inscripcion(
	control_practica INT UNSIGNED,
	id_alumno INT UNSIGNED AUTO_INCREMENT,
    fecha_inscripcion DATE NOT NULL,
    PRIMARY KEY (control_practica),
    FOREIGN KEY (id_alumno) REFERENCES alumnos(id),
    FOREIGN KEY (control_practica) REFERENCES practica(cod_practica)
); 