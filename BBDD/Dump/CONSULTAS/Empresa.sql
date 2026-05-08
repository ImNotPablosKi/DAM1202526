-- Empresa, Pablo Miguel Domínguez, EJs Consultas SQL

-- 1
SELECT NomDep FROM departamento;

-- 2
SELECT NomDep, PreAnu AS PresupuestoAnual FROM departamento;

-- 3
SELECT * FROM departamento;

-- 4
SELECT NomEmp, SalEmp FROM empleado;

-- 5
SELECT DISTINCT NumHi FROM empleado;

-- 6
SELECT NomEmp, (SalEmp*NumHi*4/10) AS ComplementoFamiliar FROM empleado;

-- 7
SELECT NomDep, PreAnu, (PreAnu*1.19) AS PrecioUSD FROM departamento;

-- 8
SELECT NomDep AS NombreDepartamento, PreAnu AS PrecioEUR, (PreAnu*1.19) AS PrecioUSD FROM departamento;

-- 9
SELECT NomEmp, SalEmp FROM empleado WHERE SalEmp > 3000000;

-- 10
SELECT NomEmp, SalEmp, NumHi FROM empleado WHERE NumHi > 0 AND SalEmp > 4000000;

-- 11
SELECT NomDep, PreAnu FROM departamento WHERE PreAnu >= 10000000 AND PreAnu <= 20000000;
SELECT NomDep, PreAnu FROM departamento WHERE PreAnu BETWEEN 10000000 AND 20000000;

-- 12
SELECT * FROM empleado WHERE CodDep LIKE 'PROZS' OR CodDep LIKE 'VENZS';

-- 13
SELECT * FROM departamento WHERE TiDir LIKE 'F' OR PreAnu > 20000000;

-- 14
SELECT * FROM empleado WHERE YEAR(FecNaEmp) < 1970 OR YEAR(FecNaEmp) > 1975;

-- 15
SELECT * FROM empleado WHERE (CodDep LIKE 'PROZS' AND SalEmp > 2000000) OR (CodDep LIKE 'VENZS' AND NumHi > 1);

-- 16
SELECT * FROM departamento WHERE (CodCen LIKE 'FAZS' AND PreAnu > 10000000) OR (CodCen LIKE 'OFZS' AND TiDir LIKE 'P');

-- 17
SELECT NomDep, PreAnu FROM departamento WHERE PreAnu NOT BETWEEN 10000000 AND 20000000;

-- 18
SELECT NomDep FROM departamento WHERE NomDep LIKE '%Zona%';

-- 19
SELECT NomEmp, SalEmp FROM empleado WHERE (NomEmp LIKE 'M%' OR NomEmp LIKE 'F%') AND SalEmp > 3000000;

-- 20
SELECT * FROM empleado WHERE (YEAR(FecNaEmp) BETWEEN 1970 AND 1979) AND (CodDep NOT LIKE  'PROZS') AND (NomEmp LIKE '%ar%' OR NomEmp LIKE '%o') AND (SalEmp > 3000000);

-- --------------------------------------------------------------------------------------------------------------

-- ======================
-- SUBCONSULTAS
-- ======================

-- 1
SELECT NomEmp, SalEmp FROM empleado WHERE SalEmp > (SELECT AVG(SalEmp) FROM empleado WHERE CodDep LIKE 'PROZS');

-- 2
SELECT NomEmp, SalEmp FROM empleado WHERE SalEmp > (SELECT AVG(SalEmp) FROM empleado WHERE CodDep IN (SELECT CodDep FROM departamento WHERE NomDep LIKE 'Investigación y Diseño'));

-- 3
SELECT NomEmp, SalEmp FROM empleado e WHERE SalEmp > (SELECT AVG(SalEmp) FROM empleado e2 WHERE e.CodDep = e2.CodDep);

-- 4
SELECT NomDep FROM departamento WHERE PreAnu > (SELECT AVG(PreAnu) FROM departamento);

-- 5
SELECT NomDep FROM departamento WHERE PreAnu > (SELECT AVG(PresuCentro) FROM (SELECT SUM(PreAnu) as PresuCentro FROM departamento GROUP BY CodCen) AS Presupuestos);

-- 6
SELECT * FROM habilidad WHERE CodHab NOT IN (SELECT CodHab FROM habemp);

-- 7
SELECT NomEmp FROM empleado ORDER BY SalEmp DESC LIMIT 1;

-- 8
SELECT NomEmp FROM empleado WHERE SalEmp = (SELECT MAX(SalEmp) FROM empleado);

-- 9
SELECT * FROM empleado WHERE SalEmp > ANY (SELECT SalEmp FROM empleado WHERE CodDep LIKE 'JEFZS');

