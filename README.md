# Mi Negocio AlquimiaSoft

 Herramientas y versiones utilizadas:
```
 Lenguaje: JAVA version 

 Framework: Spring boot Maven versión 2.7.5 

 Base de datos: Postgresql. 

 Ide: Apache NetBeans versión 15 

```
# Propiedades de la aplicacion: 
```
En el apartado Application properties de la aplicacion cambiar username y paswword. 
-- spring.datasource.username=root
-- spring.datasource.password=12345

Si desea añadir una base de datos MySql Workbench, añadir las siguientes propiedades
-- spring.datasource.url=jdbc:mysql://localhost:3306/bd_minegocio
-- spring.datasource.username=root
-- spring.datasource.password=12345

-- spring.jpa.properties.hibernate.dialet=org.hibernate.dialect.MySQL8Dialect
-- spring.jpa.hibernate.ddl-auto=update
-- spring.jpa.show-sql=true
-- spring.jpa.properties.hibernate.format_sql=true

```
# Para acceder a la documentacion del codigo mediante OpenApi:
```
-- http://localhost:8080/swagger-ui/index.html
```
# Creacion de la base de datos en postgresql: 
```
-- CREATE DATABASE bd_minegocio

De preferencia utilizar el mismo Ide para abrir el proyecto. 
