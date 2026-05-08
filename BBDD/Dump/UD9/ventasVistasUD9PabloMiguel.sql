-- UD9 Vistas Tarea Mié. 2026.04.15
-- Pablo Miguel

-- Consultas Sencillas
-- 1
CREATE VIEW v_clientes_contacto AS 
SELECT id_cliente, concat(nombre, ' ', apellidos) AS NombreCompleto, 
ciudad, provincia FROM clientes;

SELECT * FROM v_clientes_contacto;

-- 2
CREATE VIEW v_productos_pvp AS
SELECT numero_producto, nombre, precio_venta, (precio_venta*1.21) AS PrecioFinal
FROM productos;

SELECT * FROM v_productos_pvp;

-- 3
CREATE VIEW v_clientes_madrid AS
SELECT * FROM clientes WHERE provincia LIKE 'MADRID' ORDER BY apellidos;

SELECT * FROM v_clientes_madrid;

-- 4
CREATE VIEW v_productos_rango_precio AS
SELECT nombre, precio_venta FROM productos
WHERE precio_venta >= 20 AND precio_venta <= 150 ORDER BY precio_venta DESC;

SELECT * FROM v_productos_rango_precio;

-- 5
CREATE VIEW v_proveedores_sin_web AS
SELECT nombre, ciudad, telefono FROM proveedores
WHERE pag_web IS NULL;

SELECT * FROM v_proveedores_sin_web;

-- 6
CREATE VIEW v_bicicletas_y_ropa AS
SELECT nombre, descripcion, precio_venta FROM productos
WHERE (id_categoria = 2 OR id_categoria = 3) AND 
nombre LIKE '%a%';

SELECT * FROM v_bicicletas_y_ropa;

-- Subconsultas
-- 7
DROP VIEW IF EXISTS v_pedidos_grandes;

CREATE VIEW v_pedidos_grandes AS
SELECT p.numero_pedido, p.fecha_pedido, p.precio_total FROM pedidos p
WHERE p.precio_total > (SELECT AVG(p2.precio_total) FROM pedidos p2);

SELECT * FROM v_pedidos_grandes;

-- 8
DROP VIEW IF EXISTS v_clientes_activos;

CREATE VIEW v_clientes_activos AS
SELECT c.id_cliente, CONCAT(c.nombre, ' ', c.apellidos) AS NombreCompleto, c.ciudad FROM clientes c
WHERE c.id_cliente IN (SELECT p.id_cliente FROM pedidos p);

SELECT * FROM v_clientes_activos;

-- Consultas Multitabla
-- 9
DROP VIEW IF EXISTS v_pedidos_detallados;

CREATE VIEW v_pedidos_detallados AS 
SELECT p.numero_pedido, p.fecha_pedido, p.precio_total, 
CONCAT(c.nombre, ' ', c.apellidos) AS NombreCompletoCliente, CONCAT(e.nombre,' ', e.apellidos) AS NombreCompletoEmpleado FROM pedidos p
JOIN clientes c ON p.id_cliente = c.id_cliente
JOIN empleados e ON p.id_empleado = e.id_empleado;

SELECT * FROM v_pedidos_detallados;

-- 10
DROP VIEW IF EXISTS v_catalogo_productos;

CREATE VIEW v_catalogo_productos AS 
SELECT p.nombre, p.descripcion AS 'DescripcionProducto', p.precio_venta, p.stock, c.descripcion FROM productos p
JOIN categorias c ON p.id_categoria = c.id_categoria;

SELECT * FROM v_catalogo_productos;

-- 11
DROP VIEW IF EXISTS v_clientes_sin_pedidos;

CREATE VIEW v_clientes_sin_pedidos AS 
SELECT CONCAT(c.nombre, ' ', c.apellidos) AS NombreCompleto, c.ciudad, c.provincia FROM clientes c
LEFT JOIN pedidos p ON c.id_cliente = p.id_cliente
WHERE p.id_cliente IS NULL;

SELECT * FROM v_clientes_sin_pedidos;

-- 12
DROP VIEW IF EXISTS v_mejor_precio_proveedor;

CREATE VIEW v_mejor_precio_proveedor AS
SELECT p.nombre, pp.precio_por_mayor, pro.nombre AS 'NombreProveedor' FROM productos p
JOIN productos_proveedores pp ON p.numero_producto = pp.numero_producto
JOIN proveedores pro ON pp.id_prov = pro.id_prov
WHERE pp.precio_por_mayor = (SELECT MIN(pp2.precio_por_mayor) FROM productos_proveedores pp2 WHERE pp2.numero_producto = p.numero_producto);

SELECT * FROM v_mejor_precio_proveedor;