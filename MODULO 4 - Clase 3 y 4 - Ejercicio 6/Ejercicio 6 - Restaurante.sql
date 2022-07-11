/*	Ejercicio 6
	Guiandote con el siguiente Diagrama de Clases de un Restaurante Diseñar la BDD
    e insertar Valores dentro de cada una de las tablas desde JAVA
*/

CREATE DATABASE restaurante CHARACTER SET utf8mb4;
USE restaurante;

CREATE TABLE mesa (
numesa INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
ubic ENUM('N', 'S', 'E', 'O')
);

CREATE TABLE mozo (
idmozo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(30),
direccion VARCHAR(50),
telefono VARCHAR(9),
email VARCHAR(50)
);

CREATE TABLE cliente (
idc INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(30),
direccion VARCHAR(50),
telefono VARCHAR(9),
email VARCHAR(50)
);

CREATE TABLE comanda(
numped INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
idc INT UNSIGNED,
numesa INT UNSIGNED,
idmozo INT UNSIGNED,
fecha DATE NOT NULL,
FOREIGN KEY (numesa) REFERENCES mesa(numesa),
FOREIGN KEY (idmozo) REFERENCES mozo(idmozo),
FOREIGN KEY (idc) REFERENCES cliente(idc)
);

CREATE TABLE producto (
idp INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
descrip VARCHAR(100),
precio INT UNSIGNED,
tipo ENUM('rapida','al plato', 'para llevar')
);

CREATE TABLE detalle_comanda (
iddeta_com INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
numped INT UNSIGNED,
idp INT UNSIGNED,
cant INT UNSIGNED,
FOREIGN KEY (idp) REFERENCES producto(idp),
FOREIGN KEY (iddeta_com) REFERENCES comanda(numped)
);

CREATE TABLE documento (
numdoc INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
idtipo INT UNSIGNED,
fechad DATE NOT NULL,
rucd VARCHAR(50),
numped INT UNSIGNED,
total INT UNSIGNED,
FOREIGN KEY (numped) REFERENCES comanda(numped)
);