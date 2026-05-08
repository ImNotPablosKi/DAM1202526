-- Consultas VENTAS con varias Tablas (JOINS)

-- 20
SELECT cli.nombre, cli.apellidos, pe.numero_pedido, pe.fecha_pedido FROM clientes cli NATURAL LEFT JOIN pedidos pe;

-- 21
SELECT dp.numero_pedido, pro.nombre, dp.precio, pe.fecha_pedido FROM detalles_pedidos dp
NATURAL JOIN productos pro NATURAL JOIN pedidos pe WHERE pe.fecha_pedido LIKE "2008%";

-- 22
SELECT id_categoria, COUNT(numero_producto) AS total_productos, AVG(precio_venta) AS precio_promedio
FROM productos GROUP BY id_categoria;

-- 23
SELECT p.nombre,pr.nombre,pp.precio_por_mayor FROM proveedores p 
JOIN productos_proveedores pp ON p.id_prov = pp.id_prov
JOIN productos pr ON pp.numero_producto = pr.numero_producto
JOIN categorias c ON pr.id_categoria = c.id_categoria
WHERE c.descripcion LIKE 'Bicicletas';

-- 24
SELECT c.nombre, e.nombre, p.fecha_pedido FROM pedidos p
JOIN clientes c ON p.id_cliente = c.id_cliente
JOIN empleados e ON p.id_empleado = e.id_empleado
WHERE c.ciudad LIKE 'Robledo' AND e.ciudad LIKE 'Robledo';

-- 25
SELECT * FROM productos WHERE numero_producto NOT IN (SELECT numero_producto FROM detalles_pedidos);

-- 26
SELECT ped.* FROM pedidos ped WHERE (ped.fecha_envio - ped.fecha_pedido) > 7;

-- 27
SELECT cat.descripcion, pro.nombre, pro.precio_venta
FROM productos pro INNER JOIN categorias cat WHERE pro.precio_venta =
(SELECT MAX(precio_venta) FROM productos WHERE id_categoria=cat.id_categoria);