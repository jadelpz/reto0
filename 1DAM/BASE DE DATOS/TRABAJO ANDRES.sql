create schema cliente; 
use cliente;

CREATE TABLE Codigo_PUB (
Codigo_PUB int PRIMARY KEY,
Nombre varchar(50),
Licencia_Fiscal varchar(100),
Domicilio varchar (100),
Fecha_Apertura date,
Horario TIME,
COD_LOCALIDAD int
);

CREATE TABLE DNI_TITULAR (
DNI_TITULAR int PRIMARY KEY,
Nombre varchar(50),
Domicilio varchar(100),
Codigo_PUB int
);

CREATE TABLE DNI_EMPLEADO (
DNI_EMPLEADO int PRIMARY KEY,
Nombre varchar(50),
Domicilio varchar(100),
Codigo_PUB int
);


CREATE TABLE EXISTENCIA (
COD_ARTICULO int PRIMARY KEY,
Nombre varchar(50) not null,
Cantidad int,
Precio decimal (1,100),
COD_PUB int
);

CREATE TABLE LOCALIDAD (
COD_LOCALIDAD int PRIMARY KEY,
Localidad varchar (50) not null
);

CREATE TABLE EMPLEADO (
DNI_EMPLEADO varchar (20) primary key,
Nombre varchar(50) not null,
 Domicilio varchar(100)
 );

CREATE TABLE PUB_EMPLEADO (
COD_PUB int primary key,
DNI_EMPLEADO varchar (20) primary key,
FUNCION varchar (50),
PRIMARY KEY (COD_PUB,DNI_EMPLEADO,FUNCION)
);

                                              -- SEGUNDO PASO --
CREATE TABLE ESPECTACULO (
COD_ESPECTACULO int primary key,
Nombre varchar (50),
TIPO varchar (50),
FECHA_INICIAL datetime,
FECHA_FINAL datetime,
INTERPRETE VARCHAR (50),
COD_RECINTO varchar (50)
);

CREATE TABLE PRECIOS_ESPECTACULOS (
PRECIOS_ESPECTACULOS int primary key,
COD_ESPECTACULOS varchar (50),
COD_RECINTO varchar (50) primary key,
ZONA varchar (50),
PRECIO double (1,100) not null
);

CREATE TABLE RECINTO (
COD_RECINTO int PRIMARY KEY,
NOMBRE varchar (50),
Direccion varchar (100),
CIUDAD varchar (50),
TELEFONO varchar (20),
HORARIO DATE
);

CREATE TABLE ZONAS_RECINTOS (
ZONAS_RECINTOS int primary key,
COD_RECINTO VARCHAR (50) primary key,
ZONA VARCHAR (50),
CAPACIDAD VARCHAR (50)
);

CREATE TABLE REPRESENTACIONES (
REPRESENTACIONES int primary key,
COD_ESPECTACULO VARCHAR (50) primary key,
FECHA DATE,
HORA TIME
); 

CREATE TABLE ENTRADAS (
ENTRADAS int primary key,
COD_ESPECTACULO varchar (50) primary key,
FECHA DATE,
HORA TIME,
COD_RECINTO VARCHAR (50),
FILA VARCHAR (10),
NUMERO VARCHAR (50),
ZONA VARCHAR (50),
DNI_CLIENTE VARCHAR (20)
);

CREATE TABLE ESPECTADORES (
ESPECTADORES int primary key,
DNI_CLIENTE VARCHAR (50) primary key,
NOMBRE VARCHAR (50),
DIRECCION VARCHAR (50),
TELEFONO VARCHAR (50),
CIUDAD VARCHAR (50),
N_TARJETA VARCHAR (50) primary key
);

CREATE TABLE PUB_ESPECTADORES (
ESPECTACULO int primary key,
DNI_CLIENTE varchar (20) primary key,
COD_ESPECTACULO varchar (50) primary key,
COD_RECINTO varchar (50) primary key,
N_TARJETA VARCHAR (50) primary key,
PRIMARY KEY (DNI_CLIENTE,COD_ESPECTACULO,COD_RECINTO,N_TARJETA)
);  



