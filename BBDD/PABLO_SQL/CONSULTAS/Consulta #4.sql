SELECT * FROM productos WHERE precio_venta > (SELECT precio_venta FROM productos WHERE numero_producto=15);

SELECT nombre FROM clientes WHERE provincia = ALL (SELECT provincia FROM proveedores WHERE nombre LIKE 'Shinoman, Incorporated');

SELECT nombre FROM clientes WHERE provincia NOT	IN (SELECT provincia FROM proveedores);

SELECT id_prov, nombre FROM proveedores WHERE id_prov IN (SELECT id_prov FROM productos_proveedores WHERE numero_producto NOT IN (SELECT numero_producto FROM detalles_pedidos));

SELECT id_prov, nombre FROM proveedores WHERE id_prov IN (SELECT id_prov FROM productos_proveedores WHERE numero_producto IN (SELECT numero_producto FROM detalles_pedidos));

SELECT * FROM productos WHERE precio_venta < ANY (SELECT precio_venta FROM productos WHERE id_categoria IN (SELECT id_categoria FROM categorias WHERE descripcion LIKE 'Ropa'));

SELECT * FROM pedidos WHERE precio_total < ALL (SELECT precio_total FROM pedidos WHERE id_cliente = 1001);

SELECT * FROM productos WHERE precio_venta < ALL (SELECT precio_venta FROM productos WHERE id_categoria IN (SELECT id_categoria FROM categorias));

SELECT * FROM pedidos WHERE fecha_pedido < ALL (SELECT fecha_pedido FROM pedidos WHERE id_cliente=1005);

