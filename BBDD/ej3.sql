-- Ejercicio 3, Pablo Miguel, DAM1
DROP DATABASE IF EXISTS logistica;

CREATE DATABASE logistica;

USE logistica;

CREATE TABLE proveedores (
	id_prov NUMERIC(2),
	nombre VARCHAR(30),
	telefono VARCHAR(9) UNIQUE,
	mail VARCHAR(20),
	CONSTRAINT pk_proveedores_id_prov PRIMARY KEY (id_prov)
);

CREATE TABLE categorias (
	id_categoria VARCHAR(2),
	descripcion VARCHAR(50),
	CONSTRAINT pk_categorias_id PRIMARY KEY (id_categoria)
);

CREATE TABLE productos (
	numero_producto INTEGER,
	nombre VARCHAR(30),
	precio_venta FLOAT,
	stock INTEGER,
	id_categorias VARCHAR(2),
	CONSTRAINT pk_numero_producto PRIMARY KEY (numero_producto),
	CONSTRAINT fk_id_categorias FOREIGN KEY (id_categorias) REFERENCES categorias (id_categoria)
);


CREATE TABLE productos_proveedores (
	id_prov NUMERIC(2),
	num_producto INTEGER,
	CONSTRAINT pk_prov_prod PRIMARY KEY (id_prov, num_producto),
	CONSTRAINT fk_prov FOREIGN KEY (id_prov) REFERENCES proveedores (id_prov),
	CONSTRAINT fk_prod FOREIGN KEY (num_producto) REFERENCES productos (numero_producto)
);

CREATE TABLE clientes (
	id_cliente VARCHAR(3),
	nombre VARCHAR(25),
	apellidos VARCHAR(25),
	direccion VARCHAR(25),
	telefono VARCHAR(9) UNIQUE,
	CONSTRAINT pk_id_cliente PRIMARY KEY (id_cliente)
);

CREATE TABLE empleados (
	id_empleado VARCHAR(3),
	nombre VARCHAR(30),
	apellidos VARCHAR(30),
	direccion VARCHAR(30),
	codigo_area VARCHAR(2),
	CONSTRAINT pk_id_empleado PRIMARY KEY (id_empleado)
);

CREATE TABLE pedidos (
	numero_pedido INTEGER,
	fecha_pedido DATE,
	id_cliente VARCHAR(3) NOT NULL,
	id_empleado VARCHAR(3) NOT NULL,
	CONSTRAINT pk_numero_pedido PRIMARY KEY (numero_pedido),
	CONSTRAINT fk_cliente FOREIGN KEY (id_cliente) REFERENCES clientes (id_cliente),
	CONSTRAINT fk_empleado FOREIGN KEY (id_empleado) REFERENCES empleados (id_empleado)
);

CREATE TABLE detalles_pedidos (
	numero_pedido INTEGER,
	numero_producto INTEGER,
	cantidad INTEGER,
	precio DECIMAL(7,2),
	CONSTRAINT pk_pedido_producto PRIMARY KEY (numero_pedido, numero_producto),
	CONSTRAINT fk_pedido FOREIGN KEY (numero_pedido) REFERENCES pedidos (numero_pedido),
	CONSTRAINT fk_producto FOREIGN KEY (numero_producto) REFERENCES productos (numero_producto),
	CONSTRAINT ck_cantidad CHECK (cantidad >= 1 AND cantidad <= 100)
);

