-- Ejercicio 2 - ACADEMIA VIRTUAL
-- Fecha: 09/01/2026
-- Nombre: Pablo Miguel

-- Borramos la Base de Datos
DROP DATABASE IF EXISTS ACADEMIA_VIRTUAL;

-- Creamos la base de Datos
CREATE DATABASE ACADEMIA_VIRTUAL;

-- Entramos a la Base de Datos
USE ACADEMIA_VIRTUAL;

-- Creamos la tabla CATEGORÍAS
CREATE TABLE categorias (
	id_categoria INT AUTO_INCREMENT,
	nombre_categoria VARCHAR(40) NOT NULL UNIQUE,
	descripcion VARCHAR(150),
	activa CHAR(1) DEFAULT 'S',
	CONSTRAINT pk_id_categoria PRIMARY KEY (id_categoria),
	CONSTRAINT ck_activa CHECK(activa IN('S', 'N'))
);

CREATE TABLE instructores (
	email VARCHAR(100),
	nombre_completo VARCHAR(80) NOT NULL,
	biografia LONGTEXT,
	fecha_registro DATETIME DEFAULT NOW(),
	puntuacion_media DECIMAL(3,2),
	certificado CHAR(1),
	linkedin VARCHAR(150),
	CONSTRAINT pk_email_instructores PRIMARY KEY (email),
	CONSTRAINT ck_certificado CHECK(certificado IN('S', 'N')),
	CONSTRAINT ck_puntuacion CHECK(puntuacion_media>=0 AND puntuacion_media<=5)
);

CREATE TABLE cursos (
	cod_curso VARCHAR(10),
	titulo VARCHAR(100) NOT NULL,
	descripcion LONGTEXT,
	nivel VARCHAR(15),
	duracion_horas INTEGER,
	precio DECIMAL(6,2),
	fecha_creacion DATETIME DEFAULT NOW(),
	plazas_max INTEGER,
	id_categoria INT,
	email_instructor VARCHAR(100),
	CONSTRAINT pk_cod_curso PRIMARY KEY (cod_curso),
	CONSTRAINT ck_nivel_contenido CHECK (nivel IN ('BASICO', 'INTERMEDIO', 'AVANZADO', 'EXPERTO')),
	CONSTRAINT ck_duracion CHECK(duracion_horas>0 AND duracion_horas<500),
	CONSTRAINT ck_precio CHECK(precio>=0),
	CONSTRAINT ck_plazas_max CHECK(plazas_max>0 AND plazas_max<=100),
	CONSTRAINT fk_id_categoria FOREIGN KEY (id_categoria) REFERENCES categorias (id_categoria),
	CONSTRAINT fk_email_instructor FOREIGN KEY (email_instructor) REFERENCES instructores (email)
);

CREATE TABLE estudiantes (
	id_estudiante INT AUTO_INCREMENT,
	email VARCHAR(100)NOT NULL UNIQUE,
	nombre VARCHAR(40) NOT NULL,
	apellidos VARCHAR(60) NOT NULL,
	pais VARCHAR(50),
	fecha_nacimiento DATE,
	premium CHAR(1) DEFAULT 'N',
	CONSTRAINT pk_id_estudiante PRIMARY KEY (id_estudiante),
	CONSTRAINT ck_premium CHECK(premium IN('S', 'N'))
);

CREATE TABLE matriculas (
	id_matricula INT AUTO_INCREMENT,
	id_estudiante INT,
	cod_curso VARCHAR(10),
	fecha_matricula DATETIME DEFAULT NOW(),
	progreso INTEGER DEFAULT 0,
	calificacion_final DECIMAL(4,2),
	completado CHAR(1) DEFAULT 'N',
	CONSTRAINT pk_id_matricula PRIMARY KEY (id_matricula),
	CONSTRAINT fk_id_estudiante FOREIGN KEY (id_estudiante) REFERENCES estudiantes (id_estudiante) ON DELETE CASCADE,
	CONSTRAINT fk_cod_curso FOREIGN KEY (cod_curso) REFERENCES cursos (cod_curso),
	CONSTRAINT ck_progreso CHECK (progreso>0 AND progreso<=100),
	CONSTRAINT ck_calificacion CHECK (calificacion_final>=0 AND calificacion_final<=10),
	CONSTRAINT ck_completado CHECK (completado IN('S', 'N')),
	CONSTRAINT uq_curso_matricula UNIQUE(id_matricula, cod_curso)
);

-- Inserto una categoria
INSERT INTO categorias (nombre_categoria,descripcion,activa) VALUES ('PROGRAMACION','Categoria de programacion','S');

-- INSERT INTO instructores (email,nombre_completo,puntuacion_media,certificado) VALUES ('juan.perez@academia.com','Juan Pérez Sánchez',4.75,'S');
-- Comento esto pq se enfada con el ALTER de despues

-- Modificaciones Avanzadas (ALTER)

ALTER TABLE cursos ADD idioma VARCHAR(20) DEFAULT 'ESPAÑOL';

ALTER TABLE cursos ADD CONSTRAINT ck_cursos_idioma CHECK (idioma IN('ESPAÑOL','FRANCES','ALEMAN'));

ALTER TABLE instructores MODIFY biografia LONGTEXT NOT NULL;

ALTER TABLE matriculas ADD descuento_aplicado DECIMAL(5,2);

ALTER TABLE matriculas ADD CONSTRAINT ck_descuento CHECK (descuento_aplicado>=0 AND descuento_aplicado<=100);

ALTER TABLE instructores DROP CONSTRAINT ck_puntuacion;

ALTER TABLE instructores ADD CONSTRAINT ck_puntuacion CHECK(puntuacion_media>=0 AND puntuacion_media<=10);

ALTER TABLE cursos ADD fecha_inicio DATETIME, ADD fecha_fin DATETIME;

ALTER TABLE cursos ADD CONSTRAINT CHECK(fecha_fin>fecha_inicio);

ALTER TABLE instructores DROP linkedin;

ALTER TABLE matriculas ADD CONSTRAINT ck_completado_y_progrreso CHECK(completado = 'S' AND progreso=100);