-- 10
SELECT * FROM empleado WHERE SalEmp > ALL (SELECT SalEmp FROM empleado WHERE CodDep LIKE 'VENZS');

-- 11
SELECT CodCen FROM centro WHERE CodCen = ANY (SELECT CodCen FROM departamento WHERE PreAnu > 20000000);

-- 12
SELECT CodDep FROM departamento WHERE CodDep NOT IN (SELECT CodDep FROM empleado);

-- 13
SELECT CodDep FROM departamento WHERE NOT EXISTS (SELECT CodDep FROM empleado);

-- 14
SELECT * FROM centro c WHERE 20000000 > ALL (SELECT PreAnu FROM departamento d WHERE c.CodCen=d.CodCen);

-- 15
SELECT * FROM empleado e WHERE CodDep IN (SELECT CodDep FROM empleado e2 WHERE e2.SalEmp>2000000 AND e.CodEmp!=e2.CodEmp);

-- 16
SELECT * FROM empleado e WHERE NOT EXISTS (SELECT * FROM empleado e2 WHERE e2.FecInEmp>e.FecInEmp);

-- 17
SELECT CodCen FROM departamento GROUP BY CodCen HAVING MIN(PreAnu) >= 1000000;

-- 18
SELECT * FROM departamento d WHERE EXISTS (SELECT * FROM empleado e WHERE e.CodDep=d.CodDep AND e.SalEmp > 4000000);

-- 19
SELECT * FROM empleado e WHERE NumHi > (SELECT AVG(NumHi) FROM empleado WHERE CodDep=e.CodDep);

-- 20
SELECT * FROM empleado e WHERE SalEmp = (SELECT MAX(SalEmp) FROM empleado WHERE CodDep=e.CodDep);

-- 21
SELECT * FROM departamento d WHERE PreAnu > ALL (SELECT PreAnu FROM departamento WHERE CodCen!=d.CodCen);


-- --------------------------------------------------------------------------------------------------------------

-- ======================
-- MULTITABLA
-- ======================

-- 1
SELECT d.NomDep, d.PreAnu, d.CodCen FROM departamento d LEFT JOIN centro c ON c.CodCen=d.CodCen;

-- 2
SELECT d.NomDep, d.PreAnu, e.NomEmp AS NombreDirector FROM departamento d LEFT JOIN empleado e ON e.CodEmp=d.CodEmpDir;

-- 3
SELECT d.NomDep, d.PreAnu, d.CodCen, e.NomEmp FROM departamento d LEFT JOIN empleado e ON d.CodEmpDir=e.CodEmp;

-- 4
SELECT d.NomDep, d.CodCen, e.NomEmp FROM departamento d LEFT JOIN empleado e ON d.CodEmpDir=e.CodEmp  WHERE d.PreAnu = (SELECT MAX(PreAnu) FROM departamento);

-- 5
SELECT e.*, c.CodCen FROM empleado e LEFT JOIN departamento d ON e.CodDep=d.CodDep LEFT JOIN centro c ON d.CodCen=c.CodCen WHERE c.NomCen LIKE 'Fábrica Zona Sur';

-- 6
SELECT e.NomEmp, h.NomHi, h.FecNaHi FROM empleado e JOIN hijo h ON e.CodEmp=h.CodEmp WHERE e.NumHi = 1 ORDER BY h.FecNaHi;

-- 7
SELECT e.*, c.NomCen FROM empleado e LEFT JOIN departamento d ON e.CodDep=d.CodDep LEFT JOIN centro c ON d.CodCen=c.CodCen WHERE c.NomCen LIKE 'Oficinas Zona Sur' AND e.NumHi > 0;

-- 8
SELECT d.*, h.CodHab, hab.DesHab FROM departamento d LEFT JOIN empleado e ON d.CodDep=e.CodDep LEFT JOIN habemp h ON e.CodEmp=h.CodEmp LEFT JOIN habilidad hab ON h.CodHab=hab.CodHab WHERE hab.DesHab LIKE 'Fontanería';

-- 9
SELECT d.*, d2.CodDepDep AS DepartamentoDependido FROM departamento d INNER JOIN departamento d2 ON d.CodDepDep=d2.CodDep;

-- 10
SELECT hab.*, e.CodEmp, h.NivHab FROM habilidad hab NATURAL LEFT JOIN habemp h NATURAL LEFT JOIN empleado e;

-- 11
SELECT hab.* FROM habilidad hab LEFT JOIN habemp h ON hab.CodHab=h.CodHab WHERE h.CodEmp IS NULL;

-- 12
SELECT e.NomEmp, hi.NomHi FROM empleado e LEFT JOIN hijo hi ON e.CodEmp=hi.CodEmp WHERE e.NumHi > 0;