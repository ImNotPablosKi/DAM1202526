-- Consultas AVANZADAS Empresa UD7 BBDD
-- Pablo Miguel, DAM1

-- 1
SELECT UPPER(NomDep) AS NombreDepartamento, PreAnu FROM departamento;

-- 2
SELECT LOWER(NomEmp) AS NomEmpleadoMinusculas, SalEmp FROM empleado;

-- 3, SUBSTRING(Campo, inicio inclusive, fin inclusive)
SELECT NomEmp, UPPER(SUBSTRING(CodDep, 1, 2)) AS "Departamento" FROM empleado;

-- 4 IFNULL(CampoAComprobar, Reemplazo en caso de ser nulo)
SELECT CodDep, CodEmp, CONCAT(CodEmp, '-', CodDep, '-', IFNULL(ExTelEmp, 'XXXX')) AS CodigoFormado FROM empleado;

-- 5
SELECT SUBSTRING(NomEmp, 1, LOCATE(',', NomEmp) - 1) AS Apellidos, SUBSTRING(NomEmp, LOCATE(',', NomEmp) + 1) AS Nombre FROM empleado;

-- 6
SELECT NomEmp, SalEmp AS SalarioBase, ROUND((SalEmp * 1.12), 2) AS SalarioAumentado FROM empleado;

-- 7
SELECT NomEmp, SalEmp AS SalarioBase, TRUNCATE((SalEmp * 1.12), 2) AS SalarioAumentado FROM empleado;

-- 8
SELECT NomEmp, CASE
	WHEN NumHi = 1 THEN 'Sin Familia'
	WHEN NumHi = 1 THEN 'Ordinaria'
	WHEN NumHi = 2 THEN 'Semi-Numerosa'
	WHEN NumHi >= 3 THEN 'Numerosa'
END AS TipoFamilia FROM empleado;

-- 9
SELECT NomEmp, EXTRACT(DAY FROM FecNaEmp) AS DiaNacimiento, EXTRACT(MONTH FROM FecNaEmp) AS MesNacimiento, EXTRACT(YEAR FROM FecNaEmp) AS AnioNacimiento FROM empleado;

-- 10, 10V2
SELECT NomEmp, FecNaEmp, TIMESTAMPDIFF(YEAR, FecNaEmp, CURDATE()) AS Edad FROM empleado;
SELECT NomEmp, FecNaEmp, TRUNCATE(DATEDIFF(CURDATE(), FecNaEmp) / 365.25, 0) AS Edad FROM empleado;

-- 11
SELECT NomEmp, FecInEmp, FLOOR(TIMESTAMPDIFF(YEAR, FecInEmp, CURDATE()) / 4) AS DiasDeVacaciones FROM empleado;

-- 12
SELECT NomDep, CONCAT(CodDep,' ', FLOOR(10 + (RAND() * 90)),' ',CodCen) AS CodigoEspecializado FROM departamento;

-- ----------------
-- AGRUPACIONES
-- ----------------

-- 1
SELECT NomEmp, COUNT(NumHi) FROM empleado WHERE NumHi = 2 GROUP BY NomEmp;

-- 2
SELECT COUNT(*) AS CuantosEmpleados FROM empleado WHERE ExTelEmp IS NULL;

-- 3
SELECT AVG(TIMESTAMPDIFF(YEAR, FecNaEmp, CURDATE())) AS 'Edad Media' FROM empleado;

-- 4
SELECT AVG(TIMESTAMPDIFF(YEAR, e.FecNaEmp, CURDATE())) AS 'Edad Media' FROM empleado e LEFT JOIN departamento d
ON e.CodDep=d.CodDep WHERE e.CodEmp <> d.CodEmpDir;

-- 5
SELECT AVG(TIMESTAMPDIFF(YEAR, e.FecNaEmp, CURDATE())) AS 'Edad Media' FROM empleado e LEFT JOIN departamento d
ON e.CodDep=d.CodDep LEFT JOIN centro c ON d.CodCen=c.CodCen WHERE c.PobCen LIKE 'Murcia';

-- 6
SELECT SUM(d.PreAnu) FROM departamento d LEFT JOIN centro c ON d.CodCen=c.CodCen WHERE c.PobCen LIKE 'Cartagena';

-- 7
SELECT COUNT(*) FROM empleado WHERE CodEmp IN (SELECT CodEmp FROM habemp);

-- 8
SELECT COUNT(*) FROM empleado WHERE CodEmp NOT IN (SELECT CodEmp FROM habemp);

-- 9
SELECT d.CodDep, d.NomDep, MIN(e.SalEmp) AS 'PresupuestoMinimo', MAX(e.SalEmp) AS 'PresupuestoMinimo', AVG(e.SalEmp) AS 'PresupuestoMedio' FROM departamento d
LEFT JOIN empleado e ON d.CodDep=e.CodDep GROUP BY CodDep;

-- 10
SELECT e.CodEmp, e.NomEmp, COUNT(*) AS NumeroHabilidades FROM empleado e NATURAL JOIN habemp h GROUP BY CodEmp;

-- 11
SELECT d.CodDep, d.NomDep, COUNT(*) AS HabilidadesDeSusEmpleados FROM departamento d NATURAL JOIN empleado e
NATURAL JOIN habemp h GROUP BY CodDep;

-- 12
SELECT c.CodCen, c.NomCen, COUNT(*) AS HabilidadesDeEmpleadosPorCentro FROM centro c
LEFT JOIN departamento d ON c.CodCen=d.CodCen NATURAL LEFT JOIN empleado e NATURAL RIGHT JOIN habemp h GROUP BY c.CodCen;

-- 13
SELECT c.CodCen, c.NomCen, d.CodDep, d.NomDep, COUNT(*) AS HabilidadesDeEmpleadosPorCentro FROM centro c
LEFT JOIN departamento d ON c.CodCen=d.CodCen NATURAL LEFT JOIN empleado e NATURAL RIGHT JOIN habemp h GROUP BY CodDep;

-- 14
SELECT c.CodCen, AVG(e.SalEmp) FROM centro c LEFT JOIN departamento d
ON c.CodCen=d.CodCen NATURAL LEFT JOIN empleado e WHERE d.PreAnu > 25000000 GROUP BY CodCen ORDER BY AVG(e.SalEmp) DESC;

-- 15
SELECT c.PobCen, SUM(e.SalEmp) FROM centro c LEFT JOIN departamento d ON c.CodCen=d.CodCen
NATURAL JOIN empleado e GROUP BY c.PobCen;

-- 16
SELECT  d.NomDep, (SELECT  COUNT(*) FROM  empleado e WHERE  e.CodDep=d.CodDep) FROM  departamento d 
WHERE (SELECT COUNT(*) FROM  empleado e WHERE  e.CodDep=d.CodDep)>3;

-- 17
SELECT cen.NomCen, (SELECT COUNT(*) FROM empleado emp1 WHERE dep.CodDep=emp1.CodDep) AS 'Numero empleados'
FROM centro cen LEFT JOIN departamento dep ON cen.CodCen=dep.CodCen
WHERE (SELECT COUNT(*) FROM empleado emp2 WHERE dep.CodDep=emp2.CodDep) > 3;



