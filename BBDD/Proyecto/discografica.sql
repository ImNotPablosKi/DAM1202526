-- DISCOGRÁFICA Proyecto Intermodular Final DAM1
-- Apartado BBDD, Script SQL

-- Borrado preventivo
DROP DATABASE IF EXISTS discografica;

-- Creacion de la BBDD
CREATE DATABASE discografica;

-- Posicionamiento
USE discografica;

-- Tabla para login de usuarios, no está directamente relacionada con el resto de la base de datos.
CREATE TABLE logged (
	username VARCHAR(30) NOT NULL,
	password VARCHAR(30) NOT NULL,
	CONSTRAINT pk_logged PRIMARY KEY (username)
);

-- Tabla de la sede.
CREATE TABLE sede (
	cod_isrc INTEGER(5) AUTO_INCREMENT,
	label VARCHAR(20) UNIQUE NOT NULL,
	nombre VARCHAR(30),
	direccion VARCHAR(40),
	email VARCHAR(50),
	CONSTRAINT pk_sede PRIMARY KEY (cod_isrc)
);

-- Tabla para los empleados
CREATE TABLE empleados (
	dni VARCHAR(9),
	id_empleado INTEGER(3) AUTO_INCREMENT UNIQUE NOT NULL,
	nombre 	VARCHAR(20) NOT NULL,
	telefono INTEGER(9),
	sueldo DECIMAL(6, 2),
	dni_director VARCHAR(9),
	CONSTRAINT pk_empleados PRIMARY KEY (dni),
	CONSTRAINT fk_empleados_director FOREIGN KEY (dni_director) REFERENCES empleados (dni) ON DELETE SET NULL ON UPDATE CASCADE
	-- Esta última constraint es recursiva.
);

-- Tabla a partir de la relacion entre empleados y la sede
CREATE TABLE empleados_por_sede (
	cod_isrc INTEGER(5),
	dni VARCHAR(9),
	CONSTRAINT pk_empleados_por_sede PRIMARY KEY (cod_isrc, dni),
	CONSTRAINT fk_empleados_sede_sede FOREIGN KEY (cod_isrc) REFERENCES sede (cod_isrc) ON DELETE CASCADE,
	CONSTRAINT fk_empleados_sede_emp FOREIGN KEY (dni) REFERENCES empleados (dni) ON DELETE CASCADE ON UPDATE CASCADE
);

-- Tabla para los artistas
CREATE TABLE artistas (
	cod_artista INTEGER(3) AUTO_INCREMENT,
	nombre_artistico VARCHAR(20) UNIQUE,
	genero VARCHAR(15),
	nombre_legal VARCHAR(20),
	ventas INTEGER(2),
	cod_isrc INTEGER(5),
	CONSTRAINT pk_artistas PRIMARY KEY (cod_artista),
	CONSTRAINT fk_artistas_sede FOREIGN KEY (cod_isrc) REFERENCES sede (cod_isrc) ON DELETE CASCADE
);

-- Tabla para los patrocinadores
CREATE TABLE patrocinadores (
	nif VARCHAR(9),
	tipo VARCHAR(10),
	marca VARCHAR(20),
	telefono INTEGER(9),
	nivel INTEGER(2),
	CONSTRAINT pk_patrocinadores PRIMARY KEY (nif),
	CONSTRAINT ck_tipo_patrocinador CHECK(tipo IN('FIJO', 'VARIABLE'))
);

-- Tabla a partir de la relacion entre artistas y sus patrocinadores
CREATE TABLE artistas_patrocinados (
	cod_artista INTEGER(3),
	nif VARCHAR(9),
	CONSTRAINT pk_artistas_patrocinados PRIMARY KEY (cod_artista, nif),
	CONSTRAINT fk_artistas_patrocinados_artistas FOREIGN KEY (cod_artista) REFERENCES artistas (cod_artista) ON DELETE CASCADE,
	CONSTRAINT fk_artistas_patrocinados_patrocinadores FOREIGN KEY (nif) REFERENCES patrocinadores (nif) ON DELETE CASCADE ON UPDATE CASCADE
);

-- Tablas para la ISA que contiene los distintos tipos de Artistas.
CREATE TABLE banda (
	cod_artista INTEGER(3),
	instrumentos VARCHAR(100),
	CONSTRAINT pk_banda PRIMARY KEY (cod_artista),
	CONSTRAINT fk_banda_artista FOREIGN KEY (cod_artista) REFERENCES artistas (cod_artista) ON DELETE CASCADE
);

