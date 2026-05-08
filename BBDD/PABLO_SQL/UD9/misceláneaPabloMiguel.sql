-- Conjunto UD7, UD8, UD9 Ejercicios BBDD
-- Pablo Miguel, DAM1

-- -----------------------
-- Operadores de Conjunto
-- -----------------------

-- 1
SELECT d.CodEmpDir FROM departamento d UNION 
SELECT c.CodEmpDir FROM centro c;

-- 2
SELECT d.CodEmpDir FROM departamento d UNION ALL
SELECT c.CodEmpDir FROM centro c;

-- 3
SELECT CodDep, NomDep FROM departamento WHERE PreAnu > 20000000 UNION 
SELECT CodDep, NomDep FROM departamento WHERE TiDir = 'F';

-- 4
SELECT DISTINCT CodEmp, NomEmp FROM empleado WHERE CodEmp IN 
(SELECT CodEmpDir FROM departamento) AND CodEmp IN (SELECT CodEmpDir FROM centro);

-- 5
SELECT d.CodEmpDir FROM departamento d LEFT JOIN centro c ON d.CodCen  = c.CodCen
WHERE d.CodEmpDir NOT IN (SELECT c2.CodEmpDir FROM centro c2 );

-- 6
SELECT DesHab FROM habilidad WHERE CodHab IN 
(SELECT CodHab FROM habemp WHERE CodEmp IN 
(SELECT CodEmp FROM empleado WHERE CodDep = 'PROZS'))
UNION
SELECT DesHab FROM HABILIDAD WHERE CodHab IN 
(SELECT CodHab FROM habemp WHERE CodEmp IN 
(SELECT CodEmp FROM EMPLEADO WHERE CodDep = 'VENZS'));

-- 7
SELECT DesHab FROM habilidad WHERE CodHab IN 
(SELECT CodHab FROM habemp WHERE CodEmp IN 
(SELECT CodEmp FROM empleado WHERE CodDep = 'PROZS'))
INTERSECT
SELECT DesHab FROM HABILIDAD WHERE CodHab IN 
(SELECT CodHab FROM habemp WHERE CodEmp IN 
(SELECT CodEmp FROM EMPLEADO WHERE CodDep = 'VENZS'));

-- ----------------------
-- Manipulación de Datos
-- ----------------------

-- 1
INSERT INTO centro 
VALUES ('CENZ', NULL, 'Centro Norte', 'Calle Mayor, 1', 'Zaragoza');

-- 2
INSERT INTO departamento
VALUES ('DEVZS', NULL, NULL, 'CENZ', 'Desarrollo de Software', 18000000, 'F');

-- 3
INSERT INTO empleado (CodDep , ExTelEmp, FecInEmp, FecNaEmp, NomEmp, NumHi, SalEmp)
VALUES ('DEVZS', NULL, CURDATE(), '1990-03-15', 'García López, Ana', 1, 32000000);

-- 4
INSERT INTO habilidad  (CodHab, DesHab) 
VALUES ('PROYE', 'Gestión de Proyectos');

INSERT INTO habemp (CodEmp, CodHab, NivHab) 
VALUES (11, 'PROYE', 3);

-- 5
CREATE TABLE emp_backup LIKE empleado;
INSERT INTO emp_backup SELECT * FROM empleado;

-- 6
INSERT INTO hijo VALUES
(11, 1, '2015-06-01', 'García Ruíz, Pablo');

-- 7
INSERT INTO empleado (CodDep, NomEmp) VALUES ('DEVZS', 'Pastillero Lozano'), ('DEVZS', 'Colega Coleguez');

-- 8
UPDATE empleado SET SalEmp = SalEmp*1.05 WHERE CodDep = 'PROZS';

-- 9
UPDATE empleado SET SalEmp = SalEmp-100000 WHERE NumHi = 0;

-- 10
UPDATE departamento SET CodEmpDir = (SELECT CodEmp FROM empleado WHERE NomEmp = 'García López, Ana')
WHERE CodDep = 'DEVZS';

-- 11
UPDATE empleado SET SalEmp = SalEmp * 1.10 WHERE SalEmp < 
(SELECT promedio FROM (SELECT AVG(SalEmp) AS promedio FROM empleado) AS cosa);

-- 12
UPDATE departamento SET PreAnu = PreAnu*1.08 WHERE CodCen = 'FAZS' AND PreAnu < 20000000;

-- 13
UPDATE empleado SET ExTelEmp = '9999' WHERE CodDep = 
(SELECT CodDep FROM (SELECT CodDep FROM departamento WHERE PreAnu = (SELECT MAX(PreAnu) FROM departamento)) AS cosa);

-- 14
UPDATE empleado SET SalEmp = SalEmp*1.03 WHERE CodDep IN
(SELECT CodDep FROM (SELECT DISTINCT CodDep FROM empleado WHERE NumHi > 1) AS hijos);

-- 15
UPDATE empleado e LEFT JOIN hijo h ON e.CodEmp = h.CodEmp 
SET NumHi = (SELECT recuento FROM (SELECT COUNT(*) AS recuento FROM hijo WHERE CodEmp = e.CodEmp) AS cosa);

