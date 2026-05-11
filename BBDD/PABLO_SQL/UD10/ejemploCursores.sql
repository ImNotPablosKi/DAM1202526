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