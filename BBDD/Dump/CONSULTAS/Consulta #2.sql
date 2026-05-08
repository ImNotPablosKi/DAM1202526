SELECT CONCAT (nombre,apellidos) AS NombreCompleto, ciudad FROM clientes;

SELECT numero_producto, nombre, precio_venta FROM productos WHERE stock>= 10 AND stock<=50;

SELECT nombre FROM productos WHERE nombre LIKE '%Mountain%' OR nombre LIKE '%Trail%' ORDER BY precio_venta DESC;

SELECT nombre FROM clientes WHERE nombre LIKE '%a' AND provincia <> 'MADRID' AND	provincia NOT LIKE 'TOLEDO';

SELECT nombre, apellidos, CONCAT (codigo_area, telefono) AS TelfCompleto FROM clientes WHERE cod_postal LIKE '28%';

SELECT nombre, precio_venta, precio_venta-(precio_venta*0.15) AS Precio_Con_Descuento FROM productos;

-- SUBCONSULTAS --

SELECT * FROM productos WHERE precio_venta > (SELECT AVG (precio_venta) FROM productos);

SELECT empleados.id_empleado, COUNT(pedidos.id_empleado) AS pedidosHechos FROM empleados LEFT JOIN pedidos ON empleados.id_empleado = pedidos.id_empleado GROUP BY empleados.id_empleado;

SELECT numero_producto FROM productos_proveedores WHERE numero_producto IN (SELECT numero_producto FROM productos WHERE numero_producto IN (SELECT numero_producto FROM detalles_pedidos WHERE numero_pedido IN (SELECT numero_pedido FROM pedidos WHERE YEAR(fecha_pedido)=2007)));

SELECT * FROM proveedores WHERE id_prov NOT IN (SELECT id_prov FROM productos_proveedores WHERE numero_producto IN (SELECT numero_producto FROM productos WHERE numero_producto IN (SELECT numero_producto FROM detalles_pedidos WHERE numero_pedido IN (SELECT numero_pedido FROM pedidos WHERE YEAR(fecha_pedido)=2007))));

SELECT * FROM categorias WHERE id_categoria >