UPDATE empleado e
SET NumHi = (SELECT recuento FROM (SELECT COUNT(*) AS recuento FROM hijo WHERE CodEmp = e.CodEmp) AS cosa);

-- 16
DELETE FROM habemp WHERE CodHab = 'PROYE';

-- 17
DELETE FROM habilidad WHERE CodHab = 'PROYE';

-- 18
DELETE FROM hijo WHERE CodEmp NOT IN (SELECT CodEmp FROM empleado);

-- 19
DELETE FROM habemp WHERE CodEmp IN  (SELECT CodEmp FROM empleado WHERE CodDep = 'DEVZS');
DELETE FROM hijo WHERE CodEmp IN (SELECT CodEmp FROM empleado WHERE CodDep = 'DEVZS');

UPDATE departamento SET CodEmpDir = NULL WHERE CodDep = 'DEVZS';

DELETE FROM empleado WHERE CodDep LIKE 'DEVZS';

-- 20
DELETE FROM habemp WHERE CodEmp IN 
(SELECT CodEmp FROM (SELECT DISTINCT CodEmp FROM empleado WHERE SalEmp < (SELECT AVG(SalEmp) FROM empleado)) AS cosa);

-- 21
DELETE FROM departamento WHERE CodDep = 'DEVZS';
DELETE FROM centro WHERE CodCen = 'CENZ';

-- --------
-- VISTAS
-- --------

-- 1
DROP VIEW v_empleados_sobre_media;
CREATE VIEW v_empleados_sobre_media AS
SELECT NomEmp, SalEmp, CodDep FROM empleado WHERE SalEmp > (SELECT AVG(Salemp) FROM empleado);

SELECT * FROM v_empleados_sobre_media;

-- 2
DROP VIEW v_dep_sin_empleados;
CREATE VIEW v_dep_sin_empleados AS
SELECT d.CodDep, d.NomDep FROM departamento d WHERE NOT EXISTS (SELECT 1 FROM empleado e WHERE e.CodDep = d.CodDep );

SELECT * FROM v_dep_sin_empleados;

-- 3
DROP VIEW v_centros_presupuesto;
CREATE VIEW v_centros_presupuesto AS
SELECT c.CodCen, c.NomCen, 
(SELECT SUM(PreAnu) FROM departamento d WHERE d.CodCen = c.CodCen)
AS SumaPresupuestos FROM centro c GROUP BY CodCen;

SELECT * FROM v_centros_presupuesto;

-- 4
DROP VIEW v_directorio;
CREATE VIEW v_directorio AS
SELECT e.NomEmp, d.NomDep , c.NomCen, e.SalEmp, e.NumHi FROM empleado e
JOIN departamento d ON e.CodDep = d.CodDep
JOIN centro c ON d.CodCen = c.CodCen;

SELECT * FROM v_directorio;

-- 5
DROP VIEW v_emp_habilidades;
CREATE VIEW v_emp_habilidades AS 
SELECT e.NomEmp, h.DesHab, he.NivHab FROM empleado e
JOIN habemp he ON e.CodEmp = he.CodEmp
JOIN habilidad h ON he.CodHab = h.CodHab;

SELECT * FROM v_emp_habilidades;

-- 6
DROP VIEW v_resumen_dep;
CREATE VIEW v_resumen_dep AS
SELECT d.NomDep, c.NomCen, (SELECT NomEmp FROM empleado WHERE CodEmp = d.CodEmpDir) AS 'Director', 
COUNT(e.CodEmp), MIN(e.SalEmp), MAX(e.SalEmp) FROM empleado e 
JOIN departamento d ON e.CodDep = d.CodDep
JOIN centro c ON d.CodCen = c.CodCen GROUP BY CodEmp;

SELECT * FROM v_resumen_dep;

-- 7
DROP VIEW v_emp_hijos;
CREATE VIEW v_emp_hijos AS
SELECT e.NomEmp, h.NomHi, h.FecNaHi FROM empleado e
NATURAL LEFT JOIN hijo h;

SELECT * FROM v_emp_hijos;

-- 8
DROP VIEW v_top_sal_centro;
CREATE VIEW v_top_sal_centro AS 
SELECT c.NomCen, (SELECT NomEmp FROM empleado WHERE CodEmp = 
(SELECT CodEmp FROM (SELECT CodEmp FROM empleado WHERE SalEmp = (SELECT MAX(SalEmp) FROM empleado WHERE CodEmp = c.CodEmpDir)) AS cosa))
FROM centro c;

SELECT * FROM v_top_sal_centro;

-- 9
DROP VIEW v_habilidades_populares;
CREATE VIEW v_habilidades_populares AS
SELECT DesHab, COUNT(he.CodEmp) FROM habilidad h
NATURAL JOIN habemp he GROUP BY CodHab
HAVING COUNT(he.CodEmp) >= 2;

SELECT * FROM v_habilidades_populares;

SELECT * FROM empleado;
SELECT * FROM emp_backup;