CREATE TABLE independiente (
	cod_artista INTEGER(3),
	estado VARCHAR(10),
	CONSTRAINT pk_independiente PRIMARY KEY (cod_artista),
	CONSTRAINT fk_independiente_artista FOREIGN KEY (cod_artista) REFERENCES artistas (cod_artista) ON DELETE CASCADE,
	CONSTRAINT ck_estado_independiente CHECK(estado IN ('ACTIVO', 'RETIRADO'))
);

CREATE TABLE productor (
	cod_artista INTEGER(3),
	estudio BOOL,
	CONSTRAINT pk_productor PRIMARY KEY	(cod_artista),
	CONSTRAINT fk_productor_artista FOREIGN KEY (cod_artista) REFERENCES artistas (cod_artista) ON DELETE CASCADE
);

-- Tabla para Publicidad
CREATE TABLE publicidad (
	nif VARCHAR(9),
	ad_id INTEGER(2),
	canal VARCHAR(30),
	producto VARCHAR(50),
	coste DECIMAL(5,2),
	CONSTRAINT pk_publicidad PRIMARY KEY (nif, ad_id),
	CONSTRAINT fk_publicidad_patrocinadores FOREIGN KEY (nif) REFERENCES patrocinadores (nif) ON DELETE CASCADE 
);

-- Inserts para la tabla sede
INSERT INTO sede (label, nombre, direccion, email) VALUES
('SONY', 'Sony Music', 'Calle de la Música 123, Madrid', 'info@sony.es'),
('UNIV', 'Universal Music', 'Avenida del Ritmo 45, Barcelona', 'contacto@universal.es'),
('WARN', 'Warner Music', 'Plaza del Disco 67, Valencia', 'info@warner.es'),
('INDI', 'Indie Records', 'Calle Alternativa 89, Bilbao', 'hola@indie.es'),
('ELEC', 'Electronic Beats', 'Paseo del Sintetizador 12, Sevilla', 'info@elec.es');

-- Inserts para la tabla empleados
INSERT INTO empleados (dni, nombre, telefono, sueldo, dni_director) VALUES
('12345678A', 'Juan Pérez', 600000000, 2500.00, NULL),
('23456789B', 'María García', 611111111, 2200.00, '12345678A'),
('34567890C', 'Carlos López', 622222222, 2100.00, '12345678A'),
('45678901D', 'Ana Martínez', 633333333, 2000.00, '12345678A'),
('56789012E', 'Pedro Sánchez', 644444444, 1900.00, '23456789B');

-- Inserts para la tabla empleados_por_sede
INSERT INTO empleados_por_sede (cod_isrc, dni) VALUES
(1, '12345678A'),
(1, '23456789B'),
(1, '34567890C'),
(2, '45678901D'),
(2, '56789012E');

-- Inserts para la tabla artistas
INSERT INTO artistas (nombre_artistico, genero, nombre_legal, ventas, cod_isrc) VALUES
('RockStars', 'Rock', 'Juan Rodríguez', 85, 1),
('PopPrincess', 'Pop', 'Laura Fernández', 92, 1),
('JazzMasters', 'Jazz', 'Miguel Ángel', 67, 2),
('ElectroBeat', 'Electrónica', 'David Silva', 78, 3),
('IndieVibes', 'Indie', 'Sofía Castro', 73, 4);

-- Inserts para la tabla patrocinadores
INSERT INTO patrocinadores (nif, tipo, marca, telefono, nivel) VALUES
('A1234567B', 'FIJO', 'Coca-Cola', 900000001, 9),
('B2345678C', 'VARIABLE', 'Adidas', 900000002, 7),
('C3456789D', 'FIJO', 'Nike', 900000003, 8),
('D4567890E', 'VARIABLE', 'Red Bull', 900000004, 6),
('E5678901F', 'FIJO', 'Samsung', 900000005, 9);

-- Inserts para la tabla artistas_patrocinados
INSERT INTO artistas_patrocinados (cod_artista, nif) VALUES
(1, 'A1234567B'),
(1, 'B2345678C'),
(2, 'C3456789D'),
(3, 'D4567890E'),
(4, 'E5678901F');

INSERT INTO logged VALUES ('admin', 'Sor2425$');
    