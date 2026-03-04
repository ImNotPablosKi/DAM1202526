SELECT * FROM investigadores ORDER BY facultad DESC;

SELECT nombre AS NomInvestigador, apellidos AS ApellInvestigador, dni AS DNI FROM investigadores ORDER BY apellidos;

SELECT * FROM facultades WHERE NomFacultad LIKE	'%Ciencias%';

SELECT * FROM equipos WHERE IdFacultad=2;

SELECT * FROM equipos WHERE IdEquipo LIKE	'H%';

SELECT * FROM investigadores WHERE facultad=2 OR facultad=4;

SELECT * FROM reservas WHERE FInicio LIKE	'2024-11-%';

SELECT * FROM reservas WHERE FInicio >= '2024-11-01' AND	FFin <= '2024-11-30';

SELECT * FROM investigadores WHERE apellidos LIKE '%o%z' ORDER	BY apellidos;

SELECT nombre, apellidos FROM investigadores WHERE beca > 8000;

SELECT dni FROM reservas WHERE FInicio LIKE '%09%';

SELECT dni, beca, beca*1.05 AS Nueva_Cuantía FROM investigadores ORDER BY	Nueva_cuantía DESC;

SELECT descripcion FROM equipos WHERE IdEquipo LIKE 'H555';

-- SUBCONSULTAS --

SELECT nombre FROM investigadores WHERE facultad = ANY (SELECT IdFacultad FROM facultades WHERE NomFacultad LIKE	'Ciencias Matematicas');

SELECT * FROM reservas WHERE IdEquipo = ANY (SELECT IdEquipo FROM equipos WHERE descripcion LIKE 'Telemetro laser SICK');

SELECT * FROM reservas WHERE DNI = ANY (SELECT DNI FROM investigadores WHERE facultad = ANY	(SELECT IdFacultad FROM	facultades WHERE NomFacultad='Ciencias Geológicas'));

SELECT * FROM reservas WHERE DNI = ANY (SELECT DNI FROM investigadores WHERE beca>=2000 AND beca<=6000 AND facultad = ANY	(SELECT IdFacultad FROM	facultades WHERE NomFacultad='Ciencias Geológicas'));

SELECT * FROM reservas WHERE IdEquipo='H222' AND DNI = ANY (SELECT DNI FROM investigadores WHERE facultad = ANY	(SELECT IdFacultad FROM	facultades WHERE NomFacultad='Ciencias Geológicas'));

SELECT * FROM reservas WHERE IdEquipo = ANY (SELECT IdEquipo FROM equipos WHERE IdFacultad = ANY (SELECT IdFacultad FROM facultades WHERE NomFacultad LIKE 'Ciencias Químicas')) AND DNI = ANY (SELECT DNI FROM investigadores WHERE facultad = ANY	(SELECT IdFacultad FROM	facultades WHERE NomFacultad='Ciencias Geológicas'));


SELECT * FROM equipos;

