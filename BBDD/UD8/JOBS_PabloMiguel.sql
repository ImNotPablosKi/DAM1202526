-- Ejercicios JOBS BBDD DAM1
-- Pablo Miguel

-- 1
DELETE  FROM  alum a 
WHERE  a.dni IN  (SELECT  an.dni from antiguo an);

-- 2
INSERT  INTO  emple ()
VALUES  (200, "saavedra", (select e2.oficio from emple e2 where e2.apellido = "sala"), (select e2.dir from emple e2 where e2.apellido = "sala"), CURDATE(), (select e2.salario from emple e2 where e2.apellido = "sala")*1.20, (select e2.comision from emple e2 where e2.apellido = "sala"), (select e2.dept_no from emple e2 where e2.apellido = "sala"))

-- 3
UPDATE  emple e 
set e.dept_no=(select d.dept_no from depart d where d.loc="BILBAO") where e.apellido="saavedra";

-- 4
DELETE  FROM  depart d
WHERE  d.dept_no not in (select e.dept_no from emple e);

-- 5
DELETE  FROM  centro c
WHERE  c.COD_CENTRO not in (select p.COD_CENTRO from personal p);

-- 6
DELETE  FROM  personal p
WHERE  p.cod_centro in 
	(select c.COD_CENTRO from centro c  
	where (select count(p.DNI) from profesor p where p.COD_CENTRO=c.COD_CENTRO)<2 
	and c.NUM_PLAZAS<300);

-- 7
DELETE  FROM  profesor p
WHERE  p.dni NOT  IN  (select p2.dni from personal p2);

-- 8
INSERT  INTO  articulo ()
VALUES  (
	"PI201",
	"Pipas",
	(select f.COD from fabricante f where f.NOMBRE="PRESIDENT"),
	1,
	"Primera",
	100,
	200,
	5
);


INSERT  INTO  pedido ()
SELECT  
	t.nif, 
	(select a.cod from articulo a where a.nombre="Pipas"), 
	CURDATE(), 
	5 
FROM  tienda t;

-- 9
INSERT  INTO  tienda ()
VALUES  (
	"6666-C",
	"Cosas",
	"C/Señorio, 5",
	"Madrid",
	"Madrid",
	12.423
);

INSERT  INTO  pedido ()
SELECT  
	(select t.nif from tienda t where t.nombre="Cosas"), 
	a.COD, 
	CURDATE(), 
	20 
FROM  articulo a;

-- 10
INSERT  INTO  tienda ()
VALUES  (
	"6676-C",
	"Elementos",
	"C/123, 5",
	"Sevilla",
	"Sevilla",
	12.422
);

INSERT  INTO  tienda ()
VALUES  (
	"6677-C",
	"Arte",
	"C/124, 5",
	"Sevilla",
	"Sevilla",
	12.522
);

INSERT  INTO  pedido ()
SELECT  
	(select t.nif from tienda t where t.nombre="Elementos"), 
	a.COD, 
	CURDATE(), 
	30 
FROM  articulo a 
WHERE  a.COD_FABRICANTE=(select f.COD from fabricante f where f.NOMBRE="GALLO");

INSERT  INTO  pedido ()
SELECT  
	(select t.nif from tienda t where t.nombre="Arte"), 
	a.COD, 
	CURDATE(), 
	30 
FROM  articulo a 
WHERE  a.COD_FABRICANTE=(select f.COD from fabricante f where f.NOMBRE="GALLO");

-- 11
UPDATE  articulo 
set categoria="Quinta"
WHERE  COD_FABRICANTE in (select f.COD from fabricante f where f.PAIS="ITALIA");

-- 12
DELETE  FROM  articulo a
WHERE  a.cod NOT  IN  (select cod_articulo from pedido) 
AND  a.cod NOT  IN  (select cod_articulo from venta);

-- 13
UPDATE  pedido
set UNIDADES_PEDIDAS=UNIDADES_PEDIDAS-1
WHERE  nif = "5555-B";