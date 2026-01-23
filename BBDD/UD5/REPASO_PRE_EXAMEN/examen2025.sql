-- Examen 2ª Evaluacion 2025 (Repaso)
-- ALUMNO: Pablo Miguel Dommínguez, 1ºDAM

-- Borrar BBDD por si acaso
DROP DATABASE IF EXISTS RESTAURANTE;

-- Crearla
CREATE DATABASE RESTAURANTE;

-- Usarla
USE RESTAURANTE;

-- A partir de aquí se crean cada una de las tablas
CREATE TABLE categoria (
	cod_categoria CHAR(2) NOT NULL,
	nombre VARCHAR(20),
	descripcion_cat VARCHAR(300),
	encargado VARCHAR(20),
	CONSTRAINT pk_categoria PRIMARY KEY (nombre),
	CONSTRAINT ck_nombre_categoria CHECK(nombre IN('POSTRE','PRIMERO','SEGUNDO'))
);

CREATE TABLE plato (
	cod_plato INTEGER,
	nombre_plato VARCHAR(30) NOT NULL,
	descripcion VARCHAR(300),
	nivel INTEGER,
	precio DECIMAL(2,2),
	categoria VARCHAR(20),
	CONSTRAINT pk_plato PRIMARY KEY (cod_plato),
	CONSTRAINT fk_plato_categoria FOREIGN KEY (categoria) REFERENCES categoria (nombre) ON DELETE SET NULL,
	CONSTRAINT ck_precio_plato CHECK(precio>= 8 AND precio <= 50),
	CONSTRAINT ck_nivel_plato CHECK(precio <= 4),
	CONSTRAINT ck_nombre_plato_mayus CHECK(nombre_plato = UPPER(nombre_plato)),
	CONSTRAINT ck_nombre_plato_noNulo CHECK(nombre_plato IS NOT NULL),
	CONSTRAINT ck_nombre_plato_unico UNIQUE (nombre_plato)
);

CREATE TABLE ingredientes (
	codigo INTEGER,
	nombre VARCHAR(20) NOT NULL,
	unidades VARCHAR(10),
	almacen INTEGER,
	CONSTRAINT pk_ingredientes PRIMARY KEY (codigo),
	CONSTRAINT ck_unidades_ingrediente CHECK(unidades IN('GRAMOS','LITROS','KILOS','ONZAS')),
	CONSTRAINT ck_nombre_ingrediente_unico UNIQUE (nombre),
	CONSTRAINT ck_nombre_ingrediente_noNulo CHECK(nombre IS NOT NULL)
);

CREATE TABLE utiliza (
	cod_ingrediente INTEGER,
	cod_plato INTEGER,
	cantidad INTEGER,
	CONSTRAINT pk_utiliza PRIMARY KEY (cod_ingrediente,cod_plato,cantidad),
	CONSTRAINT fk_utiliza_ingrediente FOREIGN KEY (cod_ingrediente) REFERENCES ingredientes (codigo) ON DELETE CASCADE,
	CONSTRAINT fk_utiliza_plato FOREIGN KEY (cod_plato) REFERENCES plato (cod_plato) ON DELETE CASCADE
);

CREATE TABLE cocinero (
	id INT AUTO_INCREMENT,
	nombre VARCHAR(30),
	fecha_contrato DATETIME,
	CONSTRAINT pk_cocinero PRIMARY KEY (id)
);

-- A partir de aquí se realizan las modificaciones requeridas
ALTER TABLE plato ADD cocinero INT, ADD CONSTRAINT fk_plato_cocinero FOREIGN KEY (cocinero) REFERENCES cocinero (id);

ALTER TABLE plato ADD fecha_plato DATETIME DEFAULT NOW();

ALTER TABLE cocinero ADD sexo CHAR(2), ADD CONSTRAINT ck_sexo CHECK(sexo IN('M','F','SD'));

ALTER TABLE ingredientes MODIFY nombre VARCHAR(50);

ALTER TABLE plato DROP nivel;