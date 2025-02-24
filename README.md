# Proyecto Apx

### Acerca del proyecto
Desafío de almacenar la información de un cliente en una base de datos Oracle mediante un proceso de inserción. 
Para garantizar la consistencia y cumplir con ciertos estándares, se han establecido restricciones y requisitos específicos que deben ser seguidos rigurosamente.

### Tecnologías utilizadas
- Intellig IDEA 
- Postman
- Docker
- DBeaver


###Se realizaron capturas de pantalla que se encuentra en la carpeta validaciones_pruebas con el funcionamiento en postman con el json que se encuentra abajo de este apartado, 
- Como primer prueba se realizo la inserpcion de una tabla para notar si guardo en la base datos
- Segunda prueba se cambio la id por ser unica y no causar conflictos pero con el mispo nuip que se inserto anteriormente y observar en BDeaver si anulo la inserción por ser duplicada

#### Tabla creada en DBeaver 

- CREATE TABLE WIKJ."T_WIKJ_HAB_PRUEBAFINAL"(
- id number(5) NOT NULL PRIMARY KEY,
- nuip number(10),
- full_name VARCHAR(50),
- phone varchar(15),
- address varchar(30)
)

#### JSON entrada y salida serian los mismos campos 

- {
 - "dtoIn": {
 -   "id": "100",
 -  "nuip": "100",
 -  "full_name": "Max",
 -   "phone": "2311755559",
 -  "address": "Las lomas"
 - }
 - }

#### Tabla creada en DBeaver 

- CREATE TABLE WIKJ."T_WIKJ_HAB_PRUEBAFINAL"(
- id number(5) NOT NULL PRIMARY KEY,
- nuip number(10),
- full_name VARCHAR(50),
- phone varchar(15),
- address varchar(30)
)

###### Notas adicionales
logical-transaction-code - (WIKJT004)
****
