-- Ejercicio 3 CASO 2, Pablo Miguel, DAM1
DROP DATABASE IF EXISTS hospital;

CREATE DATABASE hospital;

USE hospital;

CREATE TABLE enfermedad (
	id_enfermedad NUMERIC(5),
	nombre VARCHAR(20) NOT NULL UNIQUE,
	descripcion VARCHAR(300) NOT NULL,
	t_recuperacion VARCHAR(20),
	CONSTRAINT pk_id_enfermedad PRIMARY KEY (id_enfermedad)
);

CREATE TABLE paciente (
	id_paciente NUMERIC(3),
	nombre VARCHAR(20) NOT NULL,
	apellidos VARCHAR(30),
	f_nacimiento DATE,
	poblacion VARCHAR(30),
	id_medico NUMERIC(3),
	CONSTRAINT pk_paciente PRIMARY KEY (id_paciente),
	CONSTRAINT fk_recursiva FOREIGN KEY (id_medico) REFERENCES paciente (id_paciente)
);

CREATE TABLE historial (
	id_historial NUMERIC(2),
	grupo_sanguineo CHAR(1),
	id_paciente NUMERIC(3),
	CONSTRAINT pk_historial PRIMARY KEY (id_historial),
	CONSTRAINT fk_pacientes FOREIGN KEY (id_paciente) REFERENCES paciente (id_paciente)
);

CREATE TABLE linea_historial (
	num_linea NUMERIC(2),
	id_historial NUMERIC(2),
	id_enfermedad NUMERIC(5) NOT NULL,
	f_inicio DATE,
	f_fin DATE,
	sintomas VARCHAR(50),
	observaciones VARCHAR(50),
	CONSTRAINT ck_fechas CHECK (f_fin > f_inicio),
	CONSTRAINT pk_num_linea PRIMARY KEY (num_linea),
	CONSTRAINT fk_historial_linea FOREIGN KEY (id_historial) REFERENCES historial (id_historial),
	CONSTRAINT fk_enfermedad_linea FOREIGN KEY (id_enfermedad) REFERENCES enfermedad (id_enfermedad)
);

CREATE TABLE localizacion (
	id_localizacion NUMERIC(2),
	cp NUMERIC(6),
	ciudad VARCHAR(15),
	riesgo NUMERIC(2) DEFAULT 1,
	CONSTRAINT pk_id_localizacion PRIMARY KEY (id_localizacion)
);

CREATE TABLE estancias_pacientes (
	id_paciente NUMERIC(3),
	id_localizacion NUMERIC(2),
	f_entrada DATE,
	f_salida DATE,
	CONSTRAINT pk_paciente_localizacion_fechaentrada_estancias PRIMARY KEY (id_paciente, id_localizacion, f_entrada),
	CONSTRAINT fk_paciente_estancia FOREIGN KEY (id_paciente) REFERENCES paciente (id_paciente),
	CONSTRAINT fk_localizacion_estncia FOREIGN KEY (id_localizacion) REFERENCES localizacion (id_localizacion)
);