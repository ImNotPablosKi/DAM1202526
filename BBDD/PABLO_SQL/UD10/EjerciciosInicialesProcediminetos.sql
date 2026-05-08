DELIMITER //
DROP PROCEDURE IF EXISTS sakila.ej11;//
USE sakila;//
CREATE PROCEDURE sakila.ej11(IN id_actor INT)
BEGIN
	-- Declaro variable
	DECLARE existe INT;
	
	-- Comprobar si existe
	SELECT actor_id INTO existe FROM actor WHERE actor_id = id_actor;
	
	IF existe IS NULL THEN 
		SELECT 'El actor no existe';
	ELSE 
		DELETE FROM actor WHERE actor_id = id_actor;
	END IF;
END//

DROP PROCEDURE IF EXISTS world.ej13;//
USE world;//
CREATE PROCEDURE world.ej13(IN pais varchar(50))
BEGIN
	DECLARE v_continente varchar(50);
	DECLARE v_porcentaje float;

	SELECT continent FROM country WHERE Name = pais;
	
	IF v_continente='Africa' THEN
	
		SET v_porcentaje = 0.01;
		
	ELSEIF v_continente='Antartica' THEN
	
		SET v_porcentaje = 0.015;
	
	ELSEIF v_continente='Asia' OR v_continente='South America' THEN
	
		SET v_porcentaje = 0.017;
	
	ELSEIF v_continente='Europe' OR v_continente='North America' THEN
	
		SET v_porcentaje = 0.019;
	
	ELSEIF v_continente='Oceania' THEN
	
		SET v_porcentaje = 0.016;
		
	ELSE 
	
		SELECT 'No existe';
		
	END IF;
	
	UPDATE country SET GNP=GNP*(v_porcentaje+1) WHERE Name = pais;
END//

CALL ej13('United States');
SELECT * FROM country WHERE name LIKE 'United States';



