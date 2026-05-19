-- Apartado 6 del Proyecto Intermodular DAM1 (BBDD)
-- Inserciones y Modificaciones de datos SQL (Sentencias DML)

-- Alumno: Pablo Miguel

-- 1. Inserción de datos a partir del resultado de una consulta
INSERT INTO patrocinadores (nif, marca, tipo)
SELECT CONCAT('NEW', cod_artista), nombre_artistico, 'TEMPORAL'
FROM artistas
WHERE ventas > 90;

-- 2. Modificación de datos con WHERE y una subconsulta
UPDATE artistas
SET ventas = ventas + 10
WHERE cod_isrc IN 
(SELECT cod_isrc FROM sede WHERE label = 'Sony Music');

-- 3. Modificación donde el nuevo valor proviene de una subconsulta
UPDATE artistas
SET ventas = 
(SELECT AVG(a2.ventas) FROM artistas a2 WHERE a2.genero = artistas.genero)
WHERE genero = 'Pop';

-- 4. Eliminar datos usando consulta correlacionada
DELETE FROM artistas
WHERE cod_artista IN 
(SELECT codigo FROM 
(SELECT a.cod_artista AS codigo FROM artistas a WHERE a.ventas < 
(SELECT AVG(a2.ventas) FROM artistas a2 WHERE a2.genero = a.genero)) 
AS resultado);



