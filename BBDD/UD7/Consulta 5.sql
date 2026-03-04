-- Países que tengan ciudades

SELECT Name FROM country co WHERE EXISTS (SELECT * FROM city ci WHERE ci.CountryCode=co.Code);

SELECT Name FROM country co WHERE NOT EXISTS (SELECT * FROM city ci WHERE ci.CountryCode=co.Code);

-- Subconsultas correlacionadas
-- Mostrar los países (su nombre) junto con su ciudad más poblada

SELECT NAME, (SELECT MAX(Population) FROM city ci WHERE ci.CountryCode=co.Code) FROM country co;

-- Paises con poblacion mayor al promedio de SU continente
SELECT Name FROM country co1 WHERE Population > (SELECT AVG(Population) FROM country co2 WHERE co2.Continent=co1.Continent);

-- Ciudades de más de 1.000.000 Hab. junto con el nombre de su respectivo país
SELECT ci.Name AS Ciudad , co.Name AS Pais FROM city ci INNER JOIN country co ON ci.CountryCode=co.Code WHERE ci.Population > 1000000;

-- Nombre del país junto con sus ciudades
SELECT co.Name AS Pais, ci.Name AS Ciudad FROM city ci LEFT JOIN country co ON ci.CountryCode=co.Code;

SELECT co.ventasName AS Pais, ci.Name AS Ciudad FROM city ci LEFT JOIN country co ON ci.CountryCode=co.Code WHERE ci.ID IS NULL;