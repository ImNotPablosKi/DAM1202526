-- Ejercicio EQUIPOS, Clase
DROP DATABASE IF EXISTS deportes;

CREATE DATABASE deportes;

USE deportes;

CREATE TABLE equipo (
	-- Solo puede ser AUTO_INCREMENT con INTEGER
	codigo INTEGER AUTO_INCREMENT,
	nombre VARCHAR(30),
	fecha_creacion DATETIME,
	CONSTRAINT pk_equipo_codigo PRIMARY KEY (codigo)
);

CREATE TABLE jugador (
	codigo CHAR(6),
	nombre VARCHAR(20),
	apellidos VARCHAR(20),
	posicion VARCHAR(20),
	CONSTRAINT pk_jugador_codigo PRIMARY KEY (codigo)
);

CREATE TABLE juega (
	codigoJugador CHAR(6),
	codigoEquipo INTEGER,
	fechaContrato DATETIME,
	CONSTRAINT pk_juega_jugador_equipo_contrato PRIMARY KEY (codigoJugador, codigoEquipo, fechaContrato),
	CONSTRAINT fk_juega_jugador FOREIGN KEY (codigoJugador) REFERENCES jugador (codigo),
	CONSTRAINT fk_juega_equipo FOREIGN KEY (codigoEquipo) REFERENCES equipo (codigo)
);