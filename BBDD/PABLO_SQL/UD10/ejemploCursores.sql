DELIMITER //;
DROP PROCEDURE IF EXISTS world.mostrarCiudadesPais;//
CREATE PROCEDURE world.mostrarCiudadesPais(IN codigo_pais char(3))
BEGIN
	
	DECLARE ciudad varchar(50);
	DECLARE ultima_fila bool DEFAULT 0;
	
	DECLARE cursor_ciudades CURSOR FOR
		SELECT Name FROM city WHERE CountryCode = codigo_pais;
	
	-- Declarar el manejador para el final del cursor
	-- Cuando salta una "excepción" porque no encuentra algo pone ultima_fila a 1 y se acaba el programa
	DECLARE CONTINUE HANDLER FOR NOT FOUND 
	SET ultima_fila = 1;
	
	OPEN cursor_ciudades;
	
	-- Bucle para recorrer el cursor
	bucle: LOOP
	
		FETCH cursor_ciudades INTO ciudad;
		
		-- Condición para salir del bucle
		IF ultima_fila = 1 THEN 
			LEAVE bucle;
		END IF;
		
		SELECT concat('Ciudad de ', codigo_pais, ' es ', ciudad);
	END LOOP;
		
	CLOSE cursor_ciudades;
	
END//

DROP PROCEDURE IF EXISTS world.resumen_idiomas_continente;//
CREATE PROCEDURE world.resumen_idiomas_continente()
BEGIN
	
	DECLARE continente VARCHAR(25);
	DECLARE cant_idiomas INT;
	DECLARE porcentaje DECIMAL(5,2);
	
	-- Declarar variable ultima_fila del cursor
	DECLARE ultima_fila BOOLEAN DEFAULT FALSE;
	
	-- Declarar el cursor
	DECLARE cursor_continente CURSOR FOR
		SELECT DISTINCT Continent FROM country;
	
	-- Declarar el manejador de errores para el cursor
	DECLARE CONTINUE HANDLER FOR NOT FOUND
		SET ultima_fila = TRUE;
	
	CREATE TEMPORARY TABLE temporal_continente(
		continente VARCHAR(25),
		num_idiomas INT,
		porcentaje DECIMAL(5,2)
	);
	
	-- Abrir el cursor
	OPEN cursor_continente;
	
	-- Procesar, Usamos un bucle para recorrer el cursor
	bucle_cursor: LOOP
		-- Procesar un cursor
		FETCH cursor_continente INTO continente;
	
		-- Condicion de salida del bucle
		IF ultima_fila THEN
			LEAVE bucle_cursor;
		END IF;
		
		SELECT COUNT(cl.Language), AVG(cl.percentage)
		INTO cant_idiomas, porcentaje
		FROM country c JOIN countrylanguage cl
		ON c.Code = cl.CountryCode
		WHERE c.Continent = continent;
		
		INSERT INTO temporal_continentes VALUES(continente, num_idiomas, porcentaje);
		
	END LOOP;
	
	CLOSE cursor_continente;
	
	SELECT * FROM temporal_continente;
END//
