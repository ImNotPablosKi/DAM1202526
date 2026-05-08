-- Ejercicio 4 del Boletín SQL 1 repetido, a modo de Repaso
-- ALUMNO: Pablo Miguel Domínguez a.k.a DEMON LORD

-- Borrado de la BBDD preventivo
DROP DATABASE IF EXISTS CLINICA;

-- Creo la BBDD
CREATE DATABASE CLINICA;

-- Uso la BBDD (o me posiciono en ella, como uno quiera decirlo)
USE CLINICA;

-- Creo las tablas que necesito
CREATE TABLE doctor (
	cod_doctor INT,
	nombre_doc VARCHAR(20),
	especialidad VARCHAR(50),
	CONSTRAINT pk_doctor PRIMARY KEY (cod_doctor),
	CONSTRAINT ck_nombre_doctor CHECK(nombre_doc = UPPER(nombre_doc) AND nombre_doc IS NOT NULL)
);

CREATE TABLE unidad (
	id INTEGER,
	nombre_unidad VARCHAR(20),
	planta INT,
	cod_doctor INT,
	CONSTRAINT pk_unidad PRIMARY KEY (id),
	CONSTRAINT fk_unidad_doctor FOREIGN KEY (cod_doctor) REFERENCES doctor (cod_doctor) ON DELETE CASCADE,
	CONSTRAINT ck_nombre_unidad CHECK(nombre_unidad IN('TRAUMA','QUEMADOS','INTERNA','CORAZÓN')),
	CONSTRAINT ck_nombre_unidad_unico UNIQUE (nombre_unidad),
	CONSTRAINT ck_nombre_unidad_noNulo CHECK(nombre_unidad IS NOT NULL)
);

CREATE TABLE paciente (
	nuss VARCHAR(9),
	nombre VARCHAR(20),
	edad INT,
	id_unidad INTEGER DEFAULT 1002,
	CONSTRAINT pk_paciente PRIMARY KEY (nuss),
	CONSTRAINT fk_paciente_unidad FOREIGN KEY (id_unidad) REFERENCES unidad (id) ON DELETE SET DEFAULT,
	CONSTRAINT ck_edad_paciente CHECK(edad>=5 AND edad<=80)
);

CREATE TABLE atiende (
	nuss VARCHAR(9),
	cod_doctor INT,
	fecha DATETIME,
	sintoma VARCHAR(300),
	tratamiento LONGTEXT,
	CONSTRAINT pk_atiende PRIMARY KEY (nuss, cod_doctor,fecha),
	CONSTRAINT fk_atiende_doctor FOREIGN KEY (cod_doctor) REFERENCES doctor (cod_doctor) ON DELETE CASCADE,
	CONSTRAINT fk_atiende_paciente FOREIGN KEY (nuss) REFERENCES paciente (nuss)  ON DELETE CASCADE,
	CONSTRAINT ck_fecha_ingreso_atiende CHECK(fecha>='2010-01-01')
);

-- Nueva Tabla que se pedía

CREATE TABLE enfermeria (
	codigo_enf INT AUTO_INCREMENT,
	nombre_enf VARCHAR(20) NOT NULL,
	fecha_contrato DATETIME,
	CONSTRAINT pk_enfermeria PRIMARY KEY (codigo_enf)
);

-- Altero las tablas para cumplir con las modificaciones que me piden
ALTER TABLE unidad ADD encargado INT, ADD CONSTRAINT fk_unidad_enfermeria FOREIGN KEY (encargado) REFERENCES enfermeria (codigo_enf);

ALTER TABLE atiende ADD precio INTEGER DEFAULT 10;

ALTER TABLE paciente ADD sexo CHAR(2), ADD CONSTRAINT ck_sexo_paciente CHECK(sexo IN('M','F','SD'));

ALTER TABLE doctor MODIFY nombre_doc VARCHAR(50);

ALTER TABLE atiende DROP precio;

-- Fin :)