-- Ejercicios VideoClub UD8 BBDD, Pablo Miguel

-- 1
UPDATE cliente SET Direccion = 'Mayor, 10 Teruel' where DNI = '022222222R';
SELECT * FROM  cliente c;

-- 2
UPDATE cliente SET Nombre = UPPER(Nombre);
SELECT * FROM  cliente c;

DELETE FROM pelicula p WHERE p.CodPeli =  6;

-- 3
INSERT INTO pelicula (CodPeli, Titulo, CodGenero, SegundaParte, CodActor)
VALUES (6, 'Lo que el agua se llevó', (SELECT g.CodGenero FROM genero g WHERE g.descripcion LIKE 'Drama'), 
(SELECT p.CodPeli FROM pelicula p WHERE p.Titulo LIKE 'Lo que el viento se llev�'), 
(SELECT a.CodActor FROM actor a WHERE a.nombre LIKE 'Eva'));
SELECT * FROM pelicula;

-- 4
INSERT INTO copia VALUES (1, 6);

-- 5
INSERT INTO factura VALUES (4, CURDATE(), 0, (SELECT c.DNI FROM cliente c WHERE c.Nombre LIKE 'PEDRO MARTINEZ ROY'));
SELECT * FROM factura;
DELETE FROM factura WHERE CodFactura = 4;

DELETE FROM detallefactura WHERE CodFactura = 4;

-- 6
INSERT INTO detallefactura VALUES(4, 1, 'Piel 1', 4.50, 1),(4, 2, 'Refresco', 2.50, 2);
UPDATE factura SET importe = importe + ((SELECT SUM(PrecioUnitaro * (SELECT NumeroUnidades FROM detallefactura d2 WHERE CodFactura = 4 AND LineaFactura = d1.LineaFactura)) FROM detallefactura d1 WHERE CodFactura = 4));

SELECT * FROM detallefactura d;
SELECT * FROM factura;

-- 7
INSERT INTO prestamo VALUES (6, 1, CURDATE(), (SELECT dni FROM cliente WHERE nombre LIKE 'PEDRO MARTINEZ ROY'));
SELECT * FROM prestamo;

-- 8
INSERT INTO interpretada VALUES (6, (SELECT p.codactor FROM pelicula p WHERE p.codpeli = 6));
SELECT * FROM interpretada;

-- 9
DELETE FROM pelicula p WHERE p.codpeli = 6;
SELECT * FROM pelicula;
-- Nos da un error porque hay una clave ajena referenciada que tiene datos en otras tablas y violamos su integridad