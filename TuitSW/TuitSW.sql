DROP DATABASE bd_tuits;
bd_tuitsCREATE DATABASE bd_tuits;
USE bd_tuits;

CREATE TABLE tbl_tuit(
	id_tuit INT PRIMARY KEY AUTO_INCREMENT,
	titulo_tuit VARCHAR(100),
	descripcion_tuit VARCHAR(500),
	fecha_tuit DATE
);
SELECT * FROM tbl_tuit;

INSERT INTO tbl_tuit (titulo_tuit, descripcion_tuit, fecha_tuit)
VALUES('Hola','Primer Tuit de Prueba','2021-10-01');
SELECT titulo_tuit, descripcion_tuit, DATE_FORMAT(fecha_tuit, '%d-%m-%Y') fecha_tuit FROM tbl_tuit ORDER BY fecha_tuit DESC;

SELECT titulo_tuit, descripcion_tuit, DATE_FORMAT(fecha_tuit, '%d-%m-%Y') fecha_tuit 
FROM tbl_tuit 
ORDER BY fecha_tuit DESC, titulo_tuit ASC;

TRUNCATE TABLE tbl_tuit;