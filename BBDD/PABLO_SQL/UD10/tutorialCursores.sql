-- Declarar variables

-- Declarar el cursor
DECLARE nombre_cursor CURSOR FOR consulta;

-- Declaramos el manejador de errores para saber el final del CURSOR
DECLARE CONTINUE HANDLER FOR NOT FOUND
	SET ultima_fila = TRUE;

-- Abrimos el cursor
OPEN CURSOR nombre_cursor;

-- Bucle para recorrerlo
nombre_bucle: LOOP
	-- Procesamos primera linea del CURSOR
	FETCH nombre_cursor INTO variable;
	
	-- Condicione de salida del bucle
	IF ultima_fila THEN
		LEAVE nombre_bucle;
	END IF;
	
END LOOP;

-- Cerramos el cursor
CLOSE nombre_cursor;
