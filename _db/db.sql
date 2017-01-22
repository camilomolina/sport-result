
-- ELIMINA DB
DROP TABLE JUGADOR_VISITA
DROP TABLE JUGADOR_LOCAL
DROP TABLE PARTIDO
DROP TABLE EQUIPO_PERSONA
DROP TABLE EQUIPO
DROP TABLE PERSONA
DROP TABLE POSICION
DROP TABLE TIPO_PERSONA


-- CREA DB
CREATE TABLE TIPO_PERSONA (
	ID INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL PRIMARY KEY
	, NOMBRE varchar(60) UNIQUE NOT NULL
);

CREATE TABLE POSICION (
	ID INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL PRIMARY KEY
	, NOMBRE varchar(60) UNIQUE NOT NULL
);


CREATE TABLE PERSONA (
	ID INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL PRIMARY KEY
	, NOMBRE varchar(60) UNIQUE NOT NULL
	, DIRECCION varchar(500) NULL
	, TELEFONO varchar(500) NULL
	, TIPO_PERSONA_ID INTEGER NOT NULL
	, POSICION_ID INTEGER NULL
	, IMAGEN BLOB NULL
	, ACTIVO BOOLEAN NOT NULL

	, FOREIGN KEY (TIPO_PERSONA_ID) REFERENCES TIPO_PERSONA (ID)
	, FOREIGN KEY (POSICION_ID) REFERENCES POSICION (ID)
);

CREATE TABLE EQUIPO (
	ID INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL PRIMARY KEY
	, NOMBRE varchar(60) UNIQUE NOT NULL
	, ACTIVO BOOLEAN NOT NULL
);

CREATE TABLE EQUIPO_PERSONA (
	PERSONA_ID INTEGER NOT NULL
	, EQUIPO_ID INTEGER NOT NULL

	, FOREIGN KEY (PERSONA_ID) REFERENCES PERSONA (ID)
	, FOREIGN KEY (EQUIPO_ID) REFERENCES EQUIPO (ID)
);


CREATE TABLE PARTIDO (
	ID INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL PRIMARY KEY
	, NOMBRE varchar(60) UNIQUE NOT NULL
	, EQUIPO_LOCAL_ID INTEGER NOT NULL
	, EQUIPO_VISITA_ID INTEGER NOT NULL
	, FECHA DATETIME NULL

	, FOREIGN KEY (EQUIPO_LOCAL_ID) REFERENCES EQUIPO (ID)
	, FOREIGN KEY (EQUIPO_VISITA_ID) REFERENCES EQUIPO (ID)
);

CREATE TABLE JUGADOR_LOCAL (
	ID INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL PRIMARY KEY
	, NOMBRE varchar(60) UNIQUE NOT NULL
	, PARTIDO_ID INTEGER NOT NULL
	, GOLES INTEGER NULL
	, PASES INTEGER NULL
	, TARJETA_ROJA INTEGER NULL
	, TARJETA_AMARILLA INTEGER NULL
	, JUGO BOOLEAN NOT NULL
	, LESIONADO BOOLEAN NOT NULL

	, FOREIGN KEY (PARTIDO_ID) REFERENCES PARTIDO (ID)
);

CREATE TABLE JUGADOR_VISITA (
	ID INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL PRIMARY KEY
	, NOMBRE varchar(60) UNIQUE NOT NULL
	, PARTIDO_ID INTEGER NOT NULL
	, GOLES INTEGER NULL
	, PASES INTEGER NULL
	, TARJETA_ROJA INTEGER NULL
	, TARJETA_AMARILLA INTEGER NULL
	, JUGO BOOLEAN NOT NULL
	, LESIONADO BOOLEAN NOT NULL

	, FOREIGN KEY (PARTIDO_ID) REFERENCES PARTIDO (ID)
);

-- CARGA DB
INSERT INTO TIPO_PERSONA (NOMBRE) VALUES ('Jugador')
INSERT INTO TIPO_PERSONA (NOMBRE) VALUES ('Arbitro')

INSERT INTO POSICION (NOMBRE) VALUES ('Delantero')
INSERT INTO POSICION (NOMBRE) VALUES ('Defensa')
INSERT INTO POSICION (NOMBRE) VALUES ('Volante')
INSERT INTO POSICION (NOMBRE) VALUES ('Lateral')
INSERT INTO POSICION (NOMBRE) VALUES ('Arquero')
