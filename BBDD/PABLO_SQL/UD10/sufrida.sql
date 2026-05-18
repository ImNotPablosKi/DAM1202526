DELIMITER //;
DROP PROCEDURE IF EXISTS ventas.ej1; //
CREATE PROCEDURE ventas.ej1()
BEGIN
	DECLARE v_id_cliente INT;
	DECLARE v_apellidos varchar(50);
	DECLARE v_fecha_pedido date;
	DECLARE v_fin_cursor_fechas BOOLEAN DEFAULT FALSE;
	DECLARE ultima_fila BOOLEAN DEFAULT FALSE;

	DECLARE cursor_cliente CURSOR FOR 
	SELECT id_cliente, apellidos FROM clientes ORDER BY apellidos;
	
	DECLARE CONTINUE HANDLER FOR NOT FOUND 
	SET ultima_fila = TRUE;
	
	OPEN cursor_cliente;
	
	bucle: LOOP
	
	FETCH cursor_cliente INTO v_id_cliente, v_apellidos;
	
	IF	ultima_fila THEN
		LEAVE bucle;
	END IF;
	
	-- Declaro el cursor para recorrer los pedidos de los clientes
	DECLARE cursor_fecha_pedidos CURSOR FOR
		SELECT fecha_pedido FROM pedidos WHERE id_cliente = v_id_cliente;

		-- Declaro un manejador para salir del cursor interno
		DECLARE CONTINUE HANDLER FOR NOT FOUND 
			SET v_fin_cursor_fechas = TRUE;
	
		OPEN cursor_fecha_pedido;
		bucle2: LOOP
			FETCH cursor_fecha_pedido INTO v_fecha_pedido
		
			IF	v_fin_cursor_fechas THEN 
				LEAVE bucle2;
			END IF;
		
			SELECT v_fecha_pedido;
		END LOOP bucle2;
	
	
	SELECT fecha_pedido INTO  v_fecha_pedido
	FROM pedidos WHERE id_cliente = 
	(SELECT id_cliente  FROM clientes WHERE id_cliente = v_id_cliente);
	
	
	END LOOP bucle;
	CLOSE cursor_fecha_pedido;
	
	CLOSE cursor_cliente;

END//

CALL ventas.ej1();
