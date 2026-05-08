SELECT ci.*, co.* FROM city ci CROSS JOIN country co;

SELECT Name, ci.CountryCode, cl.CountryCode, Language FROM city ci INNER JOIN countrylanguage cl 
ON ci.CountryCode=cl.CountryCode;

SELECT *, NomFacultad FROM investigadores inv INNER JOIN facultades fa ON inv.facultad = fa.IdFacultad;

SELECT re.*, inv.nombre, inv.apellidos FROM reservas re INNER JOIN investigadores inv ON re.DNI=inv.DNI;

SELECT re.*, inv.nombre, inv.apellidos FROM reservas re INNER JOIN investigadores inv USING(DNI);

SELECT re.*, inv.nombre, inv.apellidos, e.Descripcion
FROM reservas re NATURAL JOIN investigadores inv NATURAL JOIN equipos e;