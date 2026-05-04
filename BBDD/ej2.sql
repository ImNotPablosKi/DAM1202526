-- Ejercicio 2
DROP DATABASE restricciones;

CREATE DATABASE restricciones;

USE restricciones;

CREATE TABLE provincias (
	cod_provi NUMERIC(2),
	nombre VARCHAR(25) NOT NULL,
	pais VARCHAR(25),
	CONSTRAINT ck_provincias_pais CHECK (pais IN ('España', 'Portugal', 'Italia')),
	CONSTRAINT pk_cod_provi PRIMARY KEY (cod_provi)
);

-- Insertar cosica
INSERT INTO provincias VALUES (1, 'Ávila', 'España');

-- Crear Empresas
CREATE TABLE empresas (
	cod_empresa NUMERIC(2),
	nombre VARCHAR(25) NOT NULL DEFAULT 'empresa1',
	fecha_creacion DATE,
	CONSTRAINT pk_cod_empresa_empresas PRIMARY KEY (cod_empresa)
);

CREATE TABLE continentes (
	cod_continente NUMERIC(2),
	nombre VARCHAR(20) NOT NULL DEFAULT 'Europe',
	CONSTRAINT pk_cod_cont_continentes PRIMARY KEY (cod_continente)
);

CREATE TABLE alumnos (
	codigo NUMERIC(3),
	nombre VARCHAR(21) NOT NULL,
	apellido VARCHAR(30) NOT NULL,
	curso NUMERIC(1),
	-- También vale CURDATE() en vez de NOW(),
	fecha_matricula DATETIME DEFAULT NOW(),
	-- CONSTRAINT ck_alumnos_curso CHECK (curso BETWEEN 1 AND 3),
	CONSTRAINT ck_curso_alumnos CHECK (curso>=1 AND curso<=3),
	CONSTRAINT pk_codigo_alumnos PRIMARY KEY (codigo)
);

CREATE TABLE empleados (
	cod_empleado NUMERIC(2),
	nombre VARCHAR(20) NOT NULL,
	apellido VARCHAR(25),
	-- Primer número indica los carácteres totales, el segundo cuantos de ellos son decimales.
	salario DECIMAL(7,2),
	provincia NUMERIC(2),
	empresa NUMERIC(2),
	CONSTRAINT ck_empleados_salario CHECK (salario >= 0),
	CONSTRAINT pk_empleados_cod PRIMARY KEY (cod_empleado),
	CONSTRAINT fk_provincia FOREIGN KEY (provincia) REFERENCES provincias (cod_provi) ON DELETE CASCADE,
	CONSTRAINT fk_empresa FOREIGN KEY (empresa) REFERENCES empresas (cod_empresa)
);

CREATE TABLE personas (
	dni CHAR(9),
	nombre VARCHAR(20),
	direccion VARCHAR(100),
	codprovincia NUMERIC(2),
	CONSTRAINT fk_provincias_codprovincia FOREIGN KEY (codprovincia) REFERENCES provincias (cod_provi),
	CONSTRAINT pk_personas_dni PRIMARY KEY (dni)
);

CREATE TABLE ejemplo1 (
	dni VARCHAR(10),
	nombre VARCHAR(30),
	edad NUMERIC(2),
	fecha DATE
);

CREATE TABLE ejemplo3 (
	dni VARCHAR(10),
	nombre VARCHAR(30),
	edad NUMERIC(2),
	curso NUMERIC,
	CONSTRAINT pk_ej3_dni PRIMARY KEY (dni),
	CONSTRAINT ck_ej3_edad CHECK (edad >= 5 AND edad <= 20),
	CONSTRAINT ck_ej3_curso CHECK (curso IN (1,2,3))
);

CREATE TABLE alumnos2 (
	codigo NUMERIC(2),
	nombre VARCHAR(25) NOT NULL,
	CONSTRAINT pk_alumnos2_codigo PRIMARY KEY (codigo)
);

CREATE TABLE modulos (
	codigo INTEGER,
	nombre VARCHAR(25),
	CONSTRAINT pk_modulos_codigo PRIMARY KEY (codigo)
);

CREATE TABLE notas (
	cod_alumno NUMERIC(2),
	cod_modulo INTEGER,
	nota NUMERIC(2),
	CONSTRAINT pk_cod_al_mod PRIMARY KEY (cod_alumno, cod_modulo),
	CONSTRAINT fk_cod_modulo_notas FOREIGN KEY (cod_modulo) REFERENCES modulos (codigo),
	CONSTRAINT fk_cod_alumnos_notas FOREIGN KEY (cod_alumno) REFERENCES alumnos2 (codigo)
);