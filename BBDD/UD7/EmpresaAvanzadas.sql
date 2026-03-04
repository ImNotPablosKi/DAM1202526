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

