-- Apartado 6 del Proyecto Intermodular DAM1 (BBDD)
-- Consultas SQL a partir de mi BBDD Discográfica.

-- Alumno: Pablo Miguel

-- 1. AND, LIKE y ORDER BY
SELECT nombre_artistico, genero, ventas
FROM artistas
WHERE genero LIKE 'P%' AND ventas > 80 ORDER BY ventas DESC;


-- 2. IN y subconsulta
SELECT nombre_artistico, genero FROM artistas
WHERE cod_isrc IN (SELECT cod_isrc FROM sede WHERE nombre LIKE '%Music%');

-- 3. ALL y subconsulta
SELECT nombre_artistico, ventas FROM artistas
WHERE ventas = (SELECT MAX(ventas) FROM artistas);


-- 4. Tres subconsultas anidadas
SELECT nombre_artistico
FROM artistas
WHERE cod_isrc = (SELECT cod_isrc FROM sede WHERE cod_isrc = 
(SELECT cod_isrc FROM empleados_por_sede WHERE dni = 
(SELECT dni FROM empleados WHERE nombre = 'Juan Pérez')));


-- 5. JOIN de tres tablas con WHERE
SELECT a.nombre_artistico, s.nombre AS sede, p.marca
FROM artistas a
JOIN artistas_patrocinados ap ON a.cod_artista = ap.cod_artista
JOIN patrocinadores p ON ap.nif = p.nif
JOIN sede s ON a.cod_isrc = s.cod_isrc
WHERE p.tipo = 'FIJO';

-- 6. COUNT, WHERE, JOIN
SELECT COUNT(*) AS total_artistas_fijos FROM artistas a
JOIN artistas_patrocinados ap ON a.cod_artista = ap.cod_artista
JOIN patrocinadores p ON ap.nif = p.nif
WHERE p.tipo = 'FIJO';

-- 7. GROUP BY con WHERE
SELECT genero, COUNT(*) AS total_artistas FROM artistas
WHERE ventas > 70 GROUP BY genero;

-- 8. GROUP BY con un HAVING
SELECT cod_isrc, COUNT(*) AS cantidad_artistas FROM artistas
GROUP BY cod_isrc HAVING COUNT(*) > 1;


-- 9. WHERE con HAVING y con una subconsulta
SELECT genero, AVG(ventas) AS promedio_ventas
FROM artistas
WHERE cod_isrc IN ( SELECT cod_isrc FROM sede WHERE label LIKE 'S%')
GROUP BY genero HAVING AVG(ventas) > 80;

-- 10. Operador de conjuntos INTERSECT
SELECT cod_artista FROM artistas_patrocinados 
INTERSECT SELECT cod_artista FROM banda;

-- MySQL no tiene INTERSECT
SELECT DISTINCT ap.cod_artista FROM artistas_patrocinados ap
INNER JOIN banda b ON ap.cod_artista = b.cod_artista;

-- 11. Función ventana
SELECT nombre_artistico, genero, ventas,
RANK() OVER (PARTITION BY genero ORDER BY ventas DESC) AS ranking_genero
FROM artistas;

-- 12. CTE
WITH artistas_top AS (
    SELECT nombre_artistico, ventas FROM artistas
    WHERE ventas > 75
)
SELECT * FROM artistas_top;














