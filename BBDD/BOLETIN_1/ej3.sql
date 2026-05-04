-- Ejericio 3 SQL Boletín 1, Pablo Miguel

DROP DATABASE IF EXISTS BIBLIOTECA_DIGITAL;

CREATE DATABASE BIBLIOTECA_DIGITAL;

USE BIBLIOTECA_DIGITAL;

CREATE TABLE editoriales (
	cif VARCHAR(12),
	nombre VARCHAR(80) NOT NULL UNIQUE,
	pais_origen VARCHAR(50),
	anio_fundacion INTEGER(4),
	web VARCHAR(150),
	activa CHAR(1) DEFAULT 'S',
	CONSTRAINT pk_cif_editoriales PRIMARY KEY (cif),
	CONSTRAINT ck_cif_mayus CHECK(cif = UPPER(cif)),
	CONSTRAINT ck_anio_fundacion CHECK(anio_fundacion>=1800 AND anio_fundacion<2026),
	CONSTRAINT ck_activa CHECK(activa IN('S','N'))
);

CREATE TABLE autores (
	id_autor INT AUTO_INCREMENT,
	nombre_completo VARCHAR(100) NOT NULL,
	nacionalidad VARCHAR(50),
	fecha_nacimiento DATE,
	fecha_fallecimiento DATE,
	biografia LONGTEXT,
	premios VARCHAR(200),
	CONSTRAINT pk_autores PRIMARY KEY (id_autor),
	-- Esto comprueba las fechas solo si fecha_fallecimiento NO ES NULL
	CONSTRAINT ck_fechas_nacimiento_y_fallecimiento CHECK(fecha_fallecimiento IS NULL OR(fecha_fallecimiento>fecha_nacimiento))
);

CREATE TABLE libros (
	isbn VARCHAR(17),
	titulo VARCHAR(150) NOT NULL,
	anio_publicacion INTEGER(4),
	num_paginas INTEGER,
	idioma VARCHAR(20),
	genero VARCHAR(30) NOT NULL,
	formato VARCHAR(15) DEFAULT 'DIGITAL',
	precio_compra DECIMAL(6,2),
	disponible CHAR(1) DEFAULT 'S',
	cif_editorial VARCHAR(12),
	CONSTRAINT pk_isbn PRIMARY KEY (isbn),
	CONSTRAINT ck_anio_publicacion CHECK(anio_publicacion>=1000 AND anio_publicacion<2026+1),
	CONSTRAINT ck_num_paginas CHECK(num_paginas>0),
	CONSTRAINT ck_idiomas CHECK(idioma IN('ESPAÑOL','INGLES','FRANCES','ALEMAN','ITALIANO','PORTUGUES')),
	CONSTRAINT ck_formato CHECK(formato IN('DIGITAL','FISICO','AMBOS')),
	CONSTRAINT ck_precio_compra CHECK(precio_compra>0),
	CONSTRAINT ck_disponible CHECK(disponible IN('S','N')),
	CONSTRAINT fk_cif_editorial FOREIGN KEY (cif_editorial) REFERENCES editoriales (cif)
);

CREATE TABLE libros_autores (
	isbn VARCHAR(17),
	id_autor INT,
	orden_autor INT DEFAULT 1,
	CONSTRAINT fk_isbn_libros FOREIGN KEY (isbn) REFERENCES libros (isbn),
	CONSTRAINT fk_id_autores FOREIGN KEY (id_autor) REFERENCES autores (id_autor),
	CONSTRAINT ck_orden_autor CHECK(orden_autor>0)
);

CREATE TABLE socios (
	num_socio INT AUTO_INCREMENT,
	dni VARCHAR(10) NOT NULL UNIQUE,
	nombre VARCHAR(40) NOT NULL,
	apellidos VARCHAR(60) NOT NULL,
	email VARCHAR(100) NOT NULL UNIQUE,
	telefono VARCHAR(12),
	fecha_alta DATETIME DEFAULT NOW(),
	tipo_socio VARCHAR(15) DEFAULT 'BASICO',
	cuota_pagada CHAR(1) DEFAULT 'N',
	penalizaciones INT DEFAULT 0,
	CONSTRAINT ck_penalizaciones_socios CHECK (penalizaciones>=0 AND penalizaciones<=10),
	CONSTRAINT ck_cuota_pagada CHECK (cuota_pagada IN ('S','N')),
	CONSTRAINT ck_tipo_socio_socios CHECK (tipo_socio IN ('BASICO','PREMIUM','VIP')),
	CONSTRAINT pk_num_socio PRIMARY KEY (num_socio)
);

CREATE TABLE prestamos (
	id_prestamo INT AUTO_INCREMENT,
	num_socio INT,
	isbn VARCHAR(17),
	fecha_prestamo DATETIME DEFAULT NOW() NOT NULL,
	fecha_devolucion_prevista DATE NOT NULL,
	fecha_devolucion_real DATE NOT NULL,
	estado VARCHAR(20) DEFAULT 'EN_PRESTAMO',
	renovaciones INTEGER DEFAULT 0,
	CONSTRAINT pk_prestamos_id PRIMARY KEY (id_prestamo),
	CONSTRAINT fk_socio_prestamo FOREIGN KEY (num_socio) REFERENCES socios (num_socio),
	CONSTRAINT fk_isbn_prestamo FOREIGN KEY (isbn) REFERENCES libros (isbn),
	CONSTRAINT ck_estado CHECK(estado IN('EN_PRESTAMO','DEVUELTO','RESTRASADO','PERDIDO')),
	CONSTRAINT ck_renovaciones CHECK(renovaciones>=0 AND renovaciones<=3),
	CONSTRAINT ck_fecha_devolucion CHECK(fecha_devolucion_prevista>fecha_prestamo)
);

INSERT INTO editoriales (cif, nombre, pais_origen, anio_fundacion) VALUES ('A12345678','Editorial Planeta','ESPAÑA',1949);

INSERT INTO autores (nombre_completo, nacionalidad, fecha_nacimiento, fecha_fallecimiento) VALUES ('Gabriel García Márquez', 'Colombia', '1927-03-06', '2014,04,17');

-- Genera una inconsistencia en el año de publicación si ponemos (por ejemplo) 2030, pues es posterior a la fecha actual.
INSERT INTO libros (isbn, titulo, anio_publicacion, num_paginas, idioma, genero, cif_editorial) VALUES ('978-84-08-1234-6','Cien Años de Soledad',1967,500,'ESPAÑOL','Realismo Mágico','A12345678');
