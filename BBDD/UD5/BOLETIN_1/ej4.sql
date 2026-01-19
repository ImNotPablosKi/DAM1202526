-- Elimino la base de datos en caso de que exista
DROP DATABASE IF EXISTS CLINICA;

CREATE DATABASE CLINICA;

USE CLINICA;

-- Creo las tablas y tal
CREATE TABLE doctor(
	codigo INTEGER,
	nombre VARCHAR(25),
	especialidad VARCHAR(40),
	CONSTRAINT ck_codigo_doctor PRIMARY KEY (codigo),
	CONSTRAINT ck_nombre_doctor CHECK (nombre IS NOT NULL),
	CONSTRAINT ck_nombre_doc_mayus CHECK(nombre=UPPER(nombre))
);

CREATE TABLE unidades(
	id INTEGER AUTO_INCREMENT,
	nombre VARCHAR(25),
	planta INTEGER,
	codigo_doc INTEGER DEFAULT 1002,
	CONSTRAINT fk_codigo_doctor_unidades FOREIGN KEY (codigo_doc) REFERENCES doctor (codigo) ON DELETE SET DEFAULT,
	CONSTRAINT pk_id_unidades PRIMARY KEY(id),
	CONSTRAINT ck_nombre_unidades CHECK(nombre IN('TRAUMA','QUEMADOS','INTERNA','CORAZON')),
	CONSTRAINT ck_nombre_unico_unidad CHECK(nombre IS NOT NULL),
	CONSTRAINT ck_nombre_noNulo_unidad UNIQUE (nombre)
);

CREATE TABLE paciente(
	nuss VARCHAR(15),
	nombre VARCHAR(25),
	edad INT,
	fecha_ingreso DATE,
	id INTEGER,
	CONSTRAINT fk_id_paciente_unidad FOREIGN KEY (id) REFERENCES unidades (id) ON DELETE CASCADE,
	CONSTRAINT pk_nuss_paciente PRIMARY KEY (nuss),
	CONSTRAINT ck_edad_pacientes CHECK(edad>=5 AND edad<= 80),
	CONSTRAINT ck_fecha_ingreso CHECK(fecha_ingreso>='2010-01-01')
);

CREATE TABLE atiende(
	nuss VARCHAR(15),
	codigo_doctor INTEGER,
	fecha DATE,
	sintoma LONGTEXT,
	tratamiento LONGTEXT,
	CONSTRAINT fk_codigo_doctor_atiende FOREIGN KEY (codigo_doctor) REFERENCES doctor (codigo) ON DELETE CASCADE,
	CONSTRAINT fk_nuss_atiende FOREIGN KEY (nuss) REFERENCES paciente (nuss) ON DELETE CASCADE,
	CONSTRAINT pk_atiende PRIMARY KEY (nuss,codigo_doctor,fecha)
);

CREATE TABLE enfermeria (
	codigo INTEGER AUTO_INCREMENT,
	nombre VARCHAR(20),
	fecha_contrato DATE,
	CONSTRAINT pk_cod_enfermeria PRIMARY KEY (codigo)
);

-- Alteraciones

ALTER TABLE unidades ADD encargado INTEGER, ADD CONSTRAINT fk_encargado_unidad FOREIGN KEY (encargado) REFERENCES enfermeria (codigo);

ALTER TABLE atiende ADD precio INTEGER DEFAULT 10;

ALTER TABLE paciente ADD sexo VARCHAR(2), ADD CONSTRAINT ck_sexo_paciente CHECK(sexo IN('M','F','SD'));

ALTER TABLE doctor MODIFY nombre VARCHAR(50);

ALTER TABLE atiende DROP precio;