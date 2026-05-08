-- Ejercicio 1 - Pablo Miguel
-- Creación de la BBDD

-- Borrar pq usuario tonto
DROP DATABASE if EXISTS terfrutos;

-- Creamos
CREATE DATABASE terfrutos;

-- Nos metemos a la BBDD
USE terfrutos;

CREATE TABLE tiendas (
	numero_tienda NUMERIC(2),
	direccion VARCHAR(100),
	cp_tienda CHAR(5),
	telefono CHAR(9),
	CONSTRAINT pk_tiendas_numero PRIMARY KEY (numero_tienda)
);

CREATE TABLE vendedores (
	nif CHAR(12),
	nombre VARCHAR(90),
	domicilio VARCHAR(100),
	cp_vendedor CHAR(5),
	telefono CHAR(9),
	fecha_nacimiento DATE,
	estado_civil VARCHAR(20),
	numero_hijos SMALLINT,
	numero_tienda NUMERIC(2),
	-- Hay que poner la sufridica esta porque así lo va a pedir en el exámen (bleh)
	CONSTRAINT pk_vendedores_nif PRIMARY KEY (nif),
	CONSTRAINT fk_vendedores_tienda FOREIGN KEY (numero_tienda) REFERENCES tiendas (numero_tienda) ON DELETE SET NULL
);

-- Modificaciones
-- Instertamos un nuevo campo...
ALTER TABLE vendedores ADD minusvalia ENUM('S', 'N') AFTER numero_hijos;

-- Añadimos un nuevo campo "sueldo" en la tabla vendedores...
ALTER TABLE vendedores ADD sueldo FLOAT;

-- Modificamos el estado Civil (lmao)
ALTER TABLE vendedores MODIFY estado_civil CHAR(1);
