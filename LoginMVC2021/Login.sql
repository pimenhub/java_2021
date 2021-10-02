DROP DATABASE bd_login;
CREATE DATABASE bd_login;
USE bd_login;

CREATE TABLE tbl_usuario(
	id_usuario INT PRIMARY KEY AUTO_INCREMENT,
	nombre_usuario VARCHAR(25),
	apellido_usuario VARCHAR(25),
	correo_usuario VARCHAR(55),
	nick_usuario VARCHAR(20),
	contrasenia_usuario VARCHAR(55),
	id_tipoUsuario_fk INT
);

CREATE TABLE tbl_tipoUsuario(
	id_tipoUsuario INT PRIMARY KEY AUTO_INCREMENT,
	nombre_tipoUsuario VARCHAR(25),
	descripcion_tipoUsuario VARCHAR(55)
);

ALTER TABLE tbl_usuario ADD CONSTRAINT FK1 FOREIGN KEY (id_tipoUsuario_fk) 
REFERENCES tbl_tipoUsuario (id_tipoUsuario);

INSERT INTO tbl_tipousuario (
nombre_tipoUsuario, descripcion_tipoUsuario)
VALUES
('Administrador', 'Usuario con acceso completo'),
('Cliente', 'Usuario con ciertos accesos');
SELECT * FROM tbl_tipousuario;

INSERT INTO tbl_usuario (
nombre_usuario, apellido_usuario, correo_usuario, nick_usuario, contrasenia_usuario, id_tipoUsuario_fk
)VALUES
('Pedro', 'Perez', 'pedro@gmail.com', 'admin', '1235',1),
('Luis', 'Ruiz', 'luis@gmail.com', 'lruiez', '123',2);
SELECT * FROM tbl_usuario;

#JOIN

SELECT u.nick_usuario, u.contrasenia_usuario, t.nombre_tipoUsuario
FROM tbl_usuario u
INNER JOIN
tbl_tipousuario t
ON u.id_tipoUsuario_fk = t.id_tipoUsuario
WHERE u.nick_usuario = 
AND u.contrasenia_usuario = ;
 
SELECT u.nick_usuario, u.contrasenia_usuario, u.id_tipoUsuario_fk
FROM tbl_usuario u;
WHERE u.nick_usuario = 'admin'
AND u.contrasenia_usuario = '1235';
