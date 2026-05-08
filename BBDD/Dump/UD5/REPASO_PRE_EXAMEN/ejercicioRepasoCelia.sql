-- ALUMNO: Pablo Miguel Domínguez, 1º DAM
-- Ejercicio de Repaso UD5 SQL

-- Borrado preventivo
DROP DATABASE IF EXISTS DGT;

-- Crear BBDD
CREATE DATABASE DGT;

-- Usar BBDD
USE DGT;

-- A partir de aquí creo las tablas necesarias:
CREATE TABLE persona (
	dni VARCHAR(9),
	nombre VARCHAR(30) NOT NULL,
	dir VARCHAR(20),
	cp INTEGER(5),
	CONSTRAINT pk_persona PRIMARY KEY (dni),
	CONSTRAINT ck_cpostal CHECK(cp LIKE "44%")
);

CREATE TABLE vehiculo (
	matricula VARCHAR(7),
	propietario VARCHAR(9),
	fecha_compra DATE,
	CONSTRAINT pk_vehiculo PRIMARY KEY (matricula),
	CONSTRAINT fk_vehiculo_propietario FOREIGN KEY (propietario) REFERENCES persona (dni) ON DELETE CASCADE
);

CREATE TABLE multa (
	vehiculo VARCHAR(7),
	propietario VARCHAR(9),
	fecha DATE,
	euros DECIMAL(3,2),
	CONSTRAINT pk_multa PRIMARY KEY (vehiculo,propietario,fecha,euros),
	CONSTRAINT fk_multa_vehiculo FOREIGN KEY (vehiculo) REFERENCES vehiculo (matricula) ON DELETE CASCADE, 
	CONSTRAINT fk_multa_persona FOREIGN KEY (propietario) REFERENCES persona (dni) ON DELETE CASCADE,
	CONSTRAINT ck_fecha_multa CHECK(fecha>'2010-01-01' AND fecha IS NOT NULL)
);

-- Y aquí realizo las modificaciones/alteraciones requeridas:
ALTER TABLE persona MODIFY dir VARCHAR(50);

ALTER TABLE persona ADD CONSTRAINT ck_nombre_mayus CHECK(nombre = UPPER(nombre));

ALTER TABLE persona ADD sexo CHAR(2), ADD CONSTRAINT ck_sexo CHECK(sexo IN('M','F','SD'));

ALTER TABLE persona DROP sexo;