DROP TABLE CAMAREROS 		IF EXISTS;
DROP TABLE CLIENTES 		IF EXISTS;
DROP TABLE PRODUCTOS 		IF EXISTS;
DROP TABLE SECUENCIAS		IF EXISTS;
DROP TABLE PEDIDOS			IF EXISTS;
DROP TABLE LINEAS_PEDIDOS	IF EXISTS;

CREATE TABLE SECUENCIAS(
	SEQ_NAME			VARCHAR(100)	NOT NULL,
	SEQ_VALUE			BIGINT			NOT NULL,
	
	PRIMARY KEY (SEQ_NAME)
);

CREATE TABLE CAMAREROS(  
	ID					INT  			NOT NULL,
	NAME				VARCHAR(100)		
);

CREATE TABLE CLIENTES(
	CODIGO				INT				NOT NULL,
	NIF					VARCHAR(20)		,
	RAZON_SOCIAL		VARCHAR(200)	,
	FECHA_ALTA			DATE			,
	ACTIVO				BOOLEAN			NOT NULL,
	CREDITO				DOUBLE			,		
	
	PRIMARY KEY (CODIGO)	
);

CREATE TABLE PRODUCTOS(
	CODIGO				INT				NOT NULL,
	NOMBRE				VARCHAR(100)	,
	PRECIO				DOUBLE			,
	DESCRIPCION			VARCHAR(200)	,
	FAMILIA				VARCHAR(50)		,
	FECHA_ALTA			TIMESTAMP		,
	DESCATALOGADO		BOOLEAN			,
	
	PRIMARY KEY (CODIGO)
);

CREATE TABLE PEDIDOS (
	CODIGO				INT				NOT NULL,
	FECHA_HORA			TIMESTAMP		,
	ID_CAMARERO			INT				,
	
	PRIMARY KEY (CODIGO),
	FOREIGN KEY (ID_CAMARERO) REFERENCES CAMAREROS (ID)
);

CREATE TABLE LINEAS_PEDIDOS (
	INDICE				INT				NOT NULL,
	CODIGO_PEDIDO		INT				NOT NULL,
	CODIGO_PRODUCTO		INT				,
	CANTIDAD			INT				,
	PRECIO				DOUBLE			,
	
	FOREIGN KEY (CODIGO_PEDIDO) REFERENCES PEDIDOS (CODIGO),
	FOREIGN KEY (CODIGO_PRODUCTO) REFERENCES PRODUCTOS (CODIGO)